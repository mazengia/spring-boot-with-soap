//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 03:12:07 PM EAT 
//


package com.enat.multiAccountAPI.wsdl.batch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiJrnlBook-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiJrnlBook-Modify-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Detbs-Jrnl-Txn-Detail" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SERIAL_NO" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="DR_CR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACORGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TXN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTRUMENT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ADDL_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EXCH_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Misdetails" type="{http://fcubs.ofss.com/service/FCUBSDEService}TxnMIS-Modify-IO-Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiJrnlBook-Modify-IO-Type", propOrder = {
    "referenceno",
    "detbsJrnlTxnDetail",
    "misdetails"
})
public class MultiJrnlBookModifyIOType {

    @XmlElement(name = "REFERENCE_NO", required = true)
    protected String referenceno;
    @XmlElement(name = "Detbs-Jrnl-Txn-Detail")
    protected List<MultiJrnlBookModifyIOType.DetbsJrnlTxnDetail> detbsJrnlTxnDetail;
    @XmlElement(name = "Misdetails")
    protected TxnMISModifyIOType misdetails;

    /**
     * Gets the value of the referenceno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCENO() {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCENO(String value) {
        this.referenceno = value;
    }

    /**
     * Gets the value of the detbsJrnlTxnDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detbsJrnlTxnDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetbsJrnlTxnDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiJrnlBookModifyIOType.DetbsJrnlTxnDetail }
     * 
     * 
     */
    public List<MultiJrnlBookModifyIOType.DetbsJrnlTxnDetail> getDetbsJrnlTxnDetail() {
        if (detbsJrnlTxnDetail == null) {
            detbsJrnlTxnDetail = new ArrayList<MultiJrnlBookModifyIOType.DetbsJrnlTxnDetail>();
        }
        return this.detbsJrnlTxnDetail;
    }

    /**
     * Gets the value of the misdetails property.
     * 
     * @return
     *     possible object is
     *     {@link TxnMISModifyIOType }
     *     
     */
    public TxnMISModifyIOType getMisdetails() {
        return misdetails;
    }

    /**
     * Sets the value of the misdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnMISModifyIOType }
     *     
     */
    public void setMisdetails(TxnMISModifyIOType value) {
        this.misdetails = value;
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
     *         &lt;element name="SERIAL_NO" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="DR_CR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACORGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TXN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTRUMENT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ADDL_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EXCH_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "serialno",
        "drcr",
        "branchcode",
        "acorgl",
        "account",
        "amount",
        "ccy",
        "txncode",
        "instrumentno",
        "lcyamount",
        "addltext",
        "acdesc",
        "customer",
        "exchrate"
    })
    public static class DetbsJrnlTxnDetail {

        @XmlElement(name = "SERIAL_NO", required = true)
        protected BigDecimal serialno;
        @XmlElement(name = "DR_CR")
        protected String drcr;
        @XmlElement(name = "BRANCH_CODE")
        protected String branchcode;
        @XmlElement(name = "ACORGL")
        protected String acorgl;
        @XmlElement(name = "ACCOUNT")
        protected String account;
        @XmlElement(name = "AMOUNT")
        protected BigDecimal amount;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "TXN_CODE")
        protected String txncode;
        @XmlElement(name = "INSTRUMENT_NO")
        protected String instrumentno;
        @XmlElement(name = "LCY_AMOUNT")
        protected BigDecimal lcyamount;
        @XmlElement(name = "ADDL_TEXT")
        protected String addltext;
        @XmlElement(name = "ACDESC")
        protected String acdesc;
        @XmlElement(name = "CUSTOMER")
        protected String customer;
        @XmlElement(name = "EXCH_RATE")
        protected BigDecimal exchrate;

        /**
         * Gets the value of the serialno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSERIALNO() {
            return serialno;
        }

        /**
         * Sets the value of the serialno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSERIALNO(BigDecimal value) {
            this.serialno = value;
        }

        /**
         * Gets the value of the drcr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRCR() {
            return drcr;
        }

        /**
         * Sets the value of the drcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRCR(String value) {
            this.drcr = value;
        }

        /**
         * Gets the value of the branchcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRANCHCODE() {
            return branchcode;
        }

        /**
         * Sets the value of the branchcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRANCHCODE(String value) {
            this.branchcode = value;
        }

        /**
         * Gets the value of the acorgl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACORGL() {
            return acorgl;
        }

        /**
         * Sets the value of the acorgl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACORGL(String value) {
            this.acorgl = value;
        }

        /**
         * Gets the value of the account property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNT() {
            return account;
        }

        /**
         * Sets the value of the account property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNT(String value) {
            this.account = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
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
         * Gets the value of the txncode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNCODE() {
            return txncode;
        }

        /**
         * Sets the value of the txncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNCODE(String value) {
            this.txncode = value;
        }

        /**
         * Gets the value of the instrumentno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRUMENTNO() {
            return instrumentno;
        }

        /**
         * Sets the value of the instrumentno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRUMENTNO(String value) {
            this.instrumentno = value;
        }

        /**
         * Gets the value of the lcyamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYAMOUNT() {
            return lcyamount;
        }

        /**
         * Sets the value of the lcyamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYAMOUNT(BigDecimal value) {
            this.lcyamount = value;
        }

        /**
         * Gets the value of the addltext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDLTEXT() {
            return addltext;
        }

        /**
         * Sets the value of the addltext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDLTEXT(String value) {
            this.addltext = value;
        }

        /**
         * Gets the value of the acdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACDESC() {
            return acdesc;
        }

        /**
         * Sets the value of the acdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACDESC(String value) {
            this.acdesc = value;
        }

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMER() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMER(String value) {
            this.customer = value;
        }

        /**
         * Gets the value of the exchrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEXCHRATE() {
            return exchrate;
        }

        /**
         * Sets the value of the exchrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEXCHRATE(BigDecimal value) {
            this.exchrate = value;
        }

    }

}