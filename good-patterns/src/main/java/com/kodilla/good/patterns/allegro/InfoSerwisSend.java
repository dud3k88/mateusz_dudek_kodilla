package com.kodilla.good.patterns.allegro;

public class InfoSerwisSend implements InfoSerwis {

    @Override
    public void informationUser(User user) {
        System.out.println(user.getUnserName() + " send massage!");
    }
}
