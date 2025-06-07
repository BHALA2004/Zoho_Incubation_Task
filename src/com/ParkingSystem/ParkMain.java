package com.ParkingSystem;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkMain {
    static int floorId = 0;
    static int buildId = 0;
    static int vehicleId = 0;
    public static void main(String[] args) {

        ParkLogic parkLogic = new ParkLogic();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Floors you want:");
        int numberOfFloors = scanner.nextInt();
        List<Floor> floors = new ArrayList<>();
        List<Vehicle> vehicles = new ArrayList<>();
        for (int i =0;i<numberOfFloors;i++){
            System.out.println("Enter Number of Slots in Floor:");
            int slots = scanner.nextInt();
            floorId++;
            Floor floor = new Floor(floorId,slots);
            floors.add(floor);
        }
        buildId++;
        Building building = new Building(buildId,floors);

        while (true){
            System.out.println("1.Add Vehicle\n2.Exit Vehicle\n3.Display Vehicle List\n4.Display Floor List");
            System.out.println("Enter Option:");
            int value = scanner.nextInt();
            if(value==1){

                System.out.println("Enter Option (C/B) -> Car or Bike:");
                char vehicleType = scanner.next().charAt(0);
                if(vehicleType == 'C' || vehicleType=='c' ){
                    System.out.println("Enter Vehicle Number Plate:");
                    String vehicleNumberPlate = scanner.next();
                    int floorId = parkLogic.findFloorId(floors,'C');
                    if(floorId==0){
                        System.out.println("No Slots Avaible");
                    }
                    else{
                        vehicleId++;
                        Vehicle vehicle = new Vehicle(vehicleId,vehicleNumberPlate,vehicleType, LocalTime.now(), LocalDate.now(),null,null,0,floorId);
                        vehicles.add(vehicle);
                        System.out.println("Successfully Slotted");
                    }
                } else if (vehicleType=='B' || vehicleType =='b') {
                    System.out.println("Enter Vehicle Number Plate:");
                    String vehicleNumberPlate = scanner.next();
                    int floorId = parkLogic.findFloorId(floors,'B');
                    if(floorId==0){
                        System.out.println("No Slots Avaible");
                    }
                    else{
                        vehicleId++;
                        Vehicle vehicle = new Vehicle(vehicleId,vehicleNumberPlate,vehicleType, LocalTime.now(), LocalDate.now(),null,null,0,floorId);
                        vehicles.add(vehicle);
                        System.out.println("Successfully Slotted");
                    }
                } else {
                    System.out.println("Enter Valid Option");
                }


            } else if (value==2) {
                System.out.println("Enter Vehicle Number Plate:");
                String numberPlate = scanner.next();
                Vehicle findVehile = parkLogic.findVehicle(vehicles,numberPlate);
                if(findVehile!=null){
                    if(findVehile.getEndTime()!=null && findVehile.getEndDate()!=null){
                        System.out.println("Vehicle Already Exited");
                    }
                    else {
                        LocalDate endDate = LocalDate.now();
                        LocalTime endTime = LocalTime.now();
                        findVehile.setEndTime(endTime);
                        findVehile.setEndDate(endDate);
                        long minutes = Duration.between(endTime,findVehile.getStartTime()).toMinutes();
                        long cost = minutes*10;
                        String cost1 = String.valueOf(cost);
                        findVehile.setCost(Integer.parseInt(cost1));
                        System.out.println(findVehile.toString());
                        for (Floor floor : floors){
                            if(floor.getFloorId()==findVehile.getFloorId() && findVehile.getTypeOfVehicle()=='C' || findVehile.getTypeOfVehicle()=='c'){
                                floor.setNumberOfSlots(floor.getNumberOfSlots()+4);
                                break;
                            } else if (floor.getFloorId()==findVehile.getFloorId() && findVehile.getTypeOfVehicle()=='B' || findVehile.getTypeOfVehicle()=='b') {
                                floor.setNumberOfSlots(floor.getNumberOfSlots()+2);
                                break;
                            }
                        }
                        System.out.println("Vehicle Removed");
                    }
                }
                else {
                    System.out.println("NO such Vehicle Found");
                }
            } else if (value == 3) {
                System.out.println(vehicles);
            } else if (value == 4) {
                System.out.println(floors);
            }
        }

    }
}
