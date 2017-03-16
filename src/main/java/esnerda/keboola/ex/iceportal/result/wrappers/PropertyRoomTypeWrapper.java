package esnerda.keboola.ex.iceportal.result.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.iceportal.services.service.RoomType;

/**
 * @author David Esner
 */
public class PropertyRoomTypeWrapper {

	private int propIceId;
	protected String roomTypeCode;
    protected String roomTypeDescription;
    protected String keywords;

	public PropertyRoomTypeWrapper() {
	}

	public PropertyRoomTypeWrapper(int propIceId, RoomType c) {
		if (c == null) {
			return;
		}

		this.propIceId = propIceId;
		this.roomTypeCode = c.getRoomTypeCode();
		this.roomTypeDescription = c.getRoomTypeDescription();
		this.keywords = String.join(";", c.getKeywords().getKeyword());
		
	}

	public static class Builder {
		public static List<PropertyRoomTypeWrapper> build(int propIceId,
				List<RoomType> roomTypes) {
			List<PropertyRoomTypeWrapper> result = new ArrayList<>();
			if ( roomTypes == null) {
				return result;
			}
			roomTypes.forEach(t -> result.add(new PropertyRoomTypeWrapper(propIceId, t)));
			return result;
		}
	}

	public int getPropIceId() {
		return propIceId;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public String getRoomTypeDescription() {
		return roomTypeDescription;
	}

	public String getKeywords() {
		return keywords;
	}
	

}
