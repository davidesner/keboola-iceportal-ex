
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatedBrochureIDInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatedBrochureIDInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="brochureID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatedBrochureIDInfo", propOrder = {
    "iceID",
    "brochureID"
})
public class UpdatedBrochureIDInfo {

    protected int iceID;
    protected String brochureID;

    /**
     * Gets the value of the iceID property.
     * 
     */
    public int getIceID() {
        return iceID;
    }

    /**
     * Sets the value of the iceID property.
     * 
     */
    public void setIceID(int value) {
        this.iceID = value;
    }

    /**
     * Gets the value of the brochureID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrochureID() {
        return brochureID;
    }

    /**
     * Sets the value of the brochureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrochureID(String value) {
        this.brochureID = value;
    }

}
