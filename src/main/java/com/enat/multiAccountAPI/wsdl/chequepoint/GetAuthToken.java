//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 03:12:14 PM EAT 
//


package com.enat.multiAccountAPI.wsdl.chequepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="providerID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="appcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apppassphrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "providerID",
    "appcode",
    "apppassphrase"
})
@XmlRootElement(name = "GetAuthToken")
public class GetAuthToken {

    protected int providerID;
    protected String appcode;
    protected String apppassphrase;

    /**
     * Gets the value of the providerID property.
     * 
     */
    public int getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     */
    public void setProviderID(int value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the appcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppcode() {
        return appcode;
    }

    /**
     * Sets the value of the appcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppcode(String value) {
        this.appcode = value;
    }

    /**
     * Gets the value of the apppassphrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApppassphrase() {
        return apppassphrase;
    }

    /**
     * Sets the value of the apppassphrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApppassphrase(String value) {
        this.apppassphrase = value;
    }

}
