//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.29 at 09:34:55 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.batch;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DEMultiOffset-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEMultiOffset-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DE_FUND_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_CURRNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DE_ACCNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DE_CCY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DE_TOTOFFSET_AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_MAIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DE_OFFSET" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DE_VALUE_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DE_DR_CR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DE_EXCH_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DE_INSTRUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_ADDL_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_TEMPL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mltoffsetdetail" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DE_INSTRUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DE_ACCNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="DE_BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Devws-Batch-Master-1" type="{http://fcubs.ofss.com/service/FCUBSDEService}Decbatop-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Acc-SVCSIGVR" type="{http://fcubs.ofss.com/service/FCUBSDEService}Accsigdetails-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="TXNUDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSDEService}TXNUDFDETAILSType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Misdetails" type="{http://fcubs.ofss.com/service/FCUBSDEService}TxnMIS-Create-IO-Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEMultiOffset-Create-IO-Type", propOrder = {
    "defundid",
    "derefno",
    "decurrno",
    "deaccno",
    "deccycd",
    "detotoffsetamt",
    "demain",
    "deoffset",
    "devaluedate",
    "dedrcr",
    "deamount",
    "deexchrate",
    "deinstrumentnumber",
    "deaddltext",
    "detemplid",
    "mltoffsetdetail",
    "devwsBatchMaster1",
    "accSVCSIGVR",
    "txnudfdetails",
    "misdetails"
})
public class DEMultiOffsetCreateIOType {

