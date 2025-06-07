package com.ParkingSystem;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vehicle {

    private int vehicleId;
    private String vehicleNumberPlate;
    private char typeOfVehicle;
    private LocalTime startTime;
    private LocalDate startDate;
    private LocalTime endTime;
    private LocalDate endDate;

    private int cost;
    private int floorId;

    public Vehicle() {
    }

    public Vehicle(int vehicleId, String vehicleNumberPlate, char typeOfVehicle, LocalTime startTime, LocalDate startDate, LocalTime endTime, LocalDate endDate, int cost, int floorId) {
        this.vehicleId = vehicleId;
        this.vehicleNumberPlate = vehicleNumberPlate;
        this.typeOfVehicle = typeOfVehicle;
        this.startTime = startTime;
        this.startDate = startDate;
        this.endTime = endTime;
        this.endDate = endDate;
        this.cost = cost;
        this.floorId = floorId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNumberPlate() {
        return vehicleNumberPlate;
    }

    public void setVehicleNumberPlate(String vehicleNumberPlate) {
        this.vehicleNumberPlate = vehicleNumberPlate;
    }

    public char getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(char typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleNumberPlate='" + vehicleNumberPlate + '\'' +
                ", typeOfVehicle=" + typeOfVehicle +
                ", startTime=" + startTime +
                ", startDate=" + startDate +
                ", endTime=" + endTime +
                ", endDate=" + endDate +
                ", cost=" + cost +
                ", floorId=" + floorId +
                '}';
    }
}
