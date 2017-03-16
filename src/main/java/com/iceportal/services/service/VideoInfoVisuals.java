
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoInfoVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoInfoVisuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ordinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thumbnailCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thumbnailURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videoCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mediaLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mediaGalleryUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_720p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_360p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoInfoVisuals", propOrder = {
    "ordinal",
    "publicID",
    "thumbnailCaption",
    "thumbnailURL",
    "videoCaption",
    "videoURL",
    "language",
    "languageid",
    "mediaLink",
    "mediaGalleryUrl",
    "_720P",
    "_360P"
})
public class VideoInfoVisuals {

    @XmlElement(name = "Ordinal")
    protected String ordinal;
    @XmlElement(name = "PublicID")
    protected String publicID;
    protected String thumbnailCaption;
    protected String thumbnailURL;
    protected String videoCaption;
    protected String videoURL;
    protected String language;
    protected String languageid;
    protected String mediaLink;
    protected String mediaGalleryUrl;
    @XmlElement(name = "_720p")
    protected String _720P;
    @XmlElement(name = "_360p")
    protected String _360P;

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
     * Gets the value of the publicID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicID() {
        return publicID;
    }

    /**
     * Sets the value of the publicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicID(String value) {
        this.publicID = value;
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
     * Gets the value of the mediaGalleryUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaGalleryUrl() {
        return mediaGalleryUrl;
    }

    /**
     * Sets the value of the mediaGalleryUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaGalleryUrl(String value) {
        this.mediaGalleryUrl = value;
    }

    /**
     * Gets the value of the 720P property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get720P() {
        return _720P;
    }

    /**
     * Sets the value of the 720P property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set720P(String value) {
        this._720P = value;
    }

    /**
     * Gets the value of the 360P property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get360P() {
        return _360P;
    }

    /**
     * Sets the value of the 360P property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set360P(String value) {
        this._360P = value;
    }

}
