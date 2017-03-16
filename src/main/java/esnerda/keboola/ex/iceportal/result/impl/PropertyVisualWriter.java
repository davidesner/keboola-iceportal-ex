package esnerda.keboola.ex.iceportal.result.impl;

import java.util.ArrayList;
import java.util.List;

import com.iceportal.services.service.BrochureInfoVisuals;
import com.iceportal.services.service.BrochureRequest;
import com.iceportal.services.service.PropertyVisuals;

import esnerda.keboola.components.result.IResultWriter;
import esnerda.keboola.components.result.ResultFileMetadata;
import esnerda.keboola.components.result.impl.DefaultBeanResultWriter;
import esnerda.keboola.ex.iceportal.result.wrappers.AvailableContentWrapper;
import esnerda.keboola.ex.iceportal.result.wrappers.BrochureLocationWrapper;
import esnerda.keboola.ex.iceportal.result.wrappers.IceTagsWrapper;
import esnerda.keboola.ex.iceportal.result.wrappers.PropertyDescriptionWrapper;

/**
 * @author David Esner
 */
public class PropertyVisualWriter implements IResultWriter<PropertyVisuals>{

	private final static String KEY_IMGS = "GalleryImgs";
	private final static String KEY_IMGS_360 = "Galleryi360s";
	
	private IResultWriter<BrochureInfoVisuals> pInfoWriter;
	private IResultWriter<BrochureRequest> pStatusWriter;
	private IResultWriter<IceTagsWrapper> pIceTagsWriter;
	private IResultWriter<PropertyDescriptionWrapper> pDescWriter;
	private IResultWriter<AvailableContentWrapper> aContentWriter;
	private MediaContentVisualWriter imagesWriter;
	private MediaContentVisualWriter i360sWriter;
	private IResultWriter<BrochureLocationWrapper> locationWriter;
	
	@Override
	public List<ResultFileMetadata> closeAndRetrieveMetadata() throws Exception{
		List<ResultFileMetadata> results = new ArrayList<>();
		//collect all results
		results.addAll(pInfoWriter.closeAndRetrieveMetadata());
		results.addAll(pStatusWriter.closeAndRetrieveMetadata());
		results.addAll(pIceTagsWriter.closeAndRetrieveMetadata());
		results.addAll(pDescWriter.closeAndRetrieveMetadata());
		results.addAll(aContentWriter.closeAndRetrieveMetadata());
		results.addAll(imagesWriter.closeAndRetrieveMetadata());
		results.addAll(i360sWriter.closeAndRetrieveMetadata());
		results.addAll(locationWriter.closeAndRetrieveMetadata());
		return results;
	}

	@Override
	public void initWriter(String path, Class<PropertyVisuals> clazz) throws Exception {
		//init info writer
		pInfoWriter = new DefaultBeanResultWriter<BrochureInfoVisuals>("propertyInfo.csv", new String[]{"iceID"});
		pInfoWriter.initWriter(path, BrochureInfoVisuals.class);
		//init status writer
		pStatusWriter = new DefaultBeanResultWriter<BrochureRequest>("propertyStatus.csv",  new String[]{"iceID"});
		pStatusWriter.initWriter(path, BrochureRequest.class);		
		//init tags writer
		pIceTagsWriter = new DefaultBeanResultWriter<IceTagsWrapper>("propertyIceTags.csv",  new String[]{"propIceId","tag"});
		pIceTagsWriter.initWriter(path, IceTagsWrapper.class);		
		//init desc writer
		pDescWriter = new DefaultBeanResultWriter<PropertyDescriptionWrapper>("propertyDescription.csv",  new String[]{"propIceId"});
		pDescWriter.initWriter(path, PropertyDescriptionWrapper.class);		
		//init acontent writer
		aContentWriter = new DefaultBeanResultWriter<AvailableContentWrapper>("propertyAvailableContent.csv",  new String[]{"propIceId"});
		aContentWriter.initWriter(path, AvailableContentWrapper.class);	
		//init mediaContent writers
		imagesWriter = new MediaContentVisualWriter(KEY_IMGS);
		imagesWriter.initWriter(path, null);
		i360sWriter = new MediaContentVisualWriter(KEY_IMGS_360);
		i360sWriter.initWriter(path, null);
		//brochure writers
		locationWriter = new DefaultBeanResultWriter<>("brochureLocationInfo.csv", new String[]{"propIceId"});
		locationWriter.initWriter(path, BrochureLocationWrapper.class);
	}

	@Override
	public void writeResult(PropertyVisuals obj) throws Exception {
		int propId = obj.getRequest().getIceID();
		pInfoWriter.writeResult(obj.getPropertyInfo());
		pStatusWriter.writeResult(obj.getRequest());
		aContentWriter.writeResult(new AvailableContentWrapper(propId, obj.getAvailableContent()));
		pDescWriter.writeResult(new PropertyDescriptionWrapper(propId, obj.getPropertyDescription()));

		pIceTagsWriter.writeAllResults(IceTagsWrapper.Builder.buildIceTagsWrappers(propId, obj.getPrecICETags()));
		locationWriter.writeResult(new BrochureLocationWrapper(propId, obj.getLocation()));	
		//write media content
		if(obj.getMediaGallery() == null){
			return;
		}
		imagesWriter.setPropId(propId);
		imagesWriter.writeResult(obj.getMediaGallery().getPictures());	
		
		i360sWriter.setPropId(propId);
		i360sWriter.writeResult(obj.getMediaGallery().getHD360S());		
			
		
	}

	@Override
	public void writeAllResults(List<PropertyVisuals> objs) throws Exception {
		for (PropertyVisuals o : objs){
			writeResult(o);
		}			
	}

	@Override
	public List<ResultFileMetadata> writeAndRetrieveResuts(List<PropertyVisuals> objs) throws Exception {
		writeAllResults(objs);
		return closeAndRetrieveMetadata();
	}

	


}
