
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrochureInformationVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrochureInformationVisuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brochureUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="longDescription" type="{http://services.iceportal.com/service}ArrayOfItemForVisuals" minOccurs="0"/&gt;
 *         &lt;element name="shortDescription" type="{http://services.iceportal.com/service}ArrayOfDescriptionItem" minOccurs="0"/&gt;
 *         &lt;element name="hotelName" type="{http://services.iceportal.com/service}ArrayOfItemForVisuals" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrochureInformationVisuals", propOrder = {
    "brochureUrl",
    "longDescription",
    "shortDescription",
    "hotelName"
})
public class BrochureInformationVisuals {

    protected String brochureUrl;
    protected ArrayOfItemForVisuals longDescription;
    protected ArrayOfDescriptionItem shortDescription;
    protected ArrayOfItemForVisuals hotelName;

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
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemForVisuals }
     *     
     */
    public ArrayOfItemForVisuals getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemForVisuals }
     *     
     */
    public void setLongDescription(ArrayOfItemForVisuals value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDescriptionItem }
     *     
     */
    public ArrayOfDescriptionItem getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDescriptionItem }
     *     
     */
    public void setShortDescription(ArrayOfDescriptionItem value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemForVisuals }
     *     
     */
    public ArrayOfItemForVisuals getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemForVisuals }
     *     
     */
    public void setHotelName(ArrayOfItemForVisuals value) {
        this.hotelName = value;
    }

}
