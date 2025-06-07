package com.ParkingSystem;

import java.util.List;

public class Building {
    private int buildingId;
    private List<Floor> floors;

    public Building() {
    }

    public Building(int buildingId, List<Floor> floors) {
        this.buildingId = buildingId;
        this.floors = floors;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }
}
