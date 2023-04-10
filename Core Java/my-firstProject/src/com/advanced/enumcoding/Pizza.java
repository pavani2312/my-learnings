package com.advanced.enumcoding;

public class Pizza {
    private String name;
    private PizzaSizes pizzaSizes;
    private double price;

    public Pizza(String name, PizzaSizes pizzaSizes) {
        this.name = name;
        this.pizzaSizes = pizzaSizes;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch (pizzaSizes){
            case SMALL :
            default:
                return 250;
            case MEDIUM:
                return 500;
            case LARGE:
                return 800;
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSizes getPizzaSizes() {
        return pizzaSizes;
    }

    public double getPrice() {
        return price;
    }
}
