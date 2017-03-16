
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
 *         &lt;element name="GetAllBrochureIDsV2Result" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDinfo" type="{http://services.iceportal.com/service}ArrayOfBrochureIDInfo" minOccurs="0"/&gt;
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
    "getAllBrochureIDsV2Result",
    "errorMessage",
    "iDinfo"
})
@XmlRootElement(name = "GetAllBrochureIDsV2Response")
public class GetAllBrochureIDsV2Response {

    @XmlElement(name = "GetAllBrochureIDsV2Result")
    protected int getAllBrochureIDsV2Result;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "IDinfo")
    protected ArrayOfBrochureIDInfo iDinfo;

    /**
     * Gets the value of the getAllBrochureIDsV2Result property.
     * 
     */
    public int getGetAllBrochureIDsV2Result() {
        return getAllBrochureIDsV2Result;
    }

    /**
     * Sets the value of the getAllBrochureIDsV2Result property.
     * 
     */
    public void setGetAllBrochureIDsV2Result(int value) {
        this.getAllBrochureIDsV2Result = value;
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
     * Gets the value of the iDinfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBrochureIDInfo }
     *     
     */
    public ArrayOfBrochureIDInfo getIDinfo() {
        return iDinfo;
    }

    /**
     * Sets the value of the iDinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrochureIDInfo }
     *     
     */
    public void setIDinfo(ArrayOfBrochureIDInfo value) {
        this.iDinfo = value;
    }

}
