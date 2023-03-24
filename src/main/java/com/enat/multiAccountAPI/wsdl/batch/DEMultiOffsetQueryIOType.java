//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:22:59 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.batch;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DEMultiOffset-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEMultiOffset-Query-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DE_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_BATCH_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_CURRNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEMultiOffset-Query-IO-Type", propOrder = {
    "derefno",
    "debatchnumber",
    "decurrno"
})
public class DEMultiOffsetQueryIOType {

    @XmlElement(name = "DE_REF_NO")
    protected String derefno;
    @XmlElement(name = "DE_BATCH_NUMBER")
    protected String debatchnumber;
    @XmlElement(name = "DE_CURRNO")
    protected BigDecimal decurrno;

    /**
     * Gets the value of the derefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEREFNO() {
        return derefno;
    }

    /**
     * Sets the value of the derefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEREFNO(String value) {
        this.derefno = value;
    }

    /**
     * Gets the value of the debatchnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBATCHNUMBER() {
        return debatchnumber;
    }

    /**
     * Sets the value of the debatchnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBATCHNUMBER(String value) {
        this.debatchnumber = value;
    }

    /**
     * Gets the value of the decurrno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDECURRNO() {
        return decurrno;
    }

    /**
     * Sets the value of the decurrno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDECURRNO(BigDecimal value) {
        this.decurrno = value;
    }

}