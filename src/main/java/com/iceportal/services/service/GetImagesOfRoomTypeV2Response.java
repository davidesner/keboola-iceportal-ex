
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetImagesOfRoomTypeV2Result" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Images" type="{http://services.iceportal.com/service}ArrayOfImage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getImagesOfRoomTypeV2Result",
    "errorMessage",
    "images"
})
@XmlRootElement(name = "GetImagesOfRoomTypeV2Response")
public class GetImagesOfRoomTypeV2Response {

    @XmlElement(name = "GetImagesOfRoomTypeV2Result")
    protected int getImagesOfRoomTypeV2Result;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "Images")
    protected ArrayOfImage images;

    /**
     * Gets the value of the getImagesOfRoomTypeV2Result property.
     * 
     */
    public int getGetImagesOfRoomTypeV2Result() {
        return getImagesOfRoomTypeV2Result;
    }

    /**
     * Sets the value of the getImagesOfRoomTypeV2Result property.
     * 
     */
    public void setGetImagesOfRoomTypeV2Result(int value) {
        this.getImagesOfRoomTypeV2Result = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImage }
     *     
     */
    public ArrayOfImage getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImage }
     *     
     */
    public void setImages(ArrayOfImage value) {
        this.images = value;
    }

}
