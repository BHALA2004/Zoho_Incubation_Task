package com.TaxiBooking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaxiBookingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customerid = 0;
        int BookingId = 0;
        ArrayList<TaxiDetails> taxiDetailsArrayList = new ArrayList<>();
        ArrayList<CustomerDetails> customerDetailsArrayList = new ArrayList<>();
        ArrayList<BookingDetails> bookingDetails = new ArrayList<>();
        TaxiBookingImplementation taxiBookingImplementation = new TaxiBookingImplementation();
        System.out.println("Enter No of Taxi you may have:");
        int taxiCount = scanner.nextInt();
        for(int i = 0;i<taxiCount;i++){
            taxiDetailsArrayList.add(i,new TaxiDetails(i+1,'A',9,0));
        }
        boolean loopcase = true;
        while (loopcase){
            System.out.println("1.Book taxi  2.Display Book List 3.Exit");
            System.out.println("Enter Value you want :");
            int switchValue = scanner.nextInt();
            switch (switchValue){
                case 1:
                    System.out.println("Enter Start Point :");
                    char startpoint  = scanner.next().charAt(0);
                    System.out.println("Enter End point :");
                    char endpoint  = scanner.next().charAt(0);
                    System.out.println("Enter PickUp Time:");
                    int pickupTime = scanner.nextInt();
                    ArrayList<TaxiDetails> taxiDetailsList = taxiBookingImplementation.findTaxi(startpoint,pickupTime,taxiDetailsArrayList);
                    if(!taxiDetailsList.isEmpty()){
                        customerid+=1;
                        BookingId+=1;
                    Collections.sort(taxiDetailsList,(a,b)->a.getTaxiCharges()-b.getTaxiCharges());
                    CustomerDetails customerDetails = new CustomerDetails(customerid,startpoint,endpoint,pickupTime,taxiBookingImplementation.findCustomerCharges(startpoint,endpoint),taxiDetailsList.get(0).getTaxiNo());
                    customerDetailsArrayList.add(customerDetails);
                    int taxiCharges =taxiBookingImplementation.findTaxiCharges(startpoint,endpoint,taxiDetailsList.get(0));
                    int taxiTime = taxiBookingImplementation.findTime(startpoint,endpoint,taxiDetailsList.get(0));
                    taxiDetailsList.get(0).setStartPoint(customerDetails.getEndPoint());
                    taxiDetailsList.get(0).setTaxiCharges(taxiCharges);
                    taxiDetailsList.get(0).setStartTime(taxiTime);
                    bookingDetails.add(new BookingDetails(BookingId,customerDetails,taxiDetailsList.get(0)));
                        System.out.println("Booking Confirm");
                    }
                    else {
                        ArrayList<TaxiDetails> taxiDetails = taxiBookingImplementation.findAvailableTaxi(taxiDetailsArrayList,pickupTime);
                        if(!taxiDetails.isEmpty()){
                            TaxiDetails taxi = taxiBookingImplementation.findSmallestTaxi(taxiDetails,startpoint);
                            taxi.setStartPoint(startpoint);
                            customerid+=1;
                            BookingId+=1;
                            CustomerDetails customerDetails = new CustomerDetails(customerid,startpoint,endpoint,pickupTime,taxiBookingImplementation.findCustomerCharges(startpoint,endpoint),taxi.getTaxiNo());
                            customerDetailsArrayList.add(customerDetails);
                            int taxiCharges =taxiBookingImplementation.findTaxiCharges(startpoint,endpoint,taxi);
                            int taxiTime = taxiBookingImplementation.findTime(startpoint,endpoint,taxi);
                            taxi.setStartPoint(customerDetails.getEndPoint());
                            taxi.setTaxiCharges(taxiCharges);
                            taxi.setStartTime(taxiTime);
                            bookingDetails.add(new BookingDetails(BookingId,customerDetails,taxi));
                            System.out.println("Booking Confirm");

                        }
                        else {
                            System.out.println("Taxi Not available");
                        }


                    }
                    break;

                case 2:

                    BookingDetails.printTaxi(taxiDetailsArrayList);
                    BookingDetails.printCustomer(customerDetailsArrayList);break;

                case 3:
                    System.out.println("Exit");
                    loopcase=false;
                    break;



            }
        }

    }
}
