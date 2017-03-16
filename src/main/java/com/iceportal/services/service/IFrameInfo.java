
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iFrameInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iFrameInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mediaGalleryUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Caption" type="{http://services.iceportal.com/service}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="MediaLink" type="{http://services.iceportal.com/service}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iFrameInfo", propOrder = {
    "mediaGalleryUrl",
    "caption",
    "mediaLink"
})
public class IFrameInfo {

    protected String mediaGalleryUrl;
    @XmlElement(name = "Caption")
    protected ArrayOfString caption;
    @XmlElement(name = "MediaLink")
    protected ArrayOfString mediaLink;

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
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCaption(ArrayOfString value) {
        this.caption = value;
    }

    /**
     * Gets the value of the mediaLink property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getMediaLink() {
        return mediaLink;
    }

    /**
     * Sets the value of the mediaLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setMediaLink(ArrayOfString value) {
        this.mediaLink = value;
    }

}
