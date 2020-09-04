package com.kodilla.good.patterns.FoodToDoors;

import java.util.Objects;

public class Client {

    private String name;
    private String userName;
    private String emailAdress;

    public Client(String name, String userName, String emailAdress) {
        this.name = name;
        this.userName = userName;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(userName, client.userName) &&
                Objects.equals(emailAdress, client.emailAdress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, userName, emailAdress);
    }
}
