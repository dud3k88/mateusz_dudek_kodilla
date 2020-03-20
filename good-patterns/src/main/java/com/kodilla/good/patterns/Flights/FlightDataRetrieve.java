package com.kodilla.good.patterns.Flights;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightDataRetrieve {

    FlightProcessor flightProcessorSample = new FlightProcessor();

    public ArrayList<Flight> retrieve (){

        ArrayList<Flight> flightList = new ArrayList<>();

        flightList.add(new Flight("AB001", "GDA", "WRO", LocalTime.of(10,00),LocalTime.of(13,20)));
        flightList.add(new Flight("AB002", "GDA", "WRO", LocalTime.of(11,00),LocalTime.of(14,20)));
        flightList.add(new Flight("AB003", "GDA", "WRO", LocalTime.of(12,00),LocalTime.of(15,20)));
        flightList.add(new Flight("AB004", "GDA", "WRO", LocalTime.of(13,00),LocalTime.of(16,20)));
        flightList.add(new Flight("AB005", "GDA", "WRO", LocalTime.of(14,00),LocalTime.of(17,20)));
        flightList.add(new Flight("AB006", "GDA", "WRO", LocalTime.of(15,00),LocalTime.of(18,20)));
        flightList.add(new Flight("AB007", "GDA", "KRK", LocalTime.of(7,00),LocalTime.of(18,20)));
        flightList.add(new Flight("AB008", "GDA", "KRK", LocalTime.of(8,00),LocalTime.of(16,20)));
        flightList.add(new Flight("AB009", "GDA", "WWA", LocalTime.of(9,00),LocalTime.of(14,20)));
        flightList.add(new Flight("AB010", "GDA", "WWA", LocalTime.of(16,00),LocalTime.of(18,20)));
        flightList.add(new Flight("AB011", "GDA", "WWA", LocalTime.of(17,00),LocalTime.of(12,20)));

        flightList.add(new Flight("AB012", "KRK", "GDA", LocalTime.of(1,00),LocalTime.of(3,20)));
        flightList.add(new Flight("AB013", "KRK", "WRO", LocalTime.of(3,00),LocalTime.of(6,20)));
        flightList.add(new Flight("AB014", "KRK", "WWA", LocalTime.of(5,00),LocalTime.of(8,20)));
        flightList.add(new Flight("AB015", "KRK", "WRO", LocalTime.of(6,00),LocalTime.of(9,20)));
        flightList.add(new Flight("AB016", "KRK", "WRO", LocalTime.of(8,00),LocalTime.of(12,20)));

        flightList.add(new Flight("AB015", "WWA", "WRO", LocalTime.of(5,00),LocalTime.of(9,20)));
        flightList.add(new Flight("AB016", "WWA", "GDA", LocalTime.of(6,00),LocalTime.of(10,20)));
        flightList.add(new Flight("AB017", "WWA", "GDA", LocalTime.of(7,00),LocalTime.of(11,20)));
        flightList.add(new Flight("AB018", "WWA", "WRO", LocalTime.of(8,00),LocalTime.of(12,20)));
        flightList.add(new Flight("AB019", "WWA", "KRK", LocalTime.of(9,00),LocalTime.of(14,20)));
        flightList.add(new Flight("AB020", "WWA", "KRK", LocalTime.of(10,00),LocalTime.of(16,20)));
        flightList.add(new Flight("AB021", "WRO", "KRK", LocalTime.of(10,00),LocalTime.of(16,20)));
        flightList.add(new Flight("AB022", "WRO", "KRK", LocalTime.of(11,00),LocalTime.of(16,20)));
        flightList.add(new Flight("AB023", "WRO", "GDA", LocalTime.of(12,00),LocalTime.of(16,20)));
        flightList.add(new Flight("AB024", "WRO", "GDA", LocalTime.of(13,00),LocalTime.of(16,20)));
        flightList.add(new Flight("AB025", "WRO", "WWA", LocalTime.of(14,00),LocalTime.of(16,20)));
        flightList.add(new Flight("AB026", "WRO", "WWA", LocalTime.of(15,00),LocalTime.of(16,20)));

        return flightList;
    }

    public void testDepAirportSearch (String departureAirport) {
        List<Flight> sampleList = flightProcessorSample.depAirportSearch(retrieve(), departureAirport);
        System.out.println("Flights departure in: " + departureAirport);
        for (Flight list : sampleList){
            System.out.println(list.getFlightNumber()+" " + list.getDepartureAirport() + " " + list.getDepartureTime()
            + " " + list.getArrivalAirport() + " " + list.getArrivalTime());
        }
    }

    public void testArvAirportSearch (String arrivalAirport) {
        List<Flight> sampleList = flightProcessorSample.arvAirportSearch(retrieve(), arrivalAirport);
        System.out.println("Flights arrival in: " + arrivalAirport);
        for (Flight list : sampleList){
            System.out.println(list.getFlightNumber()+" " + list.getDepartureAirport() + " " + list.getDepartureTime()
                    + " " + list.getArrivalAirport() + " " + list.getArrivalTime());
        }
    }

    public void testConnectionFlight (String departureAirport, String arrivalAirport) {
        Map<Flight, Flight> sampleList = flightProcessorSample.connectionFlight(retrieve(), departureAirport, arrivalAirport);
        System.out.println("Connection Flight: ");
        for (Map.Entry<Flight, Flight> flightEntry : sampleList.entrySet()){
            System.out.println(flightEntry.getKey().getDepartureAirport() + flightEntry.getKey().getFlightNumber()
                    +" " + flightEntry.getValue().getArrivalAirport() + " " + flightEntry.getValue().getFlightNumber());
        }
    }
}



