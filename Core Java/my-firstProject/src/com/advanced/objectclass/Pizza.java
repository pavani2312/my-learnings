package com.advanced.objectclass;

import java.util.Objects;

public class Pizza implements Cloneable{
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pizza)) {
            return false;
        }
        Pizza pizza = (Pizza) o;
        return Objects.equals(name, pizza.name) && price == pizza.price &&
        pizzaSizes == pizza.pizzaSizes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pizzaSizes, price);

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", pizzaSizes=" + pizzaSizes +
                ", price=" + price +
                '}';
    }
}
