
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
 *         &lt;element name="GetCategoriesResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OTACategories" type="{http://services.iceportal.com/service}ArrayOfCategories" minOccurs="0"/&gt;
 *         &lt;element name="ICECategories" type="{http://services.iceportal.com/service}ArrayOfICESubCategories" minOccurs="0"/&gt;
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
    "getCategoriesResult",
    "errorMessage",
    "otaCategories",
    "iceCategories"
})
@XmlRootElement(name = "GetCategoriesResponse")
public class GetCategoriesResponse {

    @XmlElement(name = "GetCategoriesResult")
    protected int getCategoriesResult;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "OTACategories")
    protected ArrayOfCategories otaCategories;
    @XmlElement(name = "ICECategories")
    protected ArrayOfICESubCategories iceCategories;

    /**
     * Gets the value of the getCategoriesResult property.
     * 
     */
    public int getGetCategoriesResult() {
        return getCategoriesResult;
    }

    /**
     * Sets the value of the getCategoriesResult property.
     * 
     */
    public void setGetCategoriesResult(int value) {
        this.getCategoriesResult = value;
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
     * Gets the value of the otaCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategories }
     *     
     */
    public ArrayOfCategories getOTACategories() {
        return otaCategories;
    }

    /**
     * Sets the value of the otaCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategories }
     *     
     */
    public void setOTACategories(ArrayOfCategories value) {
        this.otaCategories = value;
    }

    /**
     * Gets the value of the iceCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfICESubCategories }
     *     
     */
    public ArrayOfICESubCategories getICECategories() {
        return iceCategories;
    }

    /**
     * Sets the value of the iceCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfICESubCategories }
     *     
     */
    public void setICECategories(ArrayOfICESubCategories value) {
        this.iceCategories = value;
    }

}
