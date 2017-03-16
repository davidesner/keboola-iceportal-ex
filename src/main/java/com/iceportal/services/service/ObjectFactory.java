
package com.iceportal.services.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.iceportal.services.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ICEAuthHeader_QNAME = new QName("http://services.iceportal.com/service", "ICEAuthHeader");
    private final static QName _ICEAuthHeaderWithMType_QNAME = new QName("http://services.iceportal.com/service", "ICEAuthHeaderWithMType");
    private final static QName _SearchBrochureInfo_QNAME = new QName("http://services.iceportal.com/service", "SearchBrochureInfo");
    private final static QName _SearchBrchureInfoV2_QNAME = new QName("http://services.iceportal.com/service", "SearchBrchureInfoV2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.iceportal.services.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllBrochureIDsV2 }
     * 
     */
    public GetAllBrochureIDsV2 createGetAllBrochureIDsV2() {
        return new GetAllBrochureIDsV2();
    }

    /**
     * Create an instance of {@link GetAllBrochureIDsV2Response }
     * 
     */
    public GetAllBrochureIDsV2Response createGetAllBrochureIDsV2Response() {
        return new GetAllBrochureIDsV2Response();
    }

    /**
     * Create an instance of {@link ArrayOfBrochureIDInfo }
     * 
     */
    public ArrayOfBrochureIDInfo createArrayOfBrochureIDInfo() {
        return new ArrayOfBrochureIDInfo();
    }

    /**
     * Create an instance of {@link ICEAuthHeader }
     * 
     */
    public ICEAuthHeader createICEAuthHeader() {
        return new ICEAuthHeader();
    }

    /**
     * Create an instance of {@link GetCategories }
     * 
     */
    public GetCategories createGetCategories() {
        return new GetCategories();
    }

    /**
     * Create an instance of {@link GetCategoriesResponse }
     * 
     */
    public GetCategoriesResponse createGetCategoriesResponse() {
        return new GetCategoriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCategories }
     * 
     */
    public ArrayOfCategories createArrayOfCategories() {
        return new ArrayOfCategories();
    }

    /**
     * Create an instance of {@link ArrayOfICESubCategories }
     * 
     */
    public ArrayOfICESubCategories createArrayOfICESubCategories() {
        return new ArrayOfICESubCategories();
    }

    /**
     * Create an instance of {@link GetAllBrochureIDs }
     * 
     */
    public GetAllBrochureIDs createGetAllBrochureIDs() {
        return new GetAllBrochureIDs();
    }

    /**
     * Create an instance of {@link GetAllBrochureIDsResponse }
     * 
     */
    public GetAllBrochureIDsResponse createGetAllBrochureIDsResponse() {
        return new GetAllBrochureIDsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetBrochureStatus }
     * 
     */
    public GetBrochureStatus createGetBrochureStatus() {
        return new GetBrochureStatus();
    }

    /**
     * Create an instance of {@link GetBrochureStatusResponse }
     * 
     */
    public GetBrochureStatusResponse createGetBrochureStatusResponse() {
        return new GetBrochureStatusResponse();
    }

    /**
     * Create an instance of {@link LookupMappedID }
     * 
     */
    public LookupMappedID createLookupMappedID() {
        return new LookupMappedID();
    }

    /**
     * Create an instance of {@link LookupMappedIDResponse }
     * 
     */
    public LookupMappedIDResponse createLookupMappedIDResponse() {
        return new LookupMappedIDResponse();
    }

    /**
     * Create an instance of {@link LookupMappedIDInfo }
     * 
     */
    public LookupMappedIDInfo createLookupMappedIDInfo() {
        return new LookupMappedIDInfo();
    }

    /**
     * Create an instance of {@link ICEAuthHeaderWithMType }
     * 
     */
    public ICEAuthHeaderWithMType createICEAuthHeaderWithMType() {
        return new ICEAuthHeaderWithMType();
    }

    /**
     * Create an instance of {@link GetMappingInfo }
     * 
     */
    public GetMappingInfo createGetMappingInfo() {
        return new GetMappingInfo();
    }

    /**
     * Create an instance of {@link GetMappingInfoResponse }
     * 
     */
    public GetMappingInfoResponse createGetMappingInfoResponse() {
        return new GetMappingInfoResponse();
    }

    /**
     * Create an instance of {@link MappingInfo }
     * 
     */
    public MappingInfo createMappingInfo() {
        return new MappingInfo();
    }

    /**
     * Create an instance of {@link GetAllMappings }
     * 
     */
    public GetAllMappings createGetAllMappings() {
        return new GetAllMappings();
    }

    /**
     * Create an instance of {@link GetAllMappingsResponse }
     * 
     */
    public GetAllMappingsResponse createGetAllMappingsResponse() {
        return new GetAllMappingsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMappingInfo }
     * 
     */
    public ArrayOfMappingInfo createArrayOfMappingInfo() {
        return new ArrayOfMappingInfo();
    }

    /**
     * Create an instance of {@link SearchBrochures }
     * 
     */
    public SearchBrochures createSearchBrochures() {
        return new SearchBrochures();
    }

    /**
     * Create an instance of {@link SearchBrochuresResponse }
     * 
     */
    public SearchBrochuresResponse createSearchBrochuresResponse() {
        return new SearchBrochuresResponse();
    }

    /**
     * Create an instance of {@link SearchBrochureInfo }
     * 
     */
    public SearchBrochureInfo createSearchBrochureInfo() {
        return new SearchBrochureInfo();
    }

    /**
     * Create an instance of {@link SearchBrochuresV2 }
     * 
     */
    public SearchBrochuresV2 createSearchBrochuresV2() {
        return new SearchBrochuresV2();
    }

    /**
     * Create an instance of {@link SearchBrochuresV2Response }
     * 
     */
    public SearchBrochuresV2Response createSearchBrochuresV2Response() {
        return new SearchBrochuresV2Response();
    }

    /**
     * Create an instance of {@link SearchBrchureInfoV2 }
     * 
     */
    public SearchBrchureInfoV2 createSearchBrchureInfoV2() {
        return new SearchBrchureInfoV2();
    }

    /**
     * Create an instance of {@link GetNewBrochureIDsSince }
     * 
     */
    public GetNewBrochureIDsSince createGetNewBrochureIDsSince() {
        return new GetNewBrochureIDsSince();
    }

    /**
     * Create an instance of {@link GetNewBrochureIDsSinceResponse }
     * 
     */
    public GetNewBrochureIDsSinceResponse createGetNewBrochureIDsSinceResponse() {
        return new GetNewBrochureIDsSinceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBrochureInfos }
     * 
     */
    public ArrayOfBrochureInfos createArrayOfBrochureInfos() {
        return new ArrayOfBrochureInfos();
    }

    /**
     * Create an instance of {@link GetNewBrochures }
     * 
     */
    public GetNewBrochures createGetNewBrochures() {
        return new GetNewBrochures();
    }

    /**
     * Create an instance of {@link GetNewBrochuresResponse }
     * 
     */
    public GetNewBrochuresResponse createGetNewBrochuresResponse() {
        return new GetNewBrochuresResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBrochureInfo }
     * 
     */
    public ArrayOfBrochureInfo createArrayOfBrochureInfo() {
        return new ArrayOfBrochureInfo();
    }

    /**
     * Create an instance of {@link GetNewBrochuresSince }
     * 
     */
    public GetNewBrochuresSince createGetNewBrochuresSince() {
        return new GetNewBrochuresSince();
    }

    /**
     * Create an instance of {@link GetNewBrochuresSinceResponse }
     * 
     */
    public GetNewBrochuresSinceResponse createGetNewBrochuresSinceResponse() {
        return new GetNewBrochuresSinceResponse();
    }

    /**
     * Create an instance of {@link GetUpdatedBrochuresSince }
     * 
     */
    public GetUpdatedBrochuresSince createGetUpdatedBrochuresSince() {
        return new GetUpdatedBrochuresSince();
    }

    /**
     * Create an instance of {@link GetUpdatedBrochuresSinceResponse }
     * 
     */
    public GetUpdatedBrochuresSinceResponse createGetUpdatedBrochuresSinceResponse() {
        return new GetUpdatedBrochuresSinceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUpdatedBrochureInfo }
     * 
     */
    public ArrayOfUpdatedBrochureInfo createArrayOfUpdatedBrochureInfo() {
        return new ArrayOfUpdatedBrochureInfo();
    }

    /**
     * Create an instance of {@link GetUpdatedBrochureIDsSince }
     * 
     */
    public GetUpdatedBrochureIDsSince createGetUpdatedBrochureIDsSince() {
        return new GetUpdatedBrochureIDsSince();
    }

    /**
     * Create an instance of {@link GetUpdatedBrochureIDsSinceResponse }
     * 
     */
    public GetUpdatedBrochureIDsSinceResponse createGetUpdatedBrochureIDsSinceResponse() {
        return new GetUpdatedBrochureIDsSinceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUpdatedBrochureIDInfo }
     * 
     */
    public ArrayOfUpdatedBrochureIDInfo createArrayOfUpdatedBrochureIDInfo() {
        return new ArrayOfUpdatedBrochureIDInfo();
    }

    /**
     * Create an instance of {@link GetUpdatedBrochureIDsSinceV1 }
     * 
     */
    public GetUpdatedBrochureIDsSinceV1 createGetUpdatedBrochureIDsSinceV1() {
        return new GetUpdatedBrochureIDsSinceV1();
    }

    /**
     * Create an instance of {@link GetUpdatedBrochureIDsSinceV1Response }
     * 
     */
    public GetUpdatedBrochureIDsSinceV1Response createGetUpdatedBrochureIDsSinceV1Response() {
        return new GetUpdatedBrochureIDsSinceV1Response();
    }

    /**
     * Create an instance of {@link ArrayOfUpdatedBrochureIDInfoV1 }
     * 
     */
    public ArrayOfUpdatedBrochureIDInfoV1 createArrayOfUpdatedBrochureIDInfoV1() {
        return new ArrayOfUpdatedBrochureIDInfoV1();
    }

    /**
     * Create an instance of {@link GetBrochure }
     * 
     */
    public GetBrochure createGetBrochure() {
        return new GetBrochure();
    }

    /**
     * Create an instance of {@link GetBrochureResponse }
     * 
     */
    public GetBrochureResponse createGetBrochureResponse() {
        return new GetBrochureResponse();
    }

    /**
     * Create an instance of {@link Brochure }
     * 
     */
    public Brochure createBrochure() {
        return new Brochure();
    }

    /**
     * Create an instance of {@link GetBrochureV1 }
     * 
     */
    public GetBrochureV1 createGetBrochureV1() {
        return new GetBrochureV1();
    }

    /**
     * Create an instance of {@link GetBrochureV1Response }
     * 
     */
    public GetBrochureV1Response createGetBrochureV1Response() {
        return new GetBrochureV1Response();
    }

    /**
     * Create an instance of {@link BrochureV1 }
     * 
     */
    public BrochureV1 createBrochureV1() {
        return new BrochureV1();
    }

    /**
     * Create an instance of {@link GetBrochureV2 }
     * 
     */
    public GetBrochureV2 createGetBrochureV2() {
        return new GetBrochureV2();
    }

    /**
     * Create an instance of {@link GetBrochureV2Response }
     * 
     */
    public GetBrochureV2Response createGetBrochureV2Response() {
        return new GetBrochureV2Response();
    }

    /**
     * Create an instance of {@link BrochureV2 }
     * 
     */
    public BrochureV2 createBrochureV2() {
        return new BrochureV2();
    }

    /**
     * Create an instance of {@link GetPropertyInfoV1 }
     * 
     */
    public GetPropertyInfoV1 createGetPropertyInfoV1() {
        return new GetPropertyInfoV1();
    }

    /**
     * Create an instance of {@link GetPropertyInfoV1Response }
     * 
     */
    public GetPropertyInfoV1Response createGetPropertyInfoV1Response() {
        return new GetPropertyInfoV1Response();
    }

    /**
     * Create an instance of {@link PropertyInfoV1 }
     * 
     */
    public PropertyInfoV1 createPropertyInfoV1() {
        return new PropertyInfoV1();
    }

    /**
     * Create an instance of {@link GetDirectVideoLinks }
     * 
     */
    public GetDirectVideoLinks createGetDirectVideoLinks() {
        return new GetDirectVideoLinks();
    }

    /**
     * Create an instance of {@link GetDirectVideoLinksResponse }
     * 
     */
    public GetDirectVideoLinksResponse createGetDirectVideoLinksResponse() {
        return new GetDirectVideoLinksResponse();
    }

    /**
     * Create an instance of {@link GetLanguages }
     * 
     */
    public GetLanguages createGetLanguages() {
        return new GetLanguages();
    }

    /**
     * Create an instance of {@link GetLanguagesResponse }
     * 
     */
    public GetLanguagesResponse createGetLanguagesResponse() {
        return new GetLanguagesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfItem }
     * 
     */
    public ArrayOfItem createArrayOfItem() {
        return new ArrayOfItem();
    }

    /**
     * Create an instance of {@link GetCountries }
     * 
     */
    public GetCountries createGetCountries() {
        return new GetCountries();
    }

    /**
     * Create an instance of {@link GetCountriesResponse }
     * 
     */
    public GetCountriesResponse createGetCountriesResponse() {
        return new GetCountriesResponse();
    }

    /**
     * Create an instance of {@link BrochureListItem }
     * 
     */
    public BrochureListItem createBrochureListItem() {
        return new BrochureListItem();
    }

    /**
     * Create an instance of {@link GetRegions }
     * 
     */
    public GetRegions createGetRegions() {
        return new GetRegions();
    }

    /**
     * Create an instance of {@link GetRegionsResponse }
     * 
     */
    public GetRegionsResponse createGetRegionsResponse() {
        return new GetRegionsResponse();
    }

    /**
     * Create an instance of {@link GetStates }
     * 
     */
    public GetStates createGetStates() {
        return new GetStates();
    }

    /**
     * Create an instance of {@link GetStatesResponse }
     * 
     */
    public GetStatesResponse createGetStatesResponse() {
        return new GetStatesResponse();
    }

    /**
     * Create an instance of {@link GetPropertyTypes }
     * 
     */
    public GetPropertyTypes createGetPropertyTypes() {
        return new GetPropertyTypes();
    }

    /**
     * Create an instance of {@link GetPropertyTypesResponse }
     * 
     */
    public GetPropertyTypesResponse createGetPropertyTypesResponse() {
        return new GetPropertyTypesResponse();
    }

    /**
     * Create an instance of {@link GetRoomTypesForProperty }
     * 
     */
    public GetRoomTypesForProperty createGetRoomTypesForProperty() {
        return new GetRoomTypesForProperty();
    }

    /**
     * Create an instance of {@link GetRoomTypesForPropertyResponse }
     * 
     */
    public GetRoomTypesForPropertyResponse createGetRoomTypesForPropertyResponse() {
        return new GetRoomTypesForPropertyResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRoomType }
     * 
     */
    public ArrayOfRoomType createArrayOfRoomType() {
        return new ArrayOfRoomType();
    }

    /**
     * Create an instance of {@link GetRoomTypesForImage }
     * 
     */
    public GetRoomTypesForImage createGetRoomTypesForImage() {
        return new GetRoomTypesForImage();
    }

    /**
     * Create an instance of {@link GetRoomTypesForImageResponse }
     * 
     */
    public GetRoomTypesForImageResponse createGetRoomTypesForImageResponse() {
        return new GetRoomTypesForImageResponse();
    }

    /**
     * Create an instance of {@link RoomTypeCodes }
     * 
     */
    public RoomTypeCodes createRoomTypeCodes() {
        return new RoomTypeCodes();
    }

    /**
     * Create an instance of {@link GetImagesOfRoomType }
     * 
     */
    public GetImagesOfRoomType createGetImagesOfRoomType() {
        return new GetImagesOfRoomType();
    }

    /**
     * Create an instance of {@link GetImagesOfRoomTypeResponse }
     * 
     */
    public GetImagesOfRoomTypeResponse createGetImagesOfRoomTypeResponse() {
        return new GetImagesOfRoomTypeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfImage }
     * 
     */
    public ArrayOfImage createArrayOfImage() {
        return new ArrayOfImage();
    }

    /**
     * Create an instance of {@link GetProperties }
     * 
     */
    public GetProperties createGetProperties() {
        return new GetProperties();
    }

    /**
     * Create an instance of {@link GetPropertiesResponse }
     * 
     */
    public GetPropertiesResponse createGetPropertiesResponse() {
        return new GetPropertiesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPropertyIDInfo }
     * 
     */
    public ArrayOfPropertyIDInfo createArrayOfPropertyIDInfo() {
        return new ArrayOfPropertyIDInfo();
    }

    /**
     * Create an instance of {@link GetVisuals }
     * 
     */
    public GetVisuals createGetVisuals() {
        return new GetVisuals();
    }

    /**
     * Create an instance of {@link GetVisualsResponse }
     * 
     */
    public GetVisualsResponse createGetVisualsResponse() {
        return new GetVisualsResponse();
    }

    /**
     * Create an instance of {@link PropertyVisuals }
     * 
     */
    public PropertyVisuals createPropertyVisuals() {
        return new PropertyVisuals();
    }

    /**
     * Create an instance of {@link BrochureIDInfo }
     * 
     */
    public BrochureIDInfo createBrochureIDInfo() {
        return new BrochureIDInfo();
    }

    /**
     * Create an instance of {@link Categories }
     * 
     */
    public Categories createCategories() {
        return new Categories();
    }

    /**
     * Create an instance of {@link ICESubCategories }
     * 
     */
    public ICESubCategories createICESubCategories() {
        return new ICESubCategories();
    }

    /**
     * Create an instance of {@link ArrayOfSubCategory }
     * 
     */
    public ArrayOfSubCategory createArrayOfSubCategory() {
        return new ArrayOfSubCategory();
    }

    /**
     * Create an instance of {@link SubCategory }
     * 
     */
    public SubCategory createSubCategory() {
        return new SubCategory();
    }

    /**
     * Create an instance of {@link ArrayOfSearchBrochure }
     * 
     */
    public ArrayOfSearchBrochure createArrayOfSearchBrochure() {
        return new ArrayOfSearchBrochure();
    }

    /**
     * Create an instance of {@link SearchBrochure }
     * 
     */
    public SearchBrochure createSearchBrochure() {
        return new SearchBrochure();
    }

    /**
     * Create an instance of {@link ArrayOfSearchBrochureV2 }
     * 
     */
    public ArrayOfSearchBrochureV2 createArrayOfSearchBrochureV2() {
        return new ArrayOfSearchBrochureV2();
    }

    /**
     * Create an instance of {@link SearchBrochureV2 }
     * 
     */
    public SearchBrochureV2 createSearchBrochureV2() {
        return new SearchBrochureV2();
    }

    /**
     * Create an instance of {@link BrochureInfos }
     * 
     */
    public BrochureInfos createBrochureInfos() {
        return new BrochureInfos();
    }

    /**
     * Create an instance of {@link BrochureInfo }
     * 
     */
    public BrochureInfo createBrochureInfo() {
        return new BrochureInfo();
    }

    /**
     * Create an instance of {@link UpdatedBrochureInfo }
     * 
     */
    public UpdatedBrochureInfo createUpdatedBrochureInfo() {
        return new UpdatedBrochureInfo();
    }

    /**
     * Create an instance of {@link UpdatedBrochureIDInfo }
     * 
     */
    public UpdatedBrochureIDInfo createUpdatedBrochureIDInfo() {
        return new UpdatedBrochureIDInfo();
    }

    /**
     * Create an instance of {@link UpdatedBrochureIDInfoV1 }
     * 
     */
    public UpdatedBrochureIDInfoV1 createUpdatedBrochureIDInfoV1() {
        return new UpdatedBrochureIDInfoV1();
    }

    /**
     * Create an instance of {@link BrochureRequest }
     * 
     */
    public BrochureRequest createBrochureRequest() {
        return new BrochureRequest();
    }

    /**
     * Create an instance of {@link BrochureContent }
     * 
     */
    public BrochureContent createBrochureContent() {
        return new BrochureContent();
    }

    /**
     * Create an instance of {@link MediaContent }
     * 
     */
    public MediaContent createMediaContent() {
        return new MediaContent();
    }

    /**
     * Create an instance of {@link ArrayOfCaption }
     * 
     */
    public ArrayOfCaption createArrayOfCaption() {
        return new ArrayOfCaption();
    }

    /**
     * Create an instance of {@link Caption }
     * 
     */
    public Caption createCaption() {
        return new Caption();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link ArrayOfCategory }
     * 
     */
    public ArrayOfCategory createArrayOfCategory() {
        return new ArrayOfCategory();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link ArrayOfBrochureImage }
     * 
     */
    public ArrayOfBrochureImage createArrayOfBrochureImage() {
        return new ArrayOfBrochureImage();
    }

    /**
     * Create an instance of {@link BrochureImage }
     * 
     */
    public BrochureImage createBrochureImage() {
        return new BrochureImage();
    }

    /**
     * Create an instance of {@link IFrameInfo }
     * 
     */
    public IFrameInfo createIFrameInfo() {
        return new IFrameInfo();
    }

    /**
     * Create an instance of {@link VideosList }
     * 
     */
    public VideosList createVideosList() {
        return new VideosList();
    }

    /**
     * Create an instance of {@link ArrayOfVideoInfo }
     * 
     */
    public ArrayOfVideoInfo createArrayOfVideoInfo() {
        return new ArrayOfVideoInfo();
    }

    /**
     * Create an instance of {@link VideoInfo }
     * 
     */
    public VideoInfo createVideoInfo() {
        return new VideoInfo();
    }

    /**
     * Create an instance of {@link BrochureConstraint }
     * 
     */
    public BrochureConstraint createBrochureConstraint() {
        return new BrochureConstraint();
    }

    /**
     * Create an instance of {@link BrochureInformation }
     * 
     */
    public BrochureInformation createBrochureInformation() {
        return new BrochureInformation();
    }

    /**
     * Create an instance of {@link ArrayOfDescriptionItem }
     * 
     */
    public ArrayOfDescriptionItem createArrayOfDescriptionItem() {
        return new ArrayOfDescriptionItem();
    }

    /**
     * Create an instance of {@link DescriptionItem }
     * 
     */
    public DescriptionItem createDescriptionItem() {
        return new DescriptionItem();
    }

    /**
     * Create an instance of {@link BrochureLocation }
     * 
     */
    public BrochureLocation createBrochureLocation() {
        return new BrochureLocation();
    }

    /**
     * Create an instance of {@link BrochureResources }
     * 
     */
    public BrochureResources createBrochureResources() {
        return new BrochureResources();
    }

    /**
     * Create an instance of {@link ArrayOfPDFFile }
     * 
     */
    public ArrayOfPDFFile createArrayOfPDFFile() {
        return new ArrayOfPDFFile();
    }

    /**
     * Create an instance of {@link PDFFile }
     * 
     */
    public PDFFile createPDFFile() {
        return new PDFFile();
    }

    /**
     * Create an instance of {@link BrochureInfoV1 }
     * 
     */
    public BrochureInfoV1 createBrochureInfoV1() {
        return new BrochureInfoV1();
    }

    /**
     * Create an instance of {@link BrochureContentV1 }
     * 
     */
    public BrochureContentV1 createBrochureContentV1() {
        return new BrochureContentV1();
    }

    /**
     * Create an instance of {@link MediaContentV1 }
     * 
     */
    public MediaContentV1 createMediaContentV1() {
        return new MediaContentV1();
    }

    /**
     * Create an instance of {@link ArrayOfBrochureImageV1 }
     * 
     */
    public ArrayOfBrochureImageV1 createArrayOfBrochureImageV1() {
        return new ArrayOfBrochureImageV1();
    }

    /**
     * Create an instance of {@link BrochureImageV1 }
     * 
     */
    public BrochureImageV1 createBrochureImageV1() {
        return new BrochureImageV1();
    }

    /**
     * Create an instance of {@link ThumbUrl }
     * 
     */
    public ThumbUrl createThumbUrl() {
        return new ThumbUrl();
    }

    /**
     * Create an instance of {@link Dimensions }
     * 
     */
    public Dimensions createDimensions() {
        return new Dimensions();
    }

    /**
     * Create an instance of {@link MediaLink }
     * 
     */
    public MediaLink createMediaLink() {
        return new MediaLink();
    }

    /**
     * Create an instance of {@link VideosListV1 }
     * 
     */
    public VideosListV1 createVideosListV1() {
        return new VideosListV1();
    }

    /**
     * Create an instance of {@link ArrayOfVideoInfoV1 }
     * 
     */
    public ArrayOfVideoInfoV1 createArrayOfVideoInfoV1() {
        return new ArrayOfVideoInfoV1();
    }

    /**
     * Create an instance of {@link VideoInfoV1 }
     * 
     */
    public VideoInfoV1 createVideoInfoV1() {
        return new VideoInfoV1();
    }

    /**
     * Create an instance of {@link BrochureInformationV1 }
     * 
     */
    public BrochureInformationV1 createBrochureInformationV1() {
        return new BrochureInformationV1();
    }

    /**
     * Create an instance of {@link BrochureLocationV1 }
     * 
     */
    public BrochureLocationV1 createBrochureLocationV1() {
        return new BrochureLocationV1();
    }

    /**
     * Create an instance of {@link BrochureResourcesV1 }
     * 
     */
    public BrochureResourcesV1 createBrochureResourcesV1() {
        return new BrochureResourcesV1();
    }

    /**
     * Create an instance of {@link ArrayOfPDFFileV1 }
     * 
     */
    public ArrayOfPDFFileV1 createArrayOfPDFFileV1() {
        return new ArrayOfPDFFileV1();
    }

    /**
     * Create an instance of {@link PDFFileV1 }
     * 
     */
    public PDFFileV1 createPDFFileV1() {
        return new PDFFileV1();
    }

    /**
     * Create an instance of {@link BrochureInfoV2 }
     * 
     */
    public BrochureInfoV2 createBrochureInfoV2() {
        return new BrochureInfoV2();
    }

    /**
     * Create an instance of {@link BrochureContentV2 }
     * 
     */
    public BrochureContentV2 createBrochureContentV2() {
        return new BrochureContentV2();
    }

    /**
     * Create an instance of {@link MediaContentV2 }
     * 
     */
    public MediaContentV2 createMediaContentV2() {
        return new MediaContentV2();
    }

    /**
     * Create an instance of {@link ArrayOfBrochureImageV2 }
     * 
     */
    public ArrayOfBrochureImageV2 createArrayOfBrochureImageV2() {
        return new ArrayOfBrochureImageV2();
    }

    /**
     * Create an instance of {@link BrochureImageV2 }
     * 
     */
    public BrochureImageV2 createBrochureImageV2() {
        return new BrochureImageV2();
    }

    /**
     * Create an instance of {@link VideosListV2 }
     * 
     */
    public VideosListV2 createVideosListV2() {
        return new VideosListV2();
    }

    /**
     * Create an instance of {@link ArrayOfVideoInfoV2 }
     * 
     */
    public ArrayOfVideoInfoV2 createArrayOfVideoInfoV2() {
        return new ArrayOfVideoInfoV2();
    }

    /**
     * Create an instance of {@link VideoInfoV2 }
     * 
     */
    public VideoInfoV2 createVideoInfoV2() {
        return new VideoInfoV2();
    }

    /**
     * Create an instance of {@link BrochureInformationV2 }
     * 
     */
    public BrochureInformationV2 createBrochureInformationV2() {
        return new BrochureInformationV2();
    }

    /**
     * Create an instance of {@link BrochureLocationV2 }
     * 
     */
    public BrochureLocationV2 createBrochureLocationV2() {
        return new BrochureLocationV2();
    }

    /**
     * Create an instance of {@link BrochureResourcesV2 }
     * 
     */
    public BrochureResourcesV2 createBrochureResourcesV2() {
        return new BrochureResourcesV2();
    }

    /**
     * Create an instance of {@link ArrayOfPDFFileV2 }
     * 
     */
    public ArrayOfPDFFileV2 createArrayOfPDFFileV2() {
        return new ArrayOfPDFFileV2();
    }

    /**
     * Create an instance of {@link PDFFileV2 }
     * 
     */
    public PDFFileV2 createPDFFileV2() {
        return new PDFFileV2();
    }

    /**
     * Create an instance of {@link BrochureInfoForGetPropertyInfoV1 }
     * 
     */
    public BrochureInfoForGetPropertyInfoV1 createBrochureInfoForGetPropertyInfoV1() {
        return new BrochureInfoForGetPropertyInfoV1();
    }

    /**
     * Create an instance of {@link AvailableContent }
     * 
     */
    public AvailableContent createAvailableContent() {
        return new AvailableContent();
    }

    /**
     * Create an instance of {@link ArrayOfGDSCode }
     * 
     */
    public ArrayOfGDSCode createArrayOfGDSCode() {
        return new ArrayOfGDSCode();
    }

    /**
     * Create an instance of {@link GDSCode }
     * 
     */
    public GDSCode createGDSCode() {
        return new GDSCode();
    }

    /**
     * Create an instance of {@link RoomType }
     * 
     */
    public RoomType createRoomType() {
        return new RoomType();
    }

    /**
     * Create an instance of {@link Keyword }
     * 
     */
    public Keyword createKeyword() {
        return new Keyword();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link PropertyIDInfo }
     * 
     */
    public PropertyIDInfo createPropertyIDInfo() {
        return new PropertyIDInfo();
    }

    /**
     * Create an instance of {@link BrochureInfoVisuals }
     * 
     */
    public BrochureInfoVisuals createBrochureInfoVisuals() {
        return new BrochureInfoVisuals();
    }

    /**
     * Create an instance of {@link PrecICETags }
     * 
     */
    public PrecICETags createPrecICETags() {
        return new PrecICETags();
    }

    /**
     * Create an instance of {@link PropertyDescription }
     * 
     */
    public PropertyDescription createPropertyDescription() {
        return new PropertyDescription();
    }

    /**
     * Create an instance of {@link AvailableContent2 }
     * 
     */
    public AvailableContent2 createAvailableContent2() {
        return new AvailableContent2();
    }

    /**
     * Create an instance of {@link BrochureContentVisuals }
     * 
     */
    public BrochureContentVisuals createBrochureContentVisuals() {
        return new BrochureContentVisuals();
    }

    /**
     * Create an instance of {@link MediaContentVisuals }
     * 
     */
    public MediaContentVisuals createMediaContentVisuals() {
        return new MediaContentVisuals();
    }

    /**
     * Create an instance of {@link ArrayOfCaptionForVisuals }
     * 
     */
    public ArrayOfCaptionForVisuals createArrayOfCaptionForVisuals() {
        return new ArrayOfCaptionForVisuals();
    }

    /**
     * Create an instance of {@link CaptionForVisuals }
     * 
     */
    public CaptionForVisuals createCaptionForVisuals() {
        return new CaptionForVisuals();
    }

    /**
     * Create an instance of {@link ArrayOfItemForVisuals }
     * 
     */
    public ArrayOfItemForVisuals createArrayOfItemForVisuals() {
        return new ArrayOfItemForVisuals();
    }

    /**
     * Create an instance of {@link ItemForVisuals }
     * 
     */
    public ItemForVisuals createItemForVisuals() {
        return new ItemForVisuals();
    }

    /**
     * Create an instance of {@link ArrayOfPropertyImageVisuals }
     * 
     */
    public ArrayOfPropertyImageVisuals createArrayOfPropertyImageVisuals() {
        return new ArrayOfPropertyImageVisuals();
    }

    /**
     * Create an instance of {@link PropertyImageVisuals }
     * 
     */
    public PropertyImageVisuals createPropertyImageVisuals() {
        return new PropertyImageVisuals();
    }

    /**
     * Create an instance of {@link DirectLinks }
     * 
     */
    public DirectLinks createDirectLinks() {
        return new DirectLinks();
    }

    /**
     * Create an instance of {@link ImageTags }
     * 
     */
    public ImageTags createImageTags() {
        return new ImageTags();
    }

    /**
     * Create an instance of {@link VideosListVisuals }
     * 
     */
    public VideosListVisuals createVideosListVisuals() {
        return new VideosListVisuals();
    }

    /**
     * Create an instance of {@link ArrayOfVideoInfoVisuals }
     * 
     */
    public ArrayOfVideoInfoVisuals createArrayOfVideoInfoVisuals() {
        return new ArrayOfVideoInfoVisuals();
    }

    /**
     * Create an instance of {@link VideoInfoVisuals }
     * 
     */
    public VideoInfoVisuals createVideoInfoVisuals() {
        return new VideoInfoVisuals();
    }

    /**
     * Create an instance of {@link BrochureInformationVisuals }
     * 
     */
    public BrochureInformationVisuals createBrochureInformationVisuals() {
        return new BrochureInformationVisuals();
    }

    /**
     * Create an instance of {@link BrochureLocationVisuals }
     * 
     */
    public BrochureLocationVisuals createBrochureLocationVisuals() {
        return new BrochureLocationVisuals();
    }

    /**
     * Create an instance of {@link BrochureResourcesVisuals }
     * 
     */
    public BrochureResourcesVisuals createBrochureResourcesVisuals() {
        return new BrochureResourcesVisuals();
    }

    /**
     * Create an instance of {@link ArrayOfPDFFileVisuals }
     * 
     */
    public ArrayOfPDFFileVisuals createArrayOfPDFFileVisuals() {
        return new ArrayOfPDFFileVisuals();
    }

    /**
     * Create an instance of {@link PDFFileVisuals }
     * 
     */
    public PDFFileVisuals createPDFFileVisuals() {
        return new PDFFileVisuals();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICEAuthHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.iceportal.com/service", name = "ICEAuthHeader")
    public JAXBElement<ICEAuthHeader> createICEAuthHeader(ICEAuthHeader value) {
        return new JAXBElement<ICEAuthHeader>(_ICEAuthHeader_QNAME, ICEAuthHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICEAuthHeaderWithMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.iceportal.com/service", name = "ICEAuthHeaderWithMType")
    public JAXBElement<ICEAuthHeaderWithMType> createICEAuthHeaderWithMType(ICEAuthHeaderWithMType value) {
        return new JAXBElement<ICEAuthHeaderWithMType>(_ICEAuthHeaderWithMType_QNAME, ICEAuthHeaderWithMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBrochureInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.iceportal.com/service", name = "SearchBrochureInfo")
    public JAXBElement<SearchBrochureInfo> createSearchBrochureInfo(SearchBrochureInfo value) {
        return new JAXBElement<SearchBrochureInfo>(_SearchBrochureInfo_QNAME, SearchBrochureInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBrchureInfoV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.iceportal.com/service", name = "SearchBrchureInfoV2")
    public JAXBElement<SearchBrchureInfoV2> createSearchBrchureInfoV2(SearchBrchureInfoV2 value) {
        return new JAXBElement<SearchBrchureInfoV2>(_SearchBrchureInfoV2_QNAME, SearchBrchureInfoV2 .class, null, value);
    }

}
