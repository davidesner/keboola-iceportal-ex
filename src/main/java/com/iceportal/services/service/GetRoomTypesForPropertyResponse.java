
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
 *         &lt;element name="GetRoomTypesForPropertyResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roomTypes" type="{http://services.iceportal.com/service}ArrayOfRoomType" minOccurs="0"/&gt;
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
    "getRoomTypesForPropertyResult",
    "errorMessage",
    "roomTypes"
})
@XmlRootElement(name = "GetRoomTypesForPropertyResponse")
public class GetRoomTypesForPropertyResponse {

    @XmlElement(name = "GetRoomTypesForPropertyResult")
    protected int getRoomTypesForPropertyResult;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    protected ArrayOfRoomType roomTypes;

    /**
     * Gets the value of the getRoomTypesForPropertyResult property.
     * 
     */
    public int getGetRoomTypesForPropertyResult() {
        return getRoomTypesForPropertyResult;
    }

    /**
     * Sets the value of the getRoomTypesForPropertyResult property.
     * 
     */
    public void setGetRoomTypesForPropertyResult(int value) {
        this.getRoomTypesForPropertyResult = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomType }
     *     
     */
    public ArrayOfRoomType getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomType }
     *     
     */
    public void setRoomTypes(ArrayOfRoomType value) {
        this.roomTypes = value;
    }

}
