package esnerda.keboola.ex.iceportal.ws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.cxf.clustering.FailoverFeature;
import org.apache.cxf.clustering.RetryStrategy;
import org.apache.cxf.common.util.StringUtils;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.apache.logging.log4j.Logger;

import com.iceportal.services.service.ArrayOfBrochureIDInfo;
import com.iceportal.services.service.ArrayOfBrochureInfo;
import com.iceportal.services.service.ArrayOfBrochureInfos;
import com.iceportal.services.service.ArrayOfCategories;
import com.iceportal.services.service.ArrayOfICESubCategories;
import com.iceportal.services.service.ArrayOfImage;
import com.iceportal.services.service.ArrayOfItem;
import com.iceportal.services.service.ArrayOfMappingInfo;
import com.iceportal.services.service.ArrayOfPropertyIDInfo;
import com.iceportal.services.service.ArrayOfRoomType;
import com.iceportal.services.service.ArrayOfString;
import com.iceportal.services.service.ArrayOfUpdatedBrochureIDInfo;
import com.iceportal.services.service.ArrayOfUpdatedBrochureIDInfoV1;
import com.iceportal.services.service.ArrayOfUpdatedBrochureInfo;
import com.iceportal.services.service.Brochure;
import com.iceportal.services.service.BrochureListItem;
import com.iceportal.services.service.BrochureV1;
import com.iceportal.services.service.BrochureV2;
import com.iceportal.services.service.ICEAuthHeader;
import com.iceportal.services.service.ICEAuthHeaderWithMType;
import com.iceportal.services.service.ICEWebService;
import com.iceportal.services.service.ICEWebServiceSoap;
import com.iceportal.services.service.LookupMappedIDInfo;
import com.iceportal.services.service.MappingInfo;
import com.iceportal.services.service.PropertyInfoV1;
import com.iceportal.services.service.PropertyVisuals;
import com.iceportal.services.service.RoomTypeCodes;
import com.iceportal.services.service.SearchBrchureInfoV2;
import com.iceportal.services.service.SearchBrochureInfo;

import esnerda.keboola.ex.iceportal.ws.interceptor.CustomLoggingInInterceptor;
import esnerda.keboola.ex.iceportal.ws.interceptor.CustomLoggingOutInterceptor;

/**
 * @author David Esner
 */
public class IceportalWsClient implements ICEWebServiceSoap {

	private static final int MAX_RETRIES = 5;
	private static final long FAILOVER_DELAY = 10000L;
	private static final String ICEPORTAL_NAMESPACE = "http://services.iceportal.com/service";

	private final ICEAuthHeader iceAuthHeader;
	private final ICEAuthHeaderWithMType iceAuthHeaderWithMType;
	private ICEWebServiceSoap iceWsClient;
	private Logger logger;

	public IceportalWsClient(IceClientConfig config, Logger logger, boolean debug) throws Exception {
		if (!config.isValid()) {
			throw new Exception("Both userName and password must be filled");
		}
		this.logger = logger;
		if (StringUtils.isEmpty(config.getUserMtype())) {
			this.iceAuthHeader = new ICEAuthHeader();
			this.iceAuthHeader.setUsername(config.getUserName());
			this.iceAuthHeader.setPassword(config.getPassword());
			this.iceAuthHeaderWithMType = null;
			configureIceClient(iceAuthHeader, ICEAuthHeader.class, debug);
		} else {
			this.iceAuthHeaderWithMType = new ICEAuthHeaderWithMType();
			this.iceAuthHeaderWithMType.setUsername(config.getUserName());
			this.iceAuthHeaderWithMType.setPassword(config.getPassword());
			this.iceAuthHeaderWithMType.setUserMType(config.getUserMtype());
			this.iceAuthHeader = null;
			configureIceClient(iceAuthHeaderWithMType, ICEAuthHeaderWithMType.class, debug);
		}	
	}

