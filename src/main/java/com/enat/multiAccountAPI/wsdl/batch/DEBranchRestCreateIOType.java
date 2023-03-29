//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.29 at 09:34:55 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.batch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DEBranchRest-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEBranchRest-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DE_BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DE_SOURCE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Batch-Restriction-Details" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DE_BATCH_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DE_REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSDEService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEBranchRest-Create-IO-Type", propOrder = {
    "debranchcode",
    "desourcecode",
    "batchRestrictionDetails",
    "udfdetails"
})
public class DEBranchRestCreateIOType {

    @XmlElement(name = "DE_BRANCH_CODE", required = true)
    protected String debranchcode;
    @XmlElement(name = "DE_SOURCE_CODE", required = true)
    protected String desourcecode;
    @XmlElement(name = "Batch-Restriction-Details", required = true)
    protected List<DEBranchRestCreateIOType.BatchRestrictionDetails> batchRestrictionDetails;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;

    /**
     * Gets the value of the debranchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBRANCHCODE() {
        return debranchcode;
    }

    /**
     * Sets the value of the debranchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBRANCHCODE(String value) {
        this.debranchcode = value;
    }

    /**
     * Gets the value of the desourcecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESOURCECODE() {
        return desourcecode;
    }

    /**
     * Sets the value of the desourcecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESOURCECODE(String value) {
        this.desourcecode = value;
    }

    /**
     * Gets the value of the batchRestrictionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchRestrictionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchRestrictionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEBranchRestCreateIOType.BatchRestrictionDetails }
     * 
     * 
     */
    public List<DEBranchRestCreateIOType.BatchRestrictionDetails> getBatchRestrictionDetails() {
        if (batchRestrictionDetails == null) {
            batchRestrictionDetails = new ArrayList<DEBranchRestCreateIOType.BatchRestrictionDetails>();
        }
        return this.batchRestrictionDetails;
    }

    /**
     * Gets the value of the udfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType2 }
     * 
     * 
     */
    public List<UDFDETAILSType2> getUDFDETAILS() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<UDFDETAILSType2>();
        }
        return this.udfdetails;
    }


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
     *         &lt;element name="DE_BATCH_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DE_REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "debatchno",
        "deremarks"
    })
    public static class BatchRestrictionDetails {

        @XmlElement(name = "DE_BATCH_NO", required = true)
        protected String debatchno;
        @XmlElement(name = "DE_REMARKS")
        protected String deremarks;

        /**
         * Gets the value of the debatchno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEBATCHNO() {
            return debatchno;
        }

        /**
         * Sets the value of the debatchno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEBATCHNO(String value) {
            this.debatchno = value;
        }

        /**
         * Gets the value of the deremarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEREMARKS() {
            return deremarks;
        }

        /**
         * Sets the value of the deremarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEREMARKS(String value) {
            this.deremarks = value;
        }

    }

}
