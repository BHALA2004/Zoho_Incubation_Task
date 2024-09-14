package com.Booking;

public class Passenger {

    private String PassengerName;
    private int age;
    private char BerthPreference;
    private String TrainName;

    public Passenger(String passengerName, int age, char berthPreference, String trainName) {
        PassengerName = passengerName;
        this.age = age;
        BerthPreference = berthPreference;
        TrainName = trainName;
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public void setPassengerName(String passengerName) {
        PassengerName = passengerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getBerthPreference() {
        return BerthPreference;
    }

    public void setBerthPreference(char berthPreference) {
        BerthPreference = berthPreference;
    }

    public String getTrainName() {
        return TrainName;
    }

    public void setTrainName(String trainName) {
        TrainName = trainName;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "PassengerName='" + PassengerName + '\'' +
                ", age=" + age +
                ", BerthPreference=" + BerthPreference +
                ", TrainName='" + TrainName + '\'' +
                '}';
    }
}
