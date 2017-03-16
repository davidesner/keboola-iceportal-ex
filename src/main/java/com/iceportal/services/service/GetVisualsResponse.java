
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
 *         &lt;element name="GetVisualsResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Property" type="{http://services.iceportal.com/service}PropertyVisuals" minOccurs="0"/&gt;
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
    "getVisualsResult",
    "errorMessage",
    "property"
})
@XmlRootElement(name = "GetVisualsResponse")
public class GetVisualsResponse {

    @XmlElement(name = "GetVisualsResult")
    protected int getVisualsResult;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "Property")
    protected PropertyVisuals property;

    /**
     * Gets the value of the getVisualsResult property.
     * 
     */
    public int getGetVisualsResult() {
        return getVisualsResult;
    }

    /**
     * Sets the value of the getVisualsResult property.
     * 
     */
    public void setGetVisualsResult(int value) {
        this.getVisualsResult = value;
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
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyVisuals }
     *     
     */
    public PropertyVisuals getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyVisuals }
     *     
     */
    public void setProperty(PropertyVisuals value) {
        this.property = value;
    }

}
