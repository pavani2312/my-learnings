package com.intermediate.abstraction;

public class AthleteApp {
    public static void main(String[] args) {

        //BasketBall Class
        BasketBallPlayer kobe = new BasketBallPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 25.0, 1346);
        kobe.setFreeThrowPercentage(83.8);
        kobe.setPointsPerGame(25.5);
        BasketBallPlayer jordan = new BasketBallPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1, 1072);
        BasketBallPlayer magic = new BasketBallPlayer("Earvin Johnson", "Magic", 1959, "Lakers", 84.8, 19.5, 906);

        BasketBallPlayer[] basketBallPlayers = new BasketBallPlayer[3];

        basketBallPlayers[0] = kobe;
        basketBallPlayers[1] = jordan;
        basketBallPlayers[2] = magic;

        for(BasketBallPlayer basketBallPlayer : basketBallPlayers){
            System.out.println("------------------------");
            basketBallPlayer.compete();
            System.out.println("------------------------");
            basketBallPlayer.getBio();

        }

        //Football Class
        FootBallPlayer tom = new FootBallPlayer("Tom Brady", "Tom Terrific", 1977, "Tampa Bay", 285, 9988, 6377);
        tom.increaseCompletions(35);
        tom.increasePassingYards(17);
        FootBallPlayer ed = new FootBallPlayer("Ed Brady", "Ed Terrific", 1979, "New England Patriots", 265, 8988, 4377);

        FootBallPlayer[] footBallPlayers = new FootBallPlayer[2];

        footBallPlayers[0] = tom;
        footBallPlayers[1] = ed;

        for(FootBallPlayer footBallPlayer : footBallPlayers){
            System.out.println("------------------------");
            footBallPlayer.compete();
            System.out.println("------------------------");
            footBallPlayer.getBio();

        }

        //Swimmer Class
        Swimmer katinka = new Swimmer("Katinka Hossam", "Iron lady", 1989, "Team Iron", 542, 845);
        System.out.println("-------------------------------------");
        katinka.compete();
        System.out.println("-------------------------------------");
        katinka.getBio();
        System.out.println(katinka.getCharacter());

    }
}
