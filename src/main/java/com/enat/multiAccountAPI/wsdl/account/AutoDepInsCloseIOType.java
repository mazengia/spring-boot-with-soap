//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:22:54 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.account;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoDepIns-Close-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoDepIns-Close-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoDepIns-Close-IO-Type", propOrder = {
    "branchcode",
    "acno",
    "seqno",
    "maker",
    "makerstamp",
    "modno"
})
public class AutoDepInsCloseIOType {

    @XmlElement(name = "BRANCH_CODE", required = true)
    protected String branchcode;
    @XmlElement(name = "AC_NO", required = true)
    protected String acno;
    @XmlElement(name = "SEQ_NO", required = true)
    protected BigDecimal seqno;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "MODNO")
    protected BigDecimal modno;

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
     * Gets the value of the seqno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSEQNO() {
        return seqno;
    }

    /**
     * Sets the value of the seqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSEQNO(BigDecimal value) {
        this.seqno = value;
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

}
