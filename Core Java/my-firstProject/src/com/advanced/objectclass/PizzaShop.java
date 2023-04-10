package com.advanced.objectclass;

import java.util.Arrays;
import java.util.SortedMap;

public class PizzaShop {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Available Sizes");
        for (PizzaSizes pizzaSize: PizzaSizes.values()) {
            System.out.println("- "+ pizzaSize.getPizzaSizeText());
        }
        System.out.println();
        Pizza pizzaOrder = new Pizza("Margareta", PizzaSizes.MEDIUM);
        System.out.println("Pizza Name: "+pizzaOrder.getName());
        System.out.println("Pizza Size: "+pizzaOrder.getPizzaSizes().getPizzaSizeText());
        System.out.println("Pizza Price: "+pizzaOrder.getPrice());

        Pizza samePizza = (Pizza) pizzaOrder.clone(); //clone()
        System.out.println("Another Pizza Order");
        System.out.println("Pizza Name: "+samePizza.getName());
        System.out.println("Pizza Size: "+samePizza.getPizzaSizes().getPizzaSizeText());
        System.out.println("Pizza Price: "+samePizza.getPrice());

        Pizza pizzaOrder1 = new Pizza("Margareta", PizzaSizes.LARGE);

        System.out.println(pizzaOrder.equals(pizzaOrder1)); //equals()

        System.out.println("------------Get Class()-------------");
        System.out.println(pizzaOrder1.getClass().getName());
        System.out.println(pizzaOrder1.getClass().getSimpleName());
        System.out.println(Arrays.toString(pizzaOrder1.getClass().getFields()));
        System.out.println(Arrays.toString(pizzaOrder1.getClass().getDeclaredFields()));
        System.out.println(Arrays.toString(pizzaOrder1.getClass().getMethods()));
        System.out.println(Arrays.toString(pizzaOrder1.getClass().getDeclaredMethods()));
        System.out.println(pizzaOrder1.getClass().getSuperclass());

        System.out.println("-------------Hash Code--------------");
        System.out.println(pizzaOrder.hashCode());
        System.out.println(samePizza.hashCode());
        System.out.println(pizzaOrder1.hashCode());

        //to String()
        System.out.println();
        System.out.println(pizzaOrder);

    }
}
