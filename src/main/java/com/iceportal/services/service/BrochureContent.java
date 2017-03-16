
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrochureContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrochureContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pictures" type="{http://services.iceportal.com/service}MediaContent" minOccurs="0"/&gt;
 *         &lt;element name="vrealities" type="{http://services.iceportal.com/service}MediaContent" minOccurs="0"/&gt;
 *         &lt;element name="iFrame" type="{http://services.iceportal.com/service}iFrameInfo" minOccurs="0"/&gt;
 *         &lt;element name="videoList" type="{http://services.iceportal.com/service}videosList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrochureContent", propOrder = {
    "pictures",
    "vrealities",
    "iFrame",
    "videoList"
})
public class BrochureContent {

    protected MediaContent pictures;
    protected MediaContent vrealities;
    protected IFrameInfo iFrame;
    protected VideosList videoList;

    /**
     * Gets the value of the pictures property.
     * 
     * @return
     *     possible object is
     *     {@link MediaContent }
     *     
     */
    public MediaContent getPictures() {
        return pictures;
    }

    /**
     * Sets the value of the pictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaContent }
     *     
     */
    public void setPictures(MediaContent value) {
        this.pictures = value;
    }

    /**
     * Gets the value of the vrealities property.
     * 
     * @return
     *     possible object is
     *     {@link MediaContent }
     *     
     */
    public MediaContent getVrealities() {
        return vrealities;
    }

    /**
     * Sets the value of the vrealities property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaContent }
     *     
     */
    public void setVrealities(MediaContent value) {
        this.vrealities = value;
    }

    /**
     * Gets the value of the iFrame property.
     * 
     * @return
     *     possible object is
     *     {@link IFrameInfo }
     *     
     */
    public IFrameInfo getIFrame() {
        return iFrame;
    }

    /**
     * Sets the value of the iFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link IFrameInfo }
     *     
     */
    public void setIFrame(IFrameInfo value) {
        this.iFrame = value;
    }

    /**
     * Gets the value of the videoList property.
     * 
     * @return
     *     possible object is
     *     {@link VideosList }
     *     
     */
    public VideosList getVideoList() {
        return videoList;
    }

    /**
     * Sets the value of the videoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideosList }
     *     
     */
    public void setVideoList(VideosList value) {
        this.videoList = value;
    }

}
