package esnerda.keboola.ex.iceportal.result.impl;

import java.util.ArrayList;
import java.util.List;

import com.iceportal.services.service.CaptionForVisuals;
import com.iceportal.services.service.MediaContentVisuals;
import com.iceportal.services.service.PropertyImageVisuals;

import esnerda.keboola.components.result.IResultWriter;
import esnerda.keboola.components.result.ResultFileMetadata;
import esnerda.keboola.components.result.impl.DefaultBeanResultWriter;
import esnerda.keboola.ex.iceportal.result.wrappers.CaptionItemWrapper;
import esnerda.keboola.ex.iceportal.result.wrappers.CaptionsWrapper;
import esnerda.keboola.ex.iceportal.result.wrappers.ImageTagsWrapper;
import esnerda.keboola.ex.iceportal.result.wrappers.ImageVisualWrapper;
import esnerda.keboola.ex.iceportal.result.wrappers.RoomTypesWrapper;

/**
 * @author David Esner
 */
public class MediaContentVisualWriter implements IResultWriter<MediaContentVisuals>{

	
	private DefaultBeanResultWriter<CaptionsWrapper> captionsWriter;
	private DefaultBeanResultWriter<ImageVisualWrapper> imgVisualsWriter;
	private DefaultBeanResultWriter<RoomTypesWrapper> roomTypesWriter;
	private DefaultBeanResultWriter<ImageTagsWrapper> imageTagsWriter;
	private DefaultBeanResultWriter<CaptionItemWrapper> captionItemWriter;
	
	private final String code;
	private int propId;

	MediaContentVisualWriter() {
		this("");
	}
	public MediaContentVisualWriter (String code) {
		this.code = code;
	}
	@Override
	public List<ResultFileMetadata> closeAndRetrieveMetadata() throws Exception{
		List<ResultFileMetadata> result = new ArrayList<>();
		result.addAll(captionsWriter.closeAndRetrieveMetadata());
		result.addAll(imgVisualsWriter.closeAndRetrieveMetadata());
		result.addAll(roomTypesWriter.closeAndRetrieveMetadata());
		result.addAll(imageTagsWriter.closeAndRetrieveMetadata());
		result.addAll(captionItemWriter.closeAndRetrieveMetadata());
		return result;
	}

	@Override
	public void initWriter(String path, Class<MediaContentVisuals> clazz) throws Exception {
		//init captions writer
		captionsWriter = new DefaultBeanResultWriter<CaptionsWrapper>(code+"Captions.csv", new String[]{"uniqueId"});
		captionsWriter.initWriter(path, CaptionsWrapper.class);
		//init img writer
		imgVisualsWriter = new DefaultBeanResultWriter<ImageVisualWrapper>(code+"Images.csv", new String[]{"propIceId","ordinal","publicID"});
		imgVisualsWriter.initWriter(path,ImageVisualWrapper.class);
		//init roomTypes writer
		roomTypesWriter = new DefaultBeanResultWriter<RoomTypesWrapper>(code+"ImgRoomTypes.csv", new String[]{"photoPubId","code"});
		roomTypesWriter.initWriter(path,RoomTypesWrapper.class);
		//init imageTags writer
		imageTagsWriter = new DefaultBeanResultWriter<ImageTagsWrapper>(code+"ImgTagsTypes.csv", new String[]{"photoPubId","tag"});
		imageTagsWriter.initWriter(path,ImageTagsWrapper.class);		
		//init captionItemWriter writer
		captionItemWriter = new DefaultBeanResultWriter<CaptionItemWrapper>(code+"CaptionItems.csv", new String[]{"captionId","lcid", "itemType"});
		captionItemWriter.initWriter(path,CaptionItemWrapper.class);		
	}

	@Override
	public void writeResult(MediaContentVisuals obj) throws Exception {
		if (obj == null) {
			return;
		}
		writeCaptions(obj);
		writeImages(obj);
		
	}

	@Override
	public void writeAllResults(List<MediaContentVisuals> objs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ResultFileMetadata> writeAndRetrieveResuts(List<MediaContentVisuals> objs) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * MUST SET before running!!
	 * @param propId
	 */
	public void setPropId(int propId) {
		this.propId = propId;
	}

	private void writeImages(MediaContentVisuals vs) throws Exception {
		for (PropertyImageVisuals vis : vs.getImages().getPropertyImageVisuals()) {
			imgVisualsWriter.writeResult(new ImageVisualWrapper(propId, vis));
			//write iTags
			imageTagsWriter.writeAllResults(ImageTagsWrapper.Builder.build(vis.getPublicID(), vis.getPrecIceTags()));
			//write roomTypes
			roomTypesWriter.writeAllResults(RoomTypesWrapper.Builder.build(vis.getPublicID(), vis.getRoomTypeCodes()));
		}
	}

	private void writeCaptions(MediaContentVisuals vs) throws Exception {	
		if (vs.getCaptions() == null) {
			return;
		}
		try {
			for (CaptionForVisuals capt : vs.getCaptions().getCaption()) {
				CaptionsWrapper cWrap = new CaptionsWrapper(code, propId, capt);
				captionsWriter.writeResult(cWrap);
				//write items
				captionItemWriter.writeAllResults(CaptionItemWrapper.Builder.build("fullSize", cWrap.getUniqueId(), capt.getFullSize()));
				captionItemWriter.writeAllResults(CaptionItemWrapper.Builder.build("longCaption", cWrap.getUniqueId(), capt.getLongCaption()));
				captionItemWriter.writeAllResults(CaptionItemWrapper.Builder.build("thumbs", cWrap.getUniqueId(), capt.getThumb()));
			}
		} catch (Exception e) {
			throw new Exception("Faild to write img captions", e);
		}
	}


}
