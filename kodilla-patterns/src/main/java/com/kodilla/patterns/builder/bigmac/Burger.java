package com.kodilla.patterns.builder.bigmac;

public enum Burger {

    S("Small"),
    M("Medium"),
    L("Large");

    String description;

    Burger(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
