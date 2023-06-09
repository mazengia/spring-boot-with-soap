//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.29 at 09:34:44 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.account;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for IntsdeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntsdeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RATEFLAG" type="{http://fcubs.ofss.com/service/FCUBSAccService}RateFlgType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntsdeType", propOrder = {
    "udeid",
    "udevalue",
    "ratecode",
    "tdratecode",
    "rateflag"
})
public class IntsdeType {

    @XmlElement(name = "UDEID", required = true)
    protected String udeid;
    @XmlElement(name = "UDEVALUE")
    protected BigDecimal udevalue;
    @XmlElement(name = "RATECODE")
    protected String ratecode;
    @XmlElement(name = "TDRATECODE")
    protected String tdratecode;
    @XmlElement(name = "RATEFLAG")
    @XmlSchemaType(name = "string")
    protected RateFlgType rateflag;

    /**
     * Gets the value of the udeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDEID() {
        return udeid;
    }

    /**
     * Sets the value of the udeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDEID(String value) {
        this.udeid = value;
    }

    /**
     * Gets the value of the udevalue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUDEVALUE() {
        return udevalue;
    }

    /**
     * Sets the value of the udevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUDEVALUE(BigDecimal value) {
        this.udevalue = value;
    }

    /**
     * Gets the value of the ratecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATECODE() {
        return ratecode;
    }

    /**
     * Sets the value of the ratecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATECODE(String value) {
        this.ratecode = value;
    }

    /**
     * Gets the value of the tdratecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDRATECODE() {
        return tdratecode;
    }

    /**
     * Sets the value of the tdratecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDRATECODE(String value) {
        this.tdratecode = value;
    }

    /**
     * Gets the value of the rateflag property.
     * 
     * @return
     *     possible object is
     *     {@link RateFlgType }
     *     
     */
    public RateFlgType getRATEFLAG() {
        return rateflag;
    }

    /**
     * Sets the value of the rateflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFlgType }
     *     
     */
    public void setRATEFLAG(RateFlgType value) {
        this.rateflag = value;
    }

}
