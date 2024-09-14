package com.Booking;

import java.util.Scanner;


public class TrainMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean x = true;
        while (x){
            System.out.println("Welcome to Booking");
            System.out.println("1.Book tickets"+"  "+"2.Cancel Tickets"+"    "+"3.Exit");
            System.out.println("Enter you want:");
            int ticketBook = scanner.nextInt();
            switch (ticketBook){
                case 1:
                    System.out.println("Enter Name:");
                    String PassengerName = scanner.next();
                    System.out.println("Enter age:");
                    int Passengerage  = scanner.nextInt();
                    System.out.println("Enter BerthPreference:");
                    char PassengerBerth = scanner.next().charAt(0);
                    System.out.println("Enter train Name:");
                    scanner.nextLine();
                    String PassengerTrain =scanner.nextLine();
                    Passenger passenger = new Passenger(PassengerName,Passengerage,PassengerBerth,PassengerTrain);
                    BookTickets bookTickets = new BookTickets(passenger,Train.getInstance());
                    BookTickets.BookInfo(passenger);
            }



        }

    }

}
