//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 03:11:59 PM EAT 
//


package com.enat.multiAccountAPI.wsdl.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthBICDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthBICDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BICCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BICDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthBICDetailsType", propOrder = {
    "biccode",
    "bicdesc"
})
public class AuthBICDetailsType {

    @XmlElement(name = "BICCODE", required = true)
    protected String biccode;
    @XmlElement(name = "BICDESC")
    protected String bicdesc;

    /**
     * Gets the value of the biccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICCODE() {
        return biccode;
    }

    /**
     * Sets the value of the biccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICCODE(String value) {
        this.biccode = value;
    }

    /**
     * Gets the value of the bicdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICDESC() {
        return bicdesc;
    }

    /**
     * Sets the value of the bicdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICDESC(String value) {
        this.bicdesc = value;
    }

}
