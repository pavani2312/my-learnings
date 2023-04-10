package com.intermediate.classesandobjects;

public class CarBluePrint {
    private byte numberOfSeats = 5;
    private byte numberOfDoors = 3;
    private byte numberOfVehicleOwners = 1;
    private byte emissionSticker = 4;
    //short
    private short power = 362;
    private short horsePower = 492;
    private short co2Emission = 333;
    private short cubicCapacity = 6417;
    //int
    private int price = 29999;
    private int mileage = 14999;
    //long
    private long registrationNumber = 134513532145234553L;
    //float
    private float fuelConsumptionCombined = 15.5F;
    private float fuelConsumptionUrban = 21.4F;
    private float fuelConsumptionExtraUrban = 13.6F;
    //double
    private double fuelConsumptionPreciseAverage = 153.24465879879E-1;
    //boolean
    private boolean isDamaged = true;
    //char
    private char energyEfficiencyCategory = 'G';
    private String color;

    //default constructor
    CarBluePrint(){
        System.out.println("This is a constructor");
    }

    //Parameter Constructor
    CarBluePrint(String color){
        this.color = color;
        System.out.println("A " +color + " car this is ");
    }

    public void startEngine(){
        System.out.println("Engine Started");
    }

    public void getDescription(){
        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + "Km");
        System.out.println("The car is damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity);
        System.out.println("Power: " + power + "kW(" + horsePower + "hp)");
        System.out.println("CO2 emission: " + co2Emission + "g/km");
        System.out.println("Emission sticker: " + emissionSticker + " ( Energy efficiency: " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + "l/100km");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + "l/100km");
        System.out.println("Extra urban fuel consumption: " + fuelConsumptionExtraUrban + "l/100km");
        System.out.println("Precise combined fuel consumption: " + fuelConsumptionPreciseAverage + "l/100km");
        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);
    }
}
