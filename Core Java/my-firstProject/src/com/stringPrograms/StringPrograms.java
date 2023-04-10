package com.stringPrograms;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringPrograms {
    public static void main(String[] args) {

    String string = "May the force be with you!";
    String[] starWarsQuoteWords = string.split(" ");
        for (String stringWord: starWarsQuoteWords) {
            System.out.println("Number of elements: " + stringWord);
        }


}
}
