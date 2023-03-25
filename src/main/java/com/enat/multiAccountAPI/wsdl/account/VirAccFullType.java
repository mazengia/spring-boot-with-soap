//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:22:54 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.account;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for VirAcc-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirAcc-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ACCOUNT_BRN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMER_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VIRTUAL_CUST_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VIRTUAL_ACC_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VIRTUAL_ACC_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VIRTUAL_ACC_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VIRTUAL_ACC_OPEN_DT" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAST_CREDIT_ACT_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VIRTUAL_ACC_CLOSURE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VIRTUAL_ACC_CODE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACC_CURR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DEFACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHECKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TXNSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSAccService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirAcc-Full-Type", propOrder = {
    "acno",
    "accountbrn",
    "acdesc",
    "customernumber",
    "customername",
    "virtualcustid",
    "virtualacccode",
    "virtualaccnumber",
    "virtualaccname",
    "virtualaccopendt",
    "status",
    "lastcreditactdt",
    "virtualaccclosuredt",
    "virtualacccodedesc",
    "acccurr",
    "defacc",
    "maker",
    "makerstamp",
    "checker",
    "checkerstamp",
    "modno",
    "txnstat",
    "authstat",
    "udfdetails"
})
public class VirAccFullType {

    @XmlElement(name = "AC_NO", required = true)
    protected String acno;
    @XmlElement(name = "ACCOUNT_BRN", required = true)
    protected String accountbrn;
    @XmlElement(name = "AC_DESC")
    protected String acdesc;
    @XmlElement(name = "CUSTOMER_NUMBER")
    protected String customernumber;
    @XmlElement(name = "CUSTOMER_NAME")
    protected String customername;
    @XmlElement(name = "VIRTUAL_CUST_ID")
    protected String virtualcustid;
    @XmlElement(name = "VIRTUAL_ACC_CODE", required = true)
    protected String virtualacccode;
    @XmlElement(name = "VIRTUAL_ACC_NUMBER", required = true)
    protected String virtualaccnumber;
    @XmlElement(name = "VIRTUAL_ACC_NAME", required = true)
    protected String virtualaccname;
    @XmlElement(name = "VIRTUAL_ACC_OPEN_DT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar virtualaccopendt;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "LAST_CREDIT_ACT_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastcreditactdt;
    @XmlElement(name = "VIRTUAL_ACC_CLOSURE_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar virtualaccclosuredt;
    @XmlElement(name = "VIRTUAL_ACC_CODE_DESC")
    protected String virtualacccodedesc;
    @XmlElement(name = "ACC_CURR", required = true)
    protected String acccurr;
    @XmlElement(name = "DEFACC")
    protected String defacc;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "CHECKER")
    protected String checker;
    @XmlElement(name = "CHECKERSTAMP")
    protected String checkerstamp;
    @XmlElement(name = "MODNO")
    protected BigDecimal modno;
    @XmlElement(name = "TXNSTAT")
    protected String txnstat;
    @XmlElement(name = "AUTHSTAT")
    protected String authstat;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;

    /**
     * Gets the value of the acno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACNO() {
        return acno;
    }

    /**
     * Sets the value of the acno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACNO(String value) {
        this.acno = value;
    }

    /**
     * Gets the value of the accountbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTBRN() {
        return accountbrn;
    }

    /**
     * Sets the value of the accountbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTBRN(String value) {
        this.accountbrn = value;
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
     * Gets the value of the customernumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNUMBER() {
        return customernumber;
    }

    /**
     * Sets the value of the customernumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNUMBER(String value) {
        this.customernumber = value;
    }

    /**
     * Gets the value of the customername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNAME() {
        return customername;
    }

    /**
     * Sets the value of the customername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNAME(String value) {
        this.customername = value;
    }

    /**
     * Gets the value of the virtualcustid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIRTUALCUSTID() {
        return virtualcustid;
    }

    /**
     * Sets the value of the virtualcustid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIRTUALCUSTID(String value) {
        this.virtualcustid = value;
    }

    /**
     * Gets the value of the virtualacccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIRTUALACCCODE() {
        return virtualacccode;
    }

    /**
     * Sets the value of the virtualacccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIRTUALACCCODE(String value) {
        this.virtualacccode = value;
    }

    /**
     * Gets the value of the virtualaccnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIRTUALACCNUMBER() {
        return virtualaccnumber;
    }

    /**
     * Sets the value of the virtualaccnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIRTUALACCNUMBER(String value) {
        this.virtualaccnumber = value;
    }

    /**
     * Gets the value of the virtualaccname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIRTUALACCNAME() {
        return virtualaccname;
    }

    /**
     * Sets the value of the virtualaccname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIRTUALACCNAME(String value) {
        this.virtualaccname = value;
    }

    /**
     * Gets the value of the virtualaccopendt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVIRTUALACCOPENDT() {
        return virtualaccopendt;
    }

    /**
     * Sets the value of the virtualaccopendt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVIRTUALACCOPENDT(XMLGregorianCalendar value) {
        this.virtualaccopendt = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the lastcreditactdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTCREDITACTDT() {
        return lastcreditactdt;
    }

    /**
     * Sets the value of the lastcreditactdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTCREDITACTDT(XMLGregorianCalendar value) {
        this.lastcreditactdt = value;
    }

    /**
     * Gets the value of the virtualaccclosuredt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVIRTUALACCCLOSUREDT() {
        return virtualaccclosuredt;
    }

    /**
     * Sets the value of the virtualaccclosuredt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVIRTUALACCCLOSUREDT(XMLGregorianCalendar value) {
        this.virtualaccclosuredt = value;
    }

    /**
     * Gets the value of the virtualacccodedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIRTUALACCCODEDESC() {
        return virtualacccodedesc;
    }

    /**
     * Sets the value of the virtualacccodedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIRTUALACCCODEDESC(String value) {
        this.virtualacccodedesc = value;
    }

    /**
     * Gets the value of the acccurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCCURR() {
        return acccurr;
    }

    /**
     * Sets the value of the acccurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCCURR(String value) {
        this.acccurr = value;
    }

    /**
     * Gets the value of the defacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFACC() {
        return defacc;
    }

    /**
     * Sets the value of the defacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFACC(String value) {
        this.defacc = value;
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
     * Gets the value of the checker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKER() {
        return checker;
    }

    /**
     * Sets the value of the checker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKER(String value) {
        this.checker = value;
    }

    /**
     * Gets the value of the checkerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKERSTAMP() {
        return checkerstamp;
    }

    /**
     * Sets the value of the checkerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKERSTAMP(String value) {
        this.checkerstamp = value;
    }

    /**
     * Gets the value of the modno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMODNO() {
        return modno;
    }

    /**
     * Sets the value of the modno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMODNO(BigDecimal value) {
        this.modno = value;
    }

    /**
     * Gets the value of the txnstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNSTAT() {
        return txnstat;
    }

    /**
     * Sets the value of the txnstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNSTAT(String value) {
        this.txnstat = value;
    }

    /**
     * Gets the value of the authstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHSTAT() {
        return authstat;
    }

    /**
     * Sets the value of the authstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHSTAT(String value) {
        this.authstat = value;
    }

    /**
     * Gets the value of the udfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType2 }
     * 
     * 
     */
    public List<UDFDETAILSType2> getUDFDETAILS() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<UDFDETAILSType2>();
        }
        return this.udfdetails;
    }

}
