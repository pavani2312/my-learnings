package com.intermediate.encapsulation;

public class FootBallPlayer extends Athlete {

    private int completions;
    private int passingYards;

    public FootBallPlayer(String name, String nickName, int dateOfBirth, String team, int gamesPlayed, int completions, int passingYards) {
        super(name, nickName, dateOfBirth, team, gamesPlayed);
        this.completions = completions;
        this.passingYards = passingYards;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Completions: " +completions);
        System.out.println("Passing yards: " +passingYards);
    }


    public void increaseCompletions(int completions){
        this.completions += completions;
    }

    public void increasePassingYards(int passingYards){
        this.passingYards += passingYards;
    }
}
