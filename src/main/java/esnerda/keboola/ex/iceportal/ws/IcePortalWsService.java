package esnerda.keboola.ex.iceportal.ws;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.Holder;

import org.apache.logging.log4j.Logger;

import com.iceportal.services.service.ArrayOfCategories;
import com.iceportal.services.service.ArrayOfICESubCategories;
import com.iceportal.services.service.ArrayOfItem;
import com.iceportal.services.service.ArrayOfPropertyIDInfo;
import com.iceportal.services.service.ArrayOfRoomType;
import com.iceportal.services.service.BrochureListItem;
import com.iceportal.services.service.Categories;
import com.iceportal.services.service.ICESubCategories;
import com.iceportal.services.service.ICEWebServiceSoap;
import com.iceportal.services.service.Item;
import com.iceportal.services.service.PropertyIDInfo;
import com.iceportal.services.service.PropertyVisuals;
import com.iceportal.services.service.RoomType;

/**
 * @author David Esner
 */
public class IcePortalWsService {
	private final ICEWebServiceSoap wsClient;

	public IcePortalWsService(Logger log, ICEWebServiceSoap wsClient) throws Exception {
		this.wsClient = wsClient;
		
	}

	public List<PropertyIDInfo> getProperties(String publicationStatus, String modifiedTypeOption, String sinceDate,
			String propertyType, String includeSupplierInfo) throws Exception {		
		Holder<Integer> result = new Holder<>();
		Holder<String> error = new Holder<>();
		Holder<ArrayOfPropertyIDInfo> info = new Holder<>();
		wsClient.getProperties(publicationStatus, modifiedTypeOption, sinceDate, propertyType, includeSupplierInfo,
				result, error, info);
		if (!error.value.equals("OK")) {
			throw new Exception("Error sending getPropetries request. Message: " + error.value);
		}
		return info.value.getPropertyIDInfo();		
	}

	public PropertyVisuals getVisuals(String mappedID, String protocol, String linkType, String photoSize) throws Exception {		
		Holder<Integer> result = new Holder<>();
		Holder<String> error = new Holder<>();
		Holder<PropertyVisuals> property = new Holder<>();
		wsClient.getVisuals(mappedID, protocol, linkType, photoSize, result, error, property);
		if (!error.value.equals("OK")) {
			throw new Exception("Error sending visuals request. Message: " + error.value);
		}
		return property.value;		
	}

	public List<BrochureListItem> getPropertyTypes() throws Exception {		
		Holder<Integer> result = new Holder<>();
		Holder<String> errorMessage = new Holder<>();		
		Holder<List<BrochureListItem>> types =   new Holder<>();
		wsClient.getPropertyTypes(result, errorMessage, types);
		if (errorMessage.value != null && !errorMessage.value.equals("OK")) {
			throw new Exception("Error sending getPropertyTypes request. Message: " + errorMessage.value);
		}
		return types.value;		
	}

	public Map<Categories, ICESubCategories> getCategories() throws Exception {
		Holder<Integer> result = new Holder<>();
		Holder<String> errorMessage = new Holder<>();
		Holder<ArrayOfCategories> otaCategories = new Holder<>();
		Holder<ArrayOfICESubCategories> iceCategories = new Holder<>();

		wsClient.getCategories(result, errorMessage, otaCategories, iceCategories);
		if (!errorMessage.value.equals("OK")) {
			throw new Exception("Error sending getCategories request. Message: " + errorMessage.value);
		}

		Map<Categories, ICESubCategories> resultMap = new HashMap<>();
		Map<Integer, ICESubCategories> subCatMap = retrieveSubCategoriesMap(iceCategories.value.getICESubCategories());
		otaCategories.value.getCategories().stream()
				.forEach(c -> resultMap.put(c, subCatMap.get(c.getID())));
		return resultMap;
	}

	public List<Item> getLanguages() throws Exception {
		Holder<Integer> result = new Holder<>();
		Holder<String> errorMessage = new Holder<>();
		Holder<ArrayOfItem> languages = new Holder<>();
		wsClient.getLanguages(result, errorMessage, languages);
		if (errorMessage.value != null && !errorMessage.value.equals("OK")) {
			throw new Exception("Error sending getLanguages request. Message: " + errorMessage.value);
		}
		return languages.value.getItem();
	}

	public List<RoomType> getRoomTypesForProperty(String mappedID) throws Exception {
		Holder<Integer> result = new Holder<>();
		Holder<String> errorMessage = new Holder<>();
		Holder<ArrayOfRoomType> roomTypes = new Holder<>();
		wsClient.getRoomTypesForProperty(mappedID, result, errorMessage, roomTypes);
		if (!errorMessage.value.equals("OK")) {
			throw new Exception("Error sending getRoomTypesForProperty request. Message: " + errorMessage.value);
		}
		return roomTypes.value.getRoomType();
		
	}

	/** Helper methods **/
	private Map<Integer, ICESubCategories> retrieveSubCategoriesMap(List<ICESubCategories> subCatArray) {
		Map<Integer,ICESubCategories> subCatMap = new HashMap<>();
		subCatArray.stream()
				.forEach(subCats -> subCatMap.put(subCats.getID(), subCats));
		return subCatMap;
	}
}
