
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrochureContentV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrochureContentV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pictures" type="{http://services.iceportal.com/service}MediaContentV2" minOccurs="0"/&gt;
 *         &lt;element name="vrealities" type="{http://services.iceportal.com/service}MediaContentV2" minOccurs="0"/&gt;
 *         &lt;element name="iFrame" type="{http://services.iceportal.com/service}iFrameInfo" minOccurs="0"/&gt;
 *         &lt;element name="videoList" type="{http://services.iceportal.com/service}videosListV2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrochureContentV2", propOrder = {
    "pictures",
    "vrealities",
    "iFrame",
    "videoList"
})
public class BrochureContentV2 {

    protected MediaContentV2 pictures;
    protected MediaContentV2 vrealities;
    protected IFrameInfo iFrame;
    protected VideosListV2 videoList;

    /**
     * Gets the value of the pictures property.
     * 
     * @return
     *     possible object is
     *     {@link MediaContentV2 }
     *     
     */
    public MediaContentV2 getPictures() {
        return pictures;
    }

    /**
     * Sets the value of the pictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaContentV2 }
     *     
     */
    public void setPictures(MediaContentV2 value) {
        this.pictures = value;
    }

    /**
     * Gets the value of the vrealities property.
     * 
     * @return
     *     possible object is
     *     {@link MediaContentV2 }
     *     
     */
    public MediaContentV2 getVrealities() {
        return vrealities;
    }

    /**
     * Sets the value of the vrealities property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaContentV2 }
     *     
     */
    public void setVrealities(MediaContentV2 value) {
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
     *     {@link VideosListV2 }
     *     
     */
    public VideosListV2 getVideoList() {
        return videoList;
    }

    /**
     * Sets the value of the videoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideosListV2 }
     *     
     */
    public void setVideoList(VideosListV2 value) {
        this.videoList = value;
    }

}
