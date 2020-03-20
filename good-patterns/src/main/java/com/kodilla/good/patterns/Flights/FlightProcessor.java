package com.kodilla.good.patterns.Flights;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightProcessor {


    public List<Flight> depAirportSearch(ArrayList<Flight> flightsList, String airport) {
        return flightsList.stream()
                .filter(n -> n.getDepartureAirport().equals(airport))
                .collect(Collectors.toList());

    }

    public List<Flight> arvAirportSearch(ArrayList<Flight> flightsList, String airport) {
        return flightsList.stream()
                .filter(n -> n.getArrivalAirport().equals(airport))
                .collect(Collectors.toList());
    }

    public List<Flight> getDeparturesFromTime(ArrayList<Flight> flightsList, String airport, LocalTime arrivalTime) {
        return depAirportSearch(flightsList, airport).stream()
                .filter(n -> n.getDepartureTime().isAfter(arrivalTime))
                .collect(Collectors.toList());
    }

    public List<Flight> directFlightSearch(ArrayList<Flight> flightsList, String departureAirport, String arrivalAirport) {
        List<Flight> destinationFlight = depAirportSearch(flightsList, departureAirport);
        return destinationFlight.stream()
                .filter(n -> n.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public Map<Flight, Flight> connectionFlight (ArrayList<Flight> flightsList, String departureAirport, String arrivalAirport){

        List<Flight> destinationFlight = depAirportSearch(flightsList, departureAirport);
        Map<Flight, Flight> connectedFlights = new HashMap<>();
        List<Flight> connectionOptions;

        for (int i = 0; i <destinationFlight.size(); i++) {

            connectionOptions = getDeparturesFromTime(flightsList, destinationFlight.get(i).getArrivalAirport(), destinationFlight.get(i).getArrivalTime());

            for (int j = 0; j <connectionOptions.size(); j++) {
                if ((connectionOptions.get(j).getArrivalAirport()).equals(arrivalAirport)){
                    connectedFlights.put(destinationFlight.get(i), connectionOptions.get(j));
                }
            }
        }

        return connectedFlights;
    }
}


