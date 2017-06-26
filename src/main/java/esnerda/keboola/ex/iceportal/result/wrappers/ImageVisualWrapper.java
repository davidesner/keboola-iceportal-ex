package esnerda.keboola.ex.iceportal.result.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.iceportal.services.service.ArrayOfPropertyImageVisuals;
import com.iceportal.services.service.PropertyImageVisuals;

/**
 * @author David Esner
 */
public class ImageVisualWrapper {
	private int propIceId;
	protected int ordinal;
	protected String publicID;
	protected String thumbUrl;
	protected int thumbHeight;
	protected int thumbWidth;
	protected String fullSizeUrl;
	protected String mediaGalleryUrl;
	protected String modifiedDate;
	protected String mediaLinkUrl;
	protected int mediaLinkDimHeight;
	protected int mediaLinkDimWidth;
	protected String directLinkUrl;
	protected int directLinkDimHeight;
	protected int directLinkDimWidth;

	public ImageVisualWrapper() {
	}
	
	public ImageVisualWrapper(int propIceId, PropertyImageVisuals iv) {
		if (iv == null) {
			return;
		}
		this.propIceId = propIceId;
		this.ordinal = iv.getOrdinal();
		this.publicID = iv.getPublicID();
		if (iv.getThumbUrl() != null) {
			this.thumbUrl = iv.getThumbUrl().getUrl();
		}
		if (iv.getThumbUrl().getDimensions() != null) {
			this.thumbHeight = iv.getThumbUrl().getDimensions().getHeight();
			this.thumbWidth = iv.getThumbUrl().getDimensions().getWidth();
		}
		this.fullSizeUrl = iv.getFullSizeUrl();
		this.mediaGalleryUrl = iv.getMediaGalleryUrl();
		this.modifiedDate = iv.getModifiedDate();
		if (iv.getMediaLink() != null) {
			this.mediaLinkUrl = iv.getMediaLink().getUrl();
			if (iv.getMediaLink().getDimensions() != null) {
				this.mediaLinkDimHeight = iv.getMediaLink().getDimensions().getHeight();
				this.mediaLinkDimWidth = iv.getMediaLink().getDimensions().getWidth();
			}
		}
		if (iv.getDirectLinks() != null) {
			this.directLinkUrl = iv.getDirectLinks().getUrl();
			if (iv.getDirectLinks().getDimensions() != null) {
				this.directLinkDimHeight = iv.getDirectLinks().getDimensions().getHeight();
				this.directLinkDimWidth = iv.getDirectLinks().getDimensions().getWidth();
			}
		}
	}

	public int getPropIceId() {
		return propIceId;
	}

	public int getOrdinal() {
		return ordinal;
	}

	public String getPublicID() {
		return publicID;
	}

	public String getThumbUrl() {
		return thumbUrl;
	}

	public int getThumbHeight() {
		return thumbHeight;
	}

	public int getThumbWidth() {
		return thumbWidth;
	}

	public String getFullSizeUrl() {
		return fullSizeUrl;
	}

	public String getMediaGalleryUrl() {
		return mediaGalleryUrl;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public String getMediaLinkUrl() {
		return mediaLinkUrl;
	}

	public int getMediaLinkDimHeight() {
		return mediaLinkDimHeight;
	}

	public int getMediaLinkDimWidth() {
		return mediaLinkDimWidth;
	}

	public String getDirectLinkUrl() {
		return directLinkUrl;
	}

	public int getDirectLinkDimHeight() {
		return directLinkDimHeight;
	}

	public int getDirectLinkDimWidth() {
		return directLinkDimWidth;
	}

	public static class Builder {
		public static List<ImageVisualWrapper> build(String typeCode, int propIceId,
				ArrayOfPropertyImageVisuals captions) {
			List<ImageVisualWrapper> result = new ArrayList<>();
			if (captions == null) {
				return result;
			}
			captions.getPropertyImageVisuals().forEach(t -> result.add(new ImageVisualWrapper(propIceId, t)));
			return result;
		}
	}

}
