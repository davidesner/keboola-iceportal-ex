
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdatedBrochureIDInfoV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdatedBrochureIDInfoV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdatedBrochureIDInfoV1" type="{http://services.iceportal.com/service}UpdatedBrochureIDInfoV1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdatedBrochureIDInfoV1", propOrder = {
    "updatedBrochureIDInfoV1"
})
public class ArrayOfUpdatedBrochureIDInfoV1 {

    @XmlElement(name = "UpdatedBrochureIDInfoV1", nillable = true)
    protected List<UpdatedBrochureIDInfoV1> updatedBrochureIDInfoV1;

    /**
     * Gets the value of the updatedBrochureIDInfoV1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatedBrochureIDInfoV1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatedBrochureIDInfoV1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedBrochureIDInfoV1 }
     * 
     * 
     */
    public List<UpdatedBrochureIDInfoV1> getUpdatedBrochureIDInfoV1() {
        if (updatedBrochureIDInfoV1 == null) {
            updatedBrochureIDInfoV1 = new ArrayList<UpdatedBrochureIDInfoV1>();
        }
        return this.updatedBrochureIDInfoV1;
    }

}
