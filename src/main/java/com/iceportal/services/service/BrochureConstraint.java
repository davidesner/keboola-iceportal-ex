
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrochureConstraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrochureConstraint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="showVideos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showPictures" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showVirtualReality" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showRatesReservations" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showGeneralInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showLocation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showPDFLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showLang" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showEmailLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showHD360PropertyMap" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showIframe" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrochureConstraint", propOrder = {
    "showVideos",
    "showPictures",
    "showVirtualReality",
    "showRatesReservations",
    "showGeneralInfo",
    "showLocation",
    "showPDFLink",
    "showLang",
    "showEmailLink",
    "showHD360PropertyMap",
    "showIframe"
})
public class BrochureConstraint {

    protected boolean showVideos;
    protected boolean showPictures;
    protected boolean showVirtualReality;
    protected boolean showRatesReservations;
    protected boolean showGeneralInfo;
    protected boolean showLocation;
    protected boolean showPDFLink;
    protected boolean showLang;
    protected boolean showEmailLink;
    protected boolean showHD360PropertyMap;
    protected boolean showIframe;

    /**
     * Gets the value of the showVideos property.
     * 
     */
    public boolean isShowVideos() {
        return showVideos;
    }

    /**
     * Sets the value of the showVideos property.
     * 
     */
    public void setShowVideos(boolean value) {
        this.showVideos = value;
    }

    /**
     * Gets the value of the showPictures property.
     * 
     */
    public boolean isShowPictures() {
        return showPictures;
    }

    /**
     * Sets the value of the showPictures property.
     * 
     */
    public void setShowPictures(boolean value) {
        this.showPictures = value;
    }

    /**
     * Gets the value of the showVirtualReality property.
     * 
     */
    public boolean isShowVirtualReality() {
        return showVirtualReality;
    }

    /**
     * Sets the value of the showVirtualReality property.
     * 
     */
    public void setShowVirtualReality(boolean value) {
        this.showVirtualReality = value;
    }

    /**
     * Gets the value of the showRatesReservations property.
     * 
     */
    public boolean isShowRatesReservations() {
        return showRatesReservations;
    }

    /**
     * Sets the value of the showRatesReservations property.
     * 
     */
    public void setShowRatesReservations(boolean value) {
        this.showRatesReservations = value;
    }

    /**
     * Gets the value of the showGeneralInfo property.
     * 
     */
    public boolean isShowGeneralInfo() {
        return showGeneralInfo;
    }

    /**
     * Sets the value of the showGeneralInfo property.
     * 
     */
    public void setShowGeneralInfo(boolean value) {
        this.showGeneralInfo = value;
    }

    /**
     * Gets the value of the showLocation property.
     * 
     */
    public boolean isShowLocation() {
        return showLocation;
    }

    /**
     * Sets the value of the showLocation property.
     * 
     */
    public void setShowLocation(boolean value) {
        this.showLocation = value;
    }

    /**
     * Gets the value of the showPDFLink property.
     * 
     */
    public boolean isShowPDFLink() {
        return showPDFLink;
    }

    /**
     * Sets the value of the showPDFLink property.
     * 
     */
    public void setShowPDFLink(boolean value) {
        this.showPDFLink = value;
    }

    /**
     * Gets the value of the showLang property.
     * 
     */
    public boolean isShowLang() {
        return showLang;
    }

    /**
     * Sets the value of the showLang property.
     * 
     */
    public void setShowLang(boolean value) {
        this.showLang = value;
    }

    /**
     * Gets the value of the showEmailLink property.
     * 
     */
    public boolean isShowEmailLink() {
        return showEmailLink;
    }

    /**
     * Sets the value of the showEmailLink property.
     * 
     */
    public void setShowEmailLink(boolean value) {
        this.showEmailLink = value;
    }

    /**
     * Gets the value of the showHD360PropertyMap property.
     * 
     */
    public boolean isShowHD360PropertyMap() {
        return showHD360PropertyMap;
    }

    /**
     * Sets the value of the showHD360PropertyMap property.
     * 
     */
    public void setShowHD360PropertyMap(boolean value) {
        this.showHD360PropertyMap = value;
    }

    /**
     * Gets the value of the showIframe property.
     * 
     */
    public boolean isShowIframe() {
        return showIframe;
    }

    /**
     * Sets the value of the showIframe property.
     * 
     */
    public void setShowIframe(boolean value) {
        this.showIframe = value;
    }

}
