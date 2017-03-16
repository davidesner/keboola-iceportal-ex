package esnerda.keboola.ex.iceportal.result.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.iceportal.services.service.ArrayOfCaptionForVisuals;
import com.iceportal.services.service.CaptionForVisuals;

/**
 * @author David Esner
 */
public class CaptionsWrapper {

	// propIceId+Code+ordinal
	private String uniqueId;
	private int propIceId;
	protected int ordinal;
	protected int mainCategory;
	protected int subCategory;

	public CaptionsWrapper (){		
	}
	
	public CaptionsWrapper(String typeCode, int propIceId, CaptionForVisuals cv) {
		if (cv == null) {
			return;
		}
		this.uniqueId = propIceId + typeCode + cv.getOrdinal();
		this.propIceId = propIceId;
		this.ordinal = cv.getOrdinal();
		this.mainCategory = cv.getMainCategory();
		this.subCategory = cv.getSubCategory();
	}

	public static class Builder {
		public static List<CaptionsWrapper> build(String typeCode, int propIceId,
				ArrayOfCaptionForVisuals captions) {
			List<CaptionsWrapper> result = new ArrayList<>();
			if (captions == null) {
				return result;
			}
			captions.getCaption()
					.forEach(t -> result.add(new CaptionsWrapper(typeCode, propIceId, t)));
			return result;
		}
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public int getPropIceId() {
		return propIceId;
	}

	public int getOrdinal() {
		return ordinal;
	}

	public int getMainCategory() {
		return mainCategory;
	}

	public int getSubCategory() {
		return subCategory;
	}

}
