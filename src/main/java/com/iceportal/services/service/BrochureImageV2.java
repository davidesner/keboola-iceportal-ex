
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrochureImageV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrochureImageV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="thumbUrl" type="{http://services.iceportal.com/service}thumbUrl" minOccurs="0"/&gt;
 *         &lt;element name="thumb" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="fullSizeUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mediaLink" type="{http://services.iceportal.com/service}mediaLink" minOccurs="0"/&gt;
 *         &lt;element name="brochureUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullSize" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrochureImageV2", propOrder = {
    "ordinal",
    "thumbUrl",
    "thumb",
    "fullSizeUrl",
    "mediaLink",
    "brochureUrl",
    "fullSize",
    "modifiedDate"
})
public class BrochureImageV2 {

    protected int ordinal;
    protected ThumbUrl thumbUrl;
    protected byte[] thumb;
    protected String fullSizeUrl;
    protected MediaLink mediaLink;
    protected String brochureUrl;
    protected byte[] fullSize;
    protected String modifiedDate;

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

}
