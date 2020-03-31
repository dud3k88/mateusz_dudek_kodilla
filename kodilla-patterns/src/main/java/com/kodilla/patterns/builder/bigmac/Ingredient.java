package com.kodilla.patterns.builder.bigmac;

public enum Ingredient {
    LETTUCE("Lettuce"),
    ONION("Onion"),
    BACON("Bacon"),
    CUCUMBER("Cucumber"),
    CHILLIPEPPER("Chilli pepper"),
    CHEESE("Cheese"),
    MUSHROOM("Mushroom"),
    SHRIMP("Shrimp");

    String description;

    Ingredient(String description) {
        this.description = description;
    }

    String getDescription() {
        return description;
    }
}
