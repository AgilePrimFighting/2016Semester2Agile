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
 * <p>Java class for SM201010RolesRoleName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010RolesRoleName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoleName" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/&gt;
 *         &lt;element name="RoleDescription" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM201010RolesRoleNameServiceCommands" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010RolesRoleName", propOrder = {
    "displayName",
    "roleName",
    "roleDescription",
    "serviceCommands"
})
public class SM201010RolesRoleName {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "RoleName")
    protected Field roleName;
    @XmlElement(name = "RoleDescription")
    protected Field roleDescription;
    @XmlElement(name = "ServiceCommands")
    protected SM201010RolesRoleNameServiceCommands serviceCommands;

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
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setRoleName(Field value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the roleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getRoleDescription() {
        return roleDescription;
    }

    /**
     * Sets the value of the roleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setRoleDescription(Field value) {
        this.roleDescription = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010RolesRoleNameServiceCommands }
     *     
     */
    public SM201010RolesRoleNameServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010RolesRoleNameServiceCommands }
     *     
     */
    public void setServiceCommands(SM201010RolesRoleNameServiceCommands value) {
        this.serviceCommands = value;
    }

}
