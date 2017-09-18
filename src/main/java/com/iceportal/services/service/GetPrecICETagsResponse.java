
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
 *         &lt;element name="GetPrecICETagsResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreIceTags" type="{http://services.iceportal.com/service}PrecIceTagsList" minOccurs="0"/&gt;
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
    "getPrecICETagsResult",
    "errorMessage",
    "preIceTags"
})
@XmlRootElement(name = "GetPrecICETagsResponse")
public class GetPrecICETagsResponse {

    @XmlElement(name = "GetPrecICETagsResult")
    protected int getPrecICETagsResult;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "PreIceTags")
    protected PrecIceTagsList preIceTags;

    /**
     * Gets the value of the getPrecICETagsResult property.
     * 
     */
    public int getGetPrecICETagsResult() {
        return getPrecICETagsResult;
    }

    /**
     * Sets the value of the getPrecICETagsResult property.
     * 
     */
    public void setGetPrecICETagsResult(int value) {
        this.getPrecICETagsResult = value;
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
     * Gets the value of the preIceTags property.
     * 
     * @return
     *     possible object is
     *     {@link PrecIceTagsList }
     *     
     */
    public PrecIceTagsList getPreIceTags() {
        return preIceTags;
    }

    /**
     * Sets the value of the preIceTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecIceTagsList }
     *     
     */
    public void setPreIceTags(PrecIceTagsList value) {
        this.preIceTags = value;
    }

}
