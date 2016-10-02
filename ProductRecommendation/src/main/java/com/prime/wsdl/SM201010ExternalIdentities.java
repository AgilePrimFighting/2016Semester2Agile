//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.01 at 07:35:09 PM NZDT 
//


package com.prime.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM201010ExternalIdentities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010ExternalIdentities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProviderName" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/&gt;
 *         &lt;element name="UserKey" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM201010ExternalIdentitiesServiceCommands" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010ExternalIdentities", propOrder = {
    "displayName",
    "providerName",
    "active",
    "userKey",
    "serviceCommands"
})
public class SM201010ExternalIdentities {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "ProviderName")
    protected Field providerName;
    @XmlElement(name = "Active")
    protected Field active;
    @XmlElement(name = "UserKey")
    protected Field userKey;
    @XmlElement(name = "ServiceCommands")
    protected SM201010ExternalIdentitiesServiceCommands serviceCommands;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setProviderName(Field value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setActive(Field value) {
        this.active = value;
    }

    /**
     * Gets the value of the userKey property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getUserKey() {
        return userKey;
    }

    /**
     * Sets the value of the userKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setUserKey(Field value) {
        this.userKey = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010ExternalIdentitiesServiceCommands }
     *     
     */
    public SM201010ExternalIdentitiesServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010ExternalIdentitiesServiceCommands }
     *     
     */
    public void setServiceCommands(SM201010ExternalIdentitiesServiceCommands value) {
        this.serviceCommands = value;
    }

}
