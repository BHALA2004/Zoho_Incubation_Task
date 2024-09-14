package com.Booking;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class BookTickets {
    private Passenger passenger;
    private Train train;

    public static void print(Passenger passenger){

        System.out.println(passenger.getPassengerName());
        System.out.println(passenger.getAge());
        System.out.println(passenger.getBerthPreference());
        if(passenger.getBerthPreference()=='L'){
            System.out.println("Lower Berth Confirmed");
            System.out.println(passenger.getTrainName());
        }
        else if(passenger.getAge()=='U'){
            System.out.println("Upper Berth Confirmed");
        }
        else if(passenger.getAge()=='M'){
            System.out.println("Middle Berth Confirmed");
        }

    }

    public BookTickets(Passenger passenger, Train train) {
        this.passenger = passenger;
        this.train = train;
    }

    public static String BookInfo(Passenger passenger){
        char passengerBerth = passenger.getBerthPreference();
        if(passengerBerth=='L' && Train.getLowerBerth()!=-1){
            int m = Train.getLowerBerth()-1;
            Train.setLowerBerth(m);
            print(passenger);

        }
        return "Book Confirmed!";
    }
}
