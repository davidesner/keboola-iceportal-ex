
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomTypesWithDetailsV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomTypesWithDetailsV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomTypeGroup" type="{http://services.iceportal.com/service}RoomTypeGroupWithDetailsV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomTypesWithDetailsV2", propOrder = {
    "roomTypeGroup"
})
public class RoomTypesWithDetailsV2 {

    @XmlElement(name = "RoomTypeGroup")
    protected List<RoomTypeGroupWithDetailsV2> roomTypeGroup;

    /**
     * Gets the value of the roomTypeGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomTypeGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomTypeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomTypeGroupWithDetailsV2 }
     * 
     * 
     */
    public List<RoomTypeGroupWithDetailsV2> getRoomTypeGroup() {
        if (roomTypeGroup == null) {
            roomTypeGroup = new ArrayList<RoomTypeGroupWithDetailsV2>();
        }
        return this.roomTypeGroup;
    }

}
