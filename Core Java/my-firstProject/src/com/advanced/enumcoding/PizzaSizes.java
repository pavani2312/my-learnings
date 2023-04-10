package com.advanced.enumcoding;

public enum PizzaSizes {
    SMALL("small size"), MEDIUM("medium size"), LARGE("large size");
    private String pizzaSizeText;

    PizzaSizes(String pizzaSizeText) {
        this.pizzaSizeText = pizzaSizeText;
    }

    public String getPizzaSizeText() {
        return pizzaSizeText;
    }
}
