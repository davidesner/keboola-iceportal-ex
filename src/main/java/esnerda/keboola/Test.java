package esnerda.keboola;

import java.util.Map;

import esnerda.keboola.components.result.IResultWriter;
import esnerda.keboola.components.result.impl.DefaultBeanResultWriter;
import esnerda.keboola.ex.iceportal.result.wrappers.PropertyRoomTypeWrapper;
import esnerda.keboola.ex.iceportal.ws.IceClientConfig;
import esnerda.keboola.ex.iceportal.ws.IcePortalWsService;
import esnerda.keboola.ex.iceportal.ws.IceportalWsClient;

/**
 * @author David Esner
 */
public class Test {

	public static void main(String[] args) throws Exception {
		
		IcePortalWsService iceWs = new IcePortalWsService(null, new IceportalWsClient(new IceClientConfig("visuals@gta-travel.com", "Qio98AbP", null),
				null, true));
		

		IResultWriter<PropertyRoomTypeWrapper>  propertRoomTypesWriter = new DefaultBeanResultWriter<PropertyRoomTypeWrapper>("propertyRoomTypesTest.csv",
				new String[] { "propIceId", "roomTypeCode" });
		propertRoomTypesWriter.initWriter("C:\\Users\\esner\\Documents\\Prace\\KBC\\keboola-ex-iceportal", PropertyRoomTypeWrapper.class);
		propertRoomTypesWriter.writeAllResults(PropertyRoomTypeWrapper.Builder.build(90440,
				iceWs.getRoomTypesForProperty("ICE90440")));
		propertRoomTypesWriter.closeAndRetrieveMetadata();
		Map map = iceWs.getCategories();
		System.out.println("done");

	}

}
