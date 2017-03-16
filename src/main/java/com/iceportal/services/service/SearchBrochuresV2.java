
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
 *         &lt;element name="HD360sExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="photosExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iFrameExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customContentExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "hd360SExist",
    "photosExist",
    "iFrameExist",
    "customContentExist",
    "pageSize",
    "pageNumber"
})
@XmlRootElement(name = "SearchBrochuresV2")
public class SearchBrochuresV2 {

    @XmlElement(name = "DID")
    protected int did;
    protected String hotelName;
    protected String city;
    protected String state;
    protected String country;
    protected String region;
    protected String type;
    protected String videosExist;
    @XmlElement(name = "HD360sExist")
    protected String hd360SExist;
    protected String photosExist;
    protected String iFrameExist;
    protected String customContentExist;
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
     * Gets the value of the hd360SExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHD360SExist() {
        return hd360SExist;
    }

    /**
     * Sets the value of the hd360SExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHD360SExist(String value) {
        this.hd360SExist = value;
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
     * Gets the value of the iFrameExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFrameExist() {
        return iFrameExist;
    }

    /**
     * Sets the value of the iFrameExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFrameExist(String value) {
        this.iFrameExist = value;
    }

    /**
     * Gets the value of the customContentExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomContentExist() {
        return customContentExist;
    }

    /**
     * Sets the value of the customContentExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomContentExist(String value) {
        this.customContentExist = value;
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
