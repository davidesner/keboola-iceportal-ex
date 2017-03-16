
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="publicationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifiedTypeOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sinceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="includeSupplierInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "publicationStatus",
    "modifiedTypeOption",
    "sinceDate",
    "propertyType",
    "includeSupplierInfo"
})
@XmlRootElement(name = "GetProperties")
public class GetProperties {

    protected String publicationStatus;
    protected String modifiedTypeOption;
    protected String sinceDate;
    protected String propertyType;
    protected String includeSupplierInfo;

    /**
     * Gets the value of the publicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationStatus() {
        return publicationStatus;
    }

    /**
     * Sets the value of the publicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationStatus(String value) {
        this.publicationStatus = value;
    }

    /**
     * Gets the value of the modifiedTypeOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedTypeOption() {
        return modifiedTypeOption;
    }

    /**
     * Sets the value of the modifiedTypeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedTypeOption(String value) {
        this.modifiedTypeOption = value;
    }

    /**
     * Gets the value of the sinceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinceDate() {
        return sinceDate;
    }

    /**
     * Sets the value of the sinceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinceDate(String value) {
        this.sinceDate = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyType(String value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the includeSupplierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeSupplierInfo() {
        return includeSupplierInfo;
    }

    /**
     * Sets the value of the includeSupplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeSupplierInfo(String value) {
        this.includeSupplierInfo = value;
    }

}
