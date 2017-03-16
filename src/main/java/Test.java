import java.util.ArrayList;
import java.util.List;

import com.iceportal.services.service.PropertyVisuals;

import esnerda.keboola.ex.iceportal.result.IResultWriter;
import esnerda.keboola.ex.iceportal.result.ResultFileMetadata;
import esnerda.keboola.ex.iceportal.result.impl.PropertyVisualWriter;
import esnerda.keboola.ex.iceportal.ws.IcePortalWsService;

/**
 * @author David Esner
 */
public class Test {

	public static void main(String[] args) throws Exception {
		
		IcePortalWsService ws = new IcePortalWsService("visuals@gta-travel.com", "Qio98AbP", "9132",null);
//		IResultWriter propResultWriter = new DefaultBeanResultWriter<>("property.csv", new String[]{"iceID"});
//		propResultWriter.initWriter("./", PropertyIDInfo.class);
//		
		//List<PropertyIDInfo> propertiesRes = ws.getProperties("1",	"2", "2017-01-03", "0", "1");
		List<ResultFileMetadata> results = new ArrayList<>();
		/* collect result */
		IResultWriter<PropertyVisuals> propVisualsWriter = new PropertyVisualWriter();
		propVisualsWriter.initWriter("./", PropertyVisuals.class);
		PropertyVisuals visuals = ws.getVisuals("ICE65", "HTTP", null,
				null);
		propVisualsWriter.writeResult(visuals);
		propVisualsWriter.closeAndRetrieveMetadata();
	        
		
	}

}
