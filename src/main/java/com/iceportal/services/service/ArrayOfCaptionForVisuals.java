
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCaptionForVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCaptionForVisuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Caption" type="{http://services.iceportal.com/service}CaptionForVisuals" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCaptionForVisuals", propOrder = {
    "caption"
})
public class ArrayOfCaptionForVisuals {

    @XmlElement(name = "Caption", nillable = true)
    protected List<CaptionForVisuals> caption;

    /**
     * Gets the value of the caption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaptionForVisuals }
     * 
     * 
     */
    public List<CaptionForVisuals> getCaption() {
        if (caption == null) {
            caption = new ArrayList<CaptionForVisuals>();
        }
        return this.caption;
    }

}
