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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SubmitACHTxnResult" type="{https://www.fintech-group.com/services/Finpay}APISubmitACHTxnResponse" minOccurs="0"/&gt;
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
    "submitACHTxnResult"
})
@XmlRootElement(name = "SubmitACHTxnResponse")
public class SubmitACHTxnResponse {

    @XmlElement(name = "SubmitACHTxnResult")
    protected APISubmitACHTxnResponse submitACHTxnResult;

    /**
     * Gets the value of the submitACHTxnResult property.
     * 
     * @return
     *     possible object is
     *     {@link APISubmitACHTxnResponse }
     *     
     */
    public APISubmitACHTxnResponse getSubmitACHTxnResult() {
        return submitACHTxnResult;
    }

    /**
     * Sets the value of the submitACHTxnResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISubmitACHTxnResponse }
     *     
     */
    public void setSubmitACHTxnResult(APISubmitACHTxnResponse value) {
        this.submitACHTxnResult = value;
    }

}