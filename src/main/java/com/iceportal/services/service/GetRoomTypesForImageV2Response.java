
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
 *         &lt;element name="GetRoomTypesForImageV2Result" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roomTypes" type="{http://services.iceportal.com/service}RoomTypesWithDetailsV2" minOccurs="0"/&gt;
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
    "getRoomTypesForImageV2Result",
    "errorMessage",
    "roomTypes"
})
@XmlRootElement(name = "GetRoomTypesForImageV2Response")
public class GetRoomTypesForImageV2Response {

    @XmlElement(name = "GetRoomTypesForImageV2Result")
    protected int getRoomTypesForImageV2Result;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    protected RoomTypesWithDetailsV2 roomTypes;

    /**
     * Gets the value of the getRoomTypesForImageV2Result property.
     * 
     */
    public int getGetRoomTypesForImageV2Result() {
        return getRoomTypesForImageV2Result;
    }

    /**
     * Sets the value of the getRoomTypesForImageV2Result property.
     * 
     */
    public void setGetRoomTypesForImageV2Result(int value) {
        this.getRoomTypesForImageV2Result = value;
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
     *     {@link RoomTypesWithDetailsV2 }
     *     
     */
    public RoomTypesWithDetailsV2 getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypesWithDetailsV2 }
     *     
     */
    public void setRoomTypes(RoomTypesWithDetailsV2 value) {
        this.roomTypes = value;
    }

}
