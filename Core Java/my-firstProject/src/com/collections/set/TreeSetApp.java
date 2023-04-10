package com.collections.set;

import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {

        TreeSet<String>  treeCars = new TreeSet<>();

        treeCars.add("Toyota");
        treeCars.add("Nissan");
        treeCars.add("Ford");
        treeCars.add("Kia");
        treeCars.add("Lexus");
        treeCars.add("Volvo");
        treeCars.add("Seat");
        treeCars.add("Fiat");

        System.out.println("The Tree Set cars are: " +treeCars);
        System.out.println();
        System.out.println("The Lower Function: " +treeCars.lower("Lexus"));
        System.out.println("The Floor Function: " +treeCars.floor("Lexus"));
        System.out.println("The Higher Function: " +treeCars.higher("Lexus"));
        System.out.println("The Ceiling Function: " +treeCars.ceiling("Lexus"));
        System.out.println();
        System.out.println("The Tail Set Function: " +treeCars.tailSet("Lexus"));
        System.out.println("The Head Set Function: " +treeCars.headSet("Lexus"));
        System.out.println("The Sub Set Function: " +treeCars.subSet("Lexus","Seat"));
        System.out.println();
        System.out.println("The First Function: " +treeCars.first());
        System.out.println("The Last Function: " +treeCars.last());
        System.out.println("The Poll First Function: " +treeCars.pollFirst());
        System.out.println("The Poll Last Function: " +treeCars.pollLast());
        System.out.println("The set of using after Poll First and Last Function: " +treeCars);
        System.out.println();
        System.out.println("The elements in descending Order: " +treeCars.descendingSet());
    }
}
