package com.ParkingSystem;

import java.util.List;

public class ParkLogic {

    private final static int carSlotLimit = 4;
    private final static int bikeSlotLimit = 2;
    public int findFloorId(List<Floor> floors,char typeVehicle){
        if(typeVehicle=='C' || typeVehicle == 'c'){
            for (Floor floor : floors){
                if(floor.getNumberOfSlots()>=carSlotLimit){
                    int remainSlots = floor.getNumberOfSlots()-carSlotLimit;
                    floor.setNumberOfSlots(remainSlots);
                 return floor.getFloorId();
                }
            }
        }
        else {
            for (Floor floor : floors){
                if(floor.getNumberOfSlots()>=bikeSlotLimit){
                    int remainSlots = floor.getNumberOfSlots()-bikeSlotLimit;
                    floor.setNumberOfSlots(remainSlots);
                    return floor.getFloorId();
                }
            }
        }
        return 0;
    }

    public Vehicle findVehicle(List<Vehicle> vehicles,String numberPlate){
        for (Vehicle vehicle : vehicles){
            if(vehicle.getVehicleNumberPlate().equals(numberPlate)){
               return vehicle;
            }
        }
        return null;
    }

}
