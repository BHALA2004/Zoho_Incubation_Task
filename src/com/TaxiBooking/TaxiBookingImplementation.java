package com.TaxiBooking;

import java.util.ArrayList;

public class TaxiBookingImplementation {





    public void printCustomer(ArrayList<CustomerDetails> customerDetailsArrayList){
        for(CustomerDetails c : customerDetailsArrayList){
            System.out.println(c.toString());
        }

    }


    public TaxiDetails findNearesttaxi(char startPoint,ArrayList<TaxiDetails> taxiDetails){
        TaxiDetails details = null;
        int min = Integer.MAX_VALUE;
        for(TaxiDetails t : taxiDetails){
            if(min>findDistance(startPoint,t.getStartPoint())){
                min = Math.min(min,findDistance(startPoint,t.getStartPoint()));
                details = t;
            }
        }
        return details;

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