	@SuppressWarnings("rawtypes")
	private void configureIceClient(Object authHeader, Class authHeaderType, boolean debug) throws JAXBException {
		ICEWebService ss = new ICEWebService();
		this.iceWsClient = ss.getICEWebServiceSoap12();		
		List<Header> headers = new ArrayList<Header>();
		// set up interceptors
		Client cxfClient = ClientProxy.getClient(iceWsClient);
		//set retry stragtegy
        RetryStrategy retryStrategy = new RetryStrategy(); 
        retryStrategy.setMaxNumberOfRetries(MAX_RETRIES);
        retryStrategy.setDelayBetweenRetries(FAILOVER_DELAY);
        FailoverFeature failoverFeature = new FailoverFeature(); 
        failoverFeature.setStrategy(retryStrategy); 
        failoverFeature.initialize(cxfClient, cxfClient.getBus());
		if (debug) {
			cxfClient.getOutInterceptors().add(new CustomLoggingOutInterceptor(logger));
			cxfClient.getInInterceptors().add(new CustomLoggingInInterceptor(logger));
		}		
		HTTPConduit http = (HTTPConduit) cxfClient.getConduit();
		
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		httpClientPolicy.setConnectionTimeout(0);
		httpClientPolicy.setReceiveTimeout(0);

		http.setClient(httpClientPolicy);

		Header header = new Header(new QName(ICEPORTAL_NAMESPACE, authHeaderType.getSimpleName()), authHeader,
				new JAXBDataBinding(authHeaderType));
		headers.add(header);
		((BindingProvider) iceWsClient).getRequestContext().put(Header.HEADER_LIST, headers);
	}

	/** Implemented methods **/
	@Override
	public void getVisuals(String mappedID, String protocol, String linkType, String photoSize,
			Holder<Integer> getVisualsResult, Holder<String> errorMessage, Holder<PropertyVisuals> property) {
		iceWsClient.getVisuals(mappedID, protocol, linkType, photoSize, getVisualsResult, errorMessage, property);
	}

	@Override
	public void getProperties(String publicationStatus, String modifiedTypeOption, String sinceDate,
			String propertyType, String includeSupplierInfo, Holder<Integer> getPropertiesResult,
			Holder<String> errorMessage, Holder<ArrayOfPropertyIDInfo> info) {
		iceWsClient.getProperties(publicationStatus, modifiedTypeOption, sinceDate, propertyType, includeSupplierInfo,
				getPropertiesResult, errorMessage, info);
	}

	@Override
	public void getRoomTypesForProperty(String mappedID, Holder<Integer> getRoomTypesForPropertyResult,
			Holder<String> errorMessage, Holder<ArrayOfRoomType> roomTypes) {
		iceWsClient.getRoomTypesForProperty(mappedID, getRoomTypesForPropertyResult, errorMessage, roomTypes);

	}

	@Override
	public void getLanguages(Holder<Integer> getLanguagesResult, Holder<String> errorMessage,
			Holder<ArrayOfItem> languages) {
		iceWsClient.getLanguages(getLanguagesResult, errorMessage, languages);
	}

	@Override
	public void getCategories(Holder<Integer> getCategoriesResult, Holder<String> errorMessage,
			Holder<ArrayOfCategories> otaCategories, Holder<ArrayOfICESubCategories> iceCategories) {
		iceWsClient.getCategories(getCategoriesResult, errorMessage, otaCategories, iceCategories);
	}

	//unimplemented

	@Override
	public void getRoomTypesForImage(int publicID, Holder<Integer> getRoomTypesForImageResult,
			Holder<String> errorMessage, Holder<RoomTypeCodes> roomTypeCodes) {
		// TODO Auto-generated method stub

	}

