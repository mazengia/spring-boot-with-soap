//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:22:54 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for TDCustAcc-Authorize-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDCustAcc-Authorize-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TERM_ACNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CHECKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Tod-Renew" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NXT_RENEW_LMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="RNW_UNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="RNW_FLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RNW_FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TDCustAcc-Authorize-IO-Type", propOrder = {
    "brn",
    "termacno",
    "checker",
    "checkerstamp",
    "modno",
    "todRenew"
})
public class TDCustAccAuthorizeIOType {

    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "TERM_ACNO", required = true)
    protected String termacno;
    @XmlElement(name = "CHECKER")
    protected String checker;
    @XmlElement(name = "CHECKERSTAMP")
    protected String checkerstamp;
    @XmlElement(name = "MODNO")
    protected BigDecimal modno;
    @XmlElement(name = "Tod-Renew")
    protected TDCustAccAuthorizeIOType.TodRenew todRenew;

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
     * Gets the value of the termacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTERMACNO() {
        return termacno;
    }

    /**
     * Sets the value of the termacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTERMACNO(String value) {
        this.termacno = value;
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
     * Gets the value of the todRenew property.
     * 
     * @return
     *     possible object is
     *     {@link TDCustAccAuthorizeIOType.TodRenew }
     *     
     */
    public TDCustAccAuthorizeIOType.TodRenew getTodRenew() {
        return todRenew;
    }

    /**
     * Sets the value of the todRenew property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDCustAccAuthorizeIOType.TodRenew }
     *     
     */
    public void setTodRenew(TDCustAccAuthorizeIOType.TodRenew value) {
        this.todRenew = value;
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
     *         &lt;element name="NXT_RENEW_LMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="RNW_UNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="RNW_FLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RNW_FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "nxtrenewlmt",
        "rnwunit",
        "rnwflg",
        "rnwfreq"
    })
    public static class TodRenew {

        @XmlElement(name = "NXT_RENEW_LMT")
        protected BigDecimal nxtrenewlmt;
        @XmlElement(name = "RNW_UNIT")
        protected BigDecimal rnwunit;
        @XmlElement(name = "RNW_FLG")
        protected String rnwflg;
        @XmlElement(name = "RNW_FREQ")
        protected String rnwfreq;

        /**
         * Gets the value of the nxtrenewlmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNXTRENEWLMT() {
            return nxtrenewlmt;
        }

        /**
         * Sets the value of the nxtrenewlmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNXTRENEWLMT(BigDecimal value) {
            this.nxtrenewlmt = value;
        }

        /**
         * Gets the value of the rnwunit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRNWUNIT() {
            return rnwunit;
        }

        /**
         * Sets the value of the rnwunit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRNWUNIT(BigDecimal value) {
            this.rnwunit = value;
        }

        /**
         * Gets the value of the rnwflg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRNWFLG() {
            return rnwflg;
        }

        /**
         * Sets the value of the rnwflg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRNWFLG(String value) {
            this.rnwflg = value;
        }

        /**
         * Gets the value of the rnwfreq property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRNWFREQ() {
            return rnwfreq;
        }

        /**
         * Sets the value of the rnwfreq property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRNWFREQ(String value) {
            this.rnwfreq = value;
        }

    }

}
