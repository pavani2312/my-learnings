package com.collections;

public class Car {

    String carName;
    double mileage;
    int carNumber;

    public Car(String carName, double mileage, int carNumber) {
        this.carName = carName;
        this.mileage = mileage;
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", mileage=" + mileage +
                ", carNumber=" + carNumber +
                '}';
    }
}
