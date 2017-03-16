
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyInfoV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyInfoV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://services.iceportal.com/service}BrochureRequest" minOccurs="0"/&gt;
 *         &lt;element name="brochureInfo" type="{http://services.iceportal.com/service}BrochureInfoForGetPropertyInfoV1" minOccurs="0"/&gt;
 *         &lt;element name="constraints" type="{http://services.iceportal.com/service}BrochureConstraint" minOccurs="0"/&gt;
 *         &lt;element name="availableContent" type="{http://services.iceportal.com/service}AvailableContent" minOccurs="0"/&gt;
 *         &lt;element name="GDSCodes" type="{http://services.iceportal.com/service}ArrayOfGDSCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyInfoV1", propOrder = {
    "request",
    "brochureInfo",
    "constraints",
    "availableContent",
    "gdsCodes"
})
public class PropertyInfoV1 {

    protected BrochureRequest request;
    protected BrochureInfoForGetPropertyInfoV1 brochureInfo;
    protected BrochureConstraint constraints;
    protected AvailableContent availableContent;
    @XmlElement(name = "GDSCodes")
    protected ArrayOfGDSCode gdsCodes;

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
     * Gets the value of the brochureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureInfoForGetPropertyInfoV1 }
     *     
     */
    public BrochureInfoForGetPropertyInfoV1 getBrochureInfo() {
        return brochureInfo;
    }

    /**
     * Sets the value of the brochureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureInfoForGetPropertyInfoV1 }
     *     
     */
    public void setBrochureInfo(BrochureInfoForGetPropertyInfoV1 value) {
        this.brochureInfo = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureConstraint }
     *     
     */
    public BrochureConstraint getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureConstraint }
     *     
     */
    public void setConstraints(BrochureConstraint value) {
        this.constraints = value;
    }

    /**
     * Gets the value of the availableContent property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableContent }
     *     
     */
    public AvailableContent getAvailableContent() {
        return availableContent;
    }

    /**
     * Sets the value of the availableContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableContent }
     *     
     */
    public void setAvailableContent(AvailableContent value) {
        this.availableContent = value;
    }

    /**
     * Gets the value of the gdsCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGDSCode }
     *     
     */
    public ArrayOfGDSCode getGDSCodes() {
        return gdsCodes;
    }

    /**
     * Sets the value of the gdsCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGDSCode }
     *     
     */
    public void setGDSCodes(ArrayOfGDSCode value) {
        this.gdsCodes = value;
    }

}
