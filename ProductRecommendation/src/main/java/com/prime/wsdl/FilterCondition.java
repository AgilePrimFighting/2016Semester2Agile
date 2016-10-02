//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.01 at 07:35:09 PM NZDT 
//


package com.prime.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterCondition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilterCondition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Equals"/&gt;
 *     &lt;enumeration value="NotEqual"/&gt;
 *     &lt;enumeration value="Greater"/&gt;
 *     &lt;enumeration value="GreaterOrEqual"/&gt;
 *     &lt;enumeration value="Less"/&gt;
 *     &lt;enumeration value="LessOrEqual"/&gt;
 *     &lt;enumeration value="Contain"/&gt;
 *     &lt;enumeration value="StartsWith"/&gt;
 *     &lt;enumeration value="EndsWith"/&gt;
 *     &lt;enumeration value="NotContain"/&gt;
 *     &lt;enumeration value="Between"/&gt;
 *     &lt;enumeration value="IsNull"/&gt;
 *     &lt;enumeration value="IsNotNull"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FilterCondition")
@XmlEnum
public enum FilterCondition {

    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("NotEqual")
    NOT_EQUAL("NotEqual"),
    @XmlEnumValue("Greater")
    GREATER("Greater"),
    @XmlEnumValue("GreaterOrEqual")
    GREATER_OR_EQUAL("GreaterOrEqual"),
    @XmlEnumValue("Less")
    LESS("Less"),
    @XmlEnumValue("LessOrEqual")
    LESS_OR_EQUAL("LessOrEqual"),
    @XmlEnumValue("Contain")
    CONTAIN("Contain"),
    @XmlEnumValue("StartsWith")
    STARTS_WITH("StartsWith"),
    @XmlEnumValue("EndsWith")
    ENDS_WITH("EndsWith"),
    @XmlEnumValue("NotContain")
    NOT_CONTAIN("NotContain"),
    @XmlEnumValue("Between")
    BETWEEN("Between"),
    @XmlEnumValue("IsNull")
    IS_NULL("IsNull"),
    @XmlEnumValue("IsNotNull")
    IS_NOT_NULL("IsNotNull");
    private final String value;

    FilterCondition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilterCondition fromValue(String v) {
        for (FilterCondition c: FilterCondition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
