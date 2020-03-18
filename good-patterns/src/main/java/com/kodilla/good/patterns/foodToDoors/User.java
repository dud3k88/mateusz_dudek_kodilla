package com.kodilla.good.patterns.foodToDoors;

public class User {

    private String name;
    private String surname;
    private String userName;
    private String emailAddress;
    private long phoneNumber;

    public User(String name, String surname, String userName, String emailAddress, long phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
