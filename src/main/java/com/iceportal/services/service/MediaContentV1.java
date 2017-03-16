
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaContentV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaContentV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brochureUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertyMapUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="captions" type="{http://services.iceportal.com/service}ArrayOfCaption" minOccurs="0"/&gt;
 *         &lt;element name="categories" type="{http://services.iceportal.com/service}ArrayOfCategory" minOccurs="0"/&gt;
 *         &lt;element name="images" type="{http://services.iceportal.com/service}ArrayOfBrochureImageV1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaContentV1", propOrder = {
    "brochureUrl",
    "propertyMapUrl",
    "captions",
    "categories",
    "images"
})
public class MediaContentV1 {

    protected String brochureUrl;
    protected String propertyMapUrl;
    protected ArrayOfCaption captions;
    protected ArrayOfCategory categories;
    protected ArrayOfBrochureImageV1 images;

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
     *     {@link ArrayOfCaption }
     *     
     */
    public ArrayOfCaption getCaptions() {
        return captions;
    }

    /**
     * Sets the value of the captions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCaption }
     *     
     */
    public void setCaptions(ArrayOfCaption value) {
        this.captions = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategory }
     *     
     */
    public ArrayOfCategory getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategory }
     *     
     */
    public void setCategories(ArrayOfCategory value) {
        this.categories = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBrochureImageV1 }
     *     
     */
    public ArrayOfBrochureImageV1 getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrochureImageV1 }
     *     
     */
    public void setImages(ArrayOfBrochureImageV1 value) {
        this.images = value;
    }

}
