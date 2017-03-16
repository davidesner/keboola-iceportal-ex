
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPDFFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPDFFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PDFFile" type="{http://services.iceportal.com/service}PDFFile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPDFFile", propOrder = {
    "pdfFile"
})
public class ArrayOfPDFFile {

    @XmlElement(name = "PDFFile", nillable = true)
    protected List<PDFFile> pdfFile;

    /**
     * Gets the value of the pdfFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdfFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDFFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDFFile }
     * 
     * 
     */
    public List<PDFFile> getPDFFile() {
        if (pdfFile == null) {
            pdfFile = new ArrayList<PDFFile>();
        }
        return this.pdfFile;
    }

}
