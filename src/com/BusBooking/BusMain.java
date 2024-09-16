package com.BusBooking;


import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;



public class BusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BusDetails> busDetails = new ArrayList<>();
        ArrayList<PassengerDetails> passengerDetails = new ArrayList<>();
        busDetails.add(new BusDetails(0,"Chennai",2,2));
        busDetails.add(new BusDetails(1,"Tirunelveli",2,2));
        boolean x = true;
        while (x){
            System.out.println("1.Book   2.Cancel  3.Display 4.Exit");
            System.out.print("Enter Value:");
            int m = scanner.nextInt();
            BusReservation busReservation = new BusReservation();
            switch (m){
                case 1:
                    System.out.println("Enter Passenger Name:");
                    String passengerName = scanner.next();
                    System.out.println("Enter Passanger Age");
                    int passengerAge = scanner.nextInt();
                    System.out.println("Enter Bus Number:");
                    int passengerBusNumber = scanner.nextInt();
                    PassengerDetails passenger = new PassengerDetails(passengerName,passengerAge,passengerBusNumber);

                    String m1 = busReservation.BookTickets(busDetails,passenger);
                    if(m1.equals("Book Successful")){
                        System.out.println("Book Sucessful");
                    } else if (m1.equals("You Are in Waiting List")) {
                        System.out.println("Waiting List Person");

                    } else if (m1.equals("No Seat Available")) {
                        System.out.println("No Seat Available");

                    } else {
                        System.out.println("No Bus Found");
                    }
                    break;
                case 2:
                    System.out.println("Enter Passenger Name:");
                    String x1 = scanner.next();
                    System.out.println("Enter Bus No:");
                    int value = scanner.nextInt();
                    String cancelled =busReservation.cancelTickets(BusReservation.waitingList,BusReservation.BookList,x1,value,busDetails);
                    if(cancelled.equals("Ticket Cancel")){
                        System.out.println("Ticket Cancel Successful");
                    }
                    break;

                case 3:
                    System.out.println("1.Book List 2.Waiting List ");
                    System.out.println("Enter value");
                    int g = scanner.nextInt();
                    if(g==1){
                        BusReservation.print(BusReservation.BookList);
                    }
                    else {
                        BusReservation.print(BusReservation.waitingList);
                    }
                    break;
                case 4:
                    x=false;
                    System.out.println("Exit");
            }
        }

    }

}
