
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrochureLocationV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrochureLocationV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brochureUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="textContent" type="{http://services.iceportal.com/service}ArrayOfItem" minOccurs="0"/&gt;
 *         &lt;element name="locationImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrochureLocationV2", propOrder = {
    "brochureUrl",
    "textContent",
    "locationImageUrl",
    "locationImage"
})
public class BrochureLocationV2 {

    protected String brochureUrl;
    protected ArrayOfItem textContent;
    protected String locationImageUrl;
    protected byte[] locationImage;

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
     * Gets the value of the textContent property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItem }
     *     
     */
    public ArrayOfItem getTextContent() {
        return textContent;
    }

    /**
     * Sets the value of the textContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItem }
     *     
     */
    public void setTextContent(ArrayOfItem value) {
        this.textContent = value;
    }

    /**
     * Gets the value of the locationImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationImageUrl() {
        return locationImageUrl;
    }

    /**
     * Sets the value of the locationImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationImageUrl(String value) {
        this.locationImageUrl = value;
    }

    /**
     * Gets the value of the locationImage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLocationImage() {
        return locationImage;
    }

    /**
     * Sets the value of the locationImage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLocationImage(byte[] value) {
        this.locationImage = value;
    }

}
