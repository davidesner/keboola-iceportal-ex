package esnerda.keboola.ex.iceportal.result.wrappers;

import com.iceportal.services.service.PropertyDescription;

/**
 * @author David Esner
 */
public class PropertyDescriptionWrapper {

	private int propIceId;

	private String description250;

	private String description500;

	private String description1000;
	

	public PropertyDescriptionWrapper() {
	}

	public PropertyDescriptionWrapper(int propIceId, PropertyDescription pDescription) {
		if (pDescription == null) {
			return;
		}
		this.propIceId = propIceId;
		this.description250 = pDescription.getDescription250();
		this.description500 = pDescription.getDescription500();
		this.description1000 = pDescription.getDescription1000();
	}

	public int getPropIceId() {
		return propIceId;
	}

	public String getDescription250() {
		return description250;
	}

	public String getDescription500() {
		return description500;
	}

	public String getDescription1000() {
		return description1000;
	}

}
