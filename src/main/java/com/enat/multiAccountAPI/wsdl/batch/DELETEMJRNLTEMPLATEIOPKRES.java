//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 03:12:07 PM EAT 
//


package com.enat.multiAccountAPI.wsdl.batch;

import java.util.ArrayList;
import java.util.List;
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
 *                   &lt;element name="Detms-Jrnl-Tmpl-Master-PK" type="{http://fcubs.ofss.com/service/FCUBSDEService}MultiJrnlTeml-PK-Type" minOccurs="0"/&gt;
 *                   &lt;element name="Detms-Jrnl-Tmpl-Master-IO" type="{http://fcubs.ofss.com/service/FCUBSDEService}MultiJrnlTeml-Delete-IO-Type" minOccurs="0"/&gt;
 *                   &lt;element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSDEService}ERRORType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSDEService}WARNINGType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlRootElement(name = "DELETEMJRNLTEMPLATE_IOPK_RES")
public class DELETEMJRNLTEMPLATEIOPKRES {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected DELETEMJRNLTEMPLATEIOPKRES.FCUBSBODY fcubsbody;

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
     *     {@link DELETEMJRNLTEMPLATEIOPKRES.FCUBSBODY }
     *     
     */
    public DELETEMJRNLTEMPLATEIOPKRES.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link DELETEMJRNLTEMPLATEIOPKRES.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(DELETEMJRNLTEMPLATEIOPKRES.FCUBSBODY value) {
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
     *         &lt;element name="Detms-Jrnl-Tmpl-Master-PK" type="{http://fcubs.ofss.com/service/FCUBSDEService}MultiJrnlTeml-PK-Type" minOccurs="0"/&gt;
     *         &lt;element name="Detms-Jrnl-Tmpl-Master-IO" type="{http://fcubs.ofss.com/service/FCUBSDEService}MultiJrnlTeml-Delete-IO-Type" minOccurs="0"/&gt;
     *         &lt;element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSDEService}ERRORType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSDEService}WARNINGType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "detmsJrnlTmplMasterPK",
        "detmsJrnlTmplMasterIO",
        "fcubserrorresp",
        "fcubswarningresp"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Detms-Jrnl-Tmpl-Master-PK")
        protected MultiJrnlTemlPKType detmsJrnlTmplMasterPK;
        @XmlElement(name = "Detms-Jrnl-Tmpl-Master-IO")
        protected MultiJrnlTemlDeleteIOType detmsJrnlTmplMasterIO;
        @XmlElement(name = "FCUBS_ERROR_RESP")
        protected List<ERRORType> fcubserrorresp;
        @XmlElement(name = "FCUBS_WARNING_RESP")
        protected List<WARNINGType> fcubswarningresp;

        /**
         * Gets the value of the detmsJrnlTmplMasterPK property.
         * 
         * @return
         *     possible object is
         *     {@link MultiJrnlTemlPKType }
         *     
         */
        public MultiJrnlTemlPKType getDetmsJrnlTmplMasterPK() {
            return detmsJrnlTmplMasterPK;
        }

        /**
         * Sets the value of the detmsJrnlTmplMasterPK property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultiJrnlTemlPKType }
         *     
         */
        public void setDetmsJrnlTmplMasterPK(MultiJrnlTemlPKType value) {
            this.detmsJrnlTmplMasterPK = value;
        }

        /**
         * Gets the value of the detmsJrnlTmplMasterIO property.
         * 
         * @return
         *     possible object is
         *     {@link MultiJrnlTemlDeleteIOType }
         *     
         */
        public MultiJrnlTemlDeleteIOType getDetmsJrnlTmplMasterIO() {
            return detmsJrnlTmplMasterIO;
        }

        /**
         * Sets the value of the detmsJrnlTmplMasterIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultiJrnlTemlDeleteIOType }
         *     
         */
        public void setDetmsJrnlTmplMasterIO(MultiJrnlTemlDeleteIOType value) {
            this.detmsJrnlTmplMasterIO = value;
        }

        /**
         * Gets the value of the fcubserrorresp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fcubserrorresp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFCUBSERRORRESP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ERRORType }
         * 
         * 
         */
        public List<ERRORType> getFCUBSERRORRESP() {
            if (fcubserrorresp == null) {
                fcubserrorresp = new ArrayList<ERRORType>();
            }
            return this.fcubserrorresp;
        }

        /**
         * Gets the value of the fcubswarningresp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fcubswarningresp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFCUBSWARNINGRESP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WARNINGType }
         * 
         * 
         */
        public List<WARNINGType> getFCUBSWARNINGRESP() {
            if (fcubswarningresp == null) {
                fcubswarningresp = new ArrayList<WARNINGType>();
            }
            return this.fcubswarningresp;
        }

    }

}
