
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBrochureImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBrochureImage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrochureImage" type="{http://services.iceportal.com/service}BrochureImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBrochureImage", propOrder = {
    "brochureImage"
})
public class ArrayOfBrochureImage {

    @XmlElement(name = "BrochureImage", nillable = true)
    protected List<BrochureImage> brochureImage;

    /**
     * Gets the value of the brochureImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brochureImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrochureImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrochureImage }
     * 
     * 
     */
    public List<BrochureImage> getBrochureImage() {
        if (brochureImage == null) {
            brochureImage = new ArrayList<BrochureImage>();
        }
        return this.brochureImage;
    }

}
