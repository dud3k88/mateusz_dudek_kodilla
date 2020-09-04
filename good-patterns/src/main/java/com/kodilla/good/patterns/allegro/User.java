package com.kodilla.good.patterns.allegro;

import java.util.Objects;

public class User {

    private String userName;
    private String adressEmail;

    public User(String userName, String adressEmail) {
        this.userName = userName;
        this.adressEmail = adressEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getAdressEmail() {
        return adressEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUserName(), user.getUserName()) &&
                Objects.equals(getAdressEmail(), user.getAdressEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getAdressEmail());
    }
}
