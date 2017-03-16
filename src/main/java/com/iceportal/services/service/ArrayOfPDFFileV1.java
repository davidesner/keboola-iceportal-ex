
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPDFFileV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPDFFileV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PDFFileV1" type="{http://services.iceportal.com/service}PDFFileV1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPDFFileV1", propOrder = {
    "pdfFileV1"
})
public class ArrayOfPDFFileV1 {

    @XmlElement(name = "PDFFileV1", nillable = true)
    protected List<PDFFileV1> pdfFileV1;

    /**
     * Gets the value of the pdfFileV1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdfFileV1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDFFileV1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDFFileV1 }
     * 
     * 
     */
    public List<PDFFileV1> getPDFFileV1() {
        if (pdfFileV1 == null) {
            pdfFileV1 = new ArrayList<PDFFileV1>();
        }
        return this.pdfFileV1;
    }

}
