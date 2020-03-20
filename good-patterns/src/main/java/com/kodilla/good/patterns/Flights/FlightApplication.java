package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightApplication {

    public static void main(String[] args) {

        FlightDataRetrieve flightDataRetrieve = new FlightDataRetrieve();
        flightDataRetrieve.testDepAirportSearch("KRK");
        flightDataRetrieve.testArvAirportSearch("WRO");
        flightDataRetrieve.testConnectionFlight("WWA", "WRO");
    }
}
