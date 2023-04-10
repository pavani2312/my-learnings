package com.intermediate.stringFunctions;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner keyboardText = new Scanner(System.in);

        String inputText =keyboardText.nextLine();

        //equals()
        if(inputText.equals("India")){
            System.out.println("India is written");
        }else
            System.out.println("The input text written is: " +inputText);

        //equalsIgnoreCase()
        if (inputText.equalsIgnoreCase("India")) {
            System.out.println("India is written");
        }else
            System.out.println("The input text written is: "+inputText);

        //contains()
        if(inputText.contains("In")){
            System.out.println("The input text contains In.");
        }

        //isEmpty()
        if(inputText.isEmpty()){
            System.out.println("The input text is empty.");
        }

        //length()
        System.out.println("The length of the input text is: "+inputText.length());

        //toLowerCase()/toUpperCase()
        System.out.println("Converting the text to upper: "+inputText.toUpperCase());
        System.out.println("Converting the text to lower: "+inputText.toLowerCase());

        //startsWith()/endsWit()
        if(inputText.startsWith("I") || inputText.endsWith("I")){
            System.out.println("The text may starts or ends with I");
        }

        //replace()
        System.out.println("Replace the text with: "+inputText.replace("N","Y"));
    }
}
