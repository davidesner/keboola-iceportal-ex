
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
 *         &lt;element name="GetAllBrochureIDsResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDs" type="{http://services.iceportal.com/service}ArrayOfString" minOccurs="0"/&gt;
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
    "getAllBrochureIDsResult",
    "errorMessage",
    "iDs"
})
@XmlRootElement(name = "GetAllBrochureIDsResponse")
public class GetAllBrochureIDsResponse {

    @XmlElement(name = "GetAllBrochureIDsResult")
    protected int getAllBrochureIDsResult;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "IDs")
    protected ArrayOfString iDs;

    /**
     * Gets the value of the getAllBrochureIDsResult property.
     * 
     */
    public int getGetAllBrochureIDsResult() {
        return getAllBrochureIDsResult;
    }

    /**
     * Sets the value of the getAllBrochureIDsResult property.
     * 
     */
    public void setGetAllBrochureIDsResult(int value) {
        this.getAllBrochureIDsResult = value;
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
     * Gets the value of the iDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getIDs() {
        return iDs;
    }

    /**
     * Sets the value of the iDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setIDs(ArrayOfString value) {
        this.iDs = value;
    }

}
