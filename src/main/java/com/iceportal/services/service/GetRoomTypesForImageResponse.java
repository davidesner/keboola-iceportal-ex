
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
 *         &lt;element name="GetRoomTypesForImageResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roomTypeCodes" type="{http://services.iceportal.com/service}roomTypeCodes" minOccurs="0"/&gt;
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
    "getRoomTypesForImageResult",
    "errorMessage",
    "roomTypeCodes"
})
@XmlRootElement(name = "GetRoomTypesForImageResponse")
public class GetRoomTypesForImageResponse {

    @XmlElement(name = "GetRoomTypesForImageResult")
    protected int getRoomTypesForImageResult;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    protected RoomTypeCodes roomTypeCodes;

    /**
     * Gets the value of the getRoomTypesForImageResult property.
     * 
     */
    public int getGetRoomTypesForImageResult() {
        return getRoomTypesForImageResult;
    }

    /**
     * Sets the value of the getRoomTypesForImageResult property.
     * 
     */
    public void setGetRoomTypesForImageResult(int value) {
        this.getRoomTypesForImageResult = value;
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
     * Gets the value of the roomTypeCodes property.
     * 
     * @return
     *     possible object is
     *     {@link RoomTypeCodes }
     *     
     */
    public RoomTypeCodes getRoomTypeCodes() {
        return roomTypeCodes;
    }

    /**
     * Sets the value of the roomTypeCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypeCodes }
     *     
     */
    public void setRoomTypeCodes(RoomTypeCodes value) {
        this.roomTypeCodes = value;
    }

}
