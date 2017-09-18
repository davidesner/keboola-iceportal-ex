
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecIceTagsConteiner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecIceTagsConteiner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TagId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentNodeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsSelectable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PreIceTags" type="{http://services.iceportal.com/service}ArrayOfItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NodeId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecIceTagsConteiner", propOrder = {
    "tagId",
    "nodeName",
    "parentNodeId",
    "isSelectable",
    "preIceTags"
})
public class PrecIceTagsConteiner {

    @XmlElement(name = "TagId")
    protected int tagId;
    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "ParentNodeId")
    protected int parentNodeId;
    @XmlElement(name = "IsSelectable")
    protected boolean isSelectable;
    @XmlElement(name = "PreIceTags")
    protected ArrayOfItem preIceTags;
    @XmlAttribute(name = "NodeId", required = true)
    protected int nodeId;

    /**
     * Gets the value of the tagId property.
     * 
     */
    public int getTagId() {
        return tagId;
    }

    /**
     * Sets the value of the tagId property.
     * 
     */
    public void setTagId(int value) {
        this.tagId = value;
    }

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the parentNodeId property.
     * 
     */
    public int getParentNodeId() {
        return parentNodeId;
    }

    /**
     * Sets the value of the parentNodeId property.
     * 
     */
    public void setParentNodeId(int value) {
        this.parentNodeId = value;
    }

    /**
     * Gets the value of the isSelectable property.
     * 
     */
    public boolean isIsSelectable() {
        return isSelectable;
    }

    /**
     * Sets the value of the isSelectable property.
     * 
     */
    public void setIsSelectable(boolean value) {
        this.isSelectable = value;
    }

    /**
     * Gets the value of the preIceTags property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItem }
     *     
     */
    public ArrayOfItem getPreIceTags() {
        return preIceTags;
    }

    /**
     * Sets the value of the preIceTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItem }
     *     
     */
    public void setPreIceTags(ArrayOfItem value) {
        this.preIceTags = value;
    }

    /**
     * Gets the value of the nodeId property.
     * 
     */
    public int getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     */
    public void setNodeId(int value) {
        this.nodeId = value;
    }

}
