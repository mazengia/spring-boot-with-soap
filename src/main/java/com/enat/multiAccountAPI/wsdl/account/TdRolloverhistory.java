//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.29 at 09:34:44 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.account;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for Td-Rolloverhistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Td-Rolloverhistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLD_MAT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="NEW_MAT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ROLLOVER_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ACC_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ROLLOVER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INTEREST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PRINCIPAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ROLLOVER_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Td-Rolloverhistory", propOrder = {
    "brn",
    "acc",
    "oldmatdate",
    "newmatdate",
    "rolloverdate",
    "accstatus",
    "rollovertype",
    "interest",
    "principal",
    "rolloveramt",
    "seqno"
})
public class TdRolloverhistory {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "OLD_MAT_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar oldmatdate;
    @XmlElement(name = "NEW_MAT_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar newmatdate;
    @XmlElement(name = "ROLLOVER_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rolloverdate;
    @XmlElement(name = "ACC_STATUS")
    protected String accstatus;
    @XmlElement(name = "ROLLOVER_TYPE")
    protected String rollovertype;
    @XmlElement(name = "INTEREST")
    protected BigDecimal interest;
    @XmlElement(name = "PRINCIPAL")
    protected BigDecimal principal;
    @XmlElement(name = "ROLLOVER_AMT")
    protected BigDecimal rolloveramt;
    @XmlElement(name = "SEQNO")
    protected BigDecimal seqno;

    /**
     * Gets the value of the brn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRN() {
        return brn;
    }

    /**
     * Sets the value of the brn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRN(String value) {
        this.brn = value;
    }

    /**
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC(String value) {
        this.acc = value;
    }

    /**
     * Gets the value of the oldmatdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOLDMATDATE() {
        return oldmatdate;
    }

    /**
     * Sets the value of the oldmatdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOLDMATDATE(XMLGregorianCalendar value) {
        this.oldmatdate = value;
    }

    /**
     * Gets the value of the newmatdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNEWMATDATE() {
        return newmatdate;
    }

    /**
     * Sets the value of the newmatdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNEWMATDATE(XMLGregorianCalendar value) {
        this.newmatdate = value;
    }

    /**
     * Gets the value of the rolloverdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getROLLOVERDATE() {
        return rolloverdate;
    }

    /**
     * Sets the value of the rolloverdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setROLLOVERDATE(XMLGregorianCalendar value) {
        this.rolloverdate = value;
    }

    /**
     * Gets the value of the accstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCSTATUS() {
        return accstatus;
    }

    /**
     * Sets the value of the accstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCSTATUS(String value) {
        this.accstatus = value;
    }

    /**
     * Gets the value of the rollovertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLOVERTYPE() {
        return rollovertype;
    }

    /**
     * Sets the value of the rollovertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLOVERTYPE(String value) {
        this.rollovertype = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTEREST() {
        return interest;
    }

    /**
     * Sets the value of the interest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTEREST(BigDecimal value) {
        this.interest = value;
    }

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRINCIPAL() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRINCIPAL(BigDecimal value) {
        this.principal = value;
    }

    /**
     * Gets the value of the rolloveramt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getROLLOVERAMT() {
        return rolloveramt;
    }

    /**
     * Sets the value of the rolloveramt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setROLLOVERAMT(BigDecimal value) {
        this.rolloveramt = value;
    }

    /**
     * Gets the value of the seqno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSEQNO() {
        return seqno;
    }

    /**
     * Sets the value of the seqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSEQNO(BigDecimal value) {
        this.seqno = value;
    }

}
