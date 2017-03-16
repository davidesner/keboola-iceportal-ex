
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for availableContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="availableContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Photos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Videos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HD360s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Iframe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeneralInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDFLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatesReservations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "availableContent", propOrder = {
    "photos",
    "videos",
    "hd360S",
    "iframe",
    "generalInfo",
    "location",
    "pdfLink",
    "ratesReservations",
    "lang",
    "emailLink"
})
public class AvailableContent2 {

    @XmlElement(name = "Photos")
    protected String photos;
    @XmlElement(name = "Videos")
    protected String videos;
    @XmlElement(name = "HD360s")
    protected String hd360S;
    @XmlElement(name = "Iframe")
    protected String iframe;
    @XmlElement(name = "GeneralInfo")
    protected String generalInfo;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "PDFLink")
    protected String pdfLink;
    @XmlElement(name = "RatesReservations")
    protected String ratesReservations;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "EmailLink")
    protected String emailLink;

    /**
     * Gets the value of the photos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotos() {
        return photos;
    }

    /**
     * Sets the value of the photos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotos(String value) {
        this.photos = value;
    }

    /**
     * Gets the value of the videos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideos() {
        return videos;
    }

    /**
     * Sets the value of the videos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideos(String value) {
        this.videos = value;
    }

    /**
     * Gets the value of the hd360S property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHD360S() {
        return hd360S;
    }

    /**
     * Sets the value of the hd360S property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHD360S(String value) {
        this.hd360S = value;
    }

    /**
     * Gets the value of the iframe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIframe() {
        return iframe;
    }

    /**
     * Sets the value of the iframe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIframe(String value) {
        this.iframe = value;
    }

    /**
     * Gets the value of the generalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralInfo() {
        return generalInfo;
    }

    /**
     * Sets the value of the generalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralInfo(String value) {
        this.generalInfo = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the pdfLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFLink() {
        return pdfLink;
    }

    /**
     * Sets the value of the pdfLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFLink(String value) {
        this.pdfLink = value;
    }

    /**
     * Gets the value of the ratesReservations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatesReservations() {
        return ratesReservations;
    }

    /**
     * Sets the value of the ratesReservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatesReservations(String value) {
        this.ratesReservations = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the emailLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailLink() {
        return emailLink;
    }

    /**
     * Sets the value of the emailLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailLink(String value) {
        this.emailLink = value;
    }

}
