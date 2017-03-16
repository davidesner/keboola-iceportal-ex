
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPDFFileVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPDFFileVisuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PDFFileVisuals" type="{http://services.iceportal.com/service}PDFFileVisuals" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPDFFileVisuals", propOrder = {
    "pdfFileVisuals"
})
public class ArrayOfPDFFileVisuals {

    @XmlElement(name = "PDFFileVisuals", nillable = true)
    protected List<PDFFileVisuals> pdfFileVisuals;

    /**
     * Gets the value of the pdfFileVisuals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdfFileVisuals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDFFileVisuals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDFFileVisuals }
     * 
     * 
     */
    public List<PDFFileVisuals> getPDFFileVisuals() {
        if (pdfFileVisuals == null) {
            pdfFileVisuals = new ArrayList<PDFFileVisuals>();
        }
        return this.pdfFileVisuals;
    }

}
