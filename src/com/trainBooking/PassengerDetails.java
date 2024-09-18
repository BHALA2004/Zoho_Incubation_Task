package com.trainBooking;

public class PassengerDetails {

    private int PassengerId;
    private String PassengerName;
    private int PassengerAge;
    private char PassengerBerthPreference;
    private String TrainName;
    private int TrainNo;

    public PassengerDetails(int passengerId, String passengerName, int passengerAge, char passengerBerthPreference, String trainName, int trainNo) {
        PassengerId = passengerId;
        PassengerName = passengerName;
        PassengerAge = passengerAge;
        PassengerBerthPreference = passengerBerthPreference;
        TrainName = trainName;
        TrainNo = trainNo;
    }

    public int getPassengerId() {
        return PassengerId;
    }

    public void setPassengerId(int passengerId) {
        PassengerId = passengerId;
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public void setPassengerName(String passengerName) {
        PassengerName = passengerName;
    }

    public int getPassengerAge() {
        return PassengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        PassengerAge = passengerAge;
    }

    public char getPassengerBerthPreference() {
        return PassengerBerthPreference;
    }

    public void setPassengerBerthPreference(char passengerBerthPreference) {
        PassengerBerthPreference = passengerBerthPreference;
    }

    public String getTrainName() {
        return TrainName;
    }

    public void setTrainName(String trainName) {
        TrainName = trainName;
    }

    public int getTrainNo() {
        return TrainNo;
    }

    public void setTrainNo(int trainNo) {
        TrainNo = trainNo;
    }

    @Override
    public String toString() {
        return "PassengerDetails{" +
                "PassengerId=" + PassengerId +
                ", PassengerName='" + PassengerName + '\'' +
                ", PassengerAge=" + PassengerAge +
                ", PassengerBerthPreference=" + PassengerBerthPreference +
                ", TrainName='" + TrainName + '\'' +
                ", TrainNo=" + TrainNo +
                '}';
    }
}
