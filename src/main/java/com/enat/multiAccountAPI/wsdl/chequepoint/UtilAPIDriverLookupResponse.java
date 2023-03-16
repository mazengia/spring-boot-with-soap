//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 03:12:14 PM EAT 
//


package com.enat.multiAccountAPI.wsdl.chequepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilAPIDriverLookupResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilAPIDriverLookupResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GrandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstNameEnglish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FatherNameEnglish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GrandNameEnglish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DriverID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilAPIDriverLookupResponse", propOrder = {
    "firstName",
    "fatherName",
    "grandName",
    "firstNameEnglish",
    "fatherNameEnglish",
    "grandNameEnglish",
    "driverID",
    "licenseArea",
    "licenseNumber",
    "licenseGrade",
    "licenseRegion",
    "isSuspended",
    "telephone"
})
public class UtilAPIDriverLookupResponse {

    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "FatherName")
    protected String fatherName;
    @XmlElement(name = "GrandName")
    protected String grandName;
    @XmlElement(name = "FirstNameEnglish")
    protected String firstNameEnglish;
    @XmlElement(name = "FatherNameEnglish")
    protected String fatherNameEnglish;
    @XmlElement(name = "GrandNameEnglish")
    protected String grandNameEnglish;
    @XmlElement(name = "DriverID")
    protected String driverID;
    @XmlElement(name = "LicenseArea")
    protected String licenseArea;
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlElement(name = "LicenseGrade")
    protected String licenseGrade;
    @XmlElement(name = "LicenseRegion")
    protected String licenseRegion;
    @XmlElement(name = "IsSuspended")
    protected boolean isSuspended;
    @XmlElement(name = "Telephone")
    protected String telephone;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherName(String value) {
        this.fatherName = value;
    }

    /**
     * Gets the value of the grandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandName() {
        return grandName;
    }

    /**
     * Sets the value of the grandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandName(String value) {
        this.grandName = value;
    }

    /**
     * Gets the value of the firstNameEnglish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameEnglish() {
        return firstNameEnglish;
    }

    /**
     * Sets the value of the firstNameEnglish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameEnglish(String value) {
        this.firstNameEnglish = value;
    }

    /**
     * Gets the value of the fatherNameEnglish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherNameEnglish() {
        return fatherNameEnglish;
    }

    /**
     * Sets the value of the fatherNameEnglish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherNameEnglish(String value) {
        this.fatherNameEnglish = value;
    }

    /**
     * Gets the value of the grandNameEnglish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandNameEnglish() {
        return grandNameEnglish;
    }

    /**
     * Sets the value of the grandNameEnglish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandNameEnglish(String value) {
        this.grandNameEnglish = value;
    }

    /**
     * Gets the value of the driverID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverID() {
        return driverID;
    }

    /**
     * Sets the value of the driverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverID(String value) {
        this.driverID = value;
    }

    /**
     * Gets the value of the licenseArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseArea() {
        return licenseArea;
    }

    /**
     * Sets the value of the licenseArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseArea(String value) {
        this.licenseArea = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the licenseGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseGrade() {
        return licenseGrade;
    }

    /**
     * Sets the value of the licenseGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseGrade(String value) {
        this.licenseGrade = value;
    }

    /**
     * Gets the value of the licenseRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseRegion() {
        return licenseRegion;
    }

    /**
     * Sets the value of the licenseRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseRegion(String value) {
        this.licenseRegion = value;
    }

    /**
     * Gets the value of the isSuspended property.
     * 
     */
    public boolean isIsSuspended() {
        return isSuspended;
    }

    /**
     * Sets the value of the isSuspended property.
     * 
     */
    public void setIsSuspended(boolean value) {
        this.isSuspended = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

}