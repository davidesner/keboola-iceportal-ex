package esnerda.keboola.ex.iceportal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.iceportal.services.service.BrochureListItem;
import com.iceportal.services.service.Item;
import com.iceportal.services.service.PropertyIDInfo;
import com.iceportal.services.service.PropertyVisuals;

import esnerda.keboola.components.KBCException;
import esnerda.keboola.components.configuration.handler.ConfigHandlerBuilder;
import esnerda.keboola.components.configuration.handler.KBCConfigurationEnvHandler;
import esnerda.keboola.components.configuration.tableconfig.ManifestFile;
import esnerda.keboola.components.logging.DefaultLogger;
import esnerda.keboola.components.logging.KBCLogger;
import esnerda.keboola.components.result.IResultWriter;
import esnerda.keboola.components.result.ResultFileMetadata;
import esnerda.keboola.components.result.impl.DefaultBeanResultWriter;
import esnerda.keboola.ex.iceportal.config.IcePortalConfigParameters;
import esnerda.keboola.ex.iceportal.config.IpLastState;
import esnerda.keboola.ex.iceportal.result.impl.PropertyVisualWriter;
import esnerda.keboola.ex.iceportal.result.wrappers.PropertyRoomTypeWrapper;
import esnerda.keboola.ex.iceportal.ws.IceClientConfig;
import esnerda.keboola.ex.iceportal.ws.IcePortalWsService;
import esnerda.keboola.ex.iceportal.ws.IceportalWsClient;

/**
 * @author David Esner
 */
public class Extractor {
	private static final String DEF_PROTOCOL = "HTTP";

	private static KBCConfigurationEnvHandler handler;
	private static IcePortalConfigParameters config;
	private static IcePortalWsService iceWs;
	private static KBCLogger log;
	
	/* writers */
	private static IResultWriter<PropertyIDInfo> propResultWriter;
	private static IResultWriter<PropertyVisuals> propVisualsWriter;
	private static IResultWriter<BrochureListItem> propTypesWriter;
	private static IResultWriter<Item> languagesWriter;
	private static IResultWriter<PropertyRoomTypeWrapper> propertRoomTypesWriter;

	public static void main(String[] args) {
		log = new DefaultLogger(Extractor.class);
		List<ResultFileMetadata> results = new ArrayList<>();

		try {
			initEnv(args);
			initWriters();
			LocalDate now = LocalDate.now();
			IpLastState lastState = (IpLastState) handler.getStateFile();

			try {
				List<PropertyIDInfo> propertiesRes = iceWs.getProperties(config.getPubStatus().toString(),
						config.getModType().toString(), config.getFullLoad() ? null : "2017-03-01"/*lastState.getLastRunString()*/, config.getPropertyTypesString(), "0");

				/* collect result */
				results.addAll(propResultWriter.writeAndRetrieveResuts(propertiesRes));

				for (PropertyIDInfo prop : propertiesRes) {
					PropertyVisuals visuals = iceWs.getVisuals(prop.getMappedID(), DEF_PROTOCOL, config.getLinkType(),
							null);
					propVisualsWriter.writeResult(visuals);
					propertRoomTypesWriter.writeAllResults(PropertyRoomTypeWrapper.Builder.build(prop.getIceID(),
							iceWs.getRoomTypesForProperty(prop.getMappedID())));
				}
				// collect results
				results.addAll(propVisualsWriter.closeAndRetrieveMetadata());
				
				results.addAll(propTypesWriter.writeAndRetrieveResuts(iceWs.getPropertyTypes()));
				results.addAll(languagesWriter.writeAndRetrieveResuts(iceWs.getLanguages()));
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			saveResults(results);
			
			handler.writeStateFile(new IpLastState(now));
			
		} catch (KBCException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private static void initEnv(String[] args) throws KBCException {
		handler = initHandler(args, log);
		config = (IcePortalConfigParameters) handler.getParameters();
		try {
			iceWs = new IcePortalWsService(log.getLogger(), new IceportalWsClient(new IceClientConfig(config.getUserName(), config.getPassword(), config.getUserMtype()),
					log.getLogger(), config.isDebug()));
		} catch (Exception e) {
			throw new KBCException("Failed to init web service!", e.getMessage(), e);
		}		
	}

	private static void initWriters() throws KBCException {
		try {
			propResultWriter = new DefaultBeanResultWriter<>("property.csv", new String[]{"iceID"});
			propResultWriter.initWriter(handler.getOutputTablesPath(), PropertyIDInfo.class);

			propVisualsWriter = new PropertyVisualWriter();
			propVisualsWriter.initWriter(handler.getOutputTablesPath(), PropertyVisuals.class);

			propTypesWriter = new DefaultBeanResultWriter<BrochureListItem>("propertyTypes.csv", new String[]{"isoCode"});
			propTypesWriter.initWriter(handler.getOutputTablesPath(), BrochureListItem.class);
			
			languagesWriter = new DefaultBeanResultWriter<Item>("languages.csv", new String[]{"lcid"});
			languagesWriter.initWriter(handler.getOutputTablesPath(), Item.class);
			
			propertRoomTypesWriter = new DefaultBeanResultWriter<PropertyRoomTypeWrapper>("propertyRoomTypes.csv", new String[]{"propIceId", "roomTypeCode"});
			propertRoomTypesWriter.initWriter(handler.getOutputTablesPath(), PropertyRoomTypeWrapper.class);
		} catch (Exception e) {
			throw new KBCException("Failed to init writer!", e.getMessage(), e);
		}
	}

	private static KBCConfigurationEnvHandler initHandler(String[] args, KBCLogger log) {
		KBCConfigurationEnvHandler handler = null;
		try {
			handler = ConfigHandlerBuilder.create(IcePortalConfigParameters.class).hasInputTables(false)
					.setStateFileType(IpLastState.class).build();
			// process the configuration
			handler.processConfigFile(args);			
		} catch (KBCException ex) {
			log.log(ex);
			System.exit(1);
		}
		return handler;
	}

	private static void saveResults(List<ResultFileMetadata> results) throws KBCException {
		for (ResultFileMetadata res : results) {
			handler.writeManifestFile(generateManifestFile(res));
		}
	}

	private static ManifestFile generateManifestFile(ResultFileMetadata result) throws KBCException {
		return ManifestFile.Builder.buildDefaultFromResult(result).setIncrementalLoad(config.getIncremental()).build();
	}

}
