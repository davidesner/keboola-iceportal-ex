package esnerda.keboola.ex.iceportal.result.wrappers;

import com.iceportal.services.service.BrochureLocationVisuals;

/**
 * @author David Esner
 */
public class BrochureLocationWrapper {
	private int propIceId;
	protected String brochureUrl;
	protected String locationImageUrl;

	public BrochureLocationWrapper(){}
	
	public BrochureLocationWrapper(int propIceId, BrochureLocationVisuals bv) {
		if (bv == null) {
			return;
		}

		this.brochureUrl = bv.getBrochureUrl();
		this.locationImageUrl = bv.getLocationImageUrl();
		this.propIceId = propIceId;
	}

	public String getBrochureUrl() {
		return brochureUrl;
	}

	public String getLocationImageUrl() {
		return locationImageUrl;
	}

	public int getPropIceId() {
		return propIceId;
	}

}
