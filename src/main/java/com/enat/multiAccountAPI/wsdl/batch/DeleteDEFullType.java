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
 * <p>Java class for Delete-DE-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Delete-DE-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BATNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DEDBATOT_DETAIL" type="{http://fcubs.ofss.com/service/FCUBSDEService}Devws_Dedbatot_detailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delete-DE-Full-Type", propOrder = {
    "brn",
    "batno",
    "dedbatotdetail"
})
public class DeleteDEFullType {

    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "BATNO", required = true)
    protected String batno;
    @XmlElement(name = "DEDBATOT_DETAIL")
    protected List<DevwsDedbatotDetailType> dedbatotdetail;

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
     * Gets the value of the batno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATNO() {
        return batno;
    }

    /**
     * Sets the value of the batno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATNO(String value) {
        this.batno = value;
    }

    /**
     * Gets the value of the dedbatotdetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dedbatotdetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEDBATOTDETAIL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevwsDedbatotDetailType }
     * 
     * 
     */
    public List<DevwsDedbatotDetailType> getDEDBATOTDETAIL() {
        if (dedbatotdetail == null) {
            dedbatotdetail = new ArrayList<DevwsDedbatotDetailType>();
        }
        return this.dedbatotdetail;
    }

}
