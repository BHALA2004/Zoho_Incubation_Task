package com.trainBooking;

import java.util.ArrayList;

public class TrainDetails {
    private int trainNo;
    private String TrainName;
    private int LowerBerthCapacity;
    private int MiddleBerthCapacity;
    private int UpperBerthCapacity;
    private int RACCapacity;
    private int WaitingListCapacity;

    private ArrayList<PassengerDetails> passengerDetails;

    public ArrayList<PassengerDetails> getPassengerDetails() {
        return passengerDetails;
    }

    public void setPassengerDetails(ArrayList<PassengerDetails> passengerDetails) {
        this.passengerDetails = passengerDetails;
    }

    public TrainDetails(int trainNo, String trainName, int lowerBerthCapacity, int middleBerthCapacity, int upperBerthCapacity, int RACCapacity, int waitingListCapacity) {
        this.trainNo = trainNo;
        TrainName = trainName;
        LowerBerthCapacity = lowerBerthCapacity;
        MiddleBerthCapacity = middleBerthCapacity;
        UpperBerthCapacity = upperBerthCapacity;
        this.RACCapacity = RACCapacity;
        WaitingListCapacity = waitingListCapacity;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainName() {
        return TrainName;
    }

    public void setTrainName(String trainName) {
        TrainName = trainName;
    }

    public int getLowerBerthCapacity() {
        return LowerBerthCapacity;
    }

    public void setLowerBerthCapacity(int lowerBerthCapacity) {
        LowerBerthCapacity = lowerBerthCapacity;
    }

    public int getMiddleBerthCapacity() {
        return MiddleBerthCapacity;
    }

    public void setMiddleBerthCapacity(int middleBerthCapacity) {
        MiddleBerthCapacity = middleBerthCapacity;
    }

    public int getUpperBerthCapacity() {
        return UpperBerthCapacity;
    }

    public void setUpperBerthCapacity(int upperBerthCapacity) {
        UpperBerthCapacity = upperBerthCapacity;
    }

    public int getRACCapacity() {
        return RACCapacity;
    }

    public void setRACCapacity(int RACCapacity) {
        this.RACCapacity = RACCapacity;
    }

    public int getWaitingListCapacity() {
        return WaitingListCapacity;
    }

    public void setWaitingListCapacity(int waitingListCapacity) {
        WaitingListCapacity = waitingListCapacity;
    }

    @Override
    public String toString() {
        return "TrainDetails{" +
                "trainNo=" + trainNo +
                ", TrainName='" + TrainName + '\'' +
                ", LowerBerthCapacity=" + LowerBerthCapacity +
                ", MiddleBerthCapacity=" + MiddleBerthCapacity +
                ", UpperBerthCapacity=" + UpperBerthCapacity +
                ", RACCapacity=" + RACCapacity +
                ", WaitingListCapacity=" + WaitingListCapacity +
                '}';
    }
}
