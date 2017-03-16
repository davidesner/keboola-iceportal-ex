
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetPropertyInfoV1Result" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brochure" type="{http://services.iceportal.com/service}PropertyInfoV1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPropertyInfoV1Result",
    "errorMessage",
    "brochure"
})
@XmlRootElement(name = "GetPropertyInfoV1Response")
public class GetPropertyInfoV1Response {

    @XmlElement(name = "GetPropertyInfoV1Result")
    protected int getPropertyInfoV1Result;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    protected PropertyInfoV1 brochure;

    /**
     * Gets the value of the getPropertyInfoV1Result property.
     * 
     */
    public int getGetPropertyInfoV1Result() {
        return getPropertyInfoV1Result;
    }

    /**
     * Sets the value of the getPropertyInfoV1Result property.
     * 
     */
    public void setGetPropertyInfoV1Result(int value) {
        this.getPropertyInfoV1Result = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the brochure property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInfoV1 }
     *     
     */
    public PropertyInfoV1 getBrochure() {
        return brochure;
    }

    /**
     * Sets the value of the brochure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInfoV1 }
     *     
     */
    public void setBrochure(PropertyInfoV1 value) {
        this.brochure = value;
    }

}
