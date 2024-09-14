package com.Booking;

public class Train {
    private static String trainName;
    private static int LowerBerth = 3;
    private static int MiddleBerth = 3;
    private static int UpperBerth = 3;

    static Train train = new Train(trainName);

    private Train(String trainName) {
        this.trainName = trainName;
    }

    public static Train getInstance(){
        return train;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public static int getLowerBerth() {
        return LowerBerth;
    }

    public static void setLowerBerth(int lowerBerth) {
        LowerBerth = lowerBerth;
    }

    public static int getMiddleBerth() {
        return MiddleBerth;
    }

    public static void setMiddleBerth(int middleBerth) {
        MiddleBerth = middleBerth;
    }

    public static int getUpperBerth() {
        return UpperBerth;
    }

    public static void setUpperBerth(int upperBerth) {
        UpperBerth = upperBerth;
    }

    @Override
    public String toString() {
        return "Train{" +
                "TrainName='" + trainName + '\'' +
                '}';
    }
}
