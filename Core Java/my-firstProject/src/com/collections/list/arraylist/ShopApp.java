package com.collections.list.arraylist;

import java.util.ArrayList;

public class ShopApp {
    public static void main(String[] args) {
        ArrayList<Products> products = new ArrayList<>();

        products.add(new Products("Fidget spinner", 3.99, "It's fun."));
        products.add(new Products("Earbud", 39.99, "Extremely clear sound. Waterproof."));
        products.add(new Products("Earbud", 39.99, "Extremely clear sound. Waterproof."));

        products.add(1, new Products("36 AAA batteries", 10.99, "High-performance alkaline batteries."));

        products.remove(2);
        //products.remove(new Product("Earbud", 39.99, "Extremely clear sound. Waterproof."));

        products.set(0, new Products("Rubber duck", 5.99, "You can't have bath without this."));

        //System.out.println(products);
        for (Products product : products) {
            System.out.println(product);
        }

        System.out.println("The third element in the list:");
        System.out.println(products.get(2));

        System.out.println(products.size() + " products can be found in the list.");
    }
}
