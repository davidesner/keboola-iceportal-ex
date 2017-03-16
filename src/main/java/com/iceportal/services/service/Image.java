
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Image"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mediaType" type="{http://services.iceportal.com/service}MediaType"/&gt;
 *         &lt;element name="mediaURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {
    "publicId",
    "mediaType",
    "mediaURL"
})
public class Image {

    protected int publicId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MediaType mediaType;
    protected String mediaURL;

    /**
     * Gets the value of the publicId property.
     * 
     */
    public int getPublicId() {
        return publicId;
    }

    /**
     * Sets the value of the publicId property.
     * 
     */
    public void setPublicId(int value) {
        this.publicId = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link MediaType }
     *     
     */
    public MediaType getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaType }
     *     
     */
    public void setMediaType(MediaType value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the mediaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaURL() {
        return mediaURL;
    }

    /**
     * Sets the value of the mediaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaURL(String value) {
        this.mediaURL = value;
    }

}
