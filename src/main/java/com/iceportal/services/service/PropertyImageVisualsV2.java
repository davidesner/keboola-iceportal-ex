
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyImageVisualsV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyImageVisualsV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PublicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThumbUrl" type="{http://services.iceportal.com/service}thumbUrl" minOccurs="0"/&gt;
 *         &lt;element name="thumb" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="fullSizeUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MediaLink" type="{http://services.iceportal.com/service}mediaLink" minOccurs="0"/&gt;
 *         &lt;element name="DirectLinks" type="{http://services.iceportal.com/service}DirectLinks" minOccurs="0"/&gt;
 *         &lt;element name="mediaGalleryUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullSize" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeCodes" type="{http://services.iceportal.com/service}RoomTypes" minOccurs="0"/&gt;
 *         &lt;element name="PrecIceTags" type="{http://services.iceportal.com/service}ImageTags" minOccurs="0"/&gt;
 *         &lt;element name="QualityScore" type="{http://services.iceportal.com/service}QualityScore" minOccurs="0"/&gt;
 *         &lt;element name="FileModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileHashCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MetadataModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyImageVisualsV2", propOrder = {
    "ordinal",
    "publicID",
    "thumbUrl",
    "thumb",
    "fullSizeUrl",
    "mediaLink",
    "directLinks",
    "mediaGalleryUrl",
    "fullSize",
    "modifiedDate",
    "roomTypeCodes",
    "precIceTags",
    "qualityScore",
    "fileModifiedDate",
    "fileHashCode",
    "metadataModifiedDate"
})
public class PropertyImageVisualsV2 {

    protected int ordinal;
    @XmlElement(name = "PublicID")
    protected String publicID;
    @XmlElement(name = "ThumbUrl")
    protected ThumbUrl thumbUrl;
    protected byte[] thumb;
    protected String fullSizeUrl;
    @XmlElement(name = "MediaLink")
    protected MediaLink mediaLink;
    @XmlElement(name = "DirectLinks")
    protected DirectLinks directLinks;
    protected String mediaGalleryUrl;
    protected byte[] fullSize;
    protected String modifiedDate;
    @XmlElement(name = "RoomTypeCodes")
    protected RoomTypes roomTypeCodes;
    @XmlElement(name = "PrecIceTags")
    protected ImageTags precIceTags;
    @XmlElement(name = "QualityScore")
    protected QualityScore qualityScore;
    @XmlElement(name = "FileModifiedDate")
    protected String fileModifiedDate;
    @XmlElement(name = "FileHashCode")
    protected String fileHashCode;
    @XmlElement(name = "MetadataModifiedDate")
    protected String metadataModifiedDate;

    /**
     * Gets the value of the ordinal property.
     * 
     */
    public int getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     */
    public void setOrdinal(int value) {
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
     * Gets the value of the thumbUrl property.
     * 
     * @return
     *     possible object is
     *     {@link ThumbUrl }
     *     
     */
    public ThumbUrl getThumbUrl() {
        return thumbUrl;
    }

    /**
     * Sets the value of the thumbUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThumbUrl }
     *     
     */
    public void setThumbUrl(ThumbUrl value) {
        this.thumbUrl = value;
    }

    /**
     * Gets the value of the thumb property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getThumb() {
        return thumb;
    }

    /**
     * Sets the value of the thumb property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setThumb(byte[] value) {
        this.thumb = value;
    }

    /**
     * Gets the value of the fullSizeUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullSizeUrl() {
        return fullSizeUrl;
    }

    /**
     * Sets the value of the fullSizeUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullSizeUrl(String value) {
        this.fullSizeUrl = value;
    }

    /**
     * Gets the value of the mediaLink property.
     * 
     * @return
     *     possible object is
     *     {@link MediaLink }
     *     
     */
    public MediaLink getMediaLink() {
        return mediaLink;
    }

    /**
     * Sets the value of the mediaLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaLink }
     *     
     */
    public void setMediaLink(MediaLink value) {
        this.mediaLink = value;
    }

    /**
     * Gets the value of the directLinks property.
     * 
     * @return
     *     possible object is
     *     {@link DirectLinks }
     *     
     */
    public DirectLinks getDirectLinks() {
        return directLinks;
    }

    /**
     * Sets the value of the directLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectLinks }
     *     
     */
    public void setDirectLinks(DirectLinks value) {
        this.directLinks = value;
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
     * Gets the value of the fullSize property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFullSize() {
        return fullSize;
    }

    /**
     * Sets the value of the fullSize property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFullSize(byte[] value) {
        this.fullSize = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the roomTypeCodes property.
     * 
     * @return
     *     possible object is
     *     {@link RoomTypes }
     *     
     */
    public RoomTypes getRoomTypeCodes() {
        return roomTypeCodes;
    }

    /**
     * Sets the value of the roomTypeCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypes }
     *     
     */
    public void setRoomTypeCodes(RoomTypes value) {
        this.roomTypeCodes = value;
    }

    /**
     * Gets the value of the precIceTags property.
     * 
     * @return
     *     possible object is
     *     {@link ImageTags }
     *     
     */
    public ImageTags getPrecIceTags() {
        return precIceTags;
    }

    /**
     * Sets the value of the precIceTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageTags }
     *     
     */
    public void setPrecIceTags(ImageTags value) {
        this.precIceTags = value;
    }

    /**
     * Gets the value of the qualityScore property.
     * 
     * @return
     *     possible object is
     *     {@link QualityScore }
     *     
     */
    public QualityScore getQualityScore() {
        return qualityScore;
    }

    /**
     * Sets the value of the qualityScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityScore }
     *     
     */
    public void setQualityScore(QualityScore value) {
        this.qualityScore = value;
    }

    /**
     * Gets the value of the fileModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileModifiedDate() {
        return fileModifiedDate;
    }

    /**
     * Sets the value of the fileModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileModifiedDate(String value) {
        this.fileModifiedDate = value;
    }

    /**
     * Gets the value of the fileHashCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileHashCode() {
        return fileHashCode;
    }

    /**
     * Sets the value of the fileHashCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileHashCode(String value) {
        this.fileHashCode = value;
    }

    /**
     * Gets the value of the metadataModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataModifiedDate() {
        return metadataModifiedDate;
    }

    /**
     * Sets the value of the metadataModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataModifiedDate(String value) {
        this.metadataModifiedDate = value;
    }

}
