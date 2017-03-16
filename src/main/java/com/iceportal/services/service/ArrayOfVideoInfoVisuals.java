
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoInfoVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoInfoVisuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VideoInfoVisuals" type="{http://services.iceportal.com/service}VideoInfoVisuals" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoInfoVisuals", propOrder = {
    "videoInfoVisuals"
})
public class ArrayOfVideoInfoVisuals {

    @XmlElement(name = "VideoInfoVisuals", nillable = true)
    protected List<VideoInfoVisuals> videoInfoVisuals;

    /**
     * Gets the value of the videoInfoVisuals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoInfoVisuals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoInfoVisuals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoInfoVisuals }
     * 
     * 
     */
    public List<VideoInfoVisuals> getVideoInfoVisuals() {
        if (videoInfoVisuals == null) {
            videoInfoVisuals = new ArrayList<VideoInfoVisuals>();
        }
        return this.videoInfoVisuals;
    }

}
