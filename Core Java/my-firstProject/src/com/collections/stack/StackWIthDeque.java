package com.collections.stack;

import java.util.Deque;
import java.util.LinkedList;

public class StackWIthDeque {

    public static void main(String[] args) {

        Deque<String> editHistory = new LinkedList<>();

        System.out.println("Taking action: making the text bold");
        editHistory.push("making the text bold");
        System.out.println("Taking action: adding some text");
        editHistory.push("adding some text");
        System.out.println("Taking action: adding a new paragraph");
        editHistory.push("adding a new paragraph");

        System.out.println("The Recent element in the stack: " +editHistory.peek());

        System.out.println("Removing recent element from stack: " +editHistory.pop());
        System.out.println("Removing recent element from stack: " +editHistory.pop());


    }
}
