
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
 *         &lt;element name="LookupMappedIDResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MappingInfo" type="{http://services.iceportal.com/service}LookupMappedIDInfo" minOccurs="0"/&gt;
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
    "lookupMappedIDResult",
    "errorMessage",
    "mappingInfo"
})
@XmlRootElement(name = "LookupMappedIDResponse")
public class LookupMappedIDResponse {

    @XmlElement(name = "LookupMappedIDResult")
    protected int lookupMappedIDResult;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "MappingInfo")
    protected LookupMappedIDInfo mappingInfo;

    /**
     * Gets the value of the lookupMappedIDResult property.
     * 
     */
    public int getLookupMappedIDResult() {
        return lookupMappedIDResult;
    }

    /**
     * Sets the value of the lookupMappedIDResult property.
     * 
     */
    public void setLookupMappedIDResult(int value) {
        this.lookupMappedIDResult = value;
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
     * Gets the value of the mappingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LookupMappedIDInfo }
     *     
     */
    public LookupMappedIDInfo getMappingInfo() {
        return mappingInfo;
    }

    /**
     * Sets the value of the mappingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupMappedIDInfo }
     *     
     */
    public void setMappingInfo(LookupMappedIDInfo value) {
        this.mappingInfo = value;
    }

}
