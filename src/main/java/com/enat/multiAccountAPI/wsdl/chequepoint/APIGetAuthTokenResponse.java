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
 * <p>Java class for APIGetAuthTokenResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIGetAuthTokenResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetAuthTokenResponse" type="{https://www.fintech-group.com/services/Finpay}GetAuthTokenResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIGetAuthTokenResponse", propOrder = {
    "getAuthTokenResponse"
})
public class APIGetAuthTokenResponse {

    @XmlElement(name = "GetAuthTokenResponse")
    protected GetAuthTokenResponse2 getAuthTokenResponse;

    /**
     * Gets the value of the getAuthTokenResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetAuthTokenResponse2 }
     *     
     */
    public GetAuthTokenResponse2 getGetAuthTokenResponse() {
        return getAuthTokenResponse;
    }

    /**
     * Sets the value of the getAuthTokenResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAuthTokenResponse2 }
     *     
     */
    public void setGetAuthTokenResponse(GetAuthTokenResponse2 value) {
        this.getAuthTokenResponse = value;
    }

}
