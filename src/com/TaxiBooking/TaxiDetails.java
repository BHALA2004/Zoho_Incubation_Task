package com.TaxiBooking;

public class TaxiDetails {
    private int taxiNo;
    private char startPoint;
    private int startTime;
    private int taxiCharges;

    public TaxiDetails(int taxiNo, char startPoint, int startTime, int taxiCharges) {
        this.taxiNo = taxiNo;
        this.startPoint = startPoint;
        this.startTime = startTime;
        this.taxiCharges = taxiCharges;
    }


    public int getTaxiNo() {
        return taxiNo;
    }

    public void setTaxiNo(int taxiNo) {
        this.taxiNo = taxiNo;
    }

    public char getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(char startPoint) {
        this.startPoint = startPoint;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getTaxiCharges() {
        return taxiCharges;
    }

    public void setTaxiCharges(int taxiCharges) {
        this.taxiCharges = taxiCharges;
    }

    @Override
    public String toString() {
        return "TaxiDetails{" +
                "taxiNo=" + taxiNo +
                ", startPoint=" + startPoint +
                ", startTime=" + startTime +
                ", taxiCharges=" + taxiCharges +
                '}';
    }
}
