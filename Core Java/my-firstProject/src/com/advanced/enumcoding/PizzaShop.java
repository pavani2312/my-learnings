package com.advanced.enumcoding;

public class PizzaShop {
    public static void main(String[] args) {
        System.out.println("Available Sizes");
        for (PizzaSizes pizzaSize: PizzaSizes.values()) {
            System.out.println("- "+ pizzaSize.getPizzaSizeText());
        }
        System.out.println();
        Pizza pizzaOrder = new Pizza("Margareta", PizzaSizes.MEDIUM);
        System.out.println("Pizza Name: "+pizzaOrder.getName());
        System.out.println("Pizza Size: "+pizzaOrder.getPizzaSizes().getPizzaSizeText());
        System.out.println("Pizza Price: "+pizzaOrder.getPrice());
    }
}
