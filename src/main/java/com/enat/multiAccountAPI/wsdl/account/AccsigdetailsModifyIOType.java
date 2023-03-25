//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:22:54 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Accsigdetails-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accsigdetails-Modify-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACBRN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACTNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ACCMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MINNOSIG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Accsigdetails" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SOLOSIG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accsigdetails-Modify-IO-Type", propOrder = {
    "acbrn1",
    "actno",
    "accmsg",
    "minnosig",
    "accsigdetails"
})
public class AccsigdetailsModifyIOType {

    @XmlElement(name = "ACBRN1")
    protected String acbrn1;
    @XmlElement(name = "ACTNO", required = true)
    protected String actno;
    @XmlElement(name = "ACCMSG")
    protected String accmsg;
    @XmlElement(name = "MINNOSIG")
    protected BigDecimal minnosig;
    @XmlElement(name = "Accsigdetails", required = true)
    protected List<AccsigdetailsModifyIOType.Accsigdetails> accsigdetails;

    /**
     * Gets the value of the acbrn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACBRN1() {
        return acbrn1;
    }

    /**
     * Sets the value of the acbrn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACBRN1(String value) {
        this.acbrn1 = value;
    }

    /**
     * Gets the value of the actno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTNO() {
        return actno;
    }

    /**
     * Sets the value of the actno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTNO(String value) {
        this.actno = value;
    }

    /**
     * Gets the value of the accmsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCMSG() {
        return accmsg;
    }

    /**
     * Sets the value of the accmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCMSG(String value) {
        this.accmsg = value;
    }

    /**
     * Gets the value of the minnosig property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINNOSIG() {
        return minnosig;
    }

    /**
     * Sets the value of the minnosig property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINNOSIG(BigDecimal value) {
        this.minnosig = value;
    }

    /**
     * Gets the value of the accsigdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accsigdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccsigdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccsigdetailsModifyIOType.Accsigdetails }
     * 
     * 
     */
    public List<AccsigdetailsModifyIOType.Accsigdetails> getAccsigdetails() {
        if (accsigdetails == null) {
            accsigdetails = new ArrayList<AccsigdetailsModifyIOType.Accsigdetails>();
        }
        return this.accsigdetails;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SOLOSIG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "solosig"
    })
    public static class Accsigdetails {

        @XmlElement(name = "SOLOSIG")
        protected BigDecimal solosig;

        /**
         * Gets the value of the solosig property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSOLOSIG() {
            return solosig;
        }

        /**
         * Sets the value of the solosig property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSOLOSIG(BigDecimal value) {
            this.solosig = value;
        }

    }

}
