package com.beginner;

import java.util.Locale;

public class ObjectReferences {

    public static void main(String[] args) {
        //Object References or Non-Primitive Data-Types
        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNumber = 23452352345245234L;

        Float fuelConsumptionUrban = 15.5F;
        Double fuelConsumptionPreciseAverage = 15.235252345;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';
        //String
        String carType = "Dodge Challenger SRT 392";
        String newCarType = new String("Dodge Challenger SRT 392");

        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Horsepower: " + horsePower + "hp");
        System.out.println("Price: $" + price.floatValue());//using In Built Functions with these Object References
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + "l/100km");
        System.out.println("Precise average fuel consumption: " + fuelConsumptionPreciseAverage.intValue() + "l/100km");
        System.out.println("The car is damaged: " + isDamaged);
        System.out.println("Energy efficiency category: " + energyEfficiencyCategory);
        System.out.println("Car model: " + carType);
        System.out.println("Car model with Lower Case method: " + carType.toLowerCase());//String Functions
        System.out.println("Car model with Upper Case method: " + carType.toUpperCase());
        System.out.println("Car model and new car model comparing with equals(): " + carType.equals(newCarType));
        System.out.println("Car model with new keyword: " + newCarType);


    }
}
