
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPropertyImageVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPropertyImageVisuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropertyImageVisuals" type="{http://services.iceportal.com/service}PropertyImageVisuals" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPropertyImageVisuals", propOrder = {
    "propertyImageVisuals"
})
public class ArrayOfPropertyImageVisuals {

    @XmlElement(name = "PropertyImageVisuals", nillable = true)
    protected List<PropertyImageVisuals> propertyImageVisuals;

    /**
     * Gets the value of the propertyImageVisuals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyImageVisuals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyImageVisuals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyImageVisuals }
     * 
     * 
     */
    public List<PropertyImageVisuals> getPropertyImageVisuals() {
        if (propertyImageVisuals == null) {
            propertyImageVisuals = new ArrayList<PropertyImageVisuals>();
        }
        return this.propertyImageVisuals;
    }

}
