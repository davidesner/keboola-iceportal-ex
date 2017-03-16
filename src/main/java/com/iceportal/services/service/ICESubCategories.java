
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICESubCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICESubCategories"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="subCateogories" type="{http://services.iceportal.com/service}ArrayOfSubCategory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICESubCategories", propOrder = {
    "id",
    "subCateogories"
})
public class ICESubCategories {

    @XmlElement(name = "ID")
    protected int id;
    protected ArrayOfSubCategory subCateogories;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the subCateogories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubCategory }
     *     
     */
    public ArrayOfSubCategory getSubCateogories() {
        return subCateogories;
    }

    /**
     * Sets the value of the subCateogories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubCategory }
     *     
     */
    public void setSubCateogories(ArrayOfSubCategory value) {
        this.subCateogories = value;
    }

}
