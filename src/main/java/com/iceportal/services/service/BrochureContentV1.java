
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrochureContentV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrochureContentV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pictures" type="{http://services.iceportal.com/service}MediaContentV1" minOccurs="0"/&gt;
 *         &lt;element name="vrealities" type="{http://services.iceportal.com/service}MediaContentV1" minOccurs="0"/&gt;
 *         &lt;element name="iFrame" type="{http://services.iceportal.com/service}iFrameInfo" minOccurs="0"/&gt;
 *         &lt;element name="videoList" type="{http://services.iceportal.com/service}videosListV1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrochureContentV1", propOrder = {
    "pictures",
    "vrealities",
    "iFrame",
    "videoList"
})
public class BrochureContentV1 {

    protected MediaContentV1 pictures;
    protected MediaContentV1 vrealities;
    protected IFrameInfo iFrame;
    protected VideosListV1 videoList;

    /**
     * Gets the value of the pictures property.
     * 
     * @return
     *     possible object is
     *     {@link MediaContentV1 }
     *     
     */
    public MediaContentV1 getPictures() {
        return pictures;
    }

    /**
     * Sets the value of the pictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaContentV1 }
     *     
     */
    public void setPictures(MediaContentV1 value) {
        this.pictures = value;
    }

    /**
     * Gets the value of the vrealities property.
     * 
     * @return
     *     possible object is
     *     {@link MediaContentV1 }
     *     
     */
    public MediaContentV1 getVrealities() {
        return vrealities;
    }

    /**
     * Sets the value of the vrealities property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaContentV1 }
     *     
     */
    public void setVrealities(MediaContentV1 value) {
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
     *     {@link VideosListV1 }
     *     
     */
    public VideosListV1 getVideoList() {
        return videoList;
    }

    /**
     * Sets the value of the videoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideosListV1 }
     *     
     */
    public void setVideoList(VideosListV1 value) {
        this.videoList = value;
    }

}
