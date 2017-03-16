
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoInfoV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoInfoV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="videoInfoV2" type="{http://services.iceportal.com/service}videoInfoV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoInfoV2", propOrder = {
    "videoInfoV2"
})
public class ArrayOfVideoInfoV2 {

    @XmlElement(nillable = true)
    protected List<VideoInfoV2> videoInfoV2;

    /**
     * Gets the value of the videoInfoV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoInfoV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoInfoV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoInfoV2 }
     * 
     * 
     */
    public List<VideoInfoV2> getVideoInfoV2() {
        if (videoInfoV2 == null) {
            videoInfoV2 = new ArrayList<VideoInfoV2>();
        }
        return this.videoInfoV2;
    }

}
