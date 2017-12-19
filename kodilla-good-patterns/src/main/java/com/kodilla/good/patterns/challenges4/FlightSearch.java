package com.kodilla.good.patterns.challenges4;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    FlightsList flightsList = new FlightsList();

    public List<Flight> flightsFrom(String city){
        List<Flight> flightsFrom = flightsList.getFlightsList().stream()
                        .filter(l -> l.getDepartureCity().equals(city))
                        .collect(Collectors.toList());

        System.out.println("From " + city + " you can go to: ");
        for (Flight flight :flightsFrom){
            System.out.println(flight.getArrivalCity());
        }
        return flightsFrom;

    }

    public List<Flight> flightsTo(String city){
        List<Flight> flightsTo = flightsList.getFlightsList().stream()
                .filter(l -> l.getArrivalCity().equals(city))
                .collect(Collectors.toList());

        System.out.println("To " + city + " you can go from: ");
        for (Flight flight :flightsTo){
            System.out.println(flight.getDepartureCity());
        }

        return flightsTo;
    }


}
