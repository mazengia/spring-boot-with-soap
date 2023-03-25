//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:23:05 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.chequepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for UtilAPIFetchPenaltyListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilAPIFetchPenaltyListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PenalityId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ViolationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateAccused" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TicketNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ViolationGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OffenceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PenalityPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TotalPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DelayAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="IsSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DelayPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExistingPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PenalityPointsforDelayCalculation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalAmountByTotalPoints" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PenalityAmountForDelayCalculation" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LatePaymetPenalityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DriverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseRegionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ActionTaken" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlateRegion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NewPlateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewPlateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Main_guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parent_guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Event_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilAPIFetchPenaltyListResponse", propOrder = {
    "penalityId",
    "violationDate",
    "dateAccused",
    "ticketNo",
    "violationGrade",
    "offenceId",
    "penalityPoints",
    "amount",
    "totalPoints",
    "delayAmount",
    "totalAmount",
    "isSuspended",
    "delayPoints",
    "existingPoints",
    "penalityPointsforDelayCalculation",
    "totalAmountByTotalPoints",
    "penalityAmountForDelayCalculation",
    "latePaymetPenalityAmount",
    "driverName",
    "licenseRegion",
    "licenseRegionDescription",
    "licenseGrade",
    "licenseNo",
    "orderNo",
    "location",
    "paymentStatus",
    "actionTaken",
    "longitude",
    "latitude",
    "locationName",
    "telephone",
    "plateRegion",
    "newPlateCode",
    "newPlateNo",
    "userID",
    "userName",
    "mainGuid",
    "parentGuid",
    "eventDate"
})
public class UtilAPIFetchPenaltyListResponse {

