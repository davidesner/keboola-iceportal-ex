
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPDFFileV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPDFFileV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PDFFileV2" type="{http://services.iceportal.com/service}PDFFileV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPDFFileV2", propOrder = {
    "pdfFileV2"
})
public class ArrayOfPDFFileV2 {

    @XmlElement(name = "PDFFileV2", nillable = true)
    protected List<PDFFileV2> pdfFileV2;

    /**
     * Gets the value of the pdfFileV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdfFileV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDFFileV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDFFileV2 }
     * 
     * 
     */
    public List<PDFFileV2> getPDFFileV2() {
        if (pdfFileV2 == null) {
            pdfFileV2 = new ArrayList<PDFFileV2>();
        }
        return this.pdfFileV2;
    }

}
