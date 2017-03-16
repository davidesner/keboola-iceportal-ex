
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdatedBrochureInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdatedBrochureInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdatedBrochureInfo" type="{http://services.iceportal.com/service}UpdatedBrochureInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdatedBrochureInfo", propOrder = {
    "updatedBrochureInfo"
})
public class ArrayOfUpdatedBrochureInfo {

    @XmlElement(name = "UpdatedBrochureInfo", nillable = true)
    protected List<UpdatedBrochureInfo> updatedBrochureInfo;

    /**
     * Gets the value of the updatedBrochureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatedBrochureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatedBrochureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedBrochureInfo }
     * 
     * 
     */
    public List<UpdatedBrochureInfo> getUpdatedBrochureInfo() {
        if (updatedBrochureInfo == null) {
            updatedBrochureInfo = new ArrayList<UpdatedBrochureInfo>();
        }
        return this.updatedBrochureInfo;
    }

}