    @XmlElement(name = "PenalityId")
    protected int penalityId;
    @XmlElement(name = "ViolationDate")
    protected String violationDate;
    @XmlElement(name = "DateAccused")
    protected String dateAccused;
    @XmlElement(name = "TicketNo")
    protected String ticketNo;
    @XmlElement(name = "ViolationGrade")
    protected String violationGrade;
    @XmlElement(name = "OffenceId")
    protected int offenceId;
    @XmlElement(name = "PenalityPoints")
    protected int penalityPoints;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "TotalPoints")
    protected int totalPoints;
    @XmlElement(name = "DelayAmount", required = true)
    protected BigDecimal delayAmount;
    @XmlElement(name = "TotalAmount", required = true)
    protected BigDecimal totalAmount;
    @XmlElement(name = "IsSuspended")
    protected boolean isSuspended;
    @XmlElement(name = "DelayPoints")
    protected int delayPoints;
    @XmlElement(name = "ExistingPoints")
    protected int existingPoints;
    @XmlElement(name = "PenalityPointsforDelayCalculation")
    protected int penalityPointsforDelayCalculation;
    @XmlElement(name = "TotalAmountByTotalPoints", required = true)
    protected BigDecimal totalAmountByTotalPoints;
    @XmlElement(name = "PenalityAmountForDelayCalculation", required = true)
    protected BigDecimal penalityAmountForDelayCalculation;
    @XmlElement(name = "LatePaymetPenalityAmount", required = true)
    protected BigDecimal latePaymetPenalityAmount;
    @XmlElement(name = "DriverName")
    protected String driverName;
    @XmlElement(name = "LicenseRegion")
    protected String licenseRegion;
    @XmlElement(name = "LicenseRegionDescription")
    protected String licenseRegionDescription;
    @XmlElement(name = "LicenseGrade")
    protected String licenseGrade;
    @XmlElement(name = "LicenseNo")
    protected String licenseNo;
    @XmlElement(name = "OrderNo")
    protected String orderNo;
    @XmlElement(name = "Location")
    protected int location;
    @XmlElement(name = "PaymentStatus")
    protected int paymentStatus;
    @XmlElement(name = "ActionTaken")
    protected int actionTaken;
    @XmlElement(name = "Longitude", required = true)
    protected BigDecimal longitude;
    @XmlElement(name = "Latitude", required = true)
    protected BigDecimal latitude;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "Telephone")
    protected String telephone;
    @XmlElement(name = "PlateRegion")
    protected int plateRegion;
    @XmlElement(name = "NewPlateCode")
    protected String newPlateCode;
    @XmlElement(name = "NewPlateNo")
    protected String newPlateNo;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "Main_guid")
    protected String mainGuid;
    @XmlElement(name = "Parent_guid")
    protected String parentGuid;
    @XmlElement(name = "Event_date")
    protected String eventDate;

    /**
     * Gets the value of the penalityId property.
     * 
     */
    public int getPenalityId() {
        return penalityId;
    }

    /**
     * Sets the value of the penalityId property.
     * 
     */
    public void setPenalityId(int value) {
        this.penalityId = value;
    }

    /**
     * Gets the value of the violationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViolationDate() {
        return violationDate;
    }

    /**
     * Sets the value of the violationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViolationDate(String value) {
        this.violationDate = value;
    }

    /**
     * Gets the value of the dateAccused property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAccused() {
        return dateAccused;
    }

    /**
     * Sets the value of the dateAccused property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAccused(String value) {
        this.dateAccused = value;
    }

    /**
     * Gets the value of the ticketNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNo() {
        return ticketNo;
    }

    /**
     * Sets the value of the ticketNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNo(String value) {
        this.ticketNo = value;
    }

    /**
     * Gets the value of the violationGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViolationGrade() {
        return violationGrade;
    }

    /**
     * Sets the value of the violationGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViolationGrade(String value) {
        this.violationGrade = value;
    }

    /**
     * Gets the value of the offenceId property.
     * 
     */
    public int getOffenceId() {
        return offenceId;
    }

    /**
     * Sets the value of the offenceId property.
     * 
     */
    public void setOffenceId(int value) {
        this.offenceId = value;
    }

    /**
     * Gets the value of the penalityPoints property.
     * 
     */
    public int getPenalityPoints() {
        return penalityPoints;
    }

    /**
     * Sets the value of the penalityPoints property.
     * 
     */
    public void setPenalityPoints(int value) {
        this.penalityPoints = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the totalPoints property.
     * 
     */
    public int getTotalPoints() {
        return totalPoints;
    }

    /**
     * Sets the value of the totalPoints property.
     * 
     */
    public void setTotalPoints(int value) {
        this.totalPoints = value;
    }

    /**
     * Gets the value of the delayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDelayAmount() {
        return delayAmount;
    }

    /**
     * Sets the value of the delayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDelayAmount(BigDecimal value) {
        this.delayAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
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
     * Gets the value of the delayPoints property.
     * 
     */
    public int getDelayPoints() {
        return delayPoints;
    }

    /**
     * Sets the value of the delayPoints property.
     * 
     */
    public void setDelayPoints(int value) {
        this.delayPoints = value;
    }

    /**
     * Gets the value of the existingPoints property.
     * 
     */
    public int getExistingPoints() {
        return existingPoints;
    }

    /**
     * Sets the value of the existingPoints property.
     * 
     */
    public void setExistingPoints(int value) {
        this.existingPoints = value;
    }

    /**
     * Gets the value of the penalityPointsforDelayCalculation property.
     * 
     */
    public int getPenalityPointsforDelayCalculation() {
        return penalityPointsforDelayCalculation;
    }

    /**
     * Sets the value of the penalityPointsforDelayCalculation property.
     * 
     */
    public void setPenalityPointsforDelayCalculation(int value) {
        this.penalityPointsforDelayCalculation = value;
    }

    /**
     * Gets the value of the totalAmountByTotalPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmountByTotalPoints() {
        return totalAmountByTotalPoints;
    }

    /**
     * Sets the value of the totalAmountByTotalPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmountByTotalPoints(BigDecimal value) {
        this.totalAmountByTotalPoints = value;
    }

    /**
     * Gets the value of the penalityAmountForDelayCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalityAmountForDelayCalculation() {
        return penalityAmountForDelayCalculation;
    }

    /**
     * Sets the value of the penalityAmountForDelayCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenalityAmountForDelayCalculation(BigDecimal value) {
        this.penalityAmountForDelayCalculation = value;
    }

    /**
     * Gets the value of the latePaymetPenalityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatePaymetPenalityAmount() {
        return latePaymetPenalityAmount;
    }

    /**
     * Sets the value of the latePaymetPenalityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatePaymetPenalityAmount(BigDecimal value) {
        this.latePaymetPenalityAmount = value;
    }

    /**
     * Gets the value of the driverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Sets the value of the driverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverName(String value) {
        this.driverName = value;
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
     * Gets the value of the licenseRegionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseRegionDescription() {
        return licenseRegionDescription;
    }

    /**
     * Sets the value of the licenseRegionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseRegionDescription(String value) {
        this.licenseRegionDescription = value;
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
     * Gets the value of the licenseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * Sets the value of the licenseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNo(String value) {
        this.licenseNo = value;
    }

    /**
     * Gets the value of the orderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * Gets the value of the location property.
     * 
     */
    public int getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     */
    public void setLocation(int value) {
        this.location = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     */
    public int getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     */
    public void setPaymentStatus(int value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the actionTaken property.
     * 
     */
    public int getActionTaken() {
        return actionTaken;
    }

    /**
     * Sets the value of the actionTaken property.
     * 
     */
    public void setActionTaken(int value) {
        this.actionTaken = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
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

    /**
     * Gets the value of the plateRegion property.
     * 
     */
    public int getPlateRegion() {
        return plateRegion;
    }

    /**
     * Sets the value of the plateRegion property.
     * 
     */
    public void setPlateRegion(int value) {
        this.plateRegion = value;
    }

    /**
     * Gets the value of the newPlateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPlateCode() {
        return newPlateCode;
    }

    /**
     * Sets the value of the newPlateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPlateCode(String value) {
        this.newPlateCode = value;
    }

    /**
     * Gets the value of the newPlateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPlateNo() {
        return newPlateNo;
    }

    /**
     * Sets the value of the newPlateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPlateNo(String value) {
        this.newPlateNo = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the mainGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainGuid() {
        return mainGuid;
    }

    /**
     * Sets the value of the mainGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainGuid(String value) {
        this.mainGuid = value;
    }

    /**
     * Gets the value of the parentGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGuid() {
        return parentGuid;
    }

    /**
     * Sets the value of the parentGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGuid(String value) {
        this.parentGuid = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDate(String value) {
        this.eventDate = value;
    }

}
