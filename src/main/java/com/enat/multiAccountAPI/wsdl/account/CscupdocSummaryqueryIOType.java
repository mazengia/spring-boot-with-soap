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
 * <p>Java class for Cscupdoc-Summaryquery-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cscupdoc-Summaryquery-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KEY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNCTION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cscupdoc-Summaryquery-IO-Type", propOrder = {
    "keyid",
    "functionid"
})
public class CscupdocSummaryqueryIOType {

    @XmlElement(name = "KEY_ID")
    protected String keyid;
    @XmlElement(name = "FUNCTION_ID")
    protected String functionid;

    /**
     * Gets the value of the keyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEYID() {
        return keyid;
    }

    /**
     * Sets the value of the keyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEYID(String value) {
        this.keyid = value;
    }

    /**
     * Gets the value of the functionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNCTIONID() {
        return functionid;
    }

    /**
     * Sets the value of the functionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNCTIONID(String value) {
        this.functionid = value;
    }

}
