
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrochureContentVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrochureContentVisuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pictures" type="{http://services.iceportal.com/service}MediaContentVisuals" minOccurs="0"/&gt;
 *         &lt;element name="HD360s" type="{http://services.iceportal.com/service}MediaContentVisuals" minOccurs="0"/&gt;
 *         &lt;element name="IFrame" type="{http://services.iceportal.com/service}iFrameInfo" minOccurs="0"/&gt;
 *         &lt;element name="VideoList" type="{http://services.iceportal.com/service}videosListVisuals" minOccurs="0"/&gt;
 *         &lt;element name="VideoListV2" type="{http://services.iceportal.com/service}videosListVisualsV2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrochureContentVisuals", propOrder = {
    "pictures",
    "hd360S",
    "iFrame",
    "videoList",
    "videoListV2"
})
public class BrochureContentVisuals {

    @XmlElement(name = "Pictures")
    protected MediaContentVisuals pictures;
    @XmlElement(name = "HD360s")
    protected MediaContentVisuals hd360S;
    @XmlElement(name = "IFrame")
    protected IFrameInfo iFrame;
    @XmlElement(name = "VideoList")
    protected VideosListVisuals videoList;
    @XmlElement(name = "VideoListV2")
    protected VideosListVisualsV2 videoListV2;

    /**
     * Gets the value of the pictures property.
     * 
     * @return
     *     possible object is
     *     {@link MediaContentVisuals }
     *     
     */
    public MediaContentVisuals getPictures() {
        return pictures;
    }

    /**
     * Sets the value of the pictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaContentVisuals }
     *     
     */
    public void setPictures(MediaContentVisuals value) {
        this.pictures = value;
    }

    /**
     * Gets the value of the hd360S property.
     * 
     * @return
     *     possible object is
     *     {@link MediaContentVisuals }
     *     
     */
    public MediaContentVisuals getHD360S() {
        return hd360S;
    }

    /**
     * Sets the value of the hd360S property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaContentVisuals }
     *     
     */
    public void setHD360S(MediaContentVisuals value) {
        this.hd360S = value;
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
     *     {@link VideosListVisuals }
     *     
     */
    public VideosListVisuals getVideoList() {
        return videoList;
    }

    /**
     * Sets the value of the videoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideosListVisuals }
     *     
     */
    public void setVideoList(VideosListVisuals value) {
        this.videoList = value;
    }

    /**
     * Gets the value of the videoListV2 property.
     * 
     * @return
     *     possible object is
     *     {@link VideosListVisualsV2 }
     *     
     */
    public VideosListVisualsV2 getVideoListV2() {
        return videoListV2;
    }

    /**
     * Sets the value of the videoListV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideosListVisualsV2 }
     *     
     */
    public void setVideoListV2(VideosListVisualsV2 value) {
        this.videoListV2 = value;
    }

}
