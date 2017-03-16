
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
 *         &lt;element name="GetUpdatedBrochureIDsSinceResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="info" type="{http://services.iceportal.com/service}ArrayOfUpdatedBrochureIDInfo" minOccurs="0"/&gt;
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
    "getUpdatedBrochureIDsSinceResult",
    "errorMessage",
    "info"
})
@XmlRootElement(name = "GetUpdatedBrochureIDsSinceResponse")
public class GetUpdatedBrochureIDsSinceResponse {

    @XmlElement(name = "GetUpdatedBrochureIDsSinceResult")
    protected int getUpdatedBrochureIDsSinceResult;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    protected ArrayOfUpdatedBrochureIDInfo info;

    /**
     * Gets the value of the getUpdatedBrochureIDsSinceResult property.
     * 
     */
    public int getGetUpdatedBrochureIDsSinceResult() {
        return getUpdatedBrochureIDsSinceResult;
    }

    /**
     * Sets the value of the getUpdatedBrochureIDsSinceResult property.
     * 
     */
    public void setGetUpdatedBrochureIDsSinceResult(int value) {
        this.getUpdatedBrochureIDsSinceResult = value;
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
     *     {@link ArrayOfUpdatedBrochureIDInfo }
     *     
     */
    public ArrayOfUpdatedBrochureIDInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdatedBrochureIDInfo }
     *     
     */
    public void setInfo(ArrayOfUpdatedBrochureIDInfo value) {
        this.info = value;
    }

}
