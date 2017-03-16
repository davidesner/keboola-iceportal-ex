
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GDSCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDSCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Supplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDSCode", propOrder = {
    "supplier",
    "chainCode",
    "propertyID"
})
public class GDSCode {

    @XmlElement(name = "Supplier")
    protected String supplier;
    @XmlElement(name = "ChainCode")
    protected String chainCode;
    @XmlElement(name = "PropertyID")
    protected String propertyID;

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplier(String value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the chainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainCode() {
        return chainCode;
    }

    /**
     * Sets the value of the chainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainCode(String value) {
        this.chainCode = value;
    }

    /**
     * Gets the value of the propertyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyID() {
        return propertyID;
    }

    /**
     * Sets the value of the propertyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyID(String value) {
        this.propertyID = value;
    }

}
