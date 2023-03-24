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
 * <p>Java class for UtilAPICheckStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilAPICheckStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CBSPosted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ACHCreated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ACHAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ACHRejected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Notified" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilAPICheckStatusResponse", propOrder = {
    "cbsPosted",
    "achCreated",
    "achAccepted",
    "achRejected",
    "notified"
})
public class UtilAPICheckStatusResponse {

    @XmlElement(name = "CBSPosted")
    protected boolean cbsPosted;
    @XmlElement(name = "ACHCreated")
    protected boolean achCreated;
    @XmlElement(name = "ACHAccepted")
    protected boolean achAccepted;
    @XmlElement(name = "ACHRejected")
    protected boolean achRejected;
    @XmlElement(name = "Notified")
    protected boolean notified;

    /**
     * Gets the value of the cbsPosted property.
     * 
     */
    public boolean isCBSPosted() {
        return cbsPosted;
    }

    /**
     * Sets the value of the cbsPosted property.
     * 
     */
    public void setCBSPosted(boolean value) {
        this.cbsPosted = value;
    }

    /**
     * Gets the value of the achCreated property.
     * 
     */
    public boolean isACHCreated() {
        return achCreated;
    }

    /**
     * Sets the value of the achCreated property.
     * 
     */
    public void setACHCreated(boolean value) {
        this.achCreated = value;
    }

    /**
     * Gets the value of the achAccepted property.
     * 
     */
    public boolean isACHAccepted() {
        return achAccepted;
    }

    /**
     * Sets the value of the achAccepted property.
     * 
     */
    public void setACHAccepted(boolean value) {
        this.achAccepted = value;
    }

    /**
     * Gets the value of the achRejected property.
     * 
     */
    public boolean isACHRejected() {
        return achRejected;
    }

    /**
     * Sets the value of the achRejected property.
     * 
     */
    public void setACHRejected(boolean value) {
        this.achRejected = value;
    }

    /**
     * Gets the value of the notified property.
     * 
     */
    public boolean isNotified() {
        return notified;
    }

    /**
     * Sets the value of the notified property.
     * 
     */
    public void setNotified(boolean value) {
        this.notified = value;
    }

}