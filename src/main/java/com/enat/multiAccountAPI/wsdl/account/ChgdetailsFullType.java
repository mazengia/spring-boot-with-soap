//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:22:54 AM EAT 
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
 * <p>Java class for Chgdetails-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Chgdetails-Full-Type"&gt;
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
 *                   &lt;element name="CHGPROD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MINAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="MAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="FREETXN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Chgslabs" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
 *         &lt;element name="Misc-Icchspcn" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Chgdetails-Full-Type", propOrder = {
    "brn",
    "acc",
    "chgdetails",
    "miscIcchspcn"
})
public class ChgdetailsFullType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "Chgdetails")
    protected List<ChgdetailsFullType.Chgdetails> chgdetails;
    @XmlElement(name = "Misc-Icchspcn")
    protected ChgdetailsFullType.MiscIcchspcn miscIcchspcn;

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
     * {@link ChgdetailsFullType.Chgdetails }
     * 
     * 
     */
    public List<ChgdetailsFullType.Chgdetails> getChgdetails() {
        if (chgdetails == null) {
            chgdetails = new ArrayList<ChgdetailsFullType.Chgdetails>();
        }
        return this.chgdetails;
    }

    /**
     * Gets the value of the miscIcchspcn property.
     * 
     * @return
     *     possible object is
     *     {@link ChgdetailsFullType.MiscIcchspcn }
     *     
     */
    public ChgdetailsFullType.MiscIcchspcn getMiscIcchspcn() {
        return miscIcchspcn;
    }

    /**
     * Sets the value of the miscIcchspcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgdetailsFullType.MiscIcchspcn }
     *     
     */
    public void setMiscIcchspcn(ChgdetailsFullType.MiscIcchspcn value) {
        this.miscIcchspcn = value;
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
     *         &lt;element name="CHGPROD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MINAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="MAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="FREETXN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Chgslabs" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "chgprod",
        "waiveprod",
        "prodmapstat",
        "minamt",
        "maxamt",
        "freetxn",
        "desc",
        "chgslabs"
    })
    public static class Chgdetails {

        @XmlElement(name = "CHGPROD", required = true)
        protected String chgprod;
        @XmlElement(name = "WAIVEPROD")
        protected String waiveprod;
        @XmlElement(name = "PRODMAPSTAT")
        protected String prodmapstat;
        @XmlElement(name = "MINAMT")
        protected BigDecimal minamt;
        @XmlElement(name = "MAXAMT")
        protected BigDecimal maxamt;
        @XmlElement(name = "FREETXN")
        protected BigDecimal freetxn;
        @XmlElement(name = "DESC")
        protected String desc;
        @XmlElement(name = "Chgslabs")
        protected List<ChgdetailsFullType.Chgdetails.Chgslabs> chgslabs;

        /**
         * Gets the value of the chgprod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGPROD() {
            return chgprod;
        }

        /**
         * Sets the value of the chgprod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGPROD(String value) {
            this.chgprod = value;
        }

        /**
         * Gets the value of the waiveprod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWAIVEPROD() {
            return waiveprod;
        }

        /**
         * Sets the value of the waiveprod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWAIVEPROD(String value) {
            this.waiveprod = value;
        }

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
         * Gets the value of the desc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESC() {
            return desc;
        }

        /**
         * Sets the value of the desc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESC(String value) {
            this.desc = value;
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
         * {@link ChgdetailsFullType.Chgdetails.Chgslabs }
         * 
         * 
         */
        public List<ChgdetailsFullType.Chgdetails.Chgslabs> getChgslabs() {
            if (chgslabs == null) {
                chgslabs = new ArrayList<ChgdetailsFullType.Chgdetails.Chgslabs>();
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
            "chgrate"
        })
        public static class Chgslabs {

            @XmlElement(name = "SLABAMT", required = true)
            protected BigDecimal slabamt;
            @XmlElement(name = "CHGAMT")
            protected BigDecimal chgamt;
            @XmlElement(name = "CHGRATE")
            protected BigDecimal chgrate;

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

        }

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
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "ccy"
    })
    public static class MiscIcchspcn {

        @XmlElement(name = "CCY")
        protected String ccy;

        /**
         * Gets the value of the ccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCY() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCY(String value) {
            this.ccy = value;
        }

    }

}
