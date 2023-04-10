package com.intermediate.abstraction;

public abstract class Athlete {
    private String name;
    private String nickName;
    private int dateOfBirth;
    private String team;
    private int numberOfCompetitions;

    public Athlete(String name, String nickName, int dateOfBirth, String team, int numberOfCompetitions) {
        this.name = name;
        this.nickName = nickName;
        this.dateOfBirth = dateOfBirth;
        this.team = team;
        this.numberOfCompetitions = numberOfCompetitions;
    }

    public String getName() {
        return name;
    }

    public void getBio(){
        System.out.println(name+" ( "+nickName+ " )");
        System.out.println("Born in: "+dateOfBirth);
        System.out.println("Team is " +team+ " and the games played are "+numberOfCompetitions);
    }

    public void compete() {
        System.out.println(name + " took part in a competition.");
        numberOfCompetitions++;
    }


    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public abstract String getCharacter();
}
