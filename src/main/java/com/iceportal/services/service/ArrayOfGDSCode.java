
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGDSCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGDSCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GDSCode" type="{http://services.iceportal.com/service}GDSCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGDSCode", propOrder = {
    "gdsCode"
})
public class ArrayOfGDSCode {

    @XmlElement(name = "GDSCode", nillable = true)
    protected List<GDSCode> gdsCode;

    /**
     * Gets the value of the gdsCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdsCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGDSCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GDSCode }
     * 
     * 
     */
    public List<GDSCode> getGDSCode() {
        if (gdsCode == null) {
            gdsCode = new ArrayList<GDSCode>();
        }
        return this.gdsCode;
    }

}
