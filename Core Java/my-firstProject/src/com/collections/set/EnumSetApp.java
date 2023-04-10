package com.collections.set;

import java.util.EnumSet;

public class EnumSetApp {

    enum PizzaSize{
        SMALL, MEDIUM, LARGE, EXTRA_LARGE, FAMILY;
    }

    public static void main(String[] args) {

        EnumSet<PizzaSize> pizzaSizes = EnumSet.allOf(PizzaSize.class);
        System.out.println("Available Pizzas : " + pizzaSizes);

        EnumSet<PizzaSize> basicPizzaSizes = EnumSet.noneOf(PizzaSize.class);
        basicPizzaSizes.add(PizzaSize.SMALL);
        basicPizzaSizes.add(PizzaSize.MEDIUM);
        basicPizzaSizes.add(PizzaSize.LARGE);
        System.out.println("Basic Pizza Sizes are: " +basicPizzaSizes);

        EnumSet<PizzaSize> rangePizzaSizes = EnumSet.range(PizzaSize.MEDIUM, PizzaSize.EXTRA_LARGE);
        System.out.println("Range of Pizzas are: " +rangePizzaSizes);
    }
}
