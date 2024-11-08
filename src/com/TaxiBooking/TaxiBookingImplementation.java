package com.TaxiBooking;

import java.util.ArrayList;

public class TaxiBookingImplementation {

    public ArrayList<TaxiDetails> findAvailableTaxi(ArrayList<TaxiDetails> taxiDetails,int pickupTime){
        ArrayList<TaxiDetails> AvailableTaxi = new ArrayList<>();
        for(TaxiDetails t : taxiDetails){
            if(pickupTime >=t.getStartTime()){
                AvailableTaxi.add(t);
            }
        }
        return AvailableTaxi;
    }

    public TaxiDetails findSmallestTaxi(ArrayList<TaxiDetails> taxiDetails,char startPoint){
        int min = Integer.MAX_VALUE;TaxiDetails taxi = null;
        for(TaxiDetails t : taxiDetails){
            if(min>findDistance(startPoint,t.getStartPoint())){
                min=Math.min(min,findDistance(startPoint,t.getStartPoint()));
                taxi=t;
            }
        }
        return taxi;

    }

    public void printCustomer(ArrayList<CustomerDetails> customerDetailsArrayList){
        for(CustomerDetails c : customerDetailsArrayList){
            System.out.println(c.toString());
        }

    }


    public ArrayList<TaxiDetails> findTaxi(int startPoint, int pickupTime, ArrayList<TaxiDetails> taxiDetailsArrayList){
       ArrayList<TaxiDetails> taxiDetailsList = new ArrayList<>();
        for(TaxiDetails t : taxiDetailsArrayList){
            if(t.getStartTime()<=pickupTime && t.getStartPoint()== startPoint){
                taxiDetailsList.add(t);
            }
        }
        return taxiDetailsList;
    }

    public int findTaxiCharges(char startPoint,char endPoint,TaxiDetails t){
        int Km = 0;
        int m = findDistance(startPoint,endPoint);
        Km = (m*15)-5;
        return t.getTaxiCharges()+100+(Km*10);


    }

    public int findCustomerCharges(char startPoint,char endPoint){
        int Km = 0;
        int m = findDistance(startPoint,endPoint);
        Km = (m*15)-5;
        return 100+(Km*10);


    }

    public int findDistance(char startPoint , char endPoint){
        return Math.abs(endPoint-startPoint);
    }

    public int findTime(char startPoint , char endPoint,TaxiDetails t){
        return Math.abs(endPoint-startPoint)+t.getStartTime();
    }

}
