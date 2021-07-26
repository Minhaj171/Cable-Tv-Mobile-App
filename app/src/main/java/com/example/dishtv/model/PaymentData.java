package com.example.dishtv.model;

/**
 * Created by MD Minhajul Islam on 6/15/2021.
 */
public class PaymentData {
    int paymentAmount;
    String cardUserName;
    int cardNumber;
    String expiryDate;
    String securityData;
    int userPostal;

    public PaymentData(int paymentAmount, String cardUserName, int cardNumber, String expiryDate, String securityData, int userPostal) {
        this.paymentAmount = paymentAmount;
        this.cardUserName = cardUserName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityData = securityData;
        this.userPostal = userPostal;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getCardUserName() {
        return cardUserName;
    }

    public void setCardUserName(String cardUserName) {
        this.cardUserName = cardUserName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getSecurityData() {
        return securityData;
    }

    public void setSecurityData(String securityData) {
        this.securityData = securityData;
    }

    public int getUserPostal() {
        return userPostal;
    }

    public void setUserPostal(int userPostal) {
        this.userPostal = userPostal;
    }

    @Override
    public String toString() {
        return "PaymentData{" +
                "paymentAmount=" + paymentAmount +
                ", cardUserName='" + cardUserName + '\'' +
                ", cardNumber=" + cardNumber +
                ", expiryDate='" + expiryDate + '\'' +
                ", securityData='" + securityData + '\'' +
                ", userPostal=" + userPostal +
                '}';
    }
}
