package com.kodilla.exception.test2;

import java.util.HashMap;

public class FlightSearch {
    public void findFlight (Flight flight) throws RouteNotFoundException{

        HashMap <String, Boolean> flights = new HashMap<>();
        flights.put("Rome", true);
        flights.put("Warsaw", true);

        if (!flights.containsKey(flight.getArrivalAirport())){
            throw new RouteNotFoundException("Such destination doesn't exist");
        }


    }
}
