package com.advanced.stringtokens;

import java.util.StringTokenizer;

public class StringSplitting {
    public static void main(String[] args) {


            String starWarsQuote = "May,the,force,be,with,you!";

            System.out.println("We are using StringTokenizer here: ");
            StringTokenizer stringTokenizer = new StringTokenizer(starWarsQuote, ",");
            System.out.println("Number of tokens: " + stringTokenizer.countTokens());
            while (stringTokenizer.hasMoreTokens()) {
                System.out.println(stringTokenizer.nextToken());
            }

            System.out.println("We are using String's split function here: ");
            String[] starWarsQuoteWords = starWarsQuote.split(",", 3);//It will print the rest of the words in new line
            System.out.println("Number of elements: " + starWarsQuoteWords.length);
            for (String starWarsQuoteWord : starWarsQuoteWords ) {
                System.out.println(starWarsQuoteWord);
            }
        }
}
