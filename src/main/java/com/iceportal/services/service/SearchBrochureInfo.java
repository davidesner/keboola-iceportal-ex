
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchBrochureInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBrochureInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="brochures" type="{http://services.iceportal.com/service}ArrayOfSearchBrochure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBrochureInfo", propOrder = {
    "pageNumber",
    "totalPages",
    "brochures"
})
public class SearchBrochureInfo {

    protected int pageNumber;
    protected int totalPages;
    protected ArrayOfSearchBrochure brochures;

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the brochures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchBrochure }
     *     
     */
    public ArrayOfSearchBrochure getBrochures() {
        return brochures;
    }

    /**
     * Sets the value of the brochures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchBrochure }
     *     
     */
    public void setBrochures(ArrayOfSearchBrochure value) {
        this.brochures = value;
    }

}
