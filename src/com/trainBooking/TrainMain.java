package com.trainBooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PassengerId=0;
        ArrayList<TrainDetails> trainDetailsArrayList = new ArrayList<>();
        ArrayList<PassengerDetails> passengerDetailsArrayList = new ArrayList<>();
        TrainImplementation trainImplementation = new TrainImplementation();
        boolean loopcase = true;
        System.out.println("Enter No of Trains:");
        int trainSize = scanner.nextInt();
        for(int i = 0;i<trainSize;i++){
            scanner.nextLine();
            System.out.println("Enter Train Name:");
            String trainName = scanner.nextLine();
            System.out.println("Enter Train  Lower Berth Capacity:");
            int trainLBC = scanner.nextInt();
            System.out.println("Enter Train  Middle Berth Capacity:");
            int trainMBC = scanner.nextInt();
            System.out.println("Enter Train  Upper Berth Capacity:");
            int trainUBC = scanner.nextInt();
            System.out.println("Enter Train  RAC Capacity:");
            int trainRAC = scanner.nextInt();
            System.out.println("Enter Train  Waiting Capacity:");
            int trainWL = scanner.nextInt();
            trainDetailsArrayList.add(new TrainDetails(i+1,trainName,trainLBC,trainMBC,trainUBC,trainRAC,trainWL));
        }
        while (loopcase){
            System.out.println("1.Book Tickets  2.Cancel  3.Show Available Tickets   4.Show Booked Details  5.Exit");
            System.out.println("Enter Value:");
            int value = scanner.nextInt();
            switch (value){
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter Passenger Name:");
                    String passengerName = scanner.nextLine();
                    System.out.println("Enter Passenger Age:");
                    int passengerAge = scanner.nextInt();
                    System.out.println("Enter Passenger Berth preference");
                    char passengerBerth = scanner.next().charAt(0);
                    scanner.nextLine();
                    System.out.println("Enter Train Name:");
                    String trainName = scanner.nextLine();
                    TrainDetails trainDetails = trainImplementation.findtrain(trainDetailsArrayList,trainName);
                    if(trainDetails!=null){
                        String berth = trainImplementation.findBerth(trainDetails,passengerBerth);
                        if(!berth.equals("waste")){
                            if(berth.equals("L")){
                                int m = trainDetails.getLowerBerthCapacity()-1;
                                trainDetails.setLowerBerthCapacity(m);
                                PassengerId+=1;
                                passengerDetailsArrayList.add(new PassengerDetails(PassengerId,passengerName,passengerAge,passengerBerth, trainDetails.getTrainName(), trainDetails.getTrainNo()));
                                trainImplementation.print(passengerBerth);
                            } else if (berth.equals("M")) {
                                int m = trainDetails.getMiddleBerthCapacity()-1;
                                trainDetails.setMiddleBerthCapacity(m);
                                PassengerId+=1;
                                passengerDetailsArrayList.add(new PassengerDetails(PassengerId,passengerName,passengerAge,passengerBerth, trainDetails.getTrainName(), trainDetails.getTrainNo()));
                                trainImplementation.print(passengerBerth);
                            } else if (berth.equals("U")) {
                                int m = trainDetails.getUpperBerthCapacity()-1;
                                trainDetails.setUpperBerthCapacity(m);
                                PassengerId+=1;
                                passengerDetailsArrayList.add(new PassengerDetails(PassengerId,passengerName,passengerAge,passengerBerth, trainDetails.getTrainName(), trainDetails.getTrainNo()));
                                trainImplementation.print(passengerBerth);
                            } else if (berth.equals("R")) {
                                int m = trainDetails.getRACCapacity()-1;
                                trainDetails.setRACCapacity(m);
                                PassengerId+=1;
                                passengerDetailsArrayList.add(new PassengerDetails(PassengerId,passengerName,passengerAge,passengerBerth, trainDetails.getTrainName(), trainDetails.getTrainNo()));
                                trainImplementation.print(passengerBerth);
                            } else if (berth.equals("W")) {
                                int m = trainDetails.getWaitingListCapacity()-1;
                                trainDetails.setWaitingListCapacity(m);
                                PassengerId+=1;
                                passengerDetailsArrayList.add(new PassengerDetails(PassengerId,passengerName,passengerAge,passengerBerth, trainDetails.getTrainName(), trainDetails.getTrainNo()));
                                trainImplementation.print(passengerBerth);
                            }

                        }
                        else {
                            int totalSeat = trainDetails.getLowerBerthCapacity()+trainDetails.getMiddleBerthCapacity()+trainDetails.getUpperBerthCapacity()+trainDetails.getRACCapacity()+trainDetails.getWaitingListCapacity();
                            if(totalSeat!=0){
                            ArrayList<Character> arrayList = trainImplementation.getArrayList(passengerBerth);
                                for(int i = 0;i<arrayList.size();i++){
                                    if(trainImplementation.findBerth(trainDetails,arrayList.get(i)).equals("L")){
                                        int m = trainDetails.getLowerBerthCapacity()-1;
                                        trainDetails.setLowerBerthCapacity(m);
                                        PassengerId+=1;
                                        passengerDetailsArrayList.add(new PassengerDetails(PassengerId,passengerName,passengerAge,'L', trainDetails.getTrainName(), trainDetails.getTrainNo()));
                                        trainImplementation.print('L');
                                        break;
                                    }
                                    else if(trainImplementation.findBerth(trainDetails,arrayList.get(i)).equals("M")){
                                        int m = trainDetails.getMiddleBerthCapacity()-1;
                                        trainDetails.setMiddleBerthCapacity(m);
                                        PassengerId+=1;
                                        passengerDetailsArrayList.add(new PassengerDetails(PassengerId,passengerName,passengerAge,'M', trainDetails.getTrainName(), trainDetails.getTrainNo()));trainImplementation.print('M');break;
                                    }
                                    else if(trainImplementation.findBerth(trainDetails,arrayList.get(i)).equals("U")){
                                        int m = trainDetails.getUpperBerthCapacity()-1;
                                        trainDetails.setUpperBerthCapacity(m);
                                        PassengerId+=1;
                                        passengerDetailsArrayList.add(new PassengerDetails(PassengerId,passengerName,passengerAge,'U', trainDetails.getTrainName(), trainDetails.getTrainNo()));trainImplementation.print('U');break;
                                    }
                                    else if(trainImplementation.findBerth(trainDetails,arrayList.get(i)).equals("R")){
                                        int m = trainDetails.getRACCapacity()-1;
                                        trainDetails.setRACCapacity(m);
                                        PassengerId+=1;
                                        passengerDetailsArrayList.add(new PassengerDetails(PassengerId,passengerName,passengerAge,'R', trainDetails.getTrainName(), trainDetails.getTrainNo()));trainImplementation.print('R');break;
                                    }
                                    else if(trainImplementation.findBerth(trainDetails,arrayList.get(i)).equals("W")){
                                        int m = trainDetails.getWaitingListCapacity()-1;
                                        trainDetails.setWaitingListCapacity(m);
                                        PassengerId+=1;
                                        passengerDetailsArrayList.add(new PassengerDetails(PassengerId,passengerName,passengerAge,'W', trainDetails.getTrainName(), trainDetails.getTrainNo()));trainImplementation.print('W');break;
                                    }
                                }
                        }
                        else {
                                System.out.println("Seat Not Available");}
                        }
                    }
                    else {
                        System.out.println("Train Not Found");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println(trainDetailsArrayList.toString());break;
                case 4:
                    System.out.println(passengerDetailsArrayList.toString());break;
                case 5:
                    loopcase=false;
                    System.out.println("Exit");


            }
        }
    }
}