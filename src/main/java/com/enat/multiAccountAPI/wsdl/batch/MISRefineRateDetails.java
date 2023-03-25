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
import java.math.BigDecimal;


/**
 * <p>Java class for MISRefineRateDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MISRefineRateDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UNITREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BKDATE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/&gt;
 *         &lt;element name="EFFDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="REFRT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MISRefineRateDetails", propOrder = {
    "unitref",
    "bkdate",
    "effdt",
    "refrt"
})
public class MISRefineRateDetails {

    @XmlElement(name = "UNITREF")
    protected String unitref;
    @XmlElement(name = "BKDATE", required = true)
    protected Object bkdate;
    @XmlElement(name = "EFFDT")
    protected Object effdt;
    @XmlElement(name = "REFRT", required = true)
    protected BigDecimal refrt;

    /**
     * Gets the value of the unitref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITREF() {
        return unitref;
    }

    /**
     * Sets the value of the unitref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITREF(String value) {
        this.unitref = value;
    }

    /**
     * Gets the value of the bkdate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBKDATE() {
        return bkdate;
    }

    /**
     * Sets the value of the bkdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBKDATE(Object value) {
        this.bkdate = value;
    }

    /**
     * Gets the value of the effdt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEFFDT() {
        return effdt;
    }

    /**
     * Sets the value of the effdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEFFDT(Object value) {
        this.effdt = value;
    }

    /**
     * Gets the value of the refrt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREFRT() {
        return refrt;
    }

    /**
     * Sets the value of the refrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREFRT(BigDecimal value) {
        this.refrt = value;
    }

}
