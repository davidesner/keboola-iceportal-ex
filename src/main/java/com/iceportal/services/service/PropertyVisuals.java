
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyVisuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://services.iceportal.com/service}BrochureRequest" minOccurs="0"/&gt;
 *         &lt;element name="PropertyInfo" type="{http://services.iceportal.com/service}BrochureInfoVisuals" minOccurs="0"/&gt;
 *         &lt;element name="PrecICETags" type="{http://services.iceportal.com/service}PrecICETags" minOccurs="0"/&gt;
 *         &lt;element name="PropertyDescription" type="{http://services.iceportal.com/service}PropertyDescription" minOccurs="0"/&gt;
 *         &lt;element name="AvailableContent" type="{http://services.iceportal.com/service}availableContent" minOccurs="0"/&gt;
 *         &lt;element name="MediaGallery" type="{http://services.iceportal.com/service}BrochureContentVisuals" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{http://services.iceportal.com/service}BrochureInformationVisuals" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://services.iceportal.com/service}BrochureLocationVisuals" minOccurs="0"/&gt;
 *         &lt;element name="Resources" type="{http://services.iceportal.com/service}BrochureResourcesVisuals" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyVisuals", propOrder = {
    "request",
    "propertyInfo",
    "precICETags",
    "propertyDescription",
    "availableContent",
    "mediaGallery",
    "information",
    "location",
    "resources"
})
public class PropertyVisuals {

    @XmlElement(name = "Request")
    protected BrochureRequest request;
    @XmlElement(name = "PropertyInfo")
    protected BrochureInfoVisuals propertyInfo;
    @XmlElement(name = "PrecICETags")
    protected PrecICETags precICETags;
    @XmlElement(name = "PropertyDescription")
    protected PropertyDescription propertyDescription;
    @XmlElement(name = "AvailableContent")
    protected AvailableContent2 availableContent;
    @XmlElement(name = "MediaGallery")
    protected BrochureContentVisuals mediaGallery;
    @XmlElement(name = "Information")
    protected BrochureInformationVisuals information;
    @XmlElement(name = "Location")
    protected BrochureLocationVisuals location;
    @XmlElement(name = "Resources")
    protected BrochureResourcesVisuals resources;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureRequest }
     *     
     */
    public BrochureRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureRequest }
     *     
     */
    public void setRequest(BrochureRequest value) {
        this.request = value;
    }

    /**
     * Gets the value of the propertyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureInfoVisuals }
     *     
     */
    public BrochureInfoVisuals getPropertyInfo() {
        return propertyInfo;
    }

    /**
     * Sets the value of the propertyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureInfoVisuals }
     *     
     */
    public void setPropertyInfo(BrochureInfoVisuals value) {
        this.propertyInfo = value;
    }

    /**
     * Gets the value of the precICETags property.
     * 
     * @return
     *     possible object is
     *     {@link PrecICETags }
     *     
     */
    public PrecICETags getPrecICETags() {
        return precICETags;
    }

    /**
     * Sets the value of the precICETags property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecICETags }
     *     
     */
    public void setPrecICETags(PrecICETags value) {
        this.precICETags = value;
    }

    /**
     * Gets the value of the propertyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyDescription }
     *     
     */
    public PropertyDescription getPropertyDescription() {
        return propertyDescription;
    }

    /**
     * Sets the value of the propertyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDescription }
     *     
     */
    public void setPropertyDescription(PropertyDescription value) {
        this.propertyDescription = value;
    }

    /**
     * Gets the value of the availableContent property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableContent2 }
     *     
     */
    public AvailableContent2 getAvailableContent() {
        return availableContent;
    }

    /**
     * Sets the value of the availableContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableContent2 }
     *     
     */
    public void setAvailableContent(AvailableContent2 value) {
        this.availableContent = value;
    }

    /**
     * Gets the value of the mediaGallery property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureContentVisuals }
     *     
     */
    public BrochureContentVisuals getMediaGallery() {
        return mediaGallery;
    }

    /**
     * Sets the value of the mediaGallery property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureContentVisuals }
     *     
     */
    public void setMediaGallery(BrochureContentVisuals value) {
        this.mediaGallery = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureInformationVisuals }
     *     
     */
    public BrochureInformationVisuals getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureInformationVisuals }
     *     
     */
    public void setInformation(BrochureInformationVisuals value) {
        this.information = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureLocationVisuals }
     *     
     */
    public BrochureLocationVisuals getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureLocationVisuals }
     *     
     */
    public void setLocation(BrochureLocationVisuals value) {
        this.location = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureResourcesVisuals }
     *     
     */
    public BrochureResourcesVisuals getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureResourcesVisuals }
     *     
     */
    public void setResources(BrochureResourcesVisuals value) {
        this.resources = value;
    }

}
