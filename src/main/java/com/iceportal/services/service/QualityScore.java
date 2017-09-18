
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityScore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PhotoOverallScore" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PhotoSizeScore" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PhotoCategoryScore" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PhotoRoomTypeScore" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PhotoTagScore" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityScore", propOrder = {
    "photoOverallScore",
    "photoSizeScore",
    "photoCategoryScore",
    "photoRoomTypeScore",
    "photoTagScore"
})
public class QualityScore {

    @XmlElement(name = "PhotoOverallScore")
    protected int photoOverallScore;
    @XmlElement(name = "PhotoSizeScore")
    protected int photoSizeScore;
    @XmlElement(name = "PhotoCategoryScore")
    protected int photoCategoryScore;
    @XmlElement(name = "PhotoRoomTypeScore")
    protected int photoRoomTypeScore;
    @XmlElement(name = "PhotoTagScore")
    protected int photoTagScore;

    /**
     * Gets the value of the photoOverallScore property.
     * 
     */
    public int getPhotoOverallScore() {
        return photoOverallScore;
    }

    /**
     * Sets the value of the photoOverallScore property.
     * 
     */
    public void setPhotoOverallScore(int value) {
        this.photoOverallScore = value;
    }

    /**
     * Gets the value of the photoSizeScore property.
     * 
     */
    public int getPhotoSizeScore() {
        return photoSizeScore;
    }

    /**
     * Sets the value of the photoSizeScore property.
     * 
     */
    public void setPhotoSizeScore(int value) {
        this.photoSizeScore = value;
    }

    /**
     * Gets the value of the photoCategoryScore property.
     * 
     */
    public int getPhotoCategoryScore() {
        return photoCategoryScore;
    }

    /**
     * Sets the value of the photoCategoryScore property.
     * 
     */
    public void setPhotoCategoryScore(int value) {
        this.photoCategoryScore = value;
    }

    /**
     * Gets the value of the photoRoomTypeScore property.
     * 
     */
    public int getPhotoRoomTypeScore() {
        return photoRoomTypeScore;
    }

    /**
     * Sets the value of the photoRoomTypeScore property.
     * 
     */
    public void setPhotoRoomTypeScore(int value) {
        this.photoRoomTypeScore = value;
    }

    /**
     * Gets the value of the photoTagScore property.
     * 
     */
    public int getPhotoTagScore() {
        return photoTagScore;
    }

    /**
     * Sets the value of the photoTagScore property.
     * 
     */
    public void setPhotoTagScore(int value) {
        this.photoTagScore = value;
    }

}
