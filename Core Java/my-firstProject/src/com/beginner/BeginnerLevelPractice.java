package com.beginner;

public class BeginnerLevelPractice {
    public static void main(String[] args) {
        String name = "Mahesh Babu";
        int dateOfBirth = 1975;
        int age = 2022- dateOfBirth;
        String[] movieTitles = {"one", "Athadu", "Pokiri", "Murari", "Okkadu"};
        float[] rating ={8.0F, 8.2F, 7.9F, 8.5F, 7.8F};

        System.out.println("The Name of the Actor is: " +name);
        System.out.println("The Birthday is On " +dateOfBirth+ " and his age is: " +age);
        System.out.println("Movies are:");
        for (int i=0;i< movieTitles.length; i++) {
            System.out.println(movieTitles[i] + " - " + getRatings(rating[i]));
        }

    }
    static String getRatings(float rating){
        if (rating <= 5.0){
            return "bad";
        } else if (rating > 5.0 && rating <= 6.5){
            return "average";
        } else if (rating > 6.5 && rating <= 7.0){
            return "good";
        } else if (rating > 7.0 && rating <= 8.0){
            return "very good";
        }else{
            return "amazing";
        }
    }
}
