package com.collections.list.vector;

import java.util.Vector;
//will have same functions as arraylist but will have some more functions
public class VectorApp {
    public static void main(String[] args) {
        Vector<String> toDoVector = new Vector<>(2,3);

        System.out.println("The Initial Capacity before adding elements: "+toDoVector.capacity());
        toDoVector.add("Cleaning the garden");
        toDoVector.add("Painting the walls");
        toDoVector.add("Taking the dog for a walk");
        System.out.println("The Capacity after adding elements: "+toDoVector.capacity());
        System.out.println("The Size of the elements: "+toDoVector.size());

        System.out.println("The first element in the list: " +toDoVector.firstElement());
        System.out.println("The last element in the list: " +toDoVector.lastElement());

    }
}