    @XmlElement(name = "DE_FUND_ID")
    protected String defundid;
    @XmlElement(name = "DE_REF_NO")
    protected String derefno;
    @XmlElement(name = "DE_CURRNO")
    protected BigDecimal decurrno;
    @XmlElement(name = "DE_ACCNO", required = true)
    protected String deaccno;
    @XmlElement(name = "DE_CCY_CD", required = true)
    protected String deccycd;
    @XmlElement(name = "DE_TOTOFFSET_AMT")
    protected String detotoffsetamt;
    @XmlElement(name = "DE_MAIN", required = true)
    protected String demain;
    @XmlElement(name = "DE_OFFSET", required = true)
    protected String deoffset;
    @XmlElement(name = "DE_VALUE_DATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar devaluedate;
    @XmlElement(name = "DE_DR_CR")
    protected String dedrcr;
    @XmlElement(name = "DE_AMOUNT", required = true)
    protected BigDecimal deamount;
    @XmlElement(name = "DE_EXCH_RATE")
    protected BigDecimal deexchrate;
    @XmlElement(name = "DE_INSTRUMENT_NUMBER")
    protected String deinstrumentnumber;
    @XmlElement(name = "DE_ADDL_TEXT")
    protected String deaddltext;
    @XmlElement(name = "DE_TEMPL_ID")
    protected String detemplid;
    @XmlElement(name = "Mltoffsetdetail", required = true)
    protected List<DEMultiOffsetCreateIOType.Mltoffsetdetail> mltoffsetdetail;
    @XmlElement(name = "Devws-Batch-Master-1")
    protected DecbatopCreateIOType devwsBatchMaster1;
    @XmlElement(name = "Acc-SVCSIGVR")
    protected AccsigdetailsCreateIOType accSVCSIGVR;
    @XmlElement(name = "TXNUDFDETAILS")
    protected List<TXNUDFDETAILSType> txnudfdetails;
    @XmlElement(name = "Misdetails")
    protected TxnMISCreateIOType misdetails;

    /**
     * Gets the value of the defundid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFUNDID() {
        return defundid;
    }

    /**
     * Sets the value of the defundid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFUNDID(String value) {
        this.defundid = value;
    }

    /**
     * Gets the value of the derefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEREFNO() {
        return derefno;
    }

    /**
     * Sets the value of the derefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEREFNO(String value) {
        this.derefno = value;
    }

    /**
     * Gets the value of the decurrno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDECURRNO() {
        return decurrno;
    }

    /**
     * Sets the value of the decurrno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDECURRNO(BigDecimal value) {
        this.decurrno = value;
    }

    /**
     * Gets the value of the deaccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEACCNO() {
        return deaccno;
    }

    /**
     * Sets the value of the deaccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEACCNO(String value) {
        this.deaccno = value;
    }

    /**
     * Gets the value of the deccycd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDECCYCD() {
        return deccycd;
    }

    /**
     * Sets the value of the deccycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDECCYCD(String value) {
        this.deccycd = value;
    }

    /**
     * Gets the value of the detotoffsetamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDETOTOFFSETAMT() {
        return detotoffsetamt;
    }

    /**
     * Sets the value of the detotoffsetamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDETOTOFFSETAMT(String value) {
        this.detotoffsetamt = value;
    }

    /**
     * Gets the value of the demain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEMAIN() {
        return demain;
    }

    /**
     * Sets the value of the demain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEMAIN(String value) {
        this.demain = value;
    }

    /**
     * Gets the value of the deoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEOFFSET() {
        return deoffset;
    }

    /**
     * Sets the value of the deoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEOFFSET(String value) {
        this.deoffset = value;
    }

    /**
     * Gets the value of the devaluedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDEVALUEDATE() {
        return devaluedate;
    }

    /**
     * Sets the value of the devaluedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDEVALUEDATE(XMLGregorianCalendar value) {
        this.devaluedate = value;
    }

    /**
     * Gets the value of the dedrcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEDRCR() {
        return dedrcr;
    }

    /**
     * Sets the value of the dedrcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEDRCR(String value) {
        this.dedrcr = value;
    }

    /**
     * Gets the value of the deamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDEAMOUNT() {
        return deamount;
    }

    /**
     * Sets the value of the deamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDEAMOUNT(BigDecimal value) {
        this.deamount = value;
    }

    /**
     * Gets the value of the deexchrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDEEXCHRATE() {
        return deexchrate;
    }

    /**
     * Sets the value of the deexchrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDEEXCHRATE(BigDecimal value) {
        this.deexchrate = value;
    }

    /**
     * Gets the value of the deinstrumentnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEINSTRUMENTNUMBER() {
        return deinstrumentnumber;
    }

    /**
     * Sets the value of the deinstrumentnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEINSTRUMENTNUMBER(String value) {
        this.deinstrumentnumber = value;
    }

    /**
     * Gets the value of the deaddltext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEADDLTEXT() {
        return deaddltext;
    }

    /**
     * Sets the value of the deaddltext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEADDLTEXT(String value) {
        this.deaddltext = value;
    }

    /**
     * Gets the value of the detemplid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDETEMPLID() {
        return detemplid;
    }

    /**
     * Sets the value of the detemplid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDETEMPLID(String value) {
        this.detemplid = value;
    }

    /**
     * Gets the value of the mltoffsetdetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mltoffsetdetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMltoffsetdetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEMultiOffsetCreateIOType.Mltoffsetdetail }
     * 
     * 
     */
    public List<DEMultiOffsetCreateIOType.Mltoffsetdetail> getMltoffsetdetail() {
        if (mltoffsetdetail == null) {
            mltoffsetdetail = new ArrayList<DEMultiOffsetCreateIOType.Mltoffsetdetail>();
        }
        return this.mltoffsetdetail;
    }

    /**
     * Gets the value of the devwsBatchMaster1 property.
     * 
     * @return
     *     possible object is
     *     {@link DecbatopCreateIOType }
     *     
     */
    public DecbatopCreateIOType getDevwsBatchMaster1() {
        return devwsBatchMaster1;
    }

    /**
     * Sets the value of the devwsBatchMaster1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecbatopCreateIOType }
     *     
     */
    public void setDevwsBatchMaster1(DecbatopCreateIOType value) {
        this.devwsBatchMaster1 = value;
    }

    /**
     * Gets the value of the accSVCSIGVR property.
     * 
     * @return
     *     possible object is
     *     {@link AccsigdetailsCreateIOType }
     *     
     */
    public AccsigdetailsCreateIOType getAccSVCSIGVR() {
        return accSVCSIGVR;
    }

    /**
     * Sets the value of the accSVCSIGVR property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccsigdetailsCreateIOType }
     *     
     */
    public void setAccSVCSIGVR(AccsigdetailsCreateIOType value) {
        this.accSVCSIGVR = value;
    }

    /**
     * Gets the value of the txnudfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txnudfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTXNUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TXNUDFDETAILSType }
     * 
     * 
     */
    public List<TXNUDFDETAILSType> getTXNUDFDETAILS() {
        if (txnudfdetails == null) {
            txnudfdetails = new ArrayList<TXNUDFDETAILSType>();
        }
        return this.txnudfdetails;
    }

    /**
     * Gets the value of the misdetails property.
     * 
     * @return
     *     possible object is
     *     {@link TxnMISCreateIOType }
     *     
     */
    public TxnMISCreateIOType getMisdetails() {
        return misdetails;
    }

    /**
     * Sets the value of the misdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnMISCreateIOType }
     *     
     */
    public void setMisdetails(TxnMISCreateIOType value) {
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
     *         &lt;element name="DE_INSTRUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DE_ACCNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="DE_BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "deinstrumentnumber",
        "deaccno",
        "deamount",
        "debranchcode"
    })
    public static class Mltoffsetdetail {

        @XmlElement(name = "DE_INSTRUMENT_NUMBER")
        protected String deinstrumentnumber;
        @XmlElement(name = "DE_ACCNO", required = true)
        protected String deaccno;
        @XmlElement(name = "DE_AMOUNT", required = true)
        protected BigDecimal deamount;
        @XmlElement(name = "DE_BRANCH_CODE", required = true)
        protected String debranchcode;

        /**
         * Gets the value of the deinstrumentnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEINSTRUMENTNUMBER() {
            return deinstrumentnumber;
        }

        /**
         * Sets the value of the deinstrumentnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEINSTRUMENTNUMBER(String value) {
            this.deinstrumentnumber = value;
        }

        /**
         * Gets the value of the deaccno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEACCNO() {
            return deaccno;
        }

        /**
         * Sets the value of the deaccno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEACCNO(String value) {
            this.deaccno = value;
        }

        /**
         * Gets the value of the deamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDEAMOUNT() {
            return deamount;
        }

        /**
         * Sets the value of the deamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDEAMOUNT(BigDecimal value) {
            this.deamount = value;
        }

        /**
         * Gets the value of the debranchcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEBRANCHCODE() {
            return debranchcode;
        }

        /**
         * Sets the value of the debranchcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEBRANCHCODE(String value) {
            this.debranchcode = value;
        }

    }

}
