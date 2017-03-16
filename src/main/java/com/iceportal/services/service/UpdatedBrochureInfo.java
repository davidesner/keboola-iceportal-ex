
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatedBrochureInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatedBrochureInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brochureID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mappedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newProperty" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="publishedStatusChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mappedIDChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PropertyInfoChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ContentChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatedBrochureInfo", propOrder = {
    "brochureID",
    "mappedID",
    "newProperty",
    "publishedStatusChanged",
    "mappedIDChanged",
    "propertyInfoChanged",
    "contentChanged"
})
public class UpdatedBrochureInfo {

    protected int brochureID;
    protected String mappedID;
    protected boolean newProperty;
    protected boolean publishedStatusChanged;
    protected boolean mappedIDChanged;
    @XmlElement(name = "PropertyInfoChanged")
    protected boolean propertyInfoChanged;
    @XmlElement(name = "ContentChanged")
    protected boolean contentChanged;

    /**
     * Gets the value of the brochureID property.
     * 
     */
    public int getBrochureID() {
        return brochureID;
    }

    /**
     * Sets the value of the brochureID property.
     * 
     */
    public void setBrochureID(int value) {
        this.brochureID = value;
    }

    /**
     * Gets the value of the mappedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedID() {
        return mappedID;
    }

    /**
     * Sets the value of the mappedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedID(String value) {
        this.mappedID = value;
    }

    /**
     * Gets the value of the newProperty property.
     * 
     */
    public boolean isNewProperty() {
        return newProperty;
    }

    /**
     * Sets the value of the newProperty property.
     * 
     */
    public void setNewProperty(boolean value) {
        this.newProperty = value;
    }

    /**
     * Gets the value of the publishedStatusChanged property.
     * 
     */
    public boolean isPublishedStatusChanged() {
        return publishedStatusChanged;
    }

    /**
     * Sets the value of the publishedStatusChanged property.
     * 
     */
    public void setPublishedStatusChanged(boolean value) {
        this.publishedStatusChanged = value;
    }

    /**
     * Gets the value of the mappedIDChanged property.
     * 
     */
    public boolean isMappedIDChanged() {
        return mappedIDChanged;
    }

    /**
     * Sets the value of the mappedIDChanged property.
     * 
     */
    public void setMappedIDChanged(boolean value) {
        this.mappedIDChanged = value;
    }

    /**
     * Gets the value of the propertyInfoChanged property.
     * 
     */
    public boolean isPropertyInfoChanged() {
        return propertyInfoChanged;
    }

    /**
     * Sets the value of the propertyInfoChanged property.
     * 
     */
    public void setPropertyInfoChanged(boolean value) {
        this.propertyInfoChanged = value;
    }

    /**
     * Gets the value of the contentChanged property.
     * 
     */
    public boolean isContentChanged() {
        return contentChanged;
    }

    /**
     * Sets the value of the contentChanged property.
     * 
     */
    public void setContentChanged(boolean value) {
        this.contentChanged = value;
    }

}
