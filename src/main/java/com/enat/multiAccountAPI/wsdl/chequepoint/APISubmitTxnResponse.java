//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:23:05 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.chequepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APISubmitTxnResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APISubmitTxnResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubmitTxnResponse" type="{https://www.fintech-group.com/services/Finpay}SubmitTxnResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APISubmitTxnResponse", propOrder = {
    "submitTxnResponse"
})
public class APISubmitTxnResponse {

    @XmlElement(name = "SubmitTxnResponse")
    protected SubmitTxnResponse2 submitTxnResponse;

    /**
     * Gets the value of the submitTxnResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitTxnResponse2 }
     *     
     */
    public SubmitTxnResponse2 getSubmitTxnResponse() {
        return submitTxnResponse;
    }

    /**
     * Sets the value of the submitTxnResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitTxnResponse2 }
     *     
     */
    public void setSubmitTxnResponse(SubmitTxnResponse2 value) {
        this.submitTxnResponse = value;
    }

}
