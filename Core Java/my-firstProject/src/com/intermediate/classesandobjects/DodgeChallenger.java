package com.intermediate.classesandobjects;

public class DodgeChallenger {
    public static void main(String[] args) {
        CarBluePrint carBluePrint = new CarBluePrint();
        carBluePrint.startEngine();
       // carBluePrint.getDescription();
        System.out.println("-----------------------------------------------");
        CarBluePrint anotherCarBluePrint = new CarBluePrint("orange");
        anotherCarBluePrint.startEngine();
    }
}
