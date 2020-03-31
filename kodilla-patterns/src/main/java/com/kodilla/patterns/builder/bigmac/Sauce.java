package com.kodilla.patterns.builder.bigmac;

    enum Sauce {
        STANDARD("Standard"),
        BBQ("Berbecue"),
        ISLAND("1000 Island");

        String description;

        Sauce(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
