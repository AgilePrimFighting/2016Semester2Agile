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
 * <p>Java class for SM203520CompanySummaryServiceCommands complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM203520CompanySummaryServiceCommands"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyCompanyID" type="{http://www.acumatica.com/generic/}Key" minOccurs="0"/&gt;
 *         &lt;element name="EveryCompanyID" type="{http://www.acumatica.com/generic/}EveryValue" minOccurs="0"/&gt;
 *         &lt;element name="DeleteRow" type="{http://www.acumatica.com/generic/}DeleteRow" minOccurs="0"/&gt;
 *         &lt;element name="DialogAnswer" type="{http://www.acumatica.com/generic/}Answer" minOccurs="0"/&gt;
 *         &lt;element name="Attachment" type="{http://www.acumatica.com/generic/}Attachment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM203520CompanySummaryServiceCommands", propOrder = {
    "keyCompanyID",
    "everyCompanyID",
    "deleteRow",
    "dialogAnswer",
    "attachment"
})
public class SM203520CompanySummaryServiceCommands {

    @XmlElement(name = "KeyCompanyID")
    protected Key keyCompanyID;
    @XmlElement(name = "EveryCompanyID")
    protected EveryValue everyCompanyID;
    @XmlElement(name = "DeleteRow")
    protected DeleteRow deleteRow;
    @XmlElement(name = "DialogAnswer")
    protected Answer dialogAnswer;
    @XmlElement(name = "Attachment")
    protected Attachment attachment;

    /**
     * Gets the value of the keyCompanyID property.
     * 
     * @return
     *     possible object is
     *     {@link Key }
     *     
     */
    public Key getKeyCompanyID() {
        return keyCompanyID;
    }

    /**
     * Sets the value of the keyCompanyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Key }
     *     
     */
    public void setKeyCompanyID(Key value) {
        this.keyCompanyID = value;
    }

    /**
     * Gets the value of the everyCompanyID property.
     * 
     * @return
     *     possible object is
     *     {@link EveryValue }
     *     
     */
    public EveryValue getEveryCompanyID() {
        return everyCompanyID;
    }

    /**
     * Sets the value of the everyCompanyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EveryValue }
     *     
     */
    public void setEveryCompanyID(EveryValue value) {
        this.everyCompanyID = value;
    }

    /**
     * Gets the value of the deleteRow property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteRow }
     *     
     */
    public DeleteRow getDeleteRow() {
        return deleteRow;
    }

    /**
     * Sets the value of the deleteRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteRow }
     *     
     */
    public void setDeleteRow(DeleteRow value) {
        this.deleteRow = value;
    }

    /**
     * Gets the value of the dialogAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link Answer }
     *     
     */
    public Answer getDialogAnswer() {
        return dialogAnswer;
    }

    /**
     * Sets the value of the dialogAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Answer }
     *     
     */
    public void setDialogAnswer(Answer value) {
        this.dialogAnswer = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setAttachment(Attachment value) {
        this.attachment = value;
    }

}
