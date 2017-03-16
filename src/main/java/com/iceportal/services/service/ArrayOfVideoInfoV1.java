
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoInfoV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoInfoV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="videoInfoV1" type="{http://services.iceportal.com/service}videoInfoV1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoInfoV1", propOrder = {
    "videoInfoV1"
})
public class ArrayOfVideoInfoV1 {

    @XmlElement(nillable = true)
    protected List<VideoInfoV1> videoInfoV1;

    /**
     * Gets the value of the videoInfoV1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoInfoV1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoInfoV1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoInfoV1 }
     * 
     * 
     */
    public List<VideoInfoV1> getVideoInfoV1() {
        if (videoInfoV1 == null) {
            videoInfoV1 = new ArrayList<VideoInfoV1>();
        }
        return this.videoInfoV1;
    }

}
