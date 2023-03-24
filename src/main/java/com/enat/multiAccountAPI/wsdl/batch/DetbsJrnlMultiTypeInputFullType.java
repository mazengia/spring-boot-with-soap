//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:22:59 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.batch;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Detbs_Jrnl_Multi_Type_InputFullType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Detbs_Jrnl_Multi_Type_InputFullType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BATCHNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CURRNO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TXNMAIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TXNOFFSET" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MKRID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VALUEDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/&gt;
 *         &lt;element name="DRCR" type="{http://fcubs.ofss.com/service/FCUBSDEService}DrcrType"/&gt;
 *         &lt;element name="BOKDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="EXRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="INSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKDTSTMP" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/&gt;
 *         &lt;element name="CHKID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHKDTSTMP" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="RECSTAT" type="{http://fcubs.ofss.com/service/FCUBSDEService}RecstatType" minOccurs="0"/&gt;
 *         &lt;element name="AUTHSTAT" type="{http://fcubs.ofss.com/service/FCUBSDEService}AuthstatusType" minOccurs="0"/&gt;
 *         &lt;element name="MISCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FNDREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDL_TXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TEMPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTALOFFAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHEQMAIN" type="{http://fcubs.ofss.com/service/FCUBSDEService}DelstatType4" minOccurs="0"/&gt;
 *         &lt;element name="CHEQOFFSET" type="{http://fcubs.ofss.com/service/FCUBSDEService}DelstatType4" minOccurs="0"/&gt;
 *         &lt;element name="FUND_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUBSYSTEMSTAT" type="{http://fcubs.ofss.com/service/FCUBSDEService}SubsystemstatType" minOccurs="0"/&gt;
 *         &lt;element name="Mlt-Offset-Detail" type="{http://fcubs.ofss.com/service/FCUBSDEService}Devws_mlt_offset_detailType"/&gt;
 *         &lt;element name="Batch-Master" type="{http://fcubs.ofss.com/service/FCUBSDEService}Devws_batch_masterType"/&gt;
 *         &lt;element name="Mis-Offset-Master" type="{http://fcubs.ofss.com/service/FCUBSDEService}Devws_multi_misType"/&gt;
 *         &lt;element name="Mis-Details" type="{http://fcubs.ofss.com/service/FCUBSDEService}MISDETAILSType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Detbs_Jrnl_Multi_Type_InputFullType", propOrder = {
    "fccref",
    "batchno",
    "currno",
    "account",
    "ccy",
    "txnmain",
    "txnoffset",
    "mkrid",
    "valuedt",
    "drcr",
    "bokdt",
    "brn",
    "amt",
    "exrate",
    "lcyamt",
    "instno",
    "makdtstmp",
    "chkid",
    "chkdtstmp",
    "recstat",
    "authstat",
    "miscode",
    "fndrefno",
    "accdesc",
    "addltxt",
    "tempid",
    "totaloffamt",
    "cheqmain",
    "cheqoffset",
    "fundid",
    "subsystemstat",
    "mltOffsetDetail",
    "batchMaster",
    "misOffsetMaster",
    "misDetails"
})
public class DetbsJrnlMultiTypeInputFullType {

    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "BATCHNO", required = true)
    protected String batchno;
    @XmlElement(name = "CURRNO")
    protected BigInteger currno;
    @XmlElement(name = "ACCOUNT", required = true)
    protected String account;
    @XmlElement(name = "CCY", required = true)
    protected String ccy;
    @XmlElement(name = "TXNMAIN", required = true)
    protected String txnmain;
    @XmlElement(name = "TXNOFFSET", required = true)
    protected String txnoffset;
    @XmlElement(name = "MKRID", required = true)
    protected String mkrid;
    @XmlElement(name = "VALUEDT", required = true)
    protected Object valuedt;
    @XmlElement(name = "DRCR", required = true)
    @XmlSchemaType(name = "string")
    protected DrcrType drcr;
    @XmlElement(name = "BOKDT")
    protected Object bokdt;
    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "AMT", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "EXRATE")
    protected BigDecimal exrate;
    @XmlElement(name = "LCYAMT")
    protected BigDecimal lcyamt;
    @XmlElement(name = "INSTNO")
    protected String instno;
    @XmlElement(name = "MAKDTSTMP", required = true)
    protected Object makdtstmp;
    @XmlElement(name = "CHKID")
    protected String chkid;
    @XmlElement(name = "CHKDTSTMP")
    protected Object chkdtstmp;
    @XmlElement(name = "RECSTAT")
    @XmlSchemaType(name = "string")
    protected RecstatType recstat;
    @XmlElement(name = "AUTHSTAT")
    @XmlSchemaType(name = "string")
    protected AuthstatusType authstat;
    @XmlElement(name = "MISCODE")
    protected String miscode;
    @XmlElement(name = "FNDREFNO")
    protected String fndrefno;
    @XmlElement(name = "ACCDESC")
    protected String accdesc;
    @XmlElement(name = "ADDL_TXT")
    protected String addltxt;
    @XmlElement(name = "TEMPID")
    protected String tempid;
    @XmlElement(name = "TOTALOFFAMT")
    protected String totaloffamt;
    @XmlElement(name = "CHEQMAIN")
    @XmlSchemaType(name = "string")
    protected DelstatType4 cheqmain;
    @XmlElement(name = "CHEQOFFSET")
    @XmlSchemaType(name = "string")
    protected DelstatType4 cheqoffset;
    @XmlElement(name = "FUND_ID")
    protected String fundid;
    @XmlElement(name = "SUBSYSTEMSTAT")
    @XmlSchemaType(name = "string")
    protected SubsystemstatType subsystemstat;
    @XmlElement(name = "Mlt-Offset-Detail", required = true)
    protected DevwsMltOffsetDetailType mltOffsetDetail;
    @XmlElement(name = "Batch-Master", required = true)
    protected DevwsBatchMasterType batchMaster;
    @XmlElement(name = "Mis-Offset-Master", required = true)
    protected DevwsMultiMisType misOffsetMaster;
    @XmlElement(name = "Mis-Details", required = true)
    protected MISDETAILSType misDetails;

    /**
     * Gets the value of the fccref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCCREF() {
        return fccref;
    }

    /**
     * Sets the value of the fccref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCCREF(String value) {
        this.fccref = value;
    }

    /**
     * Gets the value of the batchno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATCHNO() {
        return batchno;
    }

    /**
     * Sets the value of the batchno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATCHNO(String value) {
        this.batchno = value;
    }

    /**
     * Gets the value of the currno property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCURRNO() {
        return currno;
    }

    /**
     * Sets the value of the currno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCURRNO(BigInteger value) {
        this.currno = value;
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
     * Gets the value of the txnmain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNMAIN() {
        return txnmain;
    }

    /**
     * Sets the value of the txnmain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNMAIN(String value) {
        this.txnmain = value;
    }

    /**
     * Gets the value of the txnoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNOFFSET() {
        return txnoffset;
    }

    /**
     * Sets the value of the txnoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNOFFSET(String value) {
        this.txnoffset = value;
    }

    /**
     * Gets the value of the mkrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMKRID() {
        return mkrid;
    }

    /**
     * Sets the value of the mkrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMKRID(String value) {
        this.mkrid = value;
    }

    /**
     * Gets the value of the valuedt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVALUEDT() {
        return valuedt;
    }

    /**
     * Sets the value of the valuedt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVALUEDT(Object value) {
        this.valuedt = value;
    }

    /**
     * Gets the value of the drcr property.
     * 
     * @return
     *     possible object is
     *     {@link DrcrType }
     *     
     */
    public DrcrType getDRCR() {
        return drcr;
    }

    /**
     * Sets the value of the drcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrcrType }
     *     
     */
    public void setDRCR(DrcrType value) {
        this.drcr = value;
    }

    /**
     * Gets the value of the bokdt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBOKDT() {
        return bokdt;
    }

    /**
     * Sets the value of the bokdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBOKDT(Object value) {
        this.bokdt = value;
    }

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
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMT() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMT(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the exrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXRATE() {
        return exrate;
    }

    /**
     * Sets the value of the exrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXRATE(BigDecimal value) {
        this.exrate = value;
    }

    /**
     * Gets the value of the lcyamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYAMT() {
        return lcyamt;
    }

    /**
     * Sets the value of the lcyamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYAMT(BigDecimal value) {
        this.lcyamt = value;
    }

    /**
     * Gets the value of the instno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTNO() {
        return instno;
    }

    /**
     * Sets the value of the instno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTNO(String value) {
        this.instno = value;
    }

    /**
     * Gets the value of the makdtstmp property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMAKDTSTMP() {
        return makdtstmp;
    }

    /**
     * Sets the value of the makdtstmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMAKDTSTMP(Object value) {
        this.makdtstmp = value;
    }

    /**
     * Gets the value of the chkid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHKID() {
        return chkid;
    }

    /**
     * Sets the value of the chkid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHKID(String value) {
        this.chkid = value;
    }

    /**
     * Gets the value of the chkdtstmp property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCHKDTSTMP() {
        return chkdtstmp;
    }

    /**
     * Sets the value of the chkdtstmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCHKDTSTMP(Object value) {
        this.chkdtstmp = value;
    }

    /**
     * Gets the value of the recstat property.
     * 
     * @return
     *     possible object is
     *     {@link RecstatType }
     *     
     */
    public RecstatType getRECSTAT() {
        return recstat;
    }

    /**
     * Sets the value of the recstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecstatType }
     *     
     */
    public void setRECSTAT(RecstatType value) {
        this.recstat = value;
    }

    /**
     * Gets the value of the authstat property.
     * 
     * @return
     *     possible object is
     *     {@link AuthstatusType }
     *     
     */
    public AuthstatusType getAUTHSTAT() {
        return authstat;
    }

    /**
     * Sets the value of the authstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthstatusType }
     *     
     */
    public void setAUTHSTAT(AuthstatusType value) {
        this.authstat = value;
    }

    /**
     * Gets the value of the miscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISCODE() {
        return miscode;
    }

    /**
     * Sets the value of the miscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISCODE(String value) {
        this.miscode = value;
    }

    /**
     * Gets the value of the fndrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNDREFNO() {
        return fndrefno;
    }

    /**
     * Sets the value of the fndrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNDREFNO(String value) {
        this.fndrefno = value;
    }

    /**
     * Gets the value of the accdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCDESC() {
        return accdesc;
    }

    /**
     * Sets the value of the accdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCDESC(String value) {
        this.accdesc = value;
    }

    /**
     * Gets the value of the addltxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDLTXT() {
        return addltxt;
    }

    /**
     * Sets the value of the addltxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDLTXT(String value) {
        this.addltxt = value;
    }

    /**
     * Gets the value of the tempid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMPID() {
        return tempid;
    }

    /**
     * Sets the value of the tempid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMPID(String value) {
        this.tempid = value;
    }

    /**
     * Gets the value of the totaloffamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALOFFAMT() {
        return totaloffamt;
    }

    /**
     * Sets the value of the totaloffamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALOFFAMT(String value) {
        this.totaloffamt = value;
    }

    /**
     * Gets the value of the cheqmain property.
     * 
     * @return
     *     possible object is
     *     {@link DelstatType4 }
     *     
     */
    public DelstatType4 getCHEQMAIN() {
        return cheqmain;
    }

    /**
     * Sets the value of the cheqmain property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelstatType4 }
     *     
     */
    public void setCHEQMAIN(DelstatType4 value) {
        this.cheqmain = value;
    }

    /**
     * Gets the value of the cheqoffset property.
     * 
     * @return
     *     possible object is
     *     {@link DelstatType4 }
     *     
     */
    public DelstatType4 getCHEQOFFSET() {
        return cheqoffset;
    }

    /**
     * Sets the value of the cheqoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelstatType4 }
     *     
     */
    public void setCHEQOFFSET(DelstatType4 value) {
        this.cheqoffset = value;
    }

    /**
     * Gets the value of the fundid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDID() {
        return fundid;
    }

    /**
     * Sets the value of the fundid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDID(String value) {
        this.fundid = value;
    }

    /**
     * Gets the value of the subsystemstat property.
     * 
     * @return
     *     possible object is
     *     {@link SubsystemstatType }
     *     
     */
    public SubsystemstatType getSUBSYSTEMSTAT() {
        return subsystemstat;
    }

    /**
     * Sets the value of the subsystemstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsystemstatType }
     *     
     */
    public void setSUBSYSTEMSTAT(SubsystemstatType value) {
        this.subsystemstat = value;
    }

    /**
     * Gets the value of the mltOffsetDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DevwsMltOffsetDetailType }
     *     
     */
    public DevwsMltOffsetDetailType getMltOffsetDetail() {
        return mltOffsetDetail;
    }

    /**
     * Sets the value of the mltOffsetDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevwsMltOffsetDetailType }
     *     
     */
    public void setMltOffsetDetail(DevwsMltOffsetDetailType value) {
        this.mltOffsetDetail = value;
    }

    /**
     * Gets the value of the batchMaster property.
     * 
     * @return
     *     possible object is
     *     {@link DevwsBatchMasterType }
     *     
     */
    public DevwsBatchMasterType getBatchMaster() {
        return batchMaster;
    }

    /**
     * Sets the value of the batchMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevwsBatchMasterType }
     *     
     */
    public void setBatchMaster(DevwsBatchMasterType value) {
        this.batchMaster = value;
    }

    /**
     * Gets the value of the misOffsetMaster property.
     * 
     * @return
     *     possible object is
     *     {@link DevwsMultiMisType }
     *     
     */
    public DevwsMultiMisType getMisOffsetMaster() {
        return misOffsetMaster;
    }

    /**
     * Sets the value of the misOffsetMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevwsMultiMisType }
     *     
     */
    public void setMisOffsetMaster(DevwsMultiMisType value) {
        this.misOffsetMaster = value;
    }

    /**
     * Gets the value of the misDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MISDETAILSType }
     *     
     */
    public MISDETAILSType getMisDetails() {
        return misDetails;
    }

    /**
     * Sets the value of the misDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISDETAILSType }
     *     
     */
    public void setMisDetails(MISDETAILSType value) {
        this.misDetails = value;
    }

}
