
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description250" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description500" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description1000" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyDescription", propOrder = {
    "description250",
    "description500",
    "description1000"
})
public class PropertyDescription {

    @XmlElement(name = "Description250")
    protected String description250;
    @XmlElement(name = "Description500")
    protected String description500;
    @XmlElement(name = "Description1000")
    protected String description1000;

    /**
     * Gets the value of the description250 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription250() {
        return description250;
    }

    /**
     * Sets the value of the description250 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription250(String value) {
        this.description250 = value;
    }

    /**
     * Gets the value of the description500 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription500() {
        return description500;
    }

    /**
     * Sets the value of the description500 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription500(String value) {
        this.description500 = value;
    }

    /**
     * Gets the value of the description1000 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription1000() {
        return description1000;
    }

    /**
     * Sets the value of the description1000 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription1000(String value) {
        this.description1000 = value;
    }

}
