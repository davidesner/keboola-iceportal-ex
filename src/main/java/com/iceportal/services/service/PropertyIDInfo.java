
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PropertyIDInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyIDInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mappedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertymodifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="contentModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="isPublished" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="supplierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supplierMappedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyIDInfo", propOrder = {
    "iceID",
    "mappedID",
    "propertymodifiedDate",
    "contentModifiedDate",
    "isPublished",
    "supplierID",
    "supplierMappedID"
})
public class PropertyIDInfo {

    protected int iceID;
    protected String mappedID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar propertymodifiedDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contentModifiedDate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isPublished;
    protected String supplierID;
    protected String supplierMappedID;

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
     * Gets the value of the mappedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedID() {
        return mappedID;
    }

    /**
     * Sets the value of the mappedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedID(String value) {
        this.mappedID = value;
    }

    /**
     * Gets the value of the propertymodifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPropertymodifiedDate() {
        return propertymodifiedDate;
    }

    /**
     * Sets the value of the propertymodifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPropertymodifiedDate(XMLGregorianCalendar value) {
        this.propertymodifiedDate = value;
    }

    /**
     * Gets the value of the contentModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContentModifiedDate() {
        return contentModifiedDate;
    }

    /**
     * Sets the value of the contentModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContentModifiedDate(XMLGregorianCalendar value) {
        this.contentModifiedDate = value;
    }

    /**
     * Gets the value of the isPublished property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPublished() {
        return isPublished;
    }

    /**
     * Sets the value of the isPublished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPublished(Boolean value) {
        this.isPublished = value;
    }

    /**
     * Gets the value of the supplierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierID() {
        return supplierID;
    }

    /**
     * Sets the value of the supplierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierID(String value) {
        this.supplierID = value;
    }

    /**
     * Gets the value of the supplierMappedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierMappedID() {
        return supplierMappedID;
    }

    /**
     * Sets the value of the supplierMappedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierMappedID(String value) {
        this.supplierMappedID = value;
    }

}
