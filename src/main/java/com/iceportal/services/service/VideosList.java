
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for videosList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="videosList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mediagallaryUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Videos" type="{http://services.iceportal.com/service}ArrayOfVideoInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "videosList", propOrder = {
    "mediagallaryUrl",
    "videos"
})
public class VideosList {

    protected String mediagallaryUrl;
    @XmlElement(name = "Videos")
    protected ArrayOfVideoInfo videos;

    /**
     * Gets the value of the mediagallaryUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediagallaryUrl() {
        return mediagallaryUrl;
    }

    /**
     * Sets the value of the mediagallaryUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediagallaryUrl(String value) {
        this.mediagallaryUrl = value;
    }

    /**
     * Gets the value of the videos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoInfo }
     *     
     */
    public ArrayOfVideoInfo getVideos() {
        return videos;
    }

    /**
     * Sets the value of the videos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoInfo }
     *     
     */
    public void setVideos(ArrayOfVideoInfo value) {
        this.videos = value;
    }

}
