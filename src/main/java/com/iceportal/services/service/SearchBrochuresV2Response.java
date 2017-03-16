
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchBrochuresV2Result" type="{http://services.iceportal.com/service}SearchBrchureInfoV2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchBrochuresV2Result"
})
@XmlRootElement(name = "SearchBrochuresV2Response")
public class SearchBrochuresV2Response {

    @XmlElement(name = "SearchBrochuresV2Result")
    protected SearchBrchureInfoV2 searchBrochuresV2Result;

    /**
     * Gets the value of the searchBrochuresV2Result property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBrchureInfoV2 }
     *     
     */
    public SearchBrchureInfoV2 getSearchBrochuresV2Result() {
        return searchBrochuresV2Result;
    }

    /**
     * Sets the value of the searchBrochuresV2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBrchureInfoV2 }
     *     
     */
    public void setSearchBrochuresV2Result(SearchBrchureInfoV2 value) {
        this.searchBrochuresV2Result = value;
    }

}
