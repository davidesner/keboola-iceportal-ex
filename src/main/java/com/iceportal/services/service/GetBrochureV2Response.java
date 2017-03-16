
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
 *         &lt;element name="GetBrochureV2Result" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brochure" type="{http://services.iceportal.com/service}BrochureV2" minOccurs="0"/&gt;
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
    "getBrochureV2Result",
    "errorMessage",
    "brochure"
})
@XmlRootElement(name = "GetBrochureV2Response")
public class GetBrochureV2Response {

    @XmlElement(name = "GetBrochureV2Result")
    protected int getBrochureV2Result;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    protected BrochureV2 brochure;

    /**
     * Gets the value of the getBrochureV2Result property.
     * 
     */
    public int getGetBrochureV2Result() {
        return getBrochureV2Result;
    }

    /**
     * Sets the value of the getBrochureV2Result property.
     * 
     */
    public void setGetBrochureV2Result(int value) {
        this.getBrochureV2Result = value;
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
     *     {@link BrochureV2 }
     *     
     */
    public BrochureV2 getBrochure() {
        return brochure;
    }

    /**
     * Sets the value of the brochure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureV2 }
     *     
     */
    public void setBrochure(BrochureV2 value) {
        this.brochure = value;
    }

}
