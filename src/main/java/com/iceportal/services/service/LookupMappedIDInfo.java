
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LookupMappedIDInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LookupMappedIDInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ICEID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MappedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookupMappedIDInfo", propOrder = {
    "iceid",
    "mappedID"
})
public class LookupMappedIDInfo {

    @XmlElement(name = "ICEID")
    protected int iceid;
    @XmlElement(name = "MappedID")
    protected String mappedID;

    /**
     * Gets the value of the iceid property.
     * 
     */
    public int getICEID() {
        return iceid;
    }

    /**
     * Sets the value of the iceid property.
     * 
     */
    public void setICEID(int value) {
        this.iceid = value;
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

}
