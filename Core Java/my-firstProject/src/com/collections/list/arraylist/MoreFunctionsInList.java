package com.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class MoreFunctionsInList {
    public static void main(String[] args) {
        ArrayList<String> urgentTasks = new ArrayList<>(2);
        ArrayList<String> allTasks = new ArrayList<>();

        urgentTasks.add("Repairing the car");
        urgentTasks.add("Paying the checks");
        urgentTasks.add("Going to Hospital for a check-up");
//        allTasks.add(1);
//        allTasks.add(2);
//        allTasks.add(3);

        allTasks.add("Cleaning the bathroom");
        allTasks.add("Moving the lawn");
        allTasks.add("Going to the grocery store");

        //swap()
        Collections.swap(urgentTasks, 0,1);
        /*
        clear() will delete the elements
         urgentTasks.clear();
         System.out.println(urgentTasks.isEmpty());
        */
        System.out.println("Urgent tasks: ");
        for (String task: urgentTasks) {
            System.out.println("- " +task);
        }

        //addAll()
        allTasks.addAll(urgentTasks);

        //Sort() & reverseOrder()
        Collections.sort(allTasks, Collections.reverseOrder());

        System.out.println("All tasks: ");
        for (String task: allTasks) {
            System.out.println("- " +task);
        }
        //contains()
        System.out.println("Contains: " +allTasks.contains("Going to Hospital for a check-up"));

        System.out.println("All tasks using sublist: ");
        for (String task: allTasks.subList(0, 3)) {
            System.out.println("- " +task);
        }

        Collections.shuffle(allTasks);
        System.out.println("Shuffled List: ");
        for (String task: allTasks) {
            System.out.println("- " +task);
        }




    }
}
