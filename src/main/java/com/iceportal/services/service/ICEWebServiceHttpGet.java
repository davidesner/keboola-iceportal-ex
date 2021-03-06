package com.iceportal.services.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-09-18T14:33:56.880+01:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://services.iceportal.com/service", name = "ICEWebServiceHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ICEWebServiceHttpGet {

    /**
     * Searches for the brochures which match given criteria
     */
    @WebMethod(operationName = "SearchBrochuresV2")
    @WebResult(name = "SearchBrchureInfoV2", targetNamespace = "http://services.iceportal.com/service", partName = "Body")
    public SearchBrchureInfoV2 searchBrochuresV2(
        @WebParam(partName = "DID", name = "DID", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String did,
        @WebParam(partName = "hotelName", name = "hotelName", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String hotelName,
        @WebParam(partName = "city", name = "city", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String city,
        @WebParam(partName = "state", name = "state", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String state,
        @WebParam(partName = "country", name = "country", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String country,
        @WebParam(partName = "region", name = "region", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String region,
        @WebParam(partName = "type", name = "type", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String type,
        @WebParam(partName = "videosExist", name = "videosExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String videosExist,
        @WebParam(partName = "HD360sExist", name = "HD360sExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String hd360SExist,
        @WebParam(partName = "photosExist", name = "photosExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String photosExist,
        @WebParam(partName = "iFrameExist", name = "iFrameExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String iFrameExist,
        @WebParam(partName = "customContentExist", name = "customContentExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String customContentExist,
        @WebParam(partName = "pageSize", name = "pageSize", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String pageSize,
        @WebParam(partName = "pageNumber", name = "pageNumber", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String pageNumber
    );

    /**
     * Searches for the brochures which match given criteria
     */
    @WebMethod(operationName = "SearchBrochures")
    @WebResult(name = "SearchBrochureInfo", targetNamespace = "http://services.iceportal.com/service", partName = "Body")
    public SearchBrochureInfo searchBrochures(
        @WebParam(partName = "DID", name = "DID", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String did,
        @WebParam(partName = "hotelName", name = "hotelName", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String hotelName,
        @WebParam(partName = "city", name = "city", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String city,
        @WebParam(partName = "state", name = "state", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String state,
        @WebParam(partName = "country", name = "country", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String country,
        @WebParam(partName = "region", name = "region", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String region,
        @WebParam(partName = "type", name = "type", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String type,
        @WebParam(partName = "videosExist", name = "videosExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String videosExist,
        @WebParam(partName = "VRsExist", name = "VRsExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String vRsExist,
        @WebParam(partName = "photosExist", name = "photosExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String photosExist,
        @WebParam(partName = "infoExist", name = "infoExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String infoExist,
        @WebParam(partName = "generalInfoExist", name = "generalInfoExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String generalInfoExist,
        @WebParam(partName = "locationInfoExist", name = "locationInfoExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String locationInfoExist,
        @WebParam(partName = "pdfExist", name = "pdfExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String pdfExist,
        @WebParam(partName = "rrExist", name = "rrExist", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String rrExist,
        @WebParam(partName = "pageSize", name = "pageSize", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String pageSize,
        @WebParam(partName = "pageNumber", name = "pageNumber", targetNamespace = "http://services.iceportal.com/service")
        java.lang.String pageNumber
    );
}
