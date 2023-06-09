//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.29 at 09:34:44 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.account;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AccprdresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccprdresType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRTTXN" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/&gt;
 *         &lt;element name="CRTXN" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccprdresType", propOrder = {
    "prd",
    "prddesc",
    "drttxn",
    "crtxn"
})
public class AccprdresType {

    @XmlElement(name = "PRD", required = true)
    protected String prd;
    @XmlElement(name = "PRDDESC")
    protected String prddesc;
    @XmlElement(name = "DRTTXN")
    @XmlSchemaType(name = "string")
    protected YesNoType drttxn;
    @XmlElement(name = "CRTXN")
    @XmlSchemaType(name = "string")
    protected YesNoType crtxn;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRD() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRD(String value) {
        this.prd = value;
    }

    /**
     * Gets the value of the prddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDDESC() {
        return prddesc;
    }

    /**
     * Sets the value of the prddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDDESC(String value) {
        this.prddesc = value;
    }

    /**
     * Gets the value of the drttxn property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getDRTTXN() {
        return drttxn;
    }

    /**
     * Sets the value of the drttxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setDRTTXN(YesNoType value) {
        this.drttxn = value;
    }

    /**
     * Gets the value of the crtxn property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getCRTXN() {
        return crtxn;
    }

    /**
     * Sets the value of the crtxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setCRTXN(YesNoType value) {
        this.crtxn = value;
    }

}
