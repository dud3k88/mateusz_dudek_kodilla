package com.kodilla.good.patterns.allegro;

public class Inform implements InformationService {
    @Override
    public void sendInformation(User user) {
        System.out.println("Zamówienie ok" + user.getUserName());
    }
}
