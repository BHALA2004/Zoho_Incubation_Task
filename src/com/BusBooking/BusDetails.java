package com.BusBooking;

public class BusDetails {

    private int BusNo;
    private String BusName;
    private static int BusCapacity;

    private static int BusWaitingListCapacity;


    public BusDetails(int busNo, String busName, int busCapacity, int busWaitingListCapacity) {
        BusNo = busNo;
        BusName = busName;
        BusCapacity = busCapacity;
        BusWaitingListCapacity = busWaitingListCapacity;
    }

    public int getBusNo() {
        return BusNo;
    }

    public void setBusNo(int busNo) {
        BusNo = busNo;
    }

    public String getBusName() {
        return BusName;
    }

    public void setBusName(String busName) {
        BusName = busName;
    }

    public int getBusCapacity() {
        return BusCapacity;
    }

    public void setBusCapacity(int busCapacity) {
        BusCapacity = busCapacity;
    }

    public int getBusWaitingListCapacity() {
        return BusWaitingListCapacity;
    }

    public void setBusWaitingListCapacity(int busWaitingListCapacity) {
        BusWaitingListCapacity = busWaitingListCapacity;
    }
}
