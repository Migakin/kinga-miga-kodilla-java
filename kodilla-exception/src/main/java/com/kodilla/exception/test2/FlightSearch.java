package com.kodilla.exception.test2;

import java.util.HashMap;

public class FlightSearch {
    public void findFlight (Flight flight) throws RouteNotFoundException{

        HashMap <String, Boolean> flights = new HashMap<>();
        flights.put("Rome", true);
        flights.put("Warsaw", true);
        flights.put("Radom", false);

        if (!flights.containsKey(flight.getArrivalAirport())){
            throw new RouteNotFoundException("Such destination doesn't exist");
        }
        if (flights.get(flight.getArrivalAirport())&&flights.get(flight.getDepartureAirport())){
        System.out.println("There is possible flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        }
        else {
            System.out.println("No flight possible from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        }

    }
}