	@Override
	public SearchBrchureInfoV2 searchBrochuresV2(int did, String hotelName, String city, String state, String country,
			String region, String type, String videosExist, String hd360sExist, String photosExist, String iFrameExist,
			String customContentExist, String pageSize, String pageNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SearchBrochureInfo searchBrochures(int did, String hotelName, String city, String state, String country,
			String region, String type, String videosExist, String vRsExist, String photosExist, String infoExist,
			String generalInfoExist, String locationInfoExist, String pdfExist, String rrExist, String pageSize,
			String pageNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getNewBrochuresSince(XMLGregorianCalendar datefrom, Holder<Integer> getNewBrochuresSinceResult,
			Holder<String> errorMessage, Holder<ArrayOfBrochureInfo> info) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getNewBrochureIDsSince(XMLGregorianCalendar datefrom, Holder<Integer> getNewBrochureIDsSinceResult,
			Holder<String> errorMessage, Holder<ArrayOfBrochureInfos> info) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllBrochureIDs(Holder<Integer> getAllBrochureIDsResult, Holder<String> errorMessage,
			Holder<ArrayOfString> iDs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getPropertyInfoV1(String mappedID, Holder<Integer> getPropertyInfoV1Result, Holder<String> errorMessage,
			Holder<PropertyInfoV1> brochure) {
		// TODO Auto-generated method stub

	}

	@Override
	public void lookupMappedID(String searchAccountID, String searchMType, String searchMappedID,
			Holder<Integer> lookupMappedIDResult, Holder<String> errorMessage, Holder<LookupMappedIDInfo> mappingInfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDirectVideoLinks(String mappedID, Holder<Integer> getDirectVideoLinksResult,
			Holder<String> errorMessage, Holder<Brochure> brochure) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getNewBrochures(XMLGregorianCalendar datefrom, XMLGregorianCalendar dateto,
			Holder<Integer> getNewBrochuresResult, Holder<String> errorMessage, Holder<ArrayOfBrochureInfo> info) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getBrochureStatus(String mappedID, Holder<Integer> getBrochureStatusResult, Holder<String> errorMessage,
			Holder<Boolean> enabled, Holder<Boolean> published) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getRegions(Holder<Integer> getRegionsResult, Holder<String> errorMessage,
			Holder<List<BrochureListItem>> region) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getBrochure(String mappedID, Holder<Integer> getBrochureResult, Holder<String> errorMessage,
			Holder<Brochure> brochure) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getMappingInfo(String mappedID, Holder<Integer> getMappingInfoResult, Holder<String> errorMessage,
			Holder<MappingInfo> info) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getStates(int countryID, Holder<Integer> getStatesResult, Holder<String> errorMessage,
			Holder<List<BrochureListItem>> state) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getImagesOfRoomType(String roomTypeCode, String mappedID, Holder<Integer> getImagesOfRoomTypeResult,
			Holder<String> errorMessage, Holder<ArrayOfImage> images) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getUpdatedBrochureIDsSinceV1(XMLGregorianCalendar datefrom,
			Holder<Integer> getUpdatedBrochureIDsSinceV1Result, Holder<String> errorMessage,
			Holder<ArrayOfUpdatedBrochureIDInfoV1> info) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllMappings(Holder<Integer> getAllMappingsResult, Holder<String> errorMessage,
			Holder<ArrayOfMappingInfo> info) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllBrochureIDsV2(Holder<Integer> getAllBrochureIDsV2Result, Holder<String> errorMessage,
			Holder<ArrayOfBrochureIDInfo> iDinfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getUpdatedBrochuresSince(XMLGregorianCalendar datefrom, Holder<Integer> getUpdatedBrochuresSinceResult,
			Holder<String> errorMessage, Holder<ArrayOfUpdatedBrochureInfo> info) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCountries(Holder<Integer> getCountriesResult, Holder<String> errorMessage,
			Holder<List<BrochureListItem>> country) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getPropertyTypes(Holder<Integer> getPropertyTypesResult, Holder<String> errorMessage,
			Holder<List<BrochureListItem>> type) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getUpdatedBrochureIDsSince(XMLGregorianCalendar datefrom,
			Holder<Integer> getUpdatedBrochureIDsSinceResult, Holder<String> errorMessage,
			Holder<ArrayOfUpdatedBrochureIDInfo> info) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getBrochureV2(String mappedID, Holder<Integer> getBrochureV2Result, Holder<String> errorMessage,
			Holder<BrochureV2> brochure) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getBrochureV1(String mappedID, Holder<Integer> getBrochureV1Result, Holder<String> errorMessage,
			Holder<BrochureV1> brochure) {
		// TODO Auto-generated method stub

	}



}