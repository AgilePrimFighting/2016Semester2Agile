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
 * <p>Java class for SM203520RestoreSnapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM203520RestoreSnapshot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Company" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM203520RestoreSnapshotServiceCommands" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM203520RestoreSnapshot", propOrder = {
    "displayName",
    "company",
    "name",
    "description",
    "serviceCommands"
})
public class SM203520RestoreSnapshot {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Company")
    protected Field company;
    @XmlElement(name = "Name")
    protected Field name;
    @XmlElement(name = "Description")
    protected Field description;
    @XmlElement(name = "ServiceCommands")
    protected SM203520RestoreSnapshotServiceCommands serviceCommands;

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
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setCompany(Field value) {
        this.company = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setName(Field value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setDescription(Field value) {
        this.description = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520RestoreSnapshotServiceCommands }
     *     
     */
    public SM203520RestoreSnapshotServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520RestoreSnapshotServiceCommands }
     *     
     */
    public void setServiceCommands(SM203520RestoreSnapshotServiceCommands value) {
        this.serviceCommands = value;
    }

}
