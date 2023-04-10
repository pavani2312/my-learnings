package com.beginner;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int[] newArr = new int[5];

        Random randomNoGenerator = new Random();
        newArr[0] = randomNoGenerator.nextInt(90);//will generate its own number
        newArr[1] = 24;
        newArr[2] = 35;
        newArr[3] = 58;
        newArr[4] = 98;

        for (int lottery: newArr) {
            System.out.println(lottery);
        }

        //multidimensional Array
        int[][] multiArr = {
                {1,2,3,4,5},
                {10,20,30,40,50},
                {11,23,35,47,59},
                {21,42,63,84,15}
        };
        for (int i = 0; i <multiArr.length ; i++) {
            for (int j = 0; j <multiArr[i].length ; j++) {
                System.out.print(multiArr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
