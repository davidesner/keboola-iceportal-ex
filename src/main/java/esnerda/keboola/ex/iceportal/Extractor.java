package esnerda.keboola.ex.iceportal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.cxf.common.util.StringUtils;

import com.iceportal.services.service.BrochureListItem;
import com.iceportal.services.service.Categories;
import com.iceportal.services.service.ICESubCategories;
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
import esnerda.keboola.ex.iceportal.result.impl.CategoriesWriter;
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
	private static IcePortalWsService iceWsWithouMtype;
	private static KBCLogger log;

	/* writers */
	private static IResultWriter<PropertyIDInfo> propResultWriter;
	private static IResultWriter<PropertyVisuals> propVisualsWriter;
	private static IResultWriter<BrochureListItem> propTypesWriter;
	private static IResultWriter<Item> languagesWriter;
	private static IResultWriter<PropertyRoomTypeWrapper> propertRoomTypesWriter;
	private static IResultWriter<Map<Categories, ICESubCategories>> categoriesWriter;

	public static void main(String[] args) {
		log = new DefaultLogger(Extractor.class);
		List<ResultFileMetadata> results = new ArrayList<>();

		initEnv(args);
		initWriters();
		LocalDate now = LocalDate.now();
		IpLastState lastState = null;
		try {
			lastState = Optional.ofNullable((IpLastState) handler.getStateFile()).orElse(new IpLastState());
		} catch (KBCException e1) {
			handleException(e1);
		}
		String lastRunParam = !StringUtils.isEmpty(config.getSinceString()) ? config.getSinceString()
				: lastState.getLastRunString();

		try {
			List<PropertyIDInfo> propertiesRes = iceWs.getProperties(config.getPubStatus().toString(),
					config.getModType().toString(), lastRunParam, config.getPropertyTypesString(), "0");

			log.info("Retrieving properties changed since last run.");
			/* collect result */
			results.addAll(propResultWriter.writeAndRetrieveResuts(propertiesRes));
			log.info("Retrieving property visuals..");
			for (PropertyIDInfo prop : propertiesRes) {
				tryGetPropertyVisuals(prop);
			}
			// collect results
			log.info("Collectiong results...");
			results.addAll(propVisualsWriter.closeAndRetrieveMetadata());

			log.info("Getting propery types...");
			results.addAll(propTypesWriter.writeAndRetrieveResuts(iceWs.getPropertyTypes()));

			log.info("Getting languages...");
			results.addAll(languagesWriter.writeAndRetrieveResuts(iceWsWithouMtype.getLanguages()));

			log.info("Getting categories...");
			categoriesWriter.writeResult(iceWsWithouMtype.getCategories());
			results.addAll(categoriesWriter.closeAndRetrieveMetadata());

		} catch (Exception e) {
			handleException(new KBCException("", "Extraction failed. " + e.getMessage(), e, 1));
		}

		finalize(results, new IpLastState(now));

		log.info("Finished sucessfully.");

	}

	private static void tryGetPropertyVisuals(PropertyIDInfo property) {
		PropertyVisuals visuals;
		try {
			visuals = iceWs.getVisuals(property.getMappedID(), DEF_PROTOCOL, config.getLinkType(), null);
			propVisualsWriter.writeResult(visuals);
			tryGetRoomTypes(property);
		} catch (Exception e) {
			log.warning("Failed to get property " + property.getIceID() + " visuals. " + e.getMessage(), e);
		}
	}

	private static void tryGetRoomTypes(PropertyIDInfo property) {
		try {
			// why is Mtype failing?
			propertRoomTypesWriter.writeAllResults(PropertyRoomTypeWrapper.Builder.build(property.getIceID(),
					iceWsWithouMtype.getRoomTypesForProperty(property.getMappedID())));
		} catch (Exception e) {
			log.warning("Failed to get property " + property.getIceID() + " room types. " + e.getMessage(), e);
		}
	}

	private static void initEnv(String[] args) {
		handler = initHandler(args, log);
		config = (IcePortalConfigParameters) handler.getParameters();
		try {
			iceWs = new IcePortalWsService(log.getLogger(),
					new IceportalWsClient(
							new IceClientConfig(config.getUserName(), config.getPassword(), config.getUserMtype()),
							log.getLogger(), config.isDebug()));
			iceWsWithouMtype = new IcePortalWsService(log.getLogger(),
					new IceportalWsClient(new IceClientConfig(config.getUserName(), config.getPassword(), null),
							log.getLogger(), config.isDebug()));

		} catch (Exception e) {
			handleException(new KBCException("Failed to init web service!", e.getMessage(), e, 2));
		}
	}

	private static void initWriters() {
		try {
			propResultWriter = new DefaultBeanResultWriter<>("property.csv", new String[] { "iceID" });
			propResultWriter.initWriter(handler.getOutputTablesPath(), PropertyIDInfo.class);

			propVisualsWriter = new PropertyVisualWriter();
			propVisualsWriter.initWriter(handler.getOutputTablesPath(), PropertyVisuals.class);

			propTypesWriter = new DefaultBeanResultWriter<BrochureListItem>("propertyTypes.csv",
					new String[] { "isoCode" });
			propTypesWriter.initWriter(handler.getOutputTablesPath(), BrochureListItem.class);

			languagesWriter = new DefaultBeanResultWriter<Item>("languages.csv", new String[] { "lcid" });
			languagesWriter.initWriter(handler.getOutputTablesPath(), Item.class);

			propertRoomTypesWriter = new DefaultBeanResultWriter<PropertyRoomTypeWrapper>("propertyRoomTypes.csv",
					new String[] { "propIceId", "roomTypeCode" });
			propertRoomTypesWriter.initWriter(handler.getOutputTablesPath(), PropertyRoomTypeWrapper.class);

			categoriesWriter = new CategoriesWriter();
			categoriesWriter.initWriter(handler.getOutputTablesPath(), null);
		} catch (Exception e) {
			handleException(new KBCException("Failed to init writer!", e.getMessage(), e, 1));
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

	private static void finalize(List<ResultFileMetadata> results, IpLastState thisState) {
		try {
			saveResults(results);

			handler.writeStateFile(thisState);
		} catch (KBCException e) {
			handleException(e);
		}
	}

	private static ManifestFile generateManifestFile(ResultFileMetadata result) throws KBCException {
		return ManifestFile.Builder.buildDefaultFromResult(result, null, config.getIncremental()).build();
	}

	private static void handleException(KBCException ex) {
		log.log(ex);
		if (ex.getSeverity() > 2) {
			System.exit(ex.getSeverity() - 1);
		}
	}

}
