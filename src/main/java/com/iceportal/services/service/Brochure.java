
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Brochure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Brochure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://services.iceportal.com/service}BrochureRequest" minOccurs="0"/&gt;
 *         &lt;element name="brochureInfo" type="{http://services.iceportal.com/service}BrochureInfo" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://services.iceportal.com/service}BrochureContent" minOccurs="0"/&gt;
 *         &lt;element name="constraints" type="{http://services.iceportal.com/service}BrochureConstraint" minOccurs="0"/&gt;
 *         &lt;element name="information" type="{http://services.iceportal.com/service}BrochureInformation" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://services.iceportal.com/service}BrochureLocation" minOccurs="0"/&gt;
 *         &lt;element name="resources" type="{http://services.iceportal.com/service}BrochureResources" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Brochure", propOrder = {
    "request",
    "brochureInfo",
    "content",
    "constraints",
    "information",
    "location",
    "resources"
})
public class Brochure {

    protected BrochureRequest request;
    protected BrochureInfo brochureInfo;
    protected BrochureContent content;
    protected BrochureConstraint constraints;
    protected BrochureInformation information;
    protected BrochureLocation location;
    protected BrochureResources resources;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureRequest }
     *     
     */
    public BrochureRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureRequest }
     *     
     */
    public void setRequest(BrochureRequest value) {
        this.request = value;
    }

    /**
     * Gets the value of the brochureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureInfo }
     *     
     */
    public BrochureInfo getBrochureInfo() {
        return brochureInfo;
    }

    /**
     * Sets the value of the brochureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureInfo }
     *     
     */
    public void setBrochureInfo(BrochureInfo value) {
        this.brochureInfo = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureContent }
     *     
     */
    public BrochureContent getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureContent }
     *     
     */
    public void setContent(BrochureContent value) {
        this.content = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureConstraint }
     *     
     */
    public BrochureConstraint getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureConstraint }
     *     
     */
    public void setConstraints(BrochureConstraint value) {
        this.constraints = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureInformation }
     *     
     */
    public BrochureInformation getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureInformation }
     *     
     */
    public void setInformation(BrochureInformation value) {
        this.information = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureLocation }
     *     
     */
    public BrochureLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureLocation }
     *     
     */
    public void setLocation(BrochureLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureResources }
     *     
     */
    public BrochureResources getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureResources }
     *     
     */
    public void setResources(BrochureResources value) {
        this.resources = value;
    }

}
