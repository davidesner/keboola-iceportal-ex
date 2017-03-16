
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchBrochure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBrochure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brochureUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videosExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VRsExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="photosExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="infoExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="generalInfoExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="locationInfoExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="pdfExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rrExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="iframeExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="customcontentExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBrochure", propOrder = {
    "iceID",
    "hotelName",
    "address1",
    "city",
    "state",
    "country",
    "region",
    "type",
    "brochureUrl",
    "videosExist",
    "vRsExist",
    "photosExist",
    "infoExist",
    "generalInfoExist",
    "locationInfoExist",
    "pdfExist",
    "rrExist",
    "iframeExist",
    "customcontentExist"
})
public class SearchBrochure {

    protected int iceID;
    protected String hotelName;
    protected String address1;
    protected String city;
    protected String state;
    protected String country;
    protected String region;
    protected String type;
    protected String brochureUrl;
    protected boolean videosExist;
    @XmlElement(name = "VRsExist")
    protected boolean vRsExist;
    protected boolean photosExist;
    protected boolean infoExist;
    protected boolean generalInfoExist;
    protected boolean locationInfoExist;
    protected boolean pdfExist;
    protected boolean rrExist;
    protected boolean iframeExist;
    protected boolean customcontentExist;

    /**
     * Gets the value of the iceID property.
     * 
     */
    public int getIceID() {
        return iceID;
    }

    /**
     * Sets the value of the iceID property.
     * 
     */
    public void setIceID(int value) {
        this.iceID = value;
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
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
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
     * Gets the value of the brochureUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrochureUrl() {
        return brochureUrl;
    }

    /**
     * Sets the value of the brochureUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrochureUrl(String value) {
        this.brochureUrl = value;
    }

    /**
     * Gets the value of the videosExist property.
     * 
     */
    public boolean isVideosExist() {
        return videosExist;
    }

    /**
     * Sets the value of the videosExist property.
     * 
     */
    public void setVideosExist(boolean value) {
        this.videosExist = value;
    }

    /**
     * Gets the value of the vRsExist property.
     * 
     */
    public boolean isVRsExist() {
        return vRsExist;
    }

    /**
     * Sets the value of the vRsExist property.
     * 
     */
    public void setVRsExist(boolean value) {
        this.vRsExist = value;
    }

    /**
     * Gets the value of the photosExist property.
     * 
     */
    public boolean isPhotosExist() {
        return photosExist;
    }

    /**
     * Sets the value of the photosExist property.
     * 
     */
    public void setPhotosExist(boolean value) {
        this.photosExist = value;
    }

    /**
     * Gets the value of the infoExist property.
     * 
     */
    public boolean isInfoExist() {
        return infoExist;
    }

    /**
     * Sets the value of the infoExist property.
     * 
     */
    public void setInfoExist(boolean value) {
        this.infoExist = value;
    }

    /**
     * Gets the value of the generalInfoExist property.
     * 
     */
    public boolean isGeneralInfoExist() {
        return generalInfoExist;
    }

    /**
     * Sets the value of the generalInfoExist property.
     * 
     */
    public void setGeneralInfoExist(boolean value) {
        this.generalInfoExist = value;
    }

    /**
     * Gets the value of the locationInfoExist property.
     * 
     */
    public boolean isLocationInfoExist() {
        return locationInfoExist;
    }

    /**
     * Sets the value of the locationInfoExist property.
     * 
     */
    public void setLocationInfoExist(boolean value) {
        this.locationInfoExist = value;
    }

    /**
     * Gets the value of the pdfExist property.
     * 
     */
    public boolean isPdfExist() {
        return pdfExist;
    }

    /**
     * Sets the value of the pdfExist property.
     * 
     */
    public void setPdfExist(boolean value) {
        this.pdfExist = value;
    }

    /**
     * Gets the value of the rrExist property.
     * 
     */
    public boolean isRrExist() {
        return rrExist;
    }

    /**
     * Sets the value of the rrExist property.
     * 
     */
    public void setRrExist(boolean value) {
        this.rrExist = value;
    }

    /**
     * Gets the value of the iframeExist property.
     * 
     */
    public boolean isIframeExist() {
        return iframeExist;
    }

    /**
     * Sets the value of the iframeExist property.
     * 
     */
    public void setIframeExist(boolean value) {
        this.iframeExist = value;
    }

    /**
     * Gets the value of the customcontentExist property.
     * 
     */
    public boolean isCustomcontentExist() {
        return customcontentExist;
    }

    /**
     * Sets the value of the customcontentExist property.
     * 
     */
    public void setCustomcontentExist(boolean value) {
        this.customcontentExist = value;
    }

}
