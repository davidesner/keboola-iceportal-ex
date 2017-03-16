
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
 *         &lt;element name="GetUpdatedBrochureIDsSinceV1Result" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="info" type="{http://services.iceportal.com/service}ArrayOfUpdatedBrochureIDInfoV1" minOccurs="0"/&gt;
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
    "getUpdatedBrochureIDsSinceV1Result",
    "errorMessage",
    "info"
})
@XmlRootElement(name = "GetUpdatedBrochureIDsSinceV1Response")
public class GetUpdatedBrochureIDsSinceV1Response {

    @XmlElement(name = "GetUpdatedBrochureIDsSinceV1Result")
    protected int getUpdatedBrochureIDsSinceV1Result;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    protected ArrayOfUpdatedBrochureIDInfoV1 info;

    /**
     * Gets the value of the getUpdatedBrochureIDsSinceV1Result property.
     * 
     */
    public int getGetUpdatedBrochureIDsSinceV1Result() {
        return getUpdatedBrochureIDsSinceV1Result;
    }

    /**
     * Sets the value of the getUpdatedBrochureIDsSinceV1Result property.
     * 
     */
    public void setGetUpdatedBrochureIDsSinceV1Result(int value) {
        this.getUpdatedBrochureIDsSinceV1Result = value;
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
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdatedBrochureIDInfoV1 }
     *     
     */
    public ArrayOfUpdatedBrochureIDInfoV1 getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdatedBrochureIDInfoV1 }
     *     
     */
    public void setInfo(ArrayOfUpdatedBrochureIDInfoV1 value) {
        this.info = value;
    }

}
