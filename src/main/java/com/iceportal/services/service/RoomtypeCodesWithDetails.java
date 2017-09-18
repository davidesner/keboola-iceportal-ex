
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomtypeCodesWithDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomtypeCodesWithDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "RoomtypeCodesWithDetails", propOrder = {
    "roomtypeCodeDetail"
})
public class RoomtypeCodesWithDetails {

    @XmlElement(name = "RoomtypeCodeDetail")
    protected List<RoomtypeCodeDetails> roomtypeCodeDetail;

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
