
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomTypeGroupWithDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomTypeGroupWithDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomTypeGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeCodes" type="{http://services.iceportal.com/service}RoomtypeCodesWithDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomTypeGroupWithDetails", propOrder = {
    "roomTypeGroupID",
    "roomTypeCodes"
})
public class RoomTypeGroupWithDetails {

    @XmlElement(name = "RoomTypeGroupID")
    protected String roomTypeGroupID;
    @XmlElement(name = "RoomTypeCodes")
    protected RoomtypeCodesWithDetails roomTypeCodes;

    /**
     * Gets the value of the roomTypeGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeGroupID() {
        return roomTypeGroupID;
    }

    /**
     * Sets the value of the roomTypeGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeGroupID(String value) {
        this.roomTypeGroupID = value;
    }

    /**
     * Gets the value of the roomTypeCodes property.
     * 
     * @return
     *     possible object is
     *     {@link RoomtypeCodesWithDetails }
     *     
     */
    public RoomtypeCodesWithDetails getRoomTypeCodes() {
        return roomTypeCodes;
    }

    /**
     * Sets the value of the roomTypeCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomtypeCodesWithDetails }
     *     
     */
    public void setRoomTypeCodes(RoomtypeCodesWithDetails value) {
        this.roomTypeCodes = value;
    }

}
