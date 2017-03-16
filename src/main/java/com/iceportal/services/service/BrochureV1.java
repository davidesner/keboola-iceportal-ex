
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrochureV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrochureV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://services.iceportal.com/service}BrochureRequest" minOccurs="0"/&gt;
 *         &lt;element name="brochureInfo" type="{http://services.iceportal.com/service}BrochureInfoV1" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://services.iceportal.com/service}BrochureContentV1" minOccurs="0"/&gt;
 *         &lt;element name="constraints" type="{http://services.iceportal.com/service}BrochureConstraint" minOccurs="0"/&gt;
 *         &lt;element name="information" type="{http://services.iceportal.com/service}BrochureInformationV1" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://services.iceportal.com/service}BrochureLocationV1" minOccurs="0"/&gt;
 *         &lt;element name="resources" type="{http://services.iceportal.com/service}BrochureResourcesV1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrochureV1", propOrder = {
    "request",
    "brochureInfo",
    "content",
    "constraints",
    "information",
    "location",
    "resources"
})
public class BrochureV1 {

    protected BrochureRequest request;
    protected BrochureInfoV1 brochureInfo;
    protected BrochureContentV1 content;
    protected BrochureConstraint constraints;
    protected BrochureInformationV1 information;
    protected BrochureLocationV1 location;
    protected BrochureResourcesV1 resources;

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
     *     {@link BrochureInfoV1 }
     *     
     */
    public BrochureInfoV1 getBrochureInfo() {
        return brochureInfo;
    }

    /**
     * Sets the value of the brochureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureInfoV1 }
     *     
     */
    public void setBrochureInfo(BrochureInfoV1 value) {
        this.brochureInfo = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureContentV1 }
     *     
     */
    public BrochureContentV1 getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureContentV1 }
     *     
     */
    public void setContent(BrochureContentV1 value) {
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
     *     {@link BrochureInformationV1 }
     *     
     */
    public BrochureInformationV1 getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureInformationV1 }
     *     
     */
    public void setInformation(BrochureInformationV1 value) {
        this.information = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureLocationV1 }
     *     
     */
    public BrochureLocationV1 getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureLocationV1 }
     *     
     */
    public void setLocation(BrochureLocationV1 value) {
        this.location = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureResourcesV1 }
     *     
     */
    public BrochureResourcesV1 getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureResourcesV1 }
     *     
     */
    public void setResources(BrochureResourcesV1 value) {
        this.resources = value;
    }

}
