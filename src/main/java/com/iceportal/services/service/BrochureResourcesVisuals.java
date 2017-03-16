
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrochureResourcesVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrochureResourcesVisuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationPdfFile" type="{http://services.iceportal.com/service}ArrayOfPDFFileVisuals" minOccurs="0"/&gt;
 *         &lt;element name="cssFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="cssFileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="logoFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="logoFileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrochureResourcesVisuals", propOrder = {
    "locationPdfFile",
    "cssFile",
    "cssFileUrl",
    "logoFile",
    "logoFileUrl"
})
public class BrochureResourcesVisuals {

    protected ArrayOfPDFFileVisuals locationPdfFile;
    protected byte[] cssFile;
    protected String cssFileUrl;
    protected byte[] logoFile;
    protected String logoFileUrl;

    /**
     * Gets the value of the locationPdfFile property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPDFFileVisuals }
     *     
     */
    public ArrayOfPDFFileVisuals getLocationPdfFile() {
        return locationPdfFile;
    }

    /**
     * Sets the value of the locationPdfFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPDFFileVisuals }
     *     
     */
    public void setLocationPdfFile(ArrayOfPDFFileVisuals value) {
        this.locationPdfFile = value;
    }

    /**
     * Gets the value of the cssFile property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCssFile() {
        return cssFile;
    }

    /**
     * Sets the value of the cssFile property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCssFile(byte[] value) {
        this.cssFile = value;
    }

    /**
     * Gets the value of the cssFileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCssFileUrl() {
        return cssFileUrl;
    }

    /**
     * Sets the value of the cssFileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCssFileUrl(String value) {
        this.cssFileUrl = value;
    }

    /**
     * Gets the value of the logoFile property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLogoFile() {
        return logoFile;
    }

    /**
     * Sets the value of the logoFile property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLogoFile(byte[] value) {
        this.logoFile = value;
    }

    /**
     * Gets the value of the logoFileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoFileUrl() {
        return logoFileUrl;
    }

    /**
     * Sets the value of the logoFileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoFileUrl(String value) {
        this.logoFileUrl = value;
    }

}
