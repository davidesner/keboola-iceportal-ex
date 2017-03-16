
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for videoInfoV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="videoInfoV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ordinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thumbnailCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thumbnailURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videoCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mediaLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brochureUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fastDirectURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="slowDirectURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "videoInfoV2", propOrder = {
    "ordinal",
    "thumbnailCaption",
    "thumbnailURL",
    "videoCaption",
    "videoURL",
    "language",
    "languageid",
    "mediaLink",
    "brochureUrl",
    "fastDirectURL",
    "slowDirectURL"
})
public class VideoInfoV2 {

    @XmlElement(name = "Ordinal")
    protected String ordinal;
    protected String thumbnailCaption;
    protected String thumbnailURL;
    protected String videoCaption;
    protected String videoURL;
    protected String language;
    protected String languageid;
    protected String mediaLink;
    protected String brochureUrl;
    protected String fastDirectURL;
    protected String slowDirectURL;

    /**
     * Gets the value of the ordinal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdinal(String value) {
        this.ordinal = value;
    }

    /**
     * Gets the value of the thumbnailCaption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailCaption() {
        return thumbnailCaption;
    }

    /**
     * Sets the value of the thumbnailCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailCaption(String value) {
        this.thumbnailCaption = value;
    }

    /**
     * Gets the value of the thumbnailURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailURL() {
        return thumbnailURL;
    }

    /**
     * Sets the value of the thumbnailURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailURL(String value) {
        this.thumbnailURL = value;
    }

    /**
     * Gets the value of the videoCaption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoCaption() {
        return videoCaption;
    }

    /**
     * Sets the value of the videoCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoCaption(String value) {
        this.videoCaption = value;
    }

    /**
     * Gets the value of the videoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoURL() {
        return videoURL;
    }

    /**
     * Sets the value of the videoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoURL(String value) {
        this.videoURL = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the languageid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageid() {
        return languageid;
    }

    /**
     * Sets the value of the languageid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageid(String value) {
        this.languageid = value;
    }

    /**
     * Gets the value of the mediaLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaLink() {
        return mediaLink;
    }

    /**
     * Sets the value of the mediaLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaLink(String value) {
        this.mediaLink = value;
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
     * Gets the value of the fastDirectURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastDirectURL() {
        return fastDirectURL;
    }

    /**
     * Sets the value of the fastDirectURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastDirectURL(String value) {
        this.fastDirectURL = value;
    }

    /**
     * Gets the value of the slowDirectURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlowDirectURL() {
        return slowDirectURL;
    }

    /**
     * Sets the value of the slowDirectURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlowDirectURL(String value) {
        this.slowDirectURL = value;
    }

}
