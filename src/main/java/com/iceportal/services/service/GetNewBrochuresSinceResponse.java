
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
 *         &lt;element name="GetNewBrochuresSinceResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="info" type="{http://services.iceportal.com/service}ArrayOfBrochureInfo" minOccurs="0"/&gt;
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
    "getNewBrochuresSinceResult",
    "errorMessage",
    "info"
})
@XmlRootElement(name = "GetNewBrochuresSinceResponse")
public class GetNewBrochuresSinceResponse {

    @XmlElement(name = "GetNewBrochuresSinceResult")
    protected int getNewBrochuresSinceResult;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    protected ArrayOfBrochureInfo info;

    /**
     * Gets the value of the getNewBrochuresSinceResult property.
     * 
     */
    public int getGetNewBrochuresSinceResult() {
        return getNewBrochuresSinceResult;
    }

    /**
     * Sets the value of the getNewBrochuresSinceResult property.
     * 
     */
    public void setGetNewBrochuresSinceResult(int value) {
        this.getNewBrochuresSinceResult = value;
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
     *     {@link ArrayOfBrochureInfo }
     *     
     */
    public ArrayOfBrochureInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrochureInfo }
     *     
     */
    public void setInfo(ArrayOfBrochureInfo value) {
        this.info = value;
    }

}
