package com.TaxiBooking;

import java.util.ArrayList;

public class BookingDetails {

    private int BookingId;
    private CustomerDetails customerDetails;
    private TaxiDetails taxiDetails;


    public BookingDetails(int bookingId, CustomerDetails customerDetails, TaxiDetails taxiDetails) {
        BookingId = bookingId;
        this.customerDetails = customerDetails;
        this.taxiDetails = taxiDetails;
    }

    public static void printCustomer(ArrayList<CustomerDetails> customerDetails){
        for(CustomerDetails c : customerDetails){
            System.out.println(c.toString());
        }
    }

    public static void printTaxi(ArrayList<TaxiDetails> taxiDetailsArrayList){
        for(TaxiDetails c : taxiDetailsArrayList){
            System.out.println(c.toString());
        }

    }

}
