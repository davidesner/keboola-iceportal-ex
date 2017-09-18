
package com.iceportal.services.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecIceTagsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecIceTagsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PreICETag" type="{http://services.iceportal.com/service}PrecIceTagsConteiner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecIceTagsList", propOrder = {
    "preICETag"
})
public class PrecIceTagsList {

    @XmlElement(name = "PreICETag")
    protected List<PrecIceTagsConteiner> preICETag;

    /**
     * Gets the value of the preICETag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preICETag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreICETag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrecIceTagsConteiner }
     * 
     * 
     */
    public List<PrecIceTagsConteiner> getPreICETag() {
        if (preICETag == null) {
            preICETag = new ArrayList<PrecIceTagsConteiner>();
        }
        return this.preICETag;
    }

}
