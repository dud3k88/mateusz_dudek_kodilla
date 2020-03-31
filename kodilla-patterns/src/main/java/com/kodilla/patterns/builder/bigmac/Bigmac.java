package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private Bun bun;
    private Burger burgers;
    private Sauce sauce;
    private final List<String> ingredients;


    public static class BigmacBuilder {
        private Bun bun;
        private Burger burger;
        private Sauce sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun (Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burger (Burger burger) {
            this.burger = burger;
            return this;
        }

        public BigmacBuilder sauce (Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient (String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burger, sauce, ingredients);
        }
    }

    private Bigmac (final Bun bun, final Burger burger, final Sauce sauce, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burger;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }
    public Bun getBun() {
        return bun;
    }

    public Burger getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }
}
