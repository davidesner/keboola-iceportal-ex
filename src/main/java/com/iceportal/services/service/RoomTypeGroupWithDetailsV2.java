
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomTypeGroupWithDetailsV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomTypeGroupWithDetailsV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomTypeGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomtypeCodeDetail" type="{http://services.iceportal.com/service}RoomtypeCodeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomTypeGroupWithDetailsV2", propOrder = {
    "roomTypeGroupID",
    "roomtypeCodeDetail"
})
public class RoomTypeGroupWithDetailsV2 {

    @XmlElement(name = "RoomTypeGroupID")
    protected String roomTypeGroupID;
    @XmlElement(name = "RoomtypeCodeDetail")
    protected List<RoomtypeCodeDetails> roomtypeCodeDetail;

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
     * Gets the value of the roomtypeCodeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomtypeCodeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomtypeCodeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomtypeCodeDetails }
     * 
     * 
     */
    public List<RoomtypeCodeDetails> getRoomtypeCodeDetail() {
        if (roomtypeCodeDetail == null) {
            roomtypeCodeDetail = new ArrayList<RoomtypeCodeDetails>();
        }
        return this.roomtypeCodeDetail;
    }

}
