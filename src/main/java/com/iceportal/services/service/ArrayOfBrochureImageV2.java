
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBrochureImageV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBrochureImageV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrochureImageV2" type="{http://services.iceportal.com/service}BrochureImageV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBrochureImageV2", propOrder = {
    "brochureImageV2"
})
public class ArrayOfBrochureImageV2 {

    @XmlElement(name = "BrochureImageV2", nillable = true)
    protected List<BrochureImageV2> brochureImageV2;

    /**
     * Gets the value of the brochureImageV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brochureImageV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrochureImageV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrochureImageV2 }
     * 
     * 
     */
    public List<BrochureImageV2> getBrochureImageV2() {
        if (brochureImageV2 == null) {
            brochureImageV2 = new ArrayList<BrochureImageV2>();
        }
        return this.brochureImageV2;
    }

}
