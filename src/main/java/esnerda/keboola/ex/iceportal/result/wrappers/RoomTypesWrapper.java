package esnerda.keboola.ex.iceportal.result.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.iceportal.services.service.RoomTypeCodes;

/**
 * @author David Esner
 */
public class RoomTypesWrapper {
	private String photoPubId;
	private String code;

	public RoomTypesWrapper() {
	}
	
	public RoomTypesWrapper(String photoPubId, String code) {
		super();
		this.photoPubId = photoPubId;
		this.code = code;
	}

	public String getPhotoPubId() {
		return photoPubId;
	}

	public String getCode() {
		return code;
	}

	public static class Builder {
		public static List<RoomTypesWrapper> build(String photoPubId,
				RoomTypeCodes tcodes) {
			List<RoomTypesWrapper> result = new ArrayList<>();
			if (tcodes == null) {
				return result;
			}
			tcodes.getRoomTypeCode()
					.forEach(t -> result.add(new RoomTypesWrapper(photoPubId, t)));
			return result;
		}
	}
}
