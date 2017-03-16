package esnerda.keboola.ex.iceportal.result.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.iceportal.services.service.PrecICETags;

/**
 * @author David Esner
 */
public class IceTagsWrapper {

	private int propIceId;
	private String tag;

	public IceTagsWrapper() {
	}

	public IceTagsWrapper(int propIceId, String tag) {		
		this.propIceId = propIceId;
		this.tag = tag;
	}

	public int getPropIceId() {
		return propIceId;
	}

	public String getTag() {
		return tag;
	}

	public static class Builder {
		public static List<IceTagsWrapper> buildIceTagsWrappers(int propIceId, PrecICETags iceTags) {
			List<IceTagsWrapper> result = new ArrayList<>();
			if (iceTags == null) {
				return result;
			}
			iceTags.getTags().forEach(t -> result.add(new IceTagsWrapper(propIceId, t)));
			return result;
		}
	}
	
}
