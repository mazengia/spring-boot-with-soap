//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.29 at 09:34:55 AM EAT 
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
 *                   &lt;element name="Detms-Mck-Issuer-Codes-Full" type="{http://fcubs.ofss.com/service/FCUBSDEService}DEDraftIssuerMaint-Full-Type"/&gt;
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
@XmlRootElement(name = "CREATEDEDRAFTISSUERMAINT_FSFS_RES")
public class CREATEDEDRAFTISSUERMAINTFSFSRES {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected CREATEDEDRAFTISSUERMAINTFSFSRES.FCUBSBODY fcubsbody;

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
     *     {@link CREATEDEDRAFTISSUERMAINTFSFSRES.FCUBSBODY }
     *     
     */
    public CREATEDEDRAFTISSUERMAINTFSFSRES.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREATEDEDRAFTISSUERMAINTFSFSRES.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(CREATEDEDRAFTISSUERMAINTFSFSRES.FCUBSBODY value) {
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
     *         &lt;element name="Detms-Mck-Issuer-Codes-Full" type="{http://fcubs.ofss.com/service/FCUBSDEService}DEDraftIssuerMaint-Full-Type"/&gt;
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
        "detmsMckIssuerCodesFull",
        "fcubserrorresp",
        "fcubswarningresp"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Detms-Mck-Issuer-Codes-Full", required = true)
        protected DEDraftIssuerMaintFullType detmsMckIssuerCodesFull;
        @XmlElement(name = "FCUBS_ERROR_RESP")
        protected ERRORType fcubserrorresp;
        @XmlElement(name = "FCUBS_WARNING_RESP")
        protected WARNINGType fcubswarningresp;

        /**
         * Gets the value of the detmsMckIssuerCodesFull property.
         * 
         * @return
         *     possible object is
         *     {@link DEDraftIssuerMaintFullType }
         *     
         */
        public DEDraftIssuerMaintFullType getDetmsMckIssuerCodesFull() {
            return detmsMckIssuerCodesFull;
        }

        /**
         * Sets the value of the detmsMckIssuerCodesFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link DEDraftIssuerMaintFullType }
         *     
         */
        public void setDetmsMckIssuerCodesFull(DEDraftIssuerMaintFullType value) {
            this.detmsMckIssuerCodesFull = value;
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
