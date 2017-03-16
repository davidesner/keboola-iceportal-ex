
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videosExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VRsExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="photosExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="generalInfoExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationInfoExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pdfExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rrExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "did",
    "hotelName",
    "city",
    "state",
    "country",
    "region",
    "type",
    "videosExist",
    "vRsExist",
    "photosExist",
    "infoExist",
    "generalInfoExist",
    "locationInfoExist",
    "pdfExist",
    "rrExist",
    "pageSize",
    "pageNumber"
})
@XmlRootElement(name = "SearchBrochures")
public class SearchBrochures {

    @XmlElement(name = "DID")
    protected int did;
    protected String hotelName;
    protected String city;
    protected String state;
    protected String country;
    protected String region;
    protected String type;
    protected String videosExist;
    @XmlElement(name = "VRsExist")
    protected String vRsExist;
    protected String photosExist;
    protected String infoExist;
    protected String generalInfoExist;
    protected String locationInfoExist;
    protected String pdfExist;
    protected String rrExist;
    protected String pageSize;
    protected String pageNumber;

    /**
     * Gets the value of the did property.
     * 
     */
    public int getDID() {
        return did;
    }

    /**
     * Sets the value of the did property.
     * 
     */
    public void setDID(int value) {
        this.did = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the videosExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideosExist() {
        return videosExist;
    }

    /**
     * Sets the value of the videosExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideosExist(String value) {
        this.videosExist = value;
    }

    /**
     * Gets the value of the vRsExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRsExist() {
        return vRsExist;
    }

    /**
     * Sets the value of the vRsExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRsExist(String value) {
        this.vRsExist = value;
    }

    /**
     * Gets the value of the photosExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotosExist() {
        return photosExist;
    }

    /**
     * Sets the value of the photosExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotosExist(String value) {
        this.photosExist = value;
    }

    /**
     * Gets the value of the infoExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoExist() {
        return infoExist;
    }

    /**
     * Sets the value of the infoExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoExist(String value) {
        this.infoExist = value;
    }

    /**
     * Gets the value of the generalInfoExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralInfoExist() {
        return generalInfoExist;
    }

    /**
     * Sets the value of the generalInfoExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralInfoExist(String value) {
        this.generalInfoExist = value;
    }

    /**
     * Gets the value of the locationInfoExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationInfoExist() {
        return locationInfoExist;
    }

    /**
     * Sets the value of the locationInfoExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationInfoExist(String value) {
        this.locationInfoExist = value;
    }

    /**
     * Gets the value of the pdfExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfExist() {
        return pdfExist;
    }

    /**
     * Sets the value of the pdfExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfExist(String value) {
        this.pdfExist = value;
    }

    /**
     * Gets the value of the rrExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrExist() {
        return rrExist;
    }

    /**
     * Sets the value of the rrExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrExist(String value) {
        this.rrExist = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageSize(String value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumber(String value) {
        this.pageNumber = value;
    }

}
