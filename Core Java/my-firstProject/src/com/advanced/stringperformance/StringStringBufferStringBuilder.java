package com.advanced.stringperformance;

public class StringStringBufferStringBuilder {
    public static void main(String[] args) {
        long startTime = System.nanoTime(); //check how much time it is running

//        String testString = "";
//        for (int i = 0; i <= 100000; i++) {
//            testString += i; //3892ms
//        }

//        StringBuilder something = new StringBuilder("");
//        for (int i = 0; i <= 100000; i++) {
//            something.append(i); //13ms
//        }
//
        StringBuffer anything = new StringBuffer("");
        for (int i = 0; i <= 100000; i++) {
            anything.append(i);  //10ms
        }

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("It took " + totalTime / 1000000 + "ms");
    }
}
