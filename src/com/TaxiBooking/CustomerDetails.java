package com.TaxiBooking;

public class CustomerDetails {
    private int customerId;
    private char startPoint;
    private char endPoint;
    private int pichUpTime;

    private int customerCharges;

    private int taxiNo;

    public CustomerDetails(int customerId, char startPoint, char endPoint, int pichUpTime, int customerCharges, int taxiNo) {
        this.customerId = customerId;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.pichUpTime = pichUpTime;
        this.customerCharges = customerCharges;
        this.taxiNo = taxiNo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public char getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(char startPoint) {
        this.startPoint = startPoint;
    }

    public char getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(char endPoint) {
        this.endPoint = endPoint;
    }

    public int getPichUpTime() {
        return pichUpTime;
    }

    public void setPichUpTime(int pichUpTime) {
        this.pichUpTime = pichUpTime;
    }

    public int getCustomerCharges() {
        return customerCharges;
    }

    public void setCustomerCharges(int customerCharges) {
        this.customerCharges = customerCharges;
    }

    public int getTaxiNo() {
        return taxiNo;
    }

    public void setTaxiNo(int taxiNo) {
        this.taxiNo = taxiNo;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "customerId=" + customerId +
                ", startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                ", pichUpTime=" + pichUpTime +
                ", customerCharges=" + customerCharges +
                ", taxiNo=" + taxiNo +
                '}';
    }
}
