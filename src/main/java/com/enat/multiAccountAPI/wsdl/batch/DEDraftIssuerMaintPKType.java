//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:22:59 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.batch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DEDraftIssuerMaint-PK-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEDraftIssuerMaint-PK-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BANK_CODE1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="INSTRUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEDraftIssuerMaint-PK-Type", propOrder = {
    "bankcode1",
    "ccy",
    "instrumenttype"
})
public class DEDraftIssuerMaintPKType {

    @XmlElement(name = "BANK_CODE1", required = true)
    protected String bankcode1;
    @XmlElement(name = "CCY", required = true)
    protected String ccy;
    @XmlElement(name = "INSTRUMENT_TYPE", required = true)
    protected String instrumenttype;

    /**
     * Gets the value of the bankcode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKCODE1() {
        return bankcode1;
    }

    /**
     * Sets the value of the bankcode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKCODE1(String value) {
        this.bankcode1 = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCY() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCY(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the instrumenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRUMENTTYPE() {
        return instrumenttype;
    }

    /**
     * Sets the value of the instrumenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRUMENTTYPE(String value) {
        this.instrumenttype = value;
    }

}