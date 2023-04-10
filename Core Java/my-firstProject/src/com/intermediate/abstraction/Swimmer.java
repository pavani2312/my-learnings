package com.intermediate.abstraction;

public class Swimmer extends Athlete implements Swimming{

     int finaPoints;
    public Swimmer(String name, String nickName, int dateOfBirth, String team, int numberOfCompetitions, int finaPoints) {
        super(name, nickName, dateOfBirth, team, numberOfCompetitions);
        this.finaPoints = finaPoints;
    }

    @Override
    public String getCharacter() {
        return "Super and energetic.";
    }

    @Override
    public void freeStyle() {
        System.out.println("Swimming freestyle very fast.");
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("FINA points: " + finaPoints);
    }

    @Override
    public void compete() {
        super.compete();
        freeStyle();
    }
}
