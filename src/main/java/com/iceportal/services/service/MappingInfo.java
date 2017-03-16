
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MappingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MappingInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MappedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publishedOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowVideos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowVRs" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowPictures" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowLocationLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowGeneralInfoLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowPDFLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowRateReservation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowLang" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowEmailLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingInfo", propOrder = {
    "iceID",
    "mappedID",
    "createdOn",
    "publishedOn",
    "lastModifiedOn",
    "enabled",
    "showVideos",
    "showVRs",
    "showPictures",
    "showInfo",
    "showLocationLink",
    "showGeneralInfoLink",
    "showPDFLink",
    "showRateReservation",
    "showLang",
    "showEmailLink"
})
public class MappingInfo {

    protected int iceID;
    @XmlElement(name = "MappedID")
    protected String mappedID;
    @XmlElement(name = "CreatedOn")
    protected String createdOn;
    protected String publishedOn;
    @XmlElement(name = "LastModifiedOn")
    protected String lastModifiedOn;
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "ShowVideos")
    protected boolean showVideos;
    @XmlElement(name = "ShowVRs")
    protected boolean showVRs;
    @XmlElement(name = "ShowPictures")
    protected boolean showPictures;
    @XmlElement(name = "ShowInfo")
    protected boolean showInfo;
    @XmlElement(name = "ShowLocationLink")
    protected boolean showLocationLink;
    @XmlElement(name = "ShowGeneralInfoLink")
    protected boolean showGeneralInfoLink;
    @XmlElement(name = "ShowPDFLink")
    protected boolean showPDFLink;
    @XmlElement(name = "ShowRateReservation")
    protected boolean showRateReservation;
    @XmlElement(name = "ShowLang")
    protected boolean showLang;
    @XmlElement(name = "ShowEmailLink")
    protected boolean showEmailLink;

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
     * Gets the value of the mappedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedID() {
        return mappedID;
    }

    /**
     * Sets the value of the mappedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedID(String value) {
        this.mappedID = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedOn(String value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the publishedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedOn() {
        return publishedOn;
    }

    /**
     * Sets the value of the publishedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedOn(String value) {
        this.publishedOn = value;
    }

    /**
     * Gets the value of the lastModifiedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedOn() {
        return lastModifiedOn;
    }

    /**
     * Sets the value of the lastModifiedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedOn(String value) {
        this.lastModifiedOn = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the showVideos property.
     * 
     */
    public boolean isShowVideos() {
        return showVideos;
    }

    /**
     * Sets the value of the showVideos property.
     * 
     */
    public void setShowVideos(boolean value) {
        this.showVideos = value;
    }

    /**
     * Gets the value of the showVRs property.
     * 
     */
    public boolean isShowVRs() {
        return showVRs;
    }

    /**
     * Sets the value of the showVRs property.
     * 
     */
    public void setShowVRs(boolean value) {
        this.showVRs = value;
    }

    /**
     * Gets the value of the showPictures property.
     * 
     */
    public boolean isShowPictures() {
        return showPictures;
    }

    /**
     * Sets the value of the showPictures property.
     * 
     */
    public void setShowPictures(boolean value) {
        this.showPictures = value;
    }

    /**
     * Gets the value of the showInfo property.
     * 
     */
    public boolean isShowInfo() {
        return showInfo;
    }

    /**
     * Sets the value of the showInfo property.
     * 
     */
    public void setShowInfo(boolean value) {
        this.showInfo = value;
    }

    /**
     * Gets the value of the showLocationLink property.
     * 
     */
    public boolean isShowLocationLink() {
        return showLocationLink;
    }

    /**
     * Sets the value of the showLocationLink property.
     * 
     */
    public void setShowLocationLink(boolean value) {
        this.showLocationLink = value;
    }

    /**
     * Gets the value of the showGeneralInfoLink property.
     * 
     */
    public boolean isShowGeneralInfoLink() {
        return showGeneralInfoLink;
    }

    /**
     * Sets the value of the showGeneralInfoLink property.
     * 
     */
    public void setShowGeneralInfoLink(boolean value) {
        this.showGeneralInfoLink = value;
    }

    /**
     * Gets the value of the showPDFLink property.
     * 
     */
    public boolean isShowPDFLink() {
        return showPDFLink;
    }

    /**
     * Sets the value of the showPDFLink property.
     * 
     */
    public void setShowPDFLink(boolean value) {
        this.showPDFLink = value;
    }

    /**
     * Gets the value of the showRateReservation property.
     * 
     */
    public boolean isShowRateReservation() {
        return showRateReservation;
    }

    /**
     * Sets the value of the showRateReservation property.
     * 
     */
    public void setShowRateReservation(boolean value) {
        this.showRateReservation = value;
    }

    /**
     * Gets the value of the showLang property.
     * 
     */
    public boolean isShowLang() {
        return showLang;
    }

    /**
     * Sets the value of the showLang property.
     * 
     */
    public void setShowLang(boolean value) {
        this.showLang = value;
    }

    /**
     * Gets the value of the showEmailLink property.
     * 
     */
    public boolean isShowEmailLink() {
        return showEmailLink;
    }

    /**
     * Sets the value of the showEmailLink property.
     * 
     */
    public void setShowEmailLink(boolean value) {
        this.showEmailLink = value;
    }

}
