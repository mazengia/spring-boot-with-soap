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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Devws_batch_masterType2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Devws_batch_masterType2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BATCH_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TYPE" type="{http://fcubs.ofss.com/service/FCUBSDEService}TypType4" minOccurs="0"/&gt;
 *         &lt;element name="LAST_OPER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAST_AUTH_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAST_OPER_DT_STAMP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LAST_AUTH_DT_STAMP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LOCKED" type="{http://fcubs.ofss.com/service/FCUBSDEService}LocType4" minOccurs="0"/&gt;
 *         &lt;element name="CURR_NO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DR_CHK_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CR_CHK_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DR_ENT_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CR_ENT_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AUTH_STAT" type="{http://fcubs.ofss.com/service/FCUBSDEService}AustatType1" minOccurs="0"/&gt;
 *         &lt;element name="UPLOADED" type="{http://fcubs.ofss.com/service/FCUBSDEService}UplodType4" minOccurs="0"/&gt;
 *         &lt;element name="BALANCING" type="{http://fcubs.ofss.com/service/FCUBSDEService}BalanType1"/&gt;
 *         &lt;element name="SYSTEM_BATCH" type="{http://fcubs.ofss.com/service/FCUBSDEService}SysbatType2" minOccurs="0"/&gt;
 *         &lt;element name="POSITION_REQD" type="{http://fcubs.ofss.com/service/FCUBSDEService}PosreqType2" minOccurs="0"/&gt;
 *         &lt;element name="DELETE_STAT" type="{http://fcubs.ofss.com/service/FCUBSDEService}DelstatType2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Devws_batch_masterType2", propOrder = {
    "branchcode",
    "batchno",
    "description",
    "type",
    "lastoperid",
    "lastauthid",
    "lastoperdtstamp",
    "lastauthdtstamp",
    "locked",
    "currno",
    "drchktotal",
    "crchktotal",
    "drenttotal",
    "crenttotal",
    "authstat",
    "uploaded",
    "balancing",
    "systembatch",
    "positionreqd",
    "deletestat"
})
public class DevwsBatchMasterType2 {

