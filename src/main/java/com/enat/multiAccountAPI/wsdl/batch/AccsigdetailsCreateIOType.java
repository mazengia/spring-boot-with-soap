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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Accsigdetails-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accsigdetails-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACBRN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACTNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ACCMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MINNOSIG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Accsigdetails" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CUST_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SIGID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SIGMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SIGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="APPROVLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="SIGNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Accsigdetails-Create-IO-Type", propOrder = {
    "acbrn1",
    "actno",
    "accmsg",
    "minnosig",
    "accsigdetails"
})
public class AccsigdetailsCreateIOType {

    @XmlElement(name = "ACBRN1")
    protected String acbrn1;
    @XmlElement(name = "ACTNO", required = true)
    protected String actno;
    @XmlElement(name = "ACCMSG")
    protected String accmsg;
    @XmlElement(name = "MINNOSIG")
    protected BigDecimal minnosig;
    @XmlElement(name = "Accsigdetails")
    protected List<AccsigdetailsCreateIOType.Accsigdetails> accsigdetails;

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
     * {@link AccsigdetailsCreateIOType.Accsigdetails }
     * 
     * 
     */
    public List<AccsigdetailsCreateIOType.Accsigdetails> getAccsigdetails() {
        if (accsigdetails == null) {
            accsigdetails = new ArrayList<AccsigdetailsCreateIOType.Accsigdetails>();
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
     *         &lt;element name="CUST_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SIGID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SIGMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SIGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="APPROVLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="SIGNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "custid",
        "sigid",
        "sigmsg",
        "sigtype",
        "approvlimit",
        "signame",
        "solosig"
    })
    public static class Accsigdetails {

        @XmlElement(name = "CUST_ID", required = true)
        protected String custid;
        @XmlElement(name = "SIGID", required = true)
        protected String sigid;
        @XmlElement(name = "SIGMSG")
        protected String sigmsg;
        @XmlElement(name = "SIGTYPE")
        protected String sigtype;
        @XmlElement(name = "APPROVLIMIT")
        protected BigDecimal approvlimit;
        @XmlElement(name = "SIGNAME")
        protected String signame;
        @XmlElement(name = "SOLOSIG")
        protected BigDecimal solosig;

        /**
         * Gets the value of the custid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTID() {
            return custid;
        }

        /**
         * Sets the value of the custid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTID(String value) {
            this.custid = value;
        }

        /**
         * Gets the value of the sigid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGID() {
            return sigid;
        }

        /**
         * Sets the value of the sigid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGID(String value) {
            this.sigid = value;
        }

        /**
         * Gets the value of the sigmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGMSG() {
            return sigmsg;
        }

        /**
         * Sets the value of the sigmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGMSG(String value) {
            this.sigmsg = value;
        }

        /**
         * Gets the value of the sigtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGTYPE() {
            return sigtype;
        }

        /**
         * Sets the value of the sigtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGTYPE(String value) {
            this.sigtype = value;
        }

        /**
         * Gets the value of the approvlimit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAPPROVLIMIT() {
            return approvlimit;
        }

        /**
         * Sets the value of the approvlimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAPPROVLIMIT(BigDecimal value) {
            this.approvlimit = value;
        }

        /**
         * Gets the value of the signame property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGNAME() {
            return signame;
        }

        /**
         * Sets the value of the signame property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGNAME(String value) {
            this.signame = value;
        }

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
