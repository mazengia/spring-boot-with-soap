//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 03:11:59 PM EAT 
//


package com.enat.multiAccountAPI.wsdl.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Chgdetails-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Chgdetails-Query-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Chgdetails" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MINAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="MAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="FREETXN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="Chgslabs" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="FLRBASAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="FLRAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "Chgdetails-Query-IO-Type", propOrder = {
    "brn",
    "acc",
    "chgdetails"
})
public class ChgdetailsQueryIOType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "Chgdetails")
    protected List<ChgdetailsQueryIOType.Chgdetails> chgdetails;

    /**
     * Gets the value of the brn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRN() {
        return brn;
    }

    /**
     * Sets the value of the brn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRN(String value) {
        this.brn = value;
    }

    /**
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC(String value) {
        this.acc = value;
    }

    /**
     * Gets the value of the chgdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chgdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChgdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChgdetailsQueryIOType.Chgdetails }
     * 
     * 
     */
    public List<ChgdetailsQueryIOType.Chgdetails> getChgdetails() {
        if (chgdetails == null) {
            chgdetails = new ArrayList<ChgdetailsQueryIOType.Chgdetails>();
        }
        return this.chgdetails;
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
     *         &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MINAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="MAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="FREETXN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="Chgslabs" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="FLRBASAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="FLRAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "prodmapstat",
        "minamt",
        "maxamt",
        "freetxn",
        "chgslabs"
    })
    public static class Chgdetails {

        @XmlElement(name = "PRODMAPSTAT")
        protected String prodmapstat;
        @XmlElement(name = "MINAMT")
        protected BigDecimal minamt;
        @XmlElement(name = "MAXAMT")
        protected BigDecimal maxamt;
        @XmlElement(name = "FREETXN")
        protected BigDecimal freetxn;
        @XmlElement(name = "Chgslabs")
        protected List<ChgdetailsQueryIOType.Chgdetails.Chgslabs> chgslabs;

        /**
         * Gets the value of the prodmapstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODMAPSTAT() {
            return prodmapstat;
        }

        /**
         * Sets the value of the prodmapstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODMAPSTAT(String value) {
            this.prodmapstat = value;
        }

        /**
         * Gets the value of the minamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMINAMT() {
            return minamt;
        }

        /**
         * Sets the value of the minamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMINAMT(BigDecimal value) {
            this.minamt = value;
        }

        /**
         * Gets the value of the maxamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMAXAMT() {
            return maxamt;
        }

        /**
         * Sets the value of the maxamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMAXAMT(BigDecimal value) {
            this.maxamt = value;
        }

        /**
         * Gets the value of the freetxn property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFREETXN() {
            return freetxn;
        }

        /**
         * Sets the value of the freetxn property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFREETXN(BigDecimal value) {
            this.freetxn = value;
        }

        /**
         * Gets the value of the chgslabs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chgslabs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChgslabs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChgdetailsQueryIOType.Chgdetails.Chgslabs }
         * 
         * 
         */
        public List<ChgdetailsQueryIOType.Chgdetails.Chgslabs> getChgslabs() {
            if (chgslabs == null) {
                chgslabs = new ArrayList<ChgdetailsQueryIOType.Chgdetails.Chgslabs>();
            }
            return this.chgslabs;
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
         *         &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="FLRBASAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="FLRAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "slabamt",
            "chgamt",
            "chgrate",
            "flrbasamt",
            "flramt"
        })
        public static class Chgslabs {

            @XmlElement(name = "SLABAMT", required = true)
            protected BigDecimal slabamt;
            @XmlElement(name = "CHGAMT")
            protected BigDecimal chgamt;
            @XmlElement(name = "CHGRATE")
            protected BigDecimal chgrate;
            @XmlElement(name = "FLRBASAMT")
            protected BigDecimal flrbasamt;
            @XmlElement(name = "FLRAMT")
            protected BigDecimal flramt;

            /**
             * Gets the value of the slabamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSLABAMT() {
                return slabamt;
            }

            /**
             * Sets the value of the slabamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSLABAMT(BigDecimal value) {
                this.slabamt = value;
            }

            /**
             * Gets the value of the chgamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCHGAMT() {
                return chgamt;
            }

            /**
             * Sets the value of the chgamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCHGAMT(BigDecimal value) {
                this.chgamt = value;
            }

            /**
             * Gets the value of the chgrate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCHGRATE() {
                return chgrate;
            }

            /**
             * Sets the value of the chgrate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCHGRATE(BigDecimal value) {
                this.chgrate = value;
            }

            /**
             * Gets the value of the flrbasamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFLRBASAMT() {
                return flrbasamt;
            }

            /**
             * Sets the value of the flrbasamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFLRBASAMT(BigDecimal value) {
                this.flrbasamt = value;
            }

            /**
             * Gets the value of the flramt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFLRAMT() {
                return flramt;
            }

            /**
             * Sets the value of the flramt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFLRAMT(BigDecimal value) {
                this.flramt = value;
            }

        }

    }

}
