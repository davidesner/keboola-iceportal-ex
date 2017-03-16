package esnerda.keboola.ex.iceportal.result.wrappers;

import com.iceportal.services.service.AvailableContent2;

/**
 * @author David Esner
 */
public class AvailableContentWrapper {

	private int propIceId;
	protected String photos;

	protected String videos;

	protected String hd360S;

	protected String iframe;

	protected String generalInfo;

	protected String location;

	protected String pdfLink;

	protected String ratesReservations;

	protected String lang;

	protected String emailLink;

	public AvailableContentWrapper() {
	}

	public AvailableContentWrapper(int propIceId, AvailableContent2 c) {
		if (c == null) {
			return;
		}

		this.propIceId = propIceId;
		this.photos = c.getPhotos();
		videos = c.getVideos();
		hd360S = c.getHD360S();
		iframe = c.getIframe();
		generalInfo = c.getGeneralInfo();
		location = c.getLocation();
		pdfLink = c.getPDFLink();
		lang = c.getLang();
		emailLink = c.getEmailLink();
	}

	public int getPropIceId() {
		return propIceId;
	}

	public String getPhotos() {
		return photos;
	}

	public String getVideos() {
		return videos;
	}

	public String getHd360S() {
		return hd360S;
	}

	public String getIframe() {
		return iframe;
	}

	public String getGeneralInfo() {
		return generalInfo;
	}

	public String getLocation() {
		return location;
	}

	public String getPdfLink() {
		return pdfLink;
	}

	public String getRatesReservations() {
		return ratesReservations;
	}

	public String getLang() {
		return lang;
	}

	public String getEmailLink() {
		return emailLink;
	}

}
