//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 03:12:14 PM EAT 
//


package com.enat.multiAccountAPI.wsdl.chequepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APISubmitPaymentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APISubmitPaymentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubmitPaymentResponse" type="{https://www.fintech-group.com/services/Finpay}SubmitPaymentResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APISubmitPaymentResponse", propOrder = {
    "submitPaymentResponse"
})
public class APISubmitPaymentResponse {

    @XmlElement(name = "SubmitPaymentResponse")
    protected SubmitPaymentResponse2 submitPaymentResponse;

    /**
     * Gets the value of the submitPaymentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitPaymentResponse2 }
     *     
     */
    public SubmitPaymentResponse2 getSubmitPaymentResponse() {
        return submitPaymentResponse;
    }

    /**
     * Sets the value of the submitPaymentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitPaymentResponse2 }
     *     
     */
    public void setSubmitPaymentResponse(SubmitPaymentResponse2 value) {
        this.submitPaymentResponse = value;
    }

}
