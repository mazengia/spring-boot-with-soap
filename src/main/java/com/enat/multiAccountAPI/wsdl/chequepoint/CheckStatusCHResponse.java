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
 *         &lt;element name="CheckStatusCHResult" type="{https://www.fintech-group.com/services/Finpay}APICheckStatusResponse" minOccurs="0"/&gt;
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
    "checkStatusCHResult"
})
@XmlRootElement(name = "CheckStatusCHResponse")
public class CheckStatusCHResponse {

    @XmlElement(name = "CheckStatusCHResult")
    protected APICheckStatusResponse checkStatusCHResult;

    /**
     * Gets the value of the checkStatusCHResult property.
     * 
     * @return
     *     possible object is
     *     {@link APICheckStatusResponse }
     *     
     */
    public APICheckStatusResponse getCheckStatusCHResult() {
        return checkStatusCHResult;
    }

    /**
     * Sets the value of the checkStatusCHResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link APICheckStatusResponse }
     *     
     */
    public void setCheckStatusCHResult(APICheckStatusResponse value) {
        this.checkStatusCHResult = value;
    }

}
