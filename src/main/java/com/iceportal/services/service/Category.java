
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Category"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MainCategory" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SubCategory" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = {
    "ordinal",
    "mainCategory",
    "subCategory"
})
public class Category {

    protected int ordinal;
    @XmlElement(name = "MainCategory")
    protected int mainCategory;
    @XmlElement(name = "SubCategory")
    protected int subCategory;

    /**
     * Gets the value of the ordinal property.
     * 
     */
    public int getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     */
    public void setOrdinal(int value) {
        this.ordinal = value;
    }

    /**
     * Gets the value of the mainCategory property.
     * 
     */
    public int getMainCategory() {
        return mainCategory;
    }

    /**
     * Sets the value of the mainCategory property.
     * 
     */
    public void setMainCategory(int value) {
        this.mainCategory = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     */
    public int getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     */
    public void setSubCategory(int value) {
        this.subCategory = value;
    }

}
