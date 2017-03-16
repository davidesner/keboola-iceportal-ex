
package com.iceportal.services.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-03-10T19:42:10.872+01:00
 * Generated source version: 3.1.10
 * 
 */
public final class ICEWebServiceSoap_ICEWebServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://services.iceportal.com/service", "ICEWebService");

    private ICEWebServiceSoap_ICEWebServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ICEWebService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ICEWebService ss = new ICEWebService(wsdlURL, SERVICE_NAME);
        ICEWebServiceSoap port = ss.getICEWebServiceSoap();  
        
        {
        System.out.println("Invoking getVisuals...");
        java.lang.String _getVisuals_mappedID = "";
        java.lang.String _getVisuals_protocol = "";
        java.lang.String _getVisuals_linkType = "";
        java.lang.String _getVisuals_photoSize = "";
        javax.xml.ws.Holder<java.lang.Integer> _getVisuals_getVisualsResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getVisuals_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.PropertyVisuals> _getVisuals_property = new javax.xml.ws.Holder<com.iceportal.services.service.PropertyVisuals>();
        port.getVisuals(_getVisuals_mappedID, _getVisuals_protocol, _getVisuals_linkType, _getVisuals_photoSize, _getVisuals_getVisualsResult, _getVisuals_errorMessage, _getVisuals_property);

        System.out.println("getVisuals._getVisuals_getVisualsResult=" + _getVisuals_getVisualsResult.value);
        System.out.println("getVisuals._getVisuals_errorMessage=" + _getVisuals_errorMessage.value);
        System.out.println("getVisuals._getVisuals_property=" + _getVisuals_property.value);

        }
        {
        System.out.println("Invoking getRoomTypesForImage...");
        int _getRoomTypesForImage_publicID = 0;
        javax.xml.ws.Holder<java.lang.Integer> _getRoomTypesForImage_getRoomTypesForImageResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getRoomTypesForImage_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.RoomTypeCodes> _getRoomTypesForImage_roomTypeCodes = new javax.xml.ws.Holder<com.iceportal.services.service.RoomTypeCodes>();
        port.getRoomTypesForImage(_getRoomTypesForImage_publicID, _getRoomTypesForImage_getRoomTypesForImageResult, _getRoomTypesForImage_errorMessage, _getRoomTypesForImage_roomTypeCodes);

        System.out.println("getRoomTypesForImage._getRoomTypesForImage_getRoomTypesForImageResult=" + _getRoomTypesForImage_getRoomTypesForImageResult.value);
        System.out.println("getRoomTypesForImage._getRoomTypesForImage_errorMessage=" + _getRoomTypesForImage_errorMessage.value);
        System.out.println("getRoomTypesForImage._getRoomTypesForImage_roomTypeCodes=" + _getRoomTypesForImage_roomTypeCodes.value);

        }
        {
        System.out.println("Invoking searchBrochuresV2...");
        int _searchBrochuresV2_did = 0;
        java.lang.String _searchBrochuresV2_hotelName = "";
        java.lang.String _searchBrochuresV2_city = "";
        java.lang.String _searchBrochuresV2_state = "";
        java.lang.String _searchBrochuresV2_country = "";
        java.lang.String _searchBrochuresV2_region = "";
        java.lang.String _searchBrochuresV2_type = "";
        java.lang.String _searchBrochuresV2_videosExist = "";
        java.lang.String _searchBrochuresV2_hd360SExist = "";
        java.lang.String _searchBrochuresV2_photosExist = "";
        java.lang.String _searchBrochuresV2_iFrameExist = "";
        java.lang.String _searchBrochuresV2_customContentExist = "";
        java.lang.String _searchBrochuresV2_pageSize = "";
        java.lang.String _searchBrochuresV2_pageNumber = "";
        com.iceportal.services.service.SearchBrchureInfoV2 _searchBrochuresV2__return = port.searchBrochuresV2(_searchBrochuresV2_did, _searchBrochuresV2_hotelName, _searchBrochuresV2_city, _searchBrochuresV2_state, _searchBrochuresV2_country, _searchBrochuresV2_region, _searchBrochuresV2_type, _searchBrochuresV2_videosExist, _searchBrochuresV2_hd360SExist, _searchBrochuresV2_photosExist, _searchBrochuresV2_iFrameExist, _searchBrochuresV2_customContentExist, _searchBrochuresV2_pageSize, _searchBrochuresV2_pageNumber);
        System.out.println("searchBrochuresV2.result=" + _searchBrochuresV2__return);


        }
        {
        System.out.println("Invoking searchBrochures...");
        int _searchBrochures_did = 0;
        java.lang.String _searchBrochures_hotelName = "";
        java.lang.String _searchBrochures_city = "";
        java.lang.String _searchBrochures_state = "";
        java.lang.String _searchBrochures_country = "";
        java.lang.String _searchBrochures_region = "";
        java.lang.String _searchBrochures_type = "";
        java.lang.String _searchBrochures_videosExist = "";
        java.lang.String _searchBrochures_vRsExist = "";
        java.lang.String _searchBrochures_photosExist = "";
        java.lang.String _searchBrochures_infoExist = "";
        java.lang.String _searchBrochures_generalInfoExist = "";
        java.lang.String _searchBrochures_locationInfoExist = "";
        java.lang.String _searchBrochures_pdfExist = "";
        java.lang.String _searchBrochures_rrExist = "";
        java.lang.String _searchBrochures_pageSize = "";
        java.lang.String _searchBrochures_pageNumber = "";
        com.iceportal.services.service.SearchBrochureInfo _searchBrochures__return = port.searchBrochures(_searchBrochures_did, _searchBrochures_hotelName, _searchBrochures_city, _searchBrochures_state, _searchBrochures_country, _searchBrochures_region, _searchBrochures_type, _searchBrochures_videosExist, _searchBrochures_vRsExist, _searchBrochures_photosExist, _searchBrochures_infoExist, _searchBrochures_generalInfoExist, _searchBrochures_locationInfoExist, _searchBrochures_pdfExist, _searchBrochures_rrExist, _searchBrochures_pageSize, _searchBrochures_pageNumber);
        System.out.println("searchBrochures.result=" + _searchBrochures__return);


        }
        {
        System.out.println("Invoking getNewBrochuresSince...");
        javax.xml.datatype.XMLGregorianCalendar _getNewBrochuresSince_datefrom = null;
        javax.xml.ws.Holder<java.lang.Integer> _getNewBrochuresSince_getNewBrochuresSinceResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getNewBrochuresSince_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfBrochureInfo> _getNewBrochuresSince_info = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfBrochureInfo>();
        port.getNewBrochuresSince(_getNewBrochuresSince_datefrom, _getNewBrochuresSince_getNewBrochuresSinceResult, _getNewBrochuresSince_errorMessage, _getNewBrochuresSince_info);

        System.out.println("getNewBrochuresSince._getNewBrochuresSince_getNewBrochuresSinceResult=" + _getNewBrochuresSince_getNewBrochuresSinceResult.value);
        System.out.println("getNewBrochuresSince._getNewBrochuresSince_errorMessage=" + _getNewBrochuresSince_errorMessage.value);
        System.out.println("getNewBrochuresSince._getNewBrochuresSince_info=" + _getNewBrochuresSince_info.value);

        }
        {
        System.out.println("Invoking getNewBrochureIDsSince...");
        javax.xml.datatype.XMLGregorianCalendar _getNewBrochureIDsSince_datefrom = null;
        javax.xml.ws.Holder<java.lang.Integer> _getNewBrochureIDsSince_getNewBrochureIDsSinceResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getNewBrochureIDsSince_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfBrochureInfos> _getNewBrochureIDsSince_info = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfBrochureInfos>();
        port.getNewBrochureIDsSince(_getNewBrochureIDsSince_datefrom, _getNewBrochureIDsSince_getNewBrochureIDsSinceResult, _getNewBrochureIDsSince_errorMessage, _getNewBrochureIDsSince_info);

        System.out.println("getNewBrochureIDsSince._getNewBrochureIDsSince_getNewBrochureIDsSinceResult=" + _getNewBrochureIDsSince_getNewBrochureIDsSinceResult.value);
        System.out.println("getNewBrochureIDsSince._getNewBrochureIDsSince_errorMessage=" + _getNewBrochureIDsSince_errorMessage.value);
        System.out.println("getNewBrochureIDsSince._getNewBrochureIDsSince_info=" + _getNewBrochureIDsSince_info.value);

        }
        {
        System.out.println("Invoking getRoomTypesForProperty...");
        java.lang.String _getRoomTypesForProperty_mappedID = "";
        javax.xml.ws.Holder<java.lang.Integer> _getRoomTypesForProperty_getRoomTypesForPropertyResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getRoomTypesForProperty_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfRoomType> _getRoomTypesForProperty_roomTypes = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfRoomType>();
        port.getRoomTypesForProperty(_getRoomTypesForProperty_mappedID, _getRoomTypesForProperty_getRoomTypesForPropertyResult, _getRoomTypesForProperty_errorMessage, _getRoomTypesForProperty_roomTypes);

        System.out.println("getRoomTypesForProperty._getRoomTypesForProperty_getRoomTypesForPropertyResult=" + _getRoomTypesForProperty_getRoomTypesForPropertyResult.value);
        System.out.println("getRoomTypesForProperty._getRoomTypesForProperty_errorMessage=" + _getRoomTypesForProperty_errorMessage.value);
        System.out.println("getRoomTypesForProperty._getRoomTypesForProperty_roomTypes=" + _getRoomTypesForProperty_roomTypes.value);

        }
        {
        System.out.println("Invoking getAllBrochureIDs...");
        javax.xml.ws.Holder<java.lang.Integer> _getAllBrochureIDs_getAllBrochureIDsResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getAllBrochureIDs_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfString> _getAllBrochureIDs_iDs = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfString>();
        port.getAllBrochureIDs(_getAllBrochureIDs_getAllBrochureIDsResult, _getAllBrochureIDs_errorMessage, _getAllBrochureIDs_iDs);

        System.out.println("getAllBrochureIDs._getAllBrochureIDs_getAllBrochureIDsResult=" + _getAllBrochureIDs_getAllBrochureIDsResult.value);
        System.out.println("getAllBrochureIDs._getAllBrochureIDs_errorMessage=" + _getAllBrochureIDs_errorMessage.value);
        System.out.println("getAllBrochureIDs._getAllBrochureIDs_iDs=" + _getAllBrochureIDs_iDs.value);

        }
        {
        System.out.println("Invoking getProperties...");
        java.lang.String _getProperties_publicationStatus = "";
        java.lang.String _getProperties_modifiedTypeOption = "";
        java.lang.String _getProperties_sinceDate = "";
        java.lang.String _getProperties_propertyType = "";
        java.lang.String _getProperties_includeSupplierInfo = "";
        javax.xml.ws.Holder<java.lang.Integer> _getProperties_getPropertiesResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getProperties_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfPropertyIDInfo> _getProperties_info = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfPropertyIDInfo>();
        port.getProperties(_getProperties_publicationStatus, _getProperties_modifiedTypeOption, _getProperties_sinceDate, _getProperties_propertyType, _getProperties_includeSupplierInfo, _getProperties_getPropertiesResult, _getProperties_errorMessage, _getProperties_info);

        System.out.println("getProperties._getProperties_getPropertiesResult=" + _getProperties_getPropertiesResult.value);
        System.out.println("getProperties._getProperties_errorMessage=" + _getProperties_errorMessage.value);
        System.out.println("getProperties._getProperties_info=" + _getProperties_info.value);

        }
        {
        System.out.println("Invoking getPropertyInfoV1...");
        java.lang.String _getPropertyInfoV1_mappedID = "";
        javax.xml.ws.Holder<java.lang.Integer> _getPropertyInfoV1_getPropertyInfoV1Result = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getPropertyInfoV1_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.PropertyInfoV1> _getPropertyInfoV1_brochure = new javax.xml.ws.Holder<com.iceportal.services.service.PropertyInfoV1>();
        port.getPropertyInfoV1(_getPropertyInfoV1_mappedID, _getPropertyInfoV1_getPropertyInfoV1Result, _getPropertyInfoV1_errorMessage, _getPropertyInfoV1_brochure);

        System.out.println("getPropertyInfoV1._getPropertyInfoV1_getPropertyInfoV1Result=" + _getPropertyInfoV1_getPropertyInfoV1Result.value);
        System.out.println("getPropertyInfoV1._getPropertyInfoV1_errorMessage=" + _getPropertyInfoV1_errorMessage.value);
        System.out.println("getPropertyInfoV1._getPropertyInfoV1_brochure=" + _getPropertyInfoV1_brochure.value);

        }
        {
        System.out.println("Invoking lookupMappedID...");
        java.lang.String _lookupMappedID_searchAccountID = "";
        java.lang.String _lookupMappedID_searchMType = "";
        java.lang.String _lookupMappedID_searchMappedID = "";
        javax.xml.ws.Holder<java.lang.Integer> _lookupMappedID_lookupMappedIDResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _lookupMappedID_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.LookupMappedIDInfo> _lookupMappedID_mappingInfo = new javax.xml.ws.Holder<com.iceportal.services.service.LookupMappedIDInfo>();
        port.lookupMappedID(_lookupMappedID_searchAccountID, _lookupMappedID_searchMType, _lookupMappedID_searchMappedID, _lookupMappedID_lookupMappedIDResult, _lookupMappedID_errorMessage, _lookupMappedID_mappingInfo);

        System.out.println("lookupMappedID._lookupMappedID_lookupMappedIDResult=" + _lookupMappedID_lookupMappedIDResult.value);
        System.out.println("lookupMappedID._lookupMappedID_errorMessage=" + _lookupMappedID_errorMessage.value);
        System.out.println("lookupMappedID._lookupMappedID_mappingInfo=" + _lookupMappedID_mappingInfo.value);

        }
        {
        System.out.println("Invoking getLanguages...");
        javax.xml.ws.Holder<java.lang.Integer> _getLanguages_getLanguagesResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getLanguages_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfItem> _getLanguages_languages = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfItem>();
        port.getLanguages(_getLanguages_getLanguagesResult, _getLanguages_errorMessage, _getLanguages_languages);

        System.out.println("getLanguages._getLanguages_getLanguagesResult=" + _getLanguages_getLanguagesResult.value);
        System.out.println("getLanguages._getLanguages_errorMessage=" + _getLanguages_errorMessage.value);
        System.out.println("getLanguages._getLanguages_languages=" + _getLanguages_languages.value);

        }
        {
        System.out.println("Invoking getDirectVideoLinks...");
        java.lang.String _getDirectVideoLinks_mappedID = "";
        javax.xml.ws.Holder<java.lang.Integer> _getDirectVideoLinks_getDirectVideoLinksResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getDirectVideoLinks_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.Brochure> _getDirectVideoLinks_brochure = new javax.xml.ws.Holder<com.iceportal.services.service.Brochure>();
        port.getDirectVideoLinks(_getDirectVideoLinks_mappedID, _getDirectVideoLinks_getDirectVideoLinksResult, _getDirectVideoLinks_errorMessage, _getDirectVideoLinks_brochure);

        System.out.println("getDirectVideoLinks._getDirectVideoLinks_getDirectVideoLinksResult=" + _getDirectVideoLinks_getDirectVideoLinksResult.value);
        System.out.println("getDirectVideoLinks._getDirectVideoLinks_errorMessage=" + _getDirectVideoLinks_errorMessage.value);
        System.out.println("getDirectVideoLinks._getDirectVideoLinks_brochure=" + _getDirectVideoLinks_brochure.value);

        }
        {
        System.out.println("Invoking getNewBrochures...");
        javax.xml.datatype.XMLGregorianCalendar _getNewBrochures_datefrom = null;
        javax.xml.datatype.XMLGregorianCalendar _getNewBrochures_dateto = null;
        javax.xml.ws.Holder<java.lang.Integer> _getNewBrochures_getNewBrochuresResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getNewBrochures_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfBrochureInfo> _getNewBrochures_info = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfBrochureInfo>();
        port.getNewBrochures(_getNewBrochures_datefrom, _getNewBrochures_dateto, _getNewBrochures_getNewBrochuresResult, _getNewBrochures_errorMessage, _getNewBrochures_info);

        System.out.println("getNewBrochures._getNewBrochures_getNewBrochuresResult=" + _getNewBrochures_getNewBrochuresResult.value);
        System.out.println("getNewBrochures._getNewBrochures_errorMessage=" + _getNewBrochures_errorMessage.value);
        System.out.println("getNewBrochures._getNewBrochures_info=" + _getNewBrochures_info.value);

        }
        {
        System.out.println("Invoking getBrochureStatus...");
        java.lang.String _getBrochureStatus_mappedID = "";
        javax.xml.ws.Holder<java.lang.Integer> _getBrochureStatus_getBrochureStatusResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getBrochureStatus_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.Boolean> _getBrochureStatus_enabled = new javax.xml.ws.Holder<java.lang.Boolean>();
        javax.xml.ws.Holder<java.lang.Boolean> _getBrochureStatus_published = new javax.xml.ws.Holder<java.lang.Boolean>();
        port.getBrochureStatus(_getBrochureStatus_mappedID, _getBrochureStatus_getBrochureStatusResult, _getBrochureStatus_errorMessage, _getBrochureStatus_enabled, _getBrochureStatus_published);

        System.out.println("getBrochureStatus._getBrochureStatus_getBrochureStatusResult=" + _getBrochureStatus_getBrochureStatusResult.value);
        System.out.println("getBrochureStatus._getBrochureStatus_errorMessage=" + _getBrochureStatus_errorMessage.value);
        System.out.println("getBrochureStatus._getBrochureStatus_enabled=" + _getBrochureStatus_enabled.value);
        System.out.println("getBrochureStatus._getBrochureStatus_published=" + _getBrochureStatus_published.value);

        }
        {
        System.out.println("Invoking getRegions...");
        javax.xml.ws.Holder<java.lang.Integer> _getRegions_getRegionsResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getRegions_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.util.List<com.iceportal.services.service.BrochureListItem>> _getRegions_region = new javax.xml.ws.Holder<java.util.List<com.iceportal.services.service.BrochureListItem>>();
        port.getRegions(_getRegions_getRegionsResult, _getRegions_errorMessage, _getRegions_region);

        System.out.println("getRegions._getRegions_getRegionsResult=" + _getRegions_getRegionsResult.value);
        System.out.println("getRegions._getRegions_errorMessage=" + _getRegions_errorMessage.value);
        System.out.println("getRegions._getRegions_region=" + _getRegions_region.value);

        }
        {
        System.out.println("Invoking getBrochure...");
        java.lang.String _getBrochure_mappedID = "";
        javax.xml.ws.Holder<java.lang.Integer> _getBrochure_getBrochureResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getBrochure_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.Brochure> _getBrochure_brochure = new javax.xml.ws.Holder<com.iceportal.services.service.Brochure>();
        port.getBrochure(_getBrochure_mappedID, _getBrochure_getBrochureResult, _getBrochure_errorMessage, _getBrochure_brochure);

        System.out.println("getBrochure._getBrochure_getBrochureResult=" + _getBrochure_getBrochureResult.value);
        System.out.println("getBrochure._getBrochure_errorMessage=" + _getBrochure_errorMessage.value);
        System.out.println("getBrochure._getBrochure_brochure=" + _getBrochure_brochure.value);

        }
        {
        System.out.println("Invoking getMappingInfo...");
        java.lang.String _getMappingInfo_mappedID = "";
        javax.xml.ws.Holder<java.lang.Integer> _getMappingInfo_getMappingInfoResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getMappingInfo_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.MappingInfo> _getMappingInfo_info = new javax.xml.ws.Holder<com.iceportal.services.service.MappingInfo>();
        port.getMappingInfo(_getMappingInfo_mappedID, _getMappingInfo_getMappingInfoResult, _getMappingInfo_errorMessage, _getMappingInfo_info);

        System.out.println("getMappingInfo._getMappingInfo_getMappingInfoResult=" + _getMappingInfo_getMappingInfoResult.value);
        System.out.println("getMappingInfo._getMappingInfo_errorMessage=" + _getMappingInfo_errorMessage.value);
        System.out.println("getMappingInfo._getMappingInfo_info=" + _getMappingInfo_info.value);

        }
        {
        System.out.println("Invoking getStates...");
        int _getStates_countryID = 0;
        javax.xml.ws.Holder<java.lang.Integer> _getStates_getStatesResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getStates_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.util.List<com.iceportal.services.service.BrochureListItem>> _getStates_state = new javax.xml.ws.Holder<java.util.List<com.iceportal.services.service.BrochureListItem>>();
        port.getStates(_getStates_countryID, _getStates_getStatesResult, _getStates_errorMessage, _getStates_state);

        System.out.println("getStates._getStates_getStatesResult=" + _getStates_getStatesResult.value);
        System.out.println("getStates._getStates_errorMessage=" + _getStates_errorMessage.value);
        System.out.println("getStates._getStates_state=" + _getStates_state.value);

        }
        {
        System.out.println("Invoking getImagesOfRoomType...");
        java.lang.String _getImagesOfRoomType_roomTypeCode = "";
        java.lang.String _getImagesOfRoomType_mappedID = "";
        javax.xml.ws.Holder<java.lang.Integer> _getImagesOfRoomType_getImagesOfRoomTypeResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getImagesOfRoomType_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfImage> _getImagesOfRoomType_images = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfImage>();
        port.getImagesOfRoomType(_getImagesOfRoomType_roomTypeCode, _getImagesOfRoomType_mappedID, _getImagesOfRoomType_getImagesOfRoomTypeResult, _getImagesOfRoomType_errorMessage, _getImagesOfRoomType_images);

        System.out.println("getImagesOfRoomType._getImagesOfRoomType_getImagesOfRoomTypeResult=" + _getImagesOfRoomType_getImagesOfRoomTypeResult.value);
        System.out.println("getImagesOfRoomType._getImagesOfRoomType_errorMessage=" + _getImagesOfRoomType_errorMessage.value);
        System.out.println("getImagesOfRoomType._getImagesOfRoomType_images=" + _getImagesOfRoomType_images.value);

        }
        {
        System.out.println("Invoking getUpdatedBrochureIDsSinceV1...");
        javax.xml.datatype.XMLGregorianCalendar _getUpdatedBrochureIDsSinceV1_datefrom = null;
        javax.xml.ws.Holder<java.lang.Integer> _getUpdatedBrochureIDsSinceV1_getUpdatedBrochureIDsSinceV1Result = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getUpdatedBrochureIDsSinceV1_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfUpdatedBrochureIDInfoV1> _getUpdatedBrochureIDsSinceV1_info = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfUpdatedBrochureIDInfoV1>();
        port.getUpdatedBrochureIDsSinceV1(_getUpdatedBrochureIDsSinceV1_datefrom, _getUpdatedBrochureIDsSinceV1_getUpdatedBrochureIDsSinceV1Result, _getUpdatedBrochureIDsSinceV1_errorMessage, _getUpdatedBrochureIDsSinceV1_info);

        System.out.println("getUpdatedBrochureIDsSinceV1._getUpdatedBrochureIDsSinceV1_getUpdatedBrochureIDsSinceV1Result=" + _getUpdatedBrochureIDsSinceV1_getUpdatedBrochureIDsSinceV1Result.value);
        System.out.println("getUpdatedBrochureIDsSinceV1._getUpdatedBrochureIDsSinceV1_errorMessage=" + _getUpdatedBrochureIDsSinceV1_errorMessage.value);
        System.out.println("getUpdatedBrochureIDsSinceV1._getUpdatedBrochureIDsSinceV1_info=" + _getUpdatedBrochureIDsSinceV1_info.value);

        }
        {
        System.out.println("Invoking getAllMappings...");
        javax.xml.ws.Holder<java.lang.Integer> _getAllMappings_getAllMappingsResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getAllMappings_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfMappingInfo> _getAllMappings_info = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfMappingInfo>();
        port.getAllMappings(_getAllMappings_getAllMappingsResult, _getAllMappings_errorMessage, _getAllMappings_info);

        System.out.println("getAllMappings._getAllMappings_getAllMappingsResult=" + _getAllMappings_getAllMappingsResult.value);
        System.out.println("getAllMappings._getAllMappings_errorMessage=" + _getAllMappings_errorMessage.value);
        System.out.println("getAllMappings._getAllMappings_info=" + _getAllMappings_info.value);

        }
        {
        System.out.println("Invoking getAllBrochureIDsV2...");
        javax.xml.ws.Holder<java.lang.Integer> _getAllBrochureIDsV2_getAllBrochureIDsV2Result = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getAllBrochureIDsV2_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfBrochureIDInfo> _getAllBrochureIDsV2_iDinfo = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfBrochureIDInfo>();
        port.getAllBrochureIDsV2(_getAllBrochureIDsV2_getAllBrochureIDsV2Result, _getAllBrochureIDsV2_errorMessage, _getAllBrochureIDsV2_iDinfo);

        System.out.println("getAllBrochureIDsV2._getAllBrochureIDsV2_getAllBrochureIDsV2Result=" + _getAllBrochureIDsV2_getAllBrochureIDsV2Result.value);
        System.out.println("getAllBrochureIDsV2._getAllBrochureIDsV2_errorMessage=" + _getAllBrochureIDsV2_errorMessage.value);
        System.out.println("getAllBrochureIDsV2._getAllBrochureIDsV2_iDinfo=" + _getAllBrochureIDsV2_iDinfo.value);

        }
        {
        System.out.println("Invoking getUpdatedBrochuresSince...");
        javax.xml.datatype.XMLGregorianCalendar _getUpdatedBrochuresSince_datefrom = null;
        javax.xml.ws.Holder<java.lang.Integer> _getUpdatedBrochuresSince_getUpdatedBrochuresSinceResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getUpdatedBrochuresSince_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfUpdatedBrochureInfo> _getUpdatedBrochuresSince_info = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfUpdatedBrochureInfo>();
        port.getUpdatedBrochuresSince(_getUpdatedBrochuresSince_datefrom, _getUpdatedBrochuresSince_getUpdatedBrochuresSinceResult, _getUpdatedBrochuresSince_errorMessage, _getUpdatedBrochuresSince_info);

        System.out.println("getUpdatedBrochuresSince._getUpdatedBrochuresSince_getUpdatedBrochuresSinceResult=" + _getUpdatedBrochuresSince_getUpdatedBrochuresSinceResult.value);
        System.out.println("getUpdatedBrochuresSince._getUpdatedBrochuresSince_errorMessage=" + _getUpdatedBrochuresSince_errorMessage.value);
        System.out.println("getUpdatedBrochuresSince._getUpdatedBrochuresSince_info=" + _getUpdatedBrochuresSince_info.value);

        }
        {
        System.out.println("Invoking getCountries...");
        javax.xml.ws.Holder<java.lang.Integer> _getCountries_getCountriesResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getCountries_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.util.List<com.iceportal.services.service.BrochureListItem>> _getCountries_country = new javax.xml.ws.Holder<java.util.List<com.iceportal.services.service.BrochureListItem>>();
        port.getCountries(_getCountries_getCountriesResult, _getCountries_errorMessage, _getCountries_country);

        System.out.println("getCountries._getCountries_getCountriesResult=" + _getCountries_getCountriesResult.value);
        System.out.println("getCountries._getCountries_errorMessage=" + _getCountries_errorMessage.value);
        System.out.println("getCountries._getCountries_country=" + _getCountries_country.value);

        }
        {
        System.out.println("Invoking getPropertyTypes...");
        javax.xml.ws.Holder<java.lang.Integer> _getPropertyTypes_getPropertyTypesResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getPropertyTypes_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.util.List<com.iceportal.services.service.BrochureListItem>> _getPropertyTypes_type = new javax.xml.ws.Holder<java.util.List<com.iceportal.services.service.BrochureListItem>>();
        port.getPropertyTypes(_getPropertyTypes_getPropertyTypesResult, _getPropertyTypes_errorMessage, _getPropertyTypes_type);

        System.out.println("getPropertyTypes._getPropertyTypes_getPropertyTypesResult=" + _getPropertyTypes_getPropertyTypesResult.value);
        System.out.println("getPropertyTypes._getPropertyTypes_errorMessage=" + _getPropertyTypes_errorMessage.value);
        System.out.println("getPropertyTypes._getPropertyTypes_type=" + _getPropertyTypes_type.value);

        }
        {
        System.out.println("Invoking getUpdatedBrochureIDsSince...");
        javax.xml.datatype.XMLGregorianCalendar _getUpdatedBrochureIDsSince_datefrom = null;
        javax.xml.ws.Holder<java.lang.Integer> _getUpdatedBrochureIDsSince_getUpdatedBrochureIDsSinceResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getUpdatedBrochureIDsSince_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfUpdatedBrochureIDInfo> _getUpdatedBrochureIDsSince_info = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfUpdatedBrochureIDInfo>();
        port.getUpdatedBrochureIDsSince(_getUpdatedBrochureIDsSince_datefrom, _getUpdatedBrochureIDsSince_getUpdatedBrochureIDsSinceResult, _getUpdatedBrochureIDsSince_errorMessage, _getUpdatedBrochureIDsSince_info);

        System.out.println("getUpdatedBrochureIDsSince._getUpdatedBrochureIDsSince_getUpdatedBrochureIDsSinceResult=" + _getUpdatedBrochureIDsSince_getUpdatedBrochureIDsSinceResult.value);
        System.out.println("getUpdatedBrochureIDsSince._getUpdatedBrochureIDsSince_errorMessage=" + _getUpdatedBrochureIDsSince_errorMessage.value);
        System.out.println("getUpdatedBrochureIDsSince._getUpdatedBrochureIDsSince_info=" + _getUpdatedBrochureIDsSince_info.value);

        }
        {
        System.out.println("Invoking getBrochureV2...");
        java.lang.String _getBrochureV2_mappedID = "";
        javax.xml.ws.Holder<java.lang.Integer> _getBrochureV2_getBrochureV2Result = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getBrochureV2_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.BrochureV2> _getBrochureV2_brochure = new javax.xml.ws.Holder<com.iceportal.services.service.BrochureV2>();
        port.getBrochureV2(_getBrochureV2_mappedID, _getBrochureV2_getBrochureV2Result, _getBrochureV2_errorMessage, _getBrochureV2_brochure);

        System.out.println("getBrochureV2._getBrochureV2_getBrochureV2Result=" + _getBrochureV2_getBrochureV2Result.value);
        System.out.println("getBrochureV2._getBrochureV2_errorMessage=" + _getBrochureV2_errorMessage.value);
        System.out.println("getBrochureV2._getBrochureV2_brochure=" + _getBrochureV2_brochure.value);

        }
        {
        System.out.println("Invoking getCategories...");
        javax.xml.ws.Holder<java.lang.Integer> _getCategories_getCategoriesResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getCategories_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfCategories> _getCategories_otaCategories = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfCategories>();
        javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfICESubCategories> _getCategories_iceCategories = new javax.xml.ws.Holder<com.iceportal.services.service.ArrayOfICESubCategories>();
        port.getCategories(_getCategories_getCategoriesResult, _getCategories_errorMessage, _getCategories_otaCategories, _getCategories_iceCategories);

        System.out.println("getCategories._getCategories_getCategoriesResult=" + _getCategories_getCategoriesResult.value);
        System.out.println("getCategories._getCategories_errorMessage=" + _getCategories_errorMessage.value);
        System.out.println("getCategories._getCategories_otaCategories=" + _getCategories_otaCategories.value);
        System.out.println("getCategories._getCategories_iceCategories=" + _getCategories_iceCategories.value);

        }
        {
        System.out.println("Invoking getBrochureV1...");
        java.lang.String _getBrochureV1_mappedID = "";
        javax.xml.ws.Holder<java.lang.Integer> _getBrochureV1_getBrochureV1Result = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<java.lang.String> _getBrochureV1_errorMessage = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<com.iceportal.services.service.BrochureV1> _getBrochureV1_brochure = new javax.xml.ws.Holder<com.iceportal.services.service.BrochureV1>();
        port.getBrochureV1(_getBrochureV1_mappedID, _getBrochureV1_getBrochureV1Result, _getBrochureV1_errorMessage, _getBrochureV1_brochure);

        System.out.println("getBrochureV1._getBrochureV1_getBrochureV1Result=" + _getBrochureV1_getBrochureV1Result.value);
        System.out.println("getBrochureV1._getBrochureV1_errorMessage=" + _getBrochureV1_errorMessage.value);
        System.out.println("getBrochureV1._getBrochureV1_brochure=" + _getBrochureV1_brochure.value);

        }

        System.exit(0);
    }

}
