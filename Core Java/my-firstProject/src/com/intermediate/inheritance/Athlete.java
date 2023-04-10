package com.intermediate.inheritance;

public class Athlete {
    private String name;
    private String nickName;
    private int dateOfBirth;
    private String team;
    private int gamesPlayed;

    public Athlete(String name, String nickName, int dateOfBirth, String team, int gamesPlayed) {
        this.name = name;
        this.nickName = nickName;
        this.dateOfBirth = dateOfBirth;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public void getBio(){
        System.out.println(name+" ( "+nickName+ " )");
        System.out.println("Born in: "+dateOfBirth);
        System.out.println("Team is " +team+ " and the games played are "+gamesPlayed);
    }
}
