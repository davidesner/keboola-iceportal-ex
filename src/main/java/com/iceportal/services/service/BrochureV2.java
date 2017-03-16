
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrochureV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrochureV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://services.iceportal.com/service}BrochureRequest" minOccurs="0"/&gt;
 *         &lt;element name="brochureInfo" type="{http://services.iceportal.com/service}BrochureInfoV2" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://services.iceportal.com/service}BrochureContentV2" minOccurs="0"/&gt;
 *         &lt;element name="constraints" type="{http://services.iceportal.com/service}BrochureConstraint" minOccurs="0"/&gt;
 *         &lt;element name="information" type="{http://services.iceportal.com/service}BrochureInformationV2" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://services.iceportal.com/service}BrochureLocationV2" minOccurs="0"/&gt;
 *         &lt;element name="resources" type="{http://services.iceportal.com/service}BrochureResourcesV2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrochureV2", propOrder = {
    "request",
    "brochureInfo",
    "content",
    "constraints",
    "information",
    "location",
    "resources"
})
public class BrochureV2 {

    protected BrochureRequest request;
    protected BrochureInfoV2 brochureInfo;
    protected BrochureContentV2 content;
    protected BrochureConstraint constraints;
    protected BrochureInformationV2 information;
    protected BrochureLocationV2 location;
    protected BrochureResourcesV2 resources;

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
     *     {@link BrochureInfoV2 }
     *     
     */
    public BrochureInfoV2 getBrochureInfo() {
        return brochureInfo;
    }

    /**
     * Sets the value of the brochureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureInfoV2 }
     *     
     */
    public void setBrochureInfo(BrochureInfoV2 value) {
        this.brochureInfo = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureContentV2 }
     *     
     */
    public BrochureContentV2 getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureContentV2 }
     *     
     */
    public void setContent(BrochureContentV2 value) {
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
     *     {@link BrochureInformationV2 }
     *     
     */
    public BrochureInformationV2 getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureInformationV2 }
     *     
     */
    public void setInformation(BrochureInformationV2 value) {
        this.information = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureLocationV2 }
     *     
     */
    public BrochureLocationV2 getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureLocationV2 }
     *     
     */
    public void setLocation(BrochureLocationV2 value) {
        this.location = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link BrochureResourcesV2 }
     *     
     */
    public BrochureResourcesV2 getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrochureResourcesV2 }
     *     
     */
    public void setResources(BrochureResourcesV2 value) {
        this.resources = value;
    }

}
