
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
 *         &lt;element name="GetDirectVideoLinksResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brochure" type="{http://services.iceportal.com/service}Brochure" minOccurs="0"/&gt;
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
    "getDirectVideoLinksResult",
    "errorMessage",
    "brochure"
})
@XmlRootElement(name = "GetDirectVideoLinksResponse")
public class GetDirectVideoLinksResponse {

    @XmlElement(name = "GetDirectVideoLinksResult")
    protected int getDirectVideoLinksResult;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    protected Brochure brochure;

    /**
     * Gets the value of the getDirectVideoLinksResult property.
     * 
     */
    public int getGetDirectVideoLinksResult() {
        return getDirectVideoLinksResult;
    }

    /**
     * Sets the value of the getDirectVideoLinksResult property.
     * 
     */
    public void setGetDirectVideoLinksResult(int value) {
        this.getDirectVideoLinksResult = value;
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
     *     {@link Brochure }
     *     
     */
    public Brochure getBrochure() {
        return brochure;
    }

    /**
     * Sets the value of the brochure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Brochure }
     *     
     */
    public void setBrochure(Brochure value) {
        this.brochure = value;
    }

}
