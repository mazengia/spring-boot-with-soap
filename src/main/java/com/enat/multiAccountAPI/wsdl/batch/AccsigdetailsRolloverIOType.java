//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:22:59 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.batch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Accsigdetails-Rollover-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accsigdetails-Rollover-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACBRN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACTNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accsigdetails-Rollover-IO-Type", propOrder = {
    "acbrn1",
    "actno"
})
public class AccsigdetailsRolloverIOType {

    @XmlElement(name = "ACBRN1")
    protected String acbrn1;
    @XmlElement(name = "ACTNO", required = true)
    protected String actno;

    /**
     * Gets the value of the acbrn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACBRN1() {
        return acbrn1;
    }

    /**
     * Sets the value of the acbrn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACBRN1(String value) {
        this.acbrn1 = value;
    }

    /**
     * Gets the value of the actno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTNO() {
        return actno;
    }

    /**
     * Sets the value of the actno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTNO(String value) {
        this.actno = value;
    }

}
