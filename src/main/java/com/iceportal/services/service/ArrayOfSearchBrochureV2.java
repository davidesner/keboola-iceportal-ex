
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSearchBrochureV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchBrochureV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchBrochureV2" type="{http://services.iceportal.com/service}SearchBrochureV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchBrochureV2", propOrder = {
    "searchBrochureV2"
})
public class ArrayOfSearchBrochureV2 {

    @XmlElement(name = "SearchBrochureV2", nillable = true)
    protected List<SearchBrochureV2> searchBrochureV2;

    /**
     * Gets the value of the searchBrochureV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchBrochureV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchBrochureV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchBrochureV2 }
     * 
     * 
     */
    public List<SearchBrochureV2> getSearchBrochureV2() {
        if (searchBrochureV2 == null) {
            searchBrochureV2 = new ArrayList<SearchBrochureV2>();
        }
        return this.searchBrochureV2;
    }

}