    @XmlElement(name = "BRANCH_CODE", required = true)
    protected String branchcode;
    @XmlElement(name = "BATCH_NO", required = true)
    protected String batchno;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "TYPE")
    @XmlSchemaType(name = "string")
    protected TypType4 type;
    @XmlElement(name = "LAST_OPER_ID")
    protected String lastoperid;
    @XmlElement(name = "LAST_AUTH_ID")
    protected String lastauthid;
    @XmlElement(name = "LAST_OPER_DT_STAMP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastoperdtstamp;
    @XmlElement(name = "LAST_AUTH_DT_STAMP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastauthdtstamp;
    @XmlElement(name = "LOCKED")
    @XmlSchemaType(name = "string")
    protected LocType4 locked;
    @XmlElement(name = "CURR_NO")
    protected BigInteger currno;
    @XmlElement(name = "DR_CHK_TOTAL", required = true)
    protected BigDecimal drchktotal;
    @XmlElement(name = "CR_CHK_TOTAL", required = true)
    protected BigDecimal crchktotal;
    @XmlElement(name = "DR_ENT_TOTAL")
    protected BigDecimal drenttotal;
    @XmlElement(name = "CR_ENT_TOTAL")
    protected BigDecimal crenttotal;
    @XmlElement(name = "AUTH_STAT")
    @XmlSchemaType(name = "string")
    protected AustatType1 authstat;
    @XmlElement(name = "UPLOADED")
    @XmlSchemaType(name = "string")
    protected UplodType4 uploaded;
    @XmlElement(name = "BALANCING", required = true)
    @XmlSchemaType(name = "string")
    protected BalanType1 balancing;
    @XmlElement(name = "SYSTEM_BATCH")
    @XmlSchemaType(name = "string")
    protected SysbatType2 systembatch;
    @XmlElement(name = "POSITION_REQD")
    @XmlSchemaType(name = "string")
    protected PosreqType2 positionreqd;
    @XmlElement(name = "DELETE_STAT")
    @XmlSchemaType(name = "string")
    protected DelstatType2 deletestat;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypType4 }
     *     
     */
    public TypType4 getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypType4 }
     *     
     */
    public void setTYPE(TypType4 value) {
        this.type = value;
    }

    /**
     * Gets the value of the lastoperid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTOPERID() {
        return lastoperid;
    }

    /**
     * Sets the value of the lastoperid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTOPERID(String value) {
        this.lastoperid = value;
    }

    /**
     * Gets the value of the lastauthid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTAUTHID() {
        return lastauthid;
    }

    /**
     * Sets the value of the lastauthid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTAUTHID(String value) {
        this.lastauthid = value;
    }

    /**
     * Gets the value of the lastoperdtstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTOPERDTSTAMP() {
        return lastoperdtstamp;
    }

    /**
     * Sets the value of the lastoperdtstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTOPERDTSTAMP(XMLGregorianCalendar value) {
        this.lastoperdtstamp = value;
    }

    /**
     * Gets the value of the lastauthdtstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTAUTHDTSTAMP() {
        return lastauthdtstamp;
    }

    /**
     * Sets the value of the lastauthdtstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTAUTHDTSTAMP(XMLGregorianCalendar value) {
        this.lastauthdtstamp = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link LocType4 }
     *     
     */
    public LocType4 getLOCKED() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocType4 }
     *     
     */
    public void setLOCKED(LocType4 value) {
        this.locked = value;
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
     * Gets the value of the drchktotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRCHKTOTAL() {
        return drchktotal;
    }

    /**
     * Sets the value of the drchktotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRCHKTOTAL(BigDecimal value) {
        this.drchktotal = value;
    }

    /**
     * Gets the value of the crchktotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRCHKTOTAL() {
        return crchktotal;
    }

    /**
     * Sets the value of the crchktotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRCHKTOTAL(BigDecimal value) {
        this.crchktotal = value;
    }

    /**
     * Gets the value of the drenttotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRENTTOTAL() {
        return drenttotal;
    }

    /**
     * Sets the value of the drenttotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRENTTOTAL(BigDecimal value) {
        this.drenttotal = value;
    }

    /**
     * Gets the value of the crenttotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRENTTOTAL() {
        return crenttotal;
    }

    /**
     * Sets the value of the crenttotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRENTTOTAL(BigDecimal value) {
        this.crenttotal = value;
    }

    /**
     * Gets the value of the authstat property.
     * 
     * @return
     *     possible object is
     *     {@link AustatType1 }
     *     
     */
    public AustatType1 getAUTHSTAT() {
        return authstat;
    }

    /**
     * Sets the value of the authstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustatType1 }
     *     
     */
    public void setAUTHSTAT(AustatType1 value) {
        this.authstat = value;
    }

    /**
     * Gets the value of the uploaded property.
     * 
     * @return
     *     possible object is
     *     {@link UplodType4 }
     *     
     */
    public UplodType4 getUPLOADED() {
        return uploaded;
    }

    /**
     * Sets the value of the uploaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link UplodType4 }
     *     
     */
    public void setUPLOADED(UplodType4 value) {
        this.uploaded = value;
    }

    /**
     * Gets the value of the balancing property.
     * 
     * @return
     *     possible object is
     *     {@link BalanType1 }
     *     
     */
    public BalanType1 getBALANCING() {
        return balancing;
    }

    /**
     * Sets the value of the balancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanType1 }
     *     
     */
    public void setBALANCING(BalanType1 value) {
        this.balancing = value;
    }

    /**
     * Gets the value of the systembatch property.
     * 
     * @return
     *     possible object is
     *     {@link SysbatType2 }
     *     
     */
    public SysbatType2 getSYSTEMBATCH() {
        return systembatch;
    }

    /**
     * Sets the value of the systembatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SysbatType2 }
     *     
     */
    public void setSYSTEMBATCH(SysbatType2 value) {
        this.systembatch = value;
    }

    /**
     * Gets the value of the positionreqd property.
     * 
     * @return
     *     possible object is
     *     {@link PosreqType2 }
     *     
     */
    public PosreqType2 getPOSITIONREQD() {
        return positionreqd;
    }

    /**
     * Sets the value of the positionreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosreqType2 }
     *     
     */
    public void setPOSITIONREQD(PosreqType2 value) {
        this.positionreqd = value;
    }

    /**
     * Gets the value of the deletestat property.
     * 
     * @return
     *     possible object is
     *     {@link DelstatType2 }
     *     
     */
    public DelstatType2 getDELETESTAT() {
        return deletestat;
    }

    /**
     * Sets the value of the deletestat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelstatType2 }
     *     
     */
    public void setDELETESTAT(DelstatType2 value) {
        this.deletestat = value;
    }

}
