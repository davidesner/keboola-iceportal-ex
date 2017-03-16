
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Videos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Photos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HD360s" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GeneralInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PDFLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Iframe" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableContent", propOrder = {
    "videos",
    "photos",
    "hd360S",
    "generalInfo",
    "location",
    "pdfLink",
    "iframe"
})
public class AvailableContent {

    @XmlElement(name = "Videos")
    protected boolean videos;
    @XmlElement(name = "Photos")
    protected boolean photos;
    @XmlElement(name = "HD360s")
    protected boolean hd360S;
    @XmlElement(name = "GeneralInfo")
    protected boolean generalInfo;
    @XmlElement(name = "Location")
    protected boolean location;
    @XmlElement(name = "PDFLink")
    protected boolean pdfLink;
    @XmlElement(name = "Iframe")
    protected boolean iframe;

    /**
     * Gets the value of the videos property.
     * 
     */
    public boolean isVideos() {
        return videos;
    }

    /**
     * Sets the value of the videos property.
     * 
     */
    public void setVideos(boolean value) {
        this.videos = value;
    }

    /**
     * Gets the value of the photos property.
     * 
     */
    public boolean isPhotos() {
        return photos;
    }

    /**
     * Sets the value of the photos property.
     * 
     */
    public void setPhotos(boolean value) {
        this.photos = value;
    }

    /**
     * Gets the value of the hd360S property.
     * 
     */
    public boolean isHD360S() {
        return hd360S;
    }

    /**
     * Sets the value of the hd360S property.
     * 
     */
    public void setHD360S(boolean value) {
        this.hd360S = value;
    }

    /**
     * Gets the value of the generalInfo property.
     * 
     */
    public boolean isGeneralInfo() {
        return generalInfo;
    }

    /**
     * Sets the value of the generalInfo property.
     * 
     */
    public void setGeneralInfo(boolean value) {
        this.generalInfo = value;
    }

    /**
     * Gets the value of the location property.
     * 
     */
    public boolean isLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     */
    public void setLocation(boolean value) {
        this.location = value;
    }

    /**
     * Gets the value of the pdfLink property.
     * 
     */
    public boolean isPDFLink() {
        return pdfLink;
    }

    /**
     * Sets the value of the pdfLink property.
     * 
     */
    public void setPDFLink(boolean value) {
        this.pdfLink = value;
    }

    /**
     * Gets the value of the iframe property.
     * 
     */
    public boolean isIframe() {
        return iframe;
    }

    /**
     * Sets the value of the iframe property.
     * 
     */
    public void setIframe(boolean value) {
        this.iframe = value;
    }

}
