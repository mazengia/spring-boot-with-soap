//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.29 at 09:34:55 AM EAT 
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
 * <p>Java class for DEDraftIssuerMaint-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEDraftIssuerMaint-Modify-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BANK_CODE1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="INSTRUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Detm-Mck-Issuer-Codes-Dtl" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DAO_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DAO_ACC_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MAX_PAYABLE_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "DEDraftIssuerMaint-Modify-IO-Type", propOrder = {
    "bankcode1",
    "ccy",
    "instrumenttype",
    "maker",
    "makerstamp",
    "detmMckIssuerCodesDtl"
})
public class DEDraftIssuerMaintModifyIOType {

    @XmlElement(name = "BANK_CODE1", required = true)
    protected String bankcode1;
    @XmlElement(name = "CCY", required = true)
    protected String ccy;
    @XmlElement(name = "INSTRUMENT_TYPE", required = true)
    protected String instrumenttype;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "Detm-Mck-Issuer-Codes-Dtl")
    protected List<DEDraftIssuerMaintModifyIOType.DetmMckIssuerCodesDtl> detmMckIssuerCodesDtl;

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

    /**
     * Gets the value of the maker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKER() {
        return maker;
    }

    /**
     * Sets the value of the maker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKER(String value) {
        this.maker = value;
    }

    /**
     * Gets the value of the makerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERSTAMP() {
        return makerstamp;
    }

    /**
     * Sets the value of the makerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERSTAMP(String value) {
        this.makerstamp = value;
    }

    /**
     * Gets the value of the detmMckIssuerCodesDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detmMckIssuerCodesDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetmMckIssuerCodesDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEDraftIssuerMaintModifyIOType.DetmMckIssuerCodesDtl }
     * 
     * 
     */
    public List<DEDraftIssuerMaintModifyIOType.DetmMckIssuerCodesDtl> getDetmMckIssuerCodesDtl() {
        if (detmMckIssuerCodesDtl == null) {
            detmMckIssuerCodesDtl = new ArrayList<DEDraftIssuerMaintModifyIOType.DetmMckIssuerCodesDtl>();
        }
        return this.detmMckIssuerCodesDtl;
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
     *         &lt;element name="DAO_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DAO_ACC_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MAX_PAYABLE_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "daoaccount",
        "daoaccbrn",
        "maxpayablelimit"
    })
    public static class DetmMckIssuerCodesDtl {

        @XmlElement(name = "DAO_ACCOUNT")
        protected String daoaccount;
        @XmlElement(name = "DAO_ACC_BRN")
        protected String daoaccbrn;
        @XmlElement(name = "MAX_PAYABLE_LIMIT")
        protected BigDecimal maxpayablelimit;

        /**
         * Gets the value of the daoaccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDAOACCOUNT() {
            return daoaccount;
        }

        /**
         * Sets the value of the daoaccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDAOACCOUNT(String value) {
            this.daoaccount = value;
        }

        /**
         * Gets the value of the daoaccbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDAOACCBRN() {
            return daoaccbrn;
        }

        /**
         * Sets the value of the daoaccbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDAOACCBRN(String value) {
            this.daoaccbrn = value;
        }

        /**
         * Gets the value of the maxpayablelimit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMAXPAYABLELIMIT() {
            return maxpayablelimit;
        }

        /**
         * Sets the value of the maxpayablelimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMAXPAYABLELIMIT(BigDecimal value) {
            this.maxpayablelimit = value;
        }

    }

}
