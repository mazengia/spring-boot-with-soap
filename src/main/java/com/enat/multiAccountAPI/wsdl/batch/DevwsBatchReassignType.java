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
import java.math.BigInteger;


/**
 * <p>Java class for Devws_Batch_ReassignType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Devws_Batch_ReassignType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BATNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DESCRIP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TYP" type="{http://fcubs.ofss.com/service/FCUBSDEService}TypTypeBT"/&gt;
 *         &lt;element name="LASOPID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LASAUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LASOPDT" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="LASAUDT" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="LOK" type="{http://fcubs.ofss.com/service/FCUBSDEService}LocTypeBT"/&gt;
 *         &lt;element name="CRNO" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DRCHKTOT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CRCHKTOT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DRENTTOT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CRENTTOT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AUSTAT" type="{http://fcubs.ofss.com/service/FCUBSDEService}AustatTypeBT"/&gt;
 *         &lt;element name="UPLOD" type="{http://fcubs.ofss.com/service/FCUBSDEService}UplodTypeBT"/&gt;
 *         &lt;element name="BALAN" type="{http://fcubs.ofss.com/service/FCUBSDEService}BalanTypeBT"/&gt;
 *         &lt;element name="SYSBAT" type="{http://fcubs.ofss.com/service/FCUBSDEService}SysbatTypeBT"/&gt;
 *         &lt;element name="POSREQ" type="{http://fcubs.ofss.com/service/FCUBSDEService}PosreqTypeBT"/&gt;
 *         &lt;element name="DELSTAT" type="{http://fcubs.ofss.com/service/FCUBSDEService}DelstatTypeBT"/&gt;
 *         &lt;element name="ASSID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Devws_Batch_ReassignType", propOrder = {
    "brn",
    "batno",
    "descrip",
    "typ",
    "lasopid",
    "lasauid",
    "lasopdt",
    "lasaudt",
    "lok",
    "crno",
    "drchktot",
    "crchktot",
    "drenttot",
    "crenttot",
    "austat",
    "uplod",
    "balan",
    "sysbat",
    "posreq",
    "delstat",
    "assid"
})
public class DevwsBatchReassignType {

    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "BATNO", required = true)
    protected String batno;
    @XmlElement(name = "DESCRIP", required = true)
    protected String descrip;
    @XmlElement(name = "TYP", required = true)
    @XmlSchemaType(name = "string")
    protected TypTypeBT typ;
    @XmlElement(name = "LASOPID", required = true)
    protected String lasopid;
    @XmlElement(name = "LASAUID", required = true)
    protected String lasauid;
    @XmlElement(name = "LASOPDT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lasopdt;
    @XmlElement(name = "LASAUDT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lasaudt;
    @XmlElement(name = "LOK", required = true)
    @XmlSchemaType(name = "string")
    protected LocTypeBT lok;
    @XmlElement(name = "CRNO", required = true)
    protected BigInteger crno;
    @XmlElement(name = "DRCHKTOT", required = true)
    protected BigDecimal drchktot;
    @XmlElement(name = "CRCHKTOT", required = true)
    protected BigDecimal crchktot;
    @XmlElement(name = "DRENTTOT", required = true)
    protected BigDecimal drenttot;
    @XmlElement(name = "CRENTTOT", required = true)
    protected BigDecimal crenttot;
    @XmlElement(name = "AUSTAT", required = true)
    @XmlSchemaType(name = "string")
    protected AustatTypeBT austat;
    @XmlElement(name = "UPLOD", required = true)
    @XmlSchemaType(name = "string")
    protected UplodTypeBT uplod;
    @XmlElement(name = "BALAN", required = true)
    @XmlSchemaType(name = "string")
    protected BalanTypeBT balan;
    @XmlElement(name = "SYSBAT", required = true)
    @XmlSchemaType(name = "string")
    protected SysbatTypeBT sysbat;
    @XmlElement(name = "POSREQ", required = true)
    @XmlSchemaType(name = "string")
    protected PosreqTypeBT posreq;
    @XmlElement(name = "DELSTAT", required = true)
    @XmlSchemaType(name = "string")
    protected DelstatTypeBT delstat;
    @XmlElement(name = "ASSID", required = true)
    protected String assid;

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
     * Gets the value of the batno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATNO() {
        return batno;
    }

    /**
     * Sets the value of the batno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATNO(String value) {
        this.batno = value;
    }

    /**
     * Gets the value of the descrip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIP() {
        return descrip;
    }

    /**
     * Sets the value of the descrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIP(String value) {
        this.descrip = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link TypTypeBT }
     *     
     */
    public TypTypeBT getTYP() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypTypeBT }
     *     
     */
    public void setTYP(TypTypeBT value) {
        this.typ = value;
    }

    /**
     * Gets the value of the lasopid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASOPID() {
        return lasopid;
    }

    /**
     * Sets the value of the lasopid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASOPID(String value) {
        this.lasopid = value;
    }

    /**
     * Gets the value of the lasauid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASAUID() {
        return lasauid;
    }

    /**
     * Sets the value of the lasauid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASAUID(String value) {
        this.lasauid = value;
    }

    /**
     * Gets the value of the lasopdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASOPDT() {
        return lasopdt;
    }

    /**
     * Sets the value of the lasopdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASOPDT(XMLGregorianCalendar value) {
        this.lasopdt = value;
    }

    /**
     * Gets the value of the lasaudt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASAUDT() {
        return lasaudt;
    }

    /**
     * Sets the value of the lasaudt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASAUDT(XMLGregorianCalendar value) {
        this.lasaudt = value;
    }

    /**
     * Gets the value of the lok property.
     * 
     * @return
     *     possible object is
     *     {@link LocTypeBT }
     *     
     */
    public LocTypeBT getLOK() {
        return lok;
    }

    /**
     * Sets the value of the lok property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocTypeBT }
     *     
     */
    public void setLOK(LocTypeBT value) {
        this.lok = value;
    }

    /**
     * Gets the value of the crno property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCRNO() {
        return crno;
    }

    /**
     * Sets the value of the crno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCRNO(BigInteger value) {
        this.crno = value;
    }

    /**
     * Gets the value of the drchktot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRCHKTOT() {
        return drchktot;
    }

    /**
     * Sets the value of the drchktot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRCHKTOT(BigDecimal value) {
        this.drchktot = value;
    }

    /**
     * Gets the value of the crchktot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRCHKTOT() {
        return crchktot;
    }

    /**
     * Sets the value of the crchktot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRCHKTOT(BigDecimal value) {
        this.crchktot = value;
    }

    /**
     * Gets the value of the drenttot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRENTTOT() {
        return drenttot;
    }

    /**
     * Sets the value of the drenttot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRENTTOT(BigDecimal value) {
        this.drenttot = value;
    }

    /**
     * Gets the value of the crenttot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRENTTOT() {
        return crenttot;
    }

    /**
     * Sets the value of the crenttot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRENTTOT(BigDecimal value) {
        this.crenttot = value;
    }

    /**
     * Gets the value of the austat property.
     * 
     * @return
     *     possible object is
     *     {@link AustatTypeBT }
     *     
     */
    public AustatTypeBT getAUSTAT() {
        return austat;
    }

    /**
     * Sets the value of the austat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustatTypeBT }
     *     
     */
    public void setAUSTAT(AustatTypeBT value) {
        this.austat = value;
    }

    /**
     * Gets the value of the uplod property.
     * 
     * @return
     *     possible object is
     *     {@link UplodTypeBT }
     *     
     */
    public UplodTypeBT getUPLOD() {
        return uplod;
    }

    /**
     * Sets the value of the uplod property.
     * 
     * @param value
     *     allowed object is
     *     {@link UplodTypeBT }
     *     
     */
    public void setUPLOD(UplodTypeBT value) {
        this.uplod = value;
    }

    /**
     * Gets the value of the balan property.
     * 
     * @return
     *     possible object is
     *     {@link BalanTypeBT }
     *     
     */
    public BalanTypeBT getBALAN() {
        return balan;
    }

    /**
     * Sets the value of the balan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanTypeBT }
     *     
     */
    public void setBALAN(BalanTypeBT value) {
        this.balan = value;
    }

    /**
     * Gets the value of the sysbat property.
     * 
     * @return
     *     possible object is
     *     {@link SysbatTypeBT }
     *     
     */
    public SysbatTypeBT getSYSBAT() {
        return sysbat;
    }

    /**
     * Sets the value of the sysbat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SysbatTypeBT }
     *     
     */
    public void setSYSBAT(SysbatTypeBT value) {
        this.sysbat = value;
    }

    /**
     * Gets the value of the posreq property.
     * 
     * @return
     *     possible object is
     *     {@link PosreqTypeBT }
     *     
     */
    public PosreqTypeBT getPOSREQ() {
        return posreq;
    }

    /**
     * Sets the value of the posreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosreqTypeBT }
     *     
     */
    public void setPOSREQ(PosreqTypeBT value) {
        this.posreq = value;
    }

    /**
     * Gets the value of the delstat property.
     * 
     * @return
     *     possible object is
     *     {@link DelstatTypeBT }
     *     
     */
    public DelstatTypeBT getDELSTAT() {
        return delstat;
    }

    /**
     * Sets the value of the delstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelstatTypeBT }
     *     
     */
    public void setDELSTAT(DelstatTypeBT value) {
        this.delstat = value;
    }

    /**
     * Gets the value of the assid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSID() {
        return assid;
    }

    /**
     * Sets the value of the assid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSID(String value) {
        this.assid = value;
    }

}
