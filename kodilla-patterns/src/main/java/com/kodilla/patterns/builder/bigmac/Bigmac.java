package com.kodilla.patterns.builder.bigmac;

import java.util.*;

public final class Bigmac {
    private static final Set<String> AVAILABLE_ROLLS =
            new HashSet<>(Arrays.asList("with sesame","without sesame"));
    private static final Set<String> AVAILABLE_SAUCES =
            new HashSet<>(Arrays.asList("standard", "1000 islands", "barbecue"));
    private static final Set<String> AVAILABLE_INGREDIENTS =
            new HashSet<>(Arrays.asList("salad", "onion", "bacon", "shrimp", "cheese", "cucumber", "chilli pepper", "mushrooms"));
    private final int burgers;
    private final String roll;
    private final String sauce;
    private final Set<String> ingredients;


    private Bigmac(final String roll, final int burgers, final String sauce, final Set<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new HashSet<>(ingredients);
    }

    public int getBurgers() {
        return burgers;
    }

    public String getRoll() {
        return roll;
    }

    public String getSauce() {
        return sauce;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "burgers=" + burgers +
                ", roll='" + roll + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public Set<String> getIngredients() {
        return ingredients;
    }


    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private Set<String> ingredients = new HashSet<>();

        public BigmacBuilder (String roll, int burgers){
            this.roll = roll;
            this.burgers = burgers;
        }

        public BigmacBuilder roll(String roll) {
            if (!AVAILABLE_ROLLS.contains(roll) && roll != null) {
                throw new IllegalStateException("No such a roll. Available rolls: with sesame, without sesame.");
            }
            this.roll = roll;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            if (burgers <1 || burgers >3) {
                throw new IllegalStateException("You can order ony 1 to 3 burgers");
            }
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce (String sauce) {
            if (!AVAILABLE_SAUCES.contains(sauce)){
                throw new IllegalStateException("Available sauce: standard, 1000 islands, barbecue");
            }
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient (String ingredient){
            if (!AVAILABLE_INGREDIENTS.contains(ingredient)){
                throw new IllegalStateException("Available ingredients: salad, onion, bacon, shrimp, cheese, cucumber, chilli pepper,");
            }
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build () {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }

        public String getRoll() {
            return roll;
        }

        public int getBurgers() {
            return burgers;
        }

        public String getSauce() {
            return sauce;
        }

        public Set<String> getIngredients() {
            return ingredients;
        }

        @Override
        public String toString() {
            return "Bigmac{" +
                    "roll='" + roll + '\'' +
                    ", burgers=" + burgers +
                    ", sauce='" + sauce + '\'' +
                    ", ingredients=" + ingredients +
                    '}';
        }
    }
}
