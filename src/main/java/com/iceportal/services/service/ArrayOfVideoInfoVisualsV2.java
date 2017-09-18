
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoInfoVisualsV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoInfoVisualsV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VideoInfoVisualsV2" type="{http://services.iceportal.com/service}VideoInfoVisualsV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoInfoVisualsV2", propOrder = {
    "videoInfoVisualsV2"
})
public class ArrayOfVideoInfoVisualsV2 {

    @XmlElement(name = "VideoInfoVisualsV2", nillable = true)
    protected List<VideoInfoVisualsV2> videoInfoVisualsV2;

    /**
     * Gets the value of the videoInfoVisualsV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoInfoVisualsV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoInfoVisualsV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoInfoVisualsV2 }
     * 
     * 
     */
    public List<VideoInfoVisualsV2> getVideoInfoVisualsV2() {
        if (videoInfoVisualsV2 == null) {
            videoInfoVisualsV2 = new ArrayList<VideoInfoVisualsV2>();
        }
        return this.videoInfoVisualsV2;
    }

}
