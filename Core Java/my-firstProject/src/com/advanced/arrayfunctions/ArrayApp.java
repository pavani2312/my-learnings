package com.advanced.arrayfunctions;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] gamePoints = new int[12];

        //toString()
        System.out.println(Arrays.toString(gamePoints));

        //fill()
        System.out.println("All Players points are 200:");
        Arrays.fill(gamePoints, 200);
        System.out.println(Arrays.toString(gamePoints));

        //fill() in another form
        System.out.println("First 10 Players lost 20 points:");
        Arrays.fill(gamePoints, 0, 10, 180);
        System.out.println(Arrays.toString(gamePoints));

        //adding
        System.out.println("10th Player gained 50 points:");
        gamePoints[9] += 50;
        System.out.println(Arrays.toString(gamePoints));

        //sort()
        System.out.println("After Sorting the players according to points:");
        Arrays.sort(gamePoints);
        System.out.println(Arrays.toString(gamePoints));

        //Binary Search()
        System.out.println("Searching the element from array:");
        int position = Arrays.binarySearch(gamePoints,200);
        System.out.println(position);

        //Copy()
        System.out.println("Print 1st 5 pointers:");
        int[] lastFivePointers = Arrays.copyOf(gamePoints, 5);
        System.out.println(Arrays.toString(lastFivePointers));

        System.out.println("Print Top 5 pointers:");
        int[] topFivePointers = Arrays.copyOfRange(gamePoints, gamePoints.length-5, gamePoints.length);
        System.out.println(Arrays.toString(topFivePointers));

        //equals()
        if (Arrays.equals(lastFivePointers,topFivePointers)){
            System.out.println("The top 5 players have the same points as the last 5 players.");
        } else {
            System.out.println("The top 5 players don't have the same points as the last 5 players.");
        }

        gamePoints[4] = 300;
        Arrays.sort(gamePoints);
        //binarySearch()
        if (Arrays.binarySearch(gamePoints,300) >= 0){
            System.out.println("Someone reached 300 points. The game is over!");
        } else {
            System.out.println("There is nobody who reached 300 points yet.");
        }
    }
}
