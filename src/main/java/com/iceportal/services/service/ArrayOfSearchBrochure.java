
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSearchBrochure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchBrochure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchBrochure" type="{http://services.iceportal.com/service}SearchBrochure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchBrochure", propOrder = {
    "searchBrochure"
})
public class ArrayOfSearchBrochure {

    @XmlElement(name = "SearchBrochure", nillable = true)
    protected List<SearchBrochure> searchBrochure;

    /**
     * Gets the value of the searchBrochure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchBrochure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchBrochure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchBrochure }
     * 
     * 
     */
    public List<SearchBrochure> getSearchBrochure() {
        if (searchBrochure == null) {
            searchBrochure = new ArrayList<SearchBrochure>();
        }
        return this.searchBrochure;
    }

}
