
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
 *         &lt;element name="GetRoomTypesForPropertyV2Result" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roomTypes" type="{http://services.iceportal.com/service}RoomTypesWithDetails" minOccurs="0"/&gt;
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
    "getRoomTypesForPropertyV2Result",
    "errorMessage",
    "roomTypes"
})
@XmlRootElement(name = "GetRoomTypesForPropertyV2Response")
public class GetRoomTypesForPropertyV2Response {

    @XmlElement(name = "GetRoomTypesForPropertyV2Result")
    protected int getRoomTypesForPropertyV2Result;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    protected RoomTypesWithDetails roomTypes;

    /**
     * Gets the value of the getRoomTypesForPropertyV2Result property.
     * 
     */
    public int getGetRoomTypesForPropertyV2Result() {
        return getRoomTypesForPropertyV2Result;
    }

    /**
     * Sets the value of the getRoomTypesForPropertyV2Result property.
     * 
     */
    public void setGetRoomTypesForPropertyV2Result(int value) {
        this.getRoomTypesForPropertyV2Result = value;
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
     *     {@link RoomTypesWithDetails }
     *     
     */
    public RoomTypesWithDetails getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypesWithDetails }
     *     
     */
    public void setRoomTypes(RoomTypesWithDetails value) {
        this.roomTypes = value;
    }

}
