package com.advanced.mathfunctions;

public class MathFunApp {
    public static void main(String[] args) {
        double tempYesterday =  -5.6;
        double tempToday = -Math.random() * 10;
        System.out.println("Absolute: " +Math.abs(tempToday));
        System.out.println("Min: " +Math.min(tempYesterday, tempToday));
        System.out.println("Max: " +Math.max(tempYesterday, tempToday));
        System.out.println("Round the Number: "+Math.round(tempToday));
        System.out.println("Ceiling: " +Math.ceil(tempToday));
        System.out.println("Floor: " +Math.floor(tempToday));
        System.out.println("Random Value: " +tempToday);
        System.out.println("Power: " +Math.pow(tempToday,2));
        System.out.println("Square Root: " +Math.sqrt(Math.abs(tempToday)));

    }
}
