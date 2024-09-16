package com.BusBooking;

import java.util.ArrayList;

public class BusReservation {

    static ArrayList<PassengerDetails> BookList = new ArrayList<>();
    static ArrayList<PassengerDetails> waitingList = new ArrayList<>();

    public static void print(ArrayList<PassengerDetails> Display){
        try{
        for(PassengerDetails p : Display){
            System.out.println(p.toString());
        }}
        catch (Exception e){
            System.out.println("No One is Book in this Bus");
        }

    }

    public static boolean findBus(ArrayList<BusDetails> busDetails,PassengerDetails passengerDetails){
        for(BusDetails bus : busDetails){
            if(bus.getBusNo()==passengerDetails.getBusNo()){
                return true;
            }
        }
        return false;
    }

    public static int searchBus(ArrayList<BusDetails> busDetails,PassengerDetails passengerDetails){
        int count  = 0;int g = 0;
        for(BusDetails b : busDetails){
            if(b.getBusNo()==passengerDetails.getBusNo()){
               return b.getBusNo();
            }

        }
        return g;



    }

    public static String  BookTickets(ArrayList<BusDetails> busDetails,PassengerDetails passengerDetails){

        if(BusReservation.findBus(busDetails,passengerDetails)){
            int m = BusReservation.searchBus(busDetails,passengerDetails);
            if(busDetails.get(m).getBusCapacity()-1>=0){
                BookList.add(passengerDetails);
                busDetails.get(m).setBusCapacity(busDetails.get(m).getBusCapacity()-1);

                return "Book Successful";
            }
            else if(busDetails.get(m).getBusWaitingListCapacity()-1>=0){
                waitingList.add(passengerDetails);
                busDetails.get(m).setBusWaitingListCapacity(busDetails.get(m).getBusWaitingListCapacity()-1);

                return "You Are in Waiting List";
            }
            else {
                return "No Seat Available";
            }
        }
        else {
            return "Bus Not Found";
        }
    }

    public static int isWaitingOrBookList(ArrayList<PassengerDetails> waitingList,ArrayList<PassengerDetails> bookList,String name,int trainNo){
        for(PassengerDetails p : waitingList){
            if(p.getBusNo()==trainNo && p.getPassengerName().equals(name)){
                return 1;
            }

        }
        return 0;


    }

    public static String cancelTickets(ArrayList<PassengerDetails> waitingList,ArrayList<PassengerDetails> bookList,String name,int BusNo,ArrayList<BusDetails> busDetails){
        if(isWaitingOrBookList(waitingList,bookList,name,BusNo)==1){
            waitingList.remove(waitingList.get(0));
            busDetails.get(BusNo).setBusWaitingListCapacity(busDetails.get(BusNo).getBusWaitingListCapacity()+1);
        }
        else {
            PassengerDetails temp = null;
            PassengerDetails temp1 = null;
            for(PassengerDetails p : bookList){
                if(p.getPassengerName().equals(name) && p.getBusNo()==BusNo){
                    //bookList.remove(p);
                    temp = p;
                    if(!waitingList.isEmpty()){
                       // bookList.add(waitingList.get(0));
                        temp1=waitingList.get(0);
                        //waitingList.remove(waitingList.get(0));
                        busDetails.get(BusNo).setBusWaitingListCapacity(busDetails.get(BusNo).getBusWaitingListCapacity()+1);

                    }
                    else {
                        busDetails.get(BusNo).setBusCapacity(busDetails.get(BusNo).getBusCapacity()+1);
                    }
                }
            }
            bookList.remove(temp);
            bookList.add(temp1);
            waitingList.remove(temp1);
        }
        return "Ticket Cancel";

    }

}
