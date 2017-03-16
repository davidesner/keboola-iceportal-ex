
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for videosListVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="videosListVisuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mediaGalleryUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Videos" type="{http://services.iceportal.com/service}ArrayOfVideoInfoVisuals" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "videosListVisuals", propOrder = {
    "mediaGalleryUrl",
    "videos"
})
public class VideosListVisuals {

    protected String mediaGalleryUrl;
    @XmlElement(name = "Videos")
    protected ArrayOfVideoInfoVisuals videos;

    /**
     * Gets the value of the mediaGalleryUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaGalleryUrl() {
        return mediaGalleryUrl;
    }

    /**
     * Sets the value of the mediaGalleryUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaGalleryUrl(String value) {
        this.mediaGalleryUrl = value;
    }

    /**
     * Gets the value of the videos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoInfoVisuals }
     *     
     */
    public ArrayOfVideoInfoVisuals getVideos() {
        return videos;
    }

    /**
     * Sets the value of the videos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoInfoVisuals }
     *     
     */
    public void setVideos(ArrayOfVideoInfoVisuals value) {
        this.videos = value;
    }

}
