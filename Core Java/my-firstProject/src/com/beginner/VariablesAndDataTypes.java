package com.beginner;

public class VariablesAndDataTypes {
    public static void main(String[] args) {
        //Primitive data types
        //byte
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;
        //short
        short power = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;
        //int
        int price = 29999;
        int mileage = 14999;
        //long
        long registrationNumber = 134513532145234553L;
        //float
        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;
        //double
        double fuelConsumptionPreciseAverage = 153.24465879879E-1;
        //boolean
        boolean isDamaged = true;
        //char
        char energyEfficiencyCategory = 'G';

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

        //Conversion
        System.out.println("Conversion");
        short newNumberOfSeats = numberOfSeats;//widening from small to big (byte -> short)
        System.out.println("The Values Of new Number Of Seats :" +newNumberOfSeats);
        double newFuelConsumptionCombined = fuelConsumptionCombined;//widening (float -> double)
        System.out.println("The new value of combined fuel Consumption:" +newFuelConsumptionCombined);
        //Narrowing
        byte newPower = (byte)power; //(short -> byte)
        System.out.println("The Value of New Power: " +newPower+ "KW");//this will short the data

    }
}
