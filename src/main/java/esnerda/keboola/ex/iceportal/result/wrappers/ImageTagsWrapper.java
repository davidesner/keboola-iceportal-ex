package esnerda.keboola.ex.iceportal.result.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.iceportal.services.service.ImageTags;

/**
 * @author David Esner
 */
public class ImageTagsWrapper {
	private String photoPubId;
	private String tag;

	public ImageTagsWrapper() {
	}
	
	public ImageTagsWrapper(String photoPubId, String tag) {
		super();
		this.photoPubId = photoPubId;
		this.tag = tag;
	}

	public String getPhotoPubId() {
		return photoPubId;
	}

	public String getTag() {
		return tag;
	}

	public static class Builder {
		public static List<ImageTagsWrapper> build(String photoPubId,
				ImageTags tcodes) {
			List<ImageTagsWrapper> result = new ArrayList<>();
			if (tcodes == null) {
				return result;
			}
			tcodes.getTags()
					.forEach(t -> result.add(new ImageTagsWrapper(photoPubId, t)));
			return result;
		}
	}
}
