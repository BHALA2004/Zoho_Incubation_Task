package com.BusBooking;

public class PassengerDetails {



    private String PassengerName;
    private int age;
    private int BusNo;

    public PassengerDetails(String passengerName, int age, int busNo) {
        PassengerName = passengerName;
        this.age = age;
        BusNo = busNo;
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

    public int getBusNo() {
        return BusNo;
    }

    public void setBusNo(int busNo) {
        BusNo = busNo;
    }

    @Override
    public String toString() {
        return "PassengerDetails{" +
                "PassengerName='" + PassengerName + '\'' +
                ", age=" + age +
                ", BusNo=" + BusNo +
                '}';
    }
}
