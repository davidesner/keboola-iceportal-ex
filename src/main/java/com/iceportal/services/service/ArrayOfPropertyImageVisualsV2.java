
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPropertyImageVisualsV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPropertyImageVisualsV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropertyImageVisualsV2" type="{http://services.iceportal.com/service}PropertyImageVisualsV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPropertyImageVisualsV2", propOrder = {
    "propertyImageVisualsV2"
})
public class ArrayOfPropertyImageVisualsV2 {

    @XmlElement(name = "PropertyImageVisualsV2", nillable = true)
    protected List<PropertyImageVisualsV2> propertyImageVisualsV2;

    /**
     * Gets the value of the propertyImageVisualsV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyImageVisualsV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyImageVisualsV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyImageVisualsV2 }
     * 
     * 
     */
    public List<PropertyImageVisualsV2> getPropertyImageVisualsV2() {
        if (propertyImageVisualsV2 == null) {
            propertyImageVisualsV2 = new ArrayList<PropertyImageVisualsV2>();
        }
        return this.propertyImageVisualsV2;
    }

}
