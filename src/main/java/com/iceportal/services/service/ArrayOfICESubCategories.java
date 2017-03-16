
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfICESubCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfICESubCategories"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ICESubCategories" type="{http://services.iceportal.com/service}ICESubCategories" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfICESubCategories", propOrder = {
    "iceSubCategories"
})
public class ArrayOfICESubCategories {

    @XmlElement(name = "ICESubCategories", nillable = true)
    protected List<ICESubCategories> iceSubCategories;

    /**
     * Gets the value of the iceSubCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iceSubCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getICESubCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ICESubCategories }
     * 
     * 
     */
    public List<ICESubCategories> getICESubCategories() {
        if (iceSubCategories == null) {
            iceSubCategories = new ArrayList<ICESubCategories>();
        }
        return this.iceSubCategories;
    }

}
