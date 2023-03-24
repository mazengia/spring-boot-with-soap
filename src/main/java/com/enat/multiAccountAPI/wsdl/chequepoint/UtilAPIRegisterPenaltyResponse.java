//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:23:05 AM EAT 
//


package com.enat.multiAccountAPI.wsdl.chequepoint;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilAPIRegisterPenaltyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilAPIRegisterPenaltyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OffensePoint" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OffenseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PointPenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LatePaymentPenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DelayPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalPoints" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="IsVoid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsPaid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SuspensionDuration" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SuspensionMonths" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PaymentOrderNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DriverID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilAPIRegisterPenaltyResponse", propOrder = {
    "isSuspended",
    "offensePoint",
    "offenseAmount",
    "pointPenaltyAmount",
    "latePaymentPenaltyAmount",
    "delayPoints",
    "totalPoints",
    "paymentAmount",
    "isVoid",
    "isPaid",
    "suspensionDuration",
    "suspensionMonths",
    "paymentOrderNo",
    "paymentStatus",
    "driverID",
    "errorCode",
    "errorMessage"
})
public class UtilAPIRegisterPenaltyResponse {

    @XmlElement(name = "IsSuspended")
    protected boolean isSuspended;
    @XmlElement(name = "OffensePoint")
    protected int offensePoint;
    @XmlElement(name = "OffenseAmount", required = true)
    protected BigDecimal offenseAmount;
    @XmlElement(name = "PointPenaltyAmount", required = true)
    protected BigDecimal pointPenaltyAmount;
    @XmlElement(name = "LatePaymentPenaltyAmount", required = true)
    protected BigDecimal latePaymentPenaltyAmount;
    @XmlElement(name = "DelayPoints")
    protected int delayPoints;
    @XmlElement(name = "TotalPoints")
    protected int totalPoints;
    @XmlElement(name = "PaymentAmount", required = true)
    protected BigDecimal paymentAmount;
    @XmlElement(name = "IsVoid")
    protected boolean isVoid;
    @XmlElement(name = "IsPaid")
    protected boolean isPaid;
    @XmlElement(name = "SuspensionDuration")
    protected int suspensionDuration;
    @XmlElement(name = "SuspensionMonths")
    protected int suspensionMonths;
    @XmlElement(name = "PaymentOrderNo")
    protected int paymentOrderNo;
    @XmlElement(name = "PaymentStatus")
    protected int paymentStatus;
    @XmlElement(name = "DriverID")
    protected String driverID;
    @XmlElement(name = "ErrorCode")
    protected int errorCode;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;

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
     * Gets the value of the offensePoint property.
     * 
     */
    public int getOffensePoint() {
        return offensePoint;
    }

    /**
     * Sets the value of the offensePoint property.
     * 
     */
    public void setOffensePoint(int value) {
        this.offensePoint = value;
    }

    /**
     * Gets the value of the offenseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffenseAmount() {
        return offenseAmount;
    }

    /**
     * Sets the value of the offenseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffenseAmount(BigDecimal value) {
        this.offenseAmount = value;
    }

    /**
     * Gets the value of the pointPenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointPenaltyAmount() {
        return pointPenaltyAmount;
    }

    /**
     * Sets the value of the pointPenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointPenaltyAmount(BigDecimal value) {
        this.pointPenaltyAmount = value;
    }

    /**
     * Gets the value of the latePaymentPenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatePaymentPenaltyAmount() {
        return latePaymentPenaltyAmount;
    }

    /**
     * Sets the value of the latePaymentPenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatePaymentPenaltyAmount(BigDecimal value) {
        this.latePaymentPenaltyAmount = value;
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
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentAmount(BigDecimal value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the isVoid property.
     * 
     */
    public boolean isIsVoid() {
        return isVoid;
    }

    /**
     * Sets the value of the isVoid property.
     * 
     */
    public void setIsVoid(boolean value) {
        this.isVoid = value;
    }

    /**
     * Gets the value of the isPaid property.
     * 
     */
    public boolean isIsPaid() {
        return isPaid;
    }

    /**
     * Sets the value of the isPaid property.
     * 
     */
    public void setIsPaid(boolean value) {
        this.isPaid = value;
    }

    /**
     * Gets the value of the suspensionDuration property.
     * 
     */
    public int getSuspensionDuration() {
        return suspensionDuration;
    }

    /**
     * Sets the value of the suspensionDuration property.
     * 
     */
    public void setSuspensionDuration(int value) {
        this.suspensionDuration = value;
    }

    /**
     * Gets the value of the suspensionMonths property.
     * 
     */
    public int getSuspensionMonths() {
        return suspensionMonths;
    }

    /**
     * Sets the value of the suspensionMonths property.
     * 
     */
    public void setSuspensionMonths(int value) {
        this.suspensionMonths = value;
    }

    /**
     * Gets the value of the paymentOrderNo property.
     * 
     */
    public int getPaymentOrderNo() {
        return paymentOrderNo;
    }

    /**
     * Sets the value of the paymentOrderNo property.
     * 
     */
    public void setPaymentOrderNo(int value) {
        this.paymentOrderNo = value;
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
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}