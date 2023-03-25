//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:22:59 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.batch;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="FCUBS_HEADER" type="{http://fcubs.ofss.com/service/FCUBSDEService}FCUBS_HEADERType"/&gt;
 *         &lt;element name="FCUBS_BODY"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Batch-Restriction-Full" type="{http://fcubs.ofss.com/service/FCUBSDEService}DEBranchRest-Full-Type"/&gt;
 *                   &lt;element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSDEService}ERRORType" minOccurs="0"/&gt;
 *                   &lt;element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSDEService}WARNINGType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "fcubsheader",
    "fcubsbody"
})
@XmlRootElement(name = "CLOSEDEBRANCHREST_FSFS_RES")
public class CLOSEDEBRANCHRESTFSFSRES {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected CLOSEDEBRANCHRESTFSFSRES.FCUBSBODY fcubsbody;

    /**
     * Gets the value of the fcubsheader property.
     * 
     * @return
     *     possible object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public FCUBSHEADERType getFCUBSHEADER() {
        return fcubsheader;
    }

    /**
     * Sets the value of the fcubsheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public void setFCUBSHEADER(FCUBSHEADERType value) {
        this.fcubsheader = value;
    }

    /**
     * Gets the value of the fcubsbody property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSEDEBRANCHRESTFSFSRES.FCUBSBODY }
     *     
     */
    public CLOSEDEBRANCHRESTFSFSRES.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSEDEBRANCHRESTFSFSRES.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(CLOSEDEBRANCHRESTFSFSRES.FCUBSBODY value) {
        this.fcubsbody = value;
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
     *         &lt;element name="Batch-Restriction-Full" type="{http://fcubs.ofss.com/service/FCUBSDEService}DEBranchRest-Full-Type"/&gt;
     *         &lt;element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSDEService}ERRORType" minOccurs="0"/&gt;
     *         &lt;element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSDEService}WARNINGType" minOccurs="0"/&gt;
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
        "batchRestrictionFull",
        "fcubserrorresp",
        "fcubswarningresp"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Batch-Restriction-Full", required = true)
        protected DEBranchRestFullType batchRestrictionFull;
        @XmlElement(name = "FCUBS_ERROR_RESP")
        protected ERRORType fcubserrorresp;
        @XmlElement(name = "FCUBS_WARNING_RESP")
        protected WARNINGType fcubswarningresp;

        /**
         * Gets the value of the batchRestrictionFull property.
         * 
         * @return
         *     possible object is
         *     {@link DEBranchRestFullType }
         *     
         */
        public DEBranchRestFullType getBatchRestrictionFull() {
            return batchRestrictionFull;
        }

        /**
         * Sets the value of the batchRestrictionFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link DEBranchRestFullType }
         *     
         */
        public void setBatchRestrictionFull(DEBranchRestFullType value) {
            this.batchRestrictionFull = value;
        }

        /**
         * Gets the value of the fcubserrorresp property.
         * 
         * @return
         *     possible object is
         *     {@link ERRORType }
         *     
         */
        public ERRORType getFCUBSERRORRESP() {
            return fcubserrorresp;
        }

        /**
         * Sets the value of the fcubserrorresp property.
         * 
         * @param value
         *     allowed object is
         *     {@link ERRORType }
         *     
         */
        public void setFCUBSERRORRESP(ERRORType value) {
            this.fcubserrorresp = value;
        }

        /**
         * Gets the value of the fcubswarningresp property.
         * 
         * @return
         *     possible object is
         *     {@link WARNINGType }
         *     
         */
        public WARNINGType getFCUBSWARNINGRESP() {
            return fcubswarningresp;
        }

        /**
         * Sets the value of the fcubswarningresp property.
         * 
         * @param value
         *     allowed object is
         *     {@link WARNINGType }
         *     
         */
        public void setFCUBSWARNINGRESP(WARNINGType value) {
            this.fcubswarningresp = value;
        }

    }

}
