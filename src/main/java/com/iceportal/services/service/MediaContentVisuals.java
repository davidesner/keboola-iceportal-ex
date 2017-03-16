
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaContentVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaContentVisuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mediaGalleryURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertyMapUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Captions" type="{http://services.iceportal.com/service}ArrayOfCaptionForVisuals" minOccurs="0"/&gt;
 *         &lt;element name="Images" type="{http://services.iceportal.com/service}ArrayOfPropertyImageVisuals" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaContentVisuals", propOrder = {
    "mediaGalleryURL",
    "propertyMapUrl",
    "captions",
    "images"
})
public class MediaContentVisuals {

    protected String mediaGalleryURL;
    protected String propertyMapUrl;
    @XmlElement(name = "Captions")
    protected ArrayOfCaptionForVisuals captions;
    @XmlElement(name = "Images")
    protected ArrayOfPropertyImageVisuals images;

    /**
     * Gets the value of the mediaGalleryURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaGalleryURL() {
        return mediaGalleryURL;
    }

    /**
     * Sets the value of the mediaGalleryURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaGalleryURL(String value) {
        this.mediaGalleryURL = value;
    }

    /**
     * Gets the value of the propertyMapUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyMapUrl() {
        return propertyMapUrl;
    }

    /**
     * Sets the value of the propertyMapUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyMapUrl(String value) {
        this.propertyMapUrl = value;
    }

    /**
     * Gets the value of the captions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCaptionForVisuals }
     *     
     */
    public ArrayOfCaptionForVisuals getCaptions() {
        return captions;
    }

    /**
     * Sets the value of the captions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCaptionForVisuals }
     *     
     */
    public void setCaptions(ArrayOfCaptionForVisuals value) {
        this.captions = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPropertyImageVisuals }
     *     
     */
    public ArrayOfPropertyImageVisuals getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPropertyImageVisuals }
     *     
     */
    public void setImages(ArrayOfPropertyImageVisuals value) {
        this.images = value;
    }

}
