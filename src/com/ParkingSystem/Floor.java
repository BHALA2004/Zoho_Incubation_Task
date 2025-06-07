package com.ParkingSystem;

public class Floor {
    private int floorId;

    private int numberOfSlots;

    public Floor(int floorId, int numberOfSlots) {
        this.floorId = floorId;
        this.numberOfSlots = numberOfSlots;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "floorId=" + floorId +
                ", numberOfSlots=" + numberOfSlots +
                '}';
    }
}
