package com.kodilla.good.patterns.Flights;

import java.time.LocalTime;
import java.util.Objects;

public class Flight {

    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private LocalTime departureTime;
    private LocalTime arrivalTime;

    public Flight(String flightNumber, String departureAirport, String arrivalAirport, LocalTime departureTime, LocalTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightNumber, flight.flightNumber) &&
                Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(arrivalAirport, flight.arrivalAirport) &&
                Objects.equals(departureTime, flight.departureTime) &&
                Objects.equals(arrivalTime, flight.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, departureAirport, arrivalAirport, departureTime, arrivalTime);
    }
}
