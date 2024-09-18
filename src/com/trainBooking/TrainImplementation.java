package com.trainBooking;

import com.TaxiBooking.TaxiDetails;

import java.util.ArrayList;

public class TrainImplementation {

    public TrainDetails findtrain(ArrayList<TrainDetails> train,String trainName){
        for(TrainDetails t : train){
            if(t.getTrainName().equals(trainName)){
                return t;
            }
        }
        return null;

    }
    public String findBerth(TrainDetails t , char Berth){
        if(Berth=='L'){
            if(t.getLowerBerthCapacity()>0){
                return "L";
            }
        } else if (Berth=='M') {
            if(t.getMiddleBerthCapacity()>0){
                return "M";

            }
        } else if (Berth=='U') {
            if(t.getUpperBerthCapacity()>0){
                return "U";
            }
        } else if (Berth=='R') {
            if(t.getRACCapacity()>0){
                return "R";
            }
        }
        else if(Berth=='W'){
            if(t.getWaitingListCapacity()>0){
                return "W";
            }
        }
        return "waste";
    }

    public void print(char berth){
        System.out.println("Booking Confirmed");
        if(berth=='L'){
            System.out.println("Lower Berth is Allocated for u");
        }
        if(berth=='M'){
            System.out.println("Middle Berth is Allocated for u");
        }
        if(berth=='U'){
            System.out.println("Upper Berth is Allocated for u");
        }
        if(berth=='R'){
            System.out.println("RAC is Allocated for u");
        }
        if(berth=='W'){
            System.out.println("YOu are In Waiting List");
        }
    }

    public ArrayList<Character> getArrayList(char berth){
        ArrayList<Character> arrayList = new ArrayList<>();
        if(berth=='L'){
            arrayList.add('M');arrayList.add('U');arrayList.add('R');arrayList.add('W');
        } else if (berth=='M') {
            arrayList.add('L');arrayList.add('U');arrayList.add('R');arrayList.add('W');
        } else if (berth=='U') {
            arrayList.add('L');arrayList.add('M');arrayList.add('R');arrayList.add('W');
        }
        else if(berth=='R'){
            arrayList.add('L');arrayList.add('M');arrayList.add('U');arrayList.add('W');
        } else if (berth=='W') {
            arrayList.add('L');arrayList.add('M');arrayList.add('U');arrayList.add('R');
        }
        return arrayList;
    }


}
