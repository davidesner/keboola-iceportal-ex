
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescriptionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescriptionItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lcid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="descriptionOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descriptionTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptionItem", propOrder = {
    "lcid",
    "descriptionOne",
    "descriptionTwo"
})
public class DescriptionItem {

    protected int lcid;
    protected String descriptionOne;
    protected String descriptionTwo;

    /**
     * Gets the value of the lcid property.
     * 
     */
    public int getLcid() {
        return lcid;
    }

    /**
     * Sets the value of the lcid property.
     * 
     */
    public void setLcid(int value) {
        this.lcid = value;
    }

    /**
     * Gets the value of the descriptionOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionOne() {
        return descriptionOne;
    }

    /**
     * Sets the value of the descriptionOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionOne(String value) {
        this.descriptionOne = value;
    }

    /**
     * Gets the value of the descriptionTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionTwo() {
        return descriptionTwo;
    }

    /**
     * Sets the value of the descriptionTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionTwo(String value) {
        this.descriptionTwo = value;
    }

}
