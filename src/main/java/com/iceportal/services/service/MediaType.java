
package com.iceportal.services.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Video"/&gt;
 *     &lt;enumeration value="VirtualReality"/&gt;
 *     &lt;enumeration value="Photo"/&gt;
 *     &lt;enumeration value="PDF"/&gt;
 *     &lt;enumeration value="IFrame"/&gt;
 *     &lt;enumeration value="HD360"/&gt;
 *     &lt;enumeration value="VideoNG"/&gt;
 *     &lt;enumeration value="Tours360NG"/&gt;
 *     &lt;enumeration value="CustomContent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MediaType")
@XmlEnum
public enum MediaType {

    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("VirtualReality")
    VIRTUAL_REALITY("VirtualReality"),
    @XmlEnumValue("Photo")
    PHOTO("Photo"),
    PDF("PDF"),
    @XmlEnumValue("IFrame")
    I_FRAME("IFrame"),
    @XmlEnumValue("HD360")
    HD_360("HD360"),
    @XmlEnumValue("VideoNG")
    VIDEO_NG("VideoNG"),
    @XmlEnumValue("Tours360NG")
    TOURS_360_NG("Tours360NG"),
    @XmlEnumValue("CustomContent")
    CUSTOM_CONTENT("CustomContent");
    private final String value;

    MediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaType fromValue(String v) {
        for (MediaType c: MediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
