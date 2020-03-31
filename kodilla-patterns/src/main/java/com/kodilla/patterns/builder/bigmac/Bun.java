package com.kodilla.patterns.builder.bigmac;

public enum Bun {

    SESAME("Sesame"),
    WITHOUTSESAME ("With out sesame");

    String description;

    Bun(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
