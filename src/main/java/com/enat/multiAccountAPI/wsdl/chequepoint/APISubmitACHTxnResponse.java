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
 * <p>Java class for APISubmitACHTxnResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APISubmitACHTxnResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubmitACHTxnResponse" type="{https://www.fintech-group.com/services/Finpay}SubmitACHTxnResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APISubmitACHTxnResponse", propOrder = {
    "submitACHTxnResponse"
})
public class APISubmitACHTxnResponse {

    @XmlElement(name = "SubmitACHTxnResponse")
    protected SubmitACHTxnResponse2 submitACHTxnResponse;

    /**
     * Gets the value of the submitACHTxnResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitACHTxnResponse2 }
     *     
     */
    public SubmitACHTxnResponse2 getSubmitACHTxnResponse() {
        return submitACHTxnResponse;
    }

    /**
     * Sets the value of the submitACHTxnResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitACHTxnResponse2 }
     *     
     */
    public void setSubmitACHTxnResponse(SubmitACHTxnResponse2 value) {
        this.submitACHTxnResponse = value;
    }

}
