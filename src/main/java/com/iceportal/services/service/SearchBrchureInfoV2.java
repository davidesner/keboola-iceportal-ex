
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchBrchureInfoV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBrchureInfoV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="brochures" type="{http://services.iceportal.com/service}ArrayOfSearchBrochureV2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBrchureInfoV2", propOrder = {
    "pageNumber",
    "totalPages",
    "brochures"
})
public class SearchBrchureInfoV2 {

    protected int pageNumber;
    protected int totalPages;
    protected ArrayOfSearchBrochureV2 brochures;

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
     *     {@link ArrayOfSearchBrochureV2 }
     *     
     */
    public ArrayOfSearchBrochureV2 getBrochures() {
        return brochures;
    }

    /**
     * Sets the value of the brochures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchBrochureV2 }
     *     
     */
    public void setBrochures(ArrayOfSearchBrochureV2 value) {
        this.brochures = value;
    }

}
