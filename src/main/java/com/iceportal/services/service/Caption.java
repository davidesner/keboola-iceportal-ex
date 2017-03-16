
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Caption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Caption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="thumb" type="{http://services.iceportal.com/service}ArrayOfItem" minOccurs="0"/&gt;
 *         &lt;element name="fullSize" type="{http://services.iceportal.com/service}ArrayOfItem" minOccurs="0"/&gt;
 *         &lt;element name="longCaption" type="{http://services.iceportal.com/service}ArrayOfItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Caption", propOrder = {
    "ordinal",
    "thumb",
    "fullSize",
    "longCaption"
})
public class Caption {

    protected int ordinal;
    protected ArrayOfItem thumb;
    protected ArrayOfItem fullSize;
    protected ArrayOfItem longCaption;

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
     * Gets the value of the thumb property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItem }
     *     
     */
    public ArrayOfItem getThumb() {
        return thumb;
    }

    /**
     * Sets the value of the thumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItem }
     *     
     */
    public void setThumb(ArrayOfItem value) {
        this.thumb = value;
    }

    /**
     * Gets the value of the fullSize property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItem }
     *     
     */
    public ArrayOfItem getFullSize() {
        return fullSize;
    }

    /**
     * Sets the value of the fullSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItem }
     *     
     */
    public void setFullSize(ArrayOfItem value) {
        this.fullSize = value;
    }

    /**
     * Gets the value of the longCaption property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItem }
     *     
     */
    public ArrayOfItem getLongCaption() {
        return longCaption;
    }

    /**
     * Sets the value of the longCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItem }
     *     
     */
    public void setLongCaption(ArrayOfItem value) {
        this.longCaption = value;
    }

}
