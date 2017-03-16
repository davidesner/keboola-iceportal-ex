
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
 *         &lt;element name="SearchAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SearchMType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SearchMappedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "searchAccountID",
    "searchMType",
    "searchMappedID"
})
@XmlRootElement(name = "LookupMappedID")
public class LookupMappedID {

    @XmlElement(name = "SearchAccountID")
    protected String searchAccountID;
    @XmlElement(name = "SearchMType")
    protected String searchMType;
    @XmlElement(name = "SearchMappedID")
    protected String searchMappedID;

    /**
     * Gets the value of the searchAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchAccountID() {
        return searchAccountID;
    }

    /**
     * Sets the value of the searchAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchAccountID(String value) {
        this.searchAccountID = value;
    }

    /**
     * Gets the value of the searchMType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchMType() {
        return searchMType;
    }

    /**
     * Sets the value of the searchMType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchMType(String value) {
        this.searchMType = value;
    }

    /**
     * Gets the value of the searchMappedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchMappedID() {
        return searchMappedID;
    }

    /**
     * Sets the value of the searchMappedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchMappedID(String value) {
        this.searchMappedID = value;
    }

}
