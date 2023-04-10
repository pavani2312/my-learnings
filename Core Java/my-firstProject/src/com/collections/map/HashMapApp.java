package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String>  capitals = new HashMap<>();

        //put()
        capitals.put("India","New Delhi");
        capitals.put("England", "London");
        capitals.put("Russia", "Moscow");
        capitals.put("England", "Oslo");

        System.out.println("Tha capital of England is: " +capitals.get("England"));
        //remove()
        capitals.remove("England", "Oslo");
        System.out.println("Tha capital of England is: " +capitals.get("England"));

        //containsValue()
        System.out.println(capitals.containsValue("Moscow"));

        System.out.println(capitals.get("India"));
        String input = "Denmark";
        System.out.println(capitals.getOrDefault(input, "This is a default value"));
        capitals.replace("India", "Mumbai");
        System.out.println("The Replaced Value is: " +capitals.get("India"));

        //putIfAbsent()
        capitals.putIfAbsent(input, "Copenhagen");
        System.out.println("Using a put absent function: " +capitals.get(input));

        //keySet()
        System.out.println(capitals.size() + " Capitals in the hash map are");
        for(String capital : capitals.keySet()){
            System.out.println("- " +capital);
        }

        //clear
        capitals.clear();
        System.out.println(capitals.size() + " Countries in the hash map are");
        for(String country : capitals.values()){
            System.out.println("- " +country);
        }
    }
}
