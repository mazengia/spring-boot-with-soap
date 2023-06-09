//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.29 at 09:34:55 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.batch;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>Java class for Detbs_Multi_Auth_ovd_InputFullType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Detbs_Multi_Auth_ovd_InputFullType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ESQN" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OSQN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MDUL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ERRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PARAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONAUTHID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMRK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTHBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTHSTAMP" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="TXTSTAT" type="{http://fcubs.ofss.com/service/FCUBSDEService}TxtstatusType" minOccurs="0"/&gt;
 *         &lt;element name="OVDSTAT" type="{http://fcubs.ofss.com/service/FCUBSDEService}OvdstatusType" minOccurs="0"/&gt;
 *         &lt;element name="CONFIRM" type="{http://fcubs.ofss.com/service/FCUBSDEService}ConfirmedType" minOccurs="0"/&gt;
 *         &lt;element name="OVDREMRK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OVD_TXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXT_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONFREQD" type="{http://fcubs.ofss.com/service/FCUBSDEService}ConfreqdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Detbs_Multi_Auth_ovd_InputFullType", propOrder = {
    "fccref",
    "esqn",
    "osqn",
    "mdul",
    "errcd",
    "param",
    "onauthid",
    "remrk",
    "authby",
    "authstamp",
    "txtstat",
    "ovdstat",
    "confirm",
    "ovdremrk",
    "ovdtxt",
    "txtstatus",
    "confreqd"
})
public class DetbsMultiAuthOvdInputFullType {

    @XmlElement(name = "FCCREF", required = true)
    protected String fccref;
    @XmlElement(name = "ESQN", required = true)
    protected BigDecimal esqn;
    @XmlElement(name = "OSQN")
    protected BigInteger osqn;
    @XmlElement(name = "MDUL")
    protected String mdul;
    @XmlElement(name = "ERRCD")
    protected String errcd;
    @XmlElement(name = "PARAM")
    protected String param;
    @XmlElement(name = "ONAUTHID")
    protected String onauthid;
    @XmlElement(name = "REMRK")
    protected String remrk;
    @XmlElement(name = "AUTHBY")
    protected String authby;
    @XmlElement(name = "AUTHSTAMP")
    protected Object authstamp;
    @XmlElement(name = "TXTSTAT")
    @XmlSchemaType(name = "string")
    protected TxtstatusType txtstat;
    @XmlElement(name = "OVDSTAT")
    @XmlSchemaType(name = "string")
    protected OvdstatusType ovdstat;
    @XmlElement(name = "CONFIRM")
    @XmlSchemaType(name = "string")
    protected ConfirmedType confirm;
    @XmlElement(name = "OVDREMRK")
    protected String ovdremrk;
    @XmlElement(name = "OVD_TXT")
    protected String ovdtxt;
    @XmlElement(name = "TXT_STATUS")
    protected String txtstatus;
    @XmlElement(name = "CONFREQD")
    @XmlSchemaType(name = "string")
    protected ConfreqdType confreqd;

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
     * Gets the value of the esqn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getESQN() {
        return esqn;
    }

    /**
     * Sets the value of the esqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setESQN(BigDecimal value) {
        this.esqn = value;
    }

    /**
     * Gets the value of the osqn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOSQN() {
        return osqn;
    }

    /**
     * Sets the value of the osqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOSQN(BigInteger value) {
        this.osqn = value;
    }

    /**
     * Gets the value of the mdul property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDUL() {
        return mdul;
    }

    /**
     * Sets the value of the mdul property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDUL(String value) {
        this.mdul = value;
    }

    /**
     * Gets the value of the errcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRCD() {
        return errcd;
    }

    /**
     * Sets the value of the errcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRCD(String value) {
        this.errcd = value;
    }

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARAM() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARAM(String value) {
        this.param = value;
    }

    /**
     * Gets the value of the onauthid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONAUTHID() {
        return onauthid;
    }

    /**
     * Sets the value of the onauthid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONAUTHID(String value) {
        this.onauthid = value;
    }

    /**
     * Gets the value of the remrk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMRK() {
        return remrk;
    }

    /**
     * Sets the value of the remrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMRK(String value) {
        this.remrk = value;
    }

    /**
     * Gets the value of the authby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHBY() {
        return authby;
    }

    /**
     * Sets the value of the authby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHBY(String value) {
        this.authby = value;
    }

    /**
     * Gets the value of the authstamp property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAUTHSTAMP() {
        return authstamp;
    }

    /**
     * Sets the value of the authstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAUTHSTAMP(Object value) {
        this.authstamp = value;
    }

    /**
     * Gets the value of the txtstat property.
     * 
     * @return
     *     possible object is
     *     {@link TxtstatusType }
     *     
     */
    public TxtstatusType getTXTSTAT() {
        return txtstat;
    }

    /**
     * Sets the value of the txtstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxtstatusType }
     *     
     */
    public void setTXTSTAT(TxtstatusType value) {
        this.txtstat = value;
    }

    /**
     * Gets the value of the ovdstat property.
     * 
     * @return
     *     possible object is
     *     {@link OvdstatusType }
     *     
     */
    public OvdstatusType getOVDSTAT() {
        return ovdstat;
    }

    /**
     * Sets the value of the ovdstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvdstatusType }
     *     
     */
    public void setOVDSTAT(OvdstatusType value) {
        this.ovdstat = value;
    }

    /**
     * Gets the value of the confirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmedType }
     *     
     */
    public ConfirmedType getCONFIRM() {
        return confirm;
    }

    /**
     * Sets the value of the confirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmedType }
     *     
     */
    public void setCONFIRM(ConfirmedType value) {
        this.confirm = value;
    }

    /**
     * Gets the value of the ovdremrk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVDREMRK() {
        return ovdremrk;
    }

    /**
     * Sets the value of the ovdremrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVDREMRK(String value) {
        this.ovdremrk = value;
    }

    /**
     * Gets the value of the ovdtxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVDTXT() {
        return ovdtxt;
    }

    /**
     * Sets the value of the ovdtxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVDTXT(String value) {
        this.ovdtxt = value;
    }

    /**
     * Gets the value of the txtstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXTSTATUS() {
        return txtstatus;
    }

    /**
     * Sets the value of the txtstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXTSTATUS(String value) {
        this.txtstatus = value;
    }

    /**
     * Gets the value of the confreqd property.
     * 
     * @return
     *     possible object is
     *     {@link ConfreqdType }
     *     
     */
    public ConfreqdType getCONFREQD() {
        return confreqd;
    }

    /**
     * Sets the value of the confreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfreqdType }
     *     
     */
    public void setCONFREQD(ConfreqdType value) {
        this.confreqd = value;
    }

}
