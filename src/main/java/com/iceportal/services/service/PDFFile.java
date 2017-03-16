
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pdfFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="pdfFileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lcid" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFFile", propOrder = {
    "pdfFile",
    "pdfFileUrl"
})
public class PDFFile {

    protected byte[] pdfFile;
    protected String pdfFileUrl;
    @XmlAttribute(name = "lcid", required = true)
    protected int lcid;

    /**
     * Gets the value of the pdfFile property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPdfFile() {
        return pdfFile;
    }

    /**
     * Sets the value of the pdfFile property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPdfFile(byte[] value) {
        this.pdfFile = value;
    }

    /**
     * Gets the value of the pdfFileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfFileUrl() {
        return pdfFileUrl;
    }

    /**
     * Sets the value of the pdfFileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfFileUrl(String value) {
        this.pdfFileUrl = value;
    }

    /**
     * Gets the value of the lcid property.
     * 
     */
    public int getLcid() {
        return lcid;
    }

    /**
     * Sets the value of the lcid property.
     * 
     */
    public void setLcid(int value) {
        this.lcid = value;
    }

}
