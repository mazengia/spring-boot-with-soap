//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 03:12:07 PM EAT 
//


package com.enat.multiAccountAPI.wsdl.batch;

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
 *         &lt;element name="FCUBS_HEADER" type="{http://fcubs.ofss.com/service/FCUBSDEService}FCUBS_HEADERType"/&gt;
 *         &lt;element name="FCUBS_BODY"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Detms-Mck-Issuer-Codes-IO" type="{http://fcubs.ofss.com/service/FCUBSDEService}DEDraftIssuerMaint-Reopen-IO-Type"/&gt;
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
@XmlRootElement(name = "REOPENDEDRAFTISSUERMAINT_IOPK_REQ")
public class REOPENDEDRAFTISSUERMAINTIOPKREQ {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected REOPENDEDRAFTISSUERMAINTIOPKREQ.FCUBSBODY fcubsbody;

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
     *     {@link REOPENDEDRAFTISSUERMAINTIOPKREQ.FCUBSBODY }
     *     
     */
    public REOPENDEDRAFTISSUERMAINTIOPKREQ.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link REOPENDEDRAFTISSUERMAINTIOPKREQ.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(REOPENDEDRAFTISSUERMAINTIOPKREQ.FCUBSBODY value) {
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
     *         &lt;element name="Detms-Mck-Issuer-Codes-IO" type="{http://fcubs.ofss.com/service/FCUBSDEService}DEDraftIssuerMaint-Reopen-IO-Type"/&gt;
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
        "detmsMckIssuerCodesIO"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Detms-Mck-Issuer-Codes-IO", required = true)
        protected DEDraftIssuerMaintReopenIOType detmsMckIssuerCodesIO;

        /**
         * Gets the value of the detmsMckIssuerCodesIO property.
         * 
         * @return
         *     possible object is
         *     {@link DEDraftIssuerMaintReopenIOType }
         *     
         */
        public DEDraftIssuerMaintReopenIOType getDetmsMckIssuerCodesIO() {
            return detmsMckIssuerCodesIO;
        }

        /**
         * Sets the value of the detmsMckIssuerCodesIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link DEDraftIssuerMaintReopenIOType }
         *     
         */
        public void setDetmsMckIssuerCodesIO(DEDraftIssuerMaintReopenIOType value) {
            this.detmsMckIssuerCodesIO = value;
        }

    }

}
