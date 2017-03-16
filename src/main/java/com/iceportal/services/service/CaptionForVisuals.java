
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaptionForVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaptionForVisuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MainCategory" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SubCategory" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Thumb" type="{http://services.iceportal.com/service}ArrayOfItemForVisuals" minOccurs="0"/&gt;
 *         &lt;element name="FullSize" type="{http://services.iceportal.com/service}ArrayOfItemForVisuals" minOccurs="0"/&gt;
 *         &lt;element name="LongCaption" type="{http://services.iceportal.com/service}ArrayOfItemForVisuals" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaptionForVisuals", propOrder = {
    "ordinal",
    "mainCategory",
    "subCategory",
    "thumb",
    "fullSize",
    "longCaption"
})
public class CaptionForVisuals {

    protected int ordinal;
    @XmlElement(name = "MainCategory")
    protected int mainCategory;
    @XmlElement(name = "SubCategory")
    protected int subCategory;
    @XmlElement(name = "Thumb")
    protected ArrayOfItemForVisuals thumb;
    @XmlElement(name = "FullSize")
    protected ArrayOfItemForVisuals fullSize;
    @XmlElement(name = "LongCaption")
    protected ArrayOfItemForVisuals longCaption;

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

    /**
     * Gets the value of the thumb property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemForVisuals }
     *     
     */
    public ArrayOfItemForVisuals getThumb() {
        return thumb;
    }

    /**
     * Sets the value of the thumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemForVisuals }
     *     
     */
    public void setThumb(ArrayOfItemForVisuals value) {
        this.thumb = value;
    }

    /**
     * Gets the value of the fullSize property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemForVisuals }
     *     
     */
    public ArrayOfItemForVisuals getFullSize() {
        return fullSize;
    }

    /**
     * Sets the value of the fullSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemForVisuals }
     *     
     */
    public void setFullSize(ArrayOfItemForVisuals value) {
        this.fullSize = value;
    }

    /**
     * Gets the value of the longCaption property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemForVisuals }
     *     
     */
    public ArrayOfItemForVisuals getLongCaption() {
        return longCaption;
    }

    /**
     * Sets the value of the longCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemForVisuals }
     *     
     */
    public void setLongCaption(ArrayOfItemForVisuals value) {
        this.longCaption = value;
    }

}
