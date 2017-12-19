package com.kodilla.good.patterns.challenges4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class FlightsList {

    private final List<Flight> flights = new ArrayList<>();

    public FlightsList() {
        flights.add(new Flight("Warszawa", "Poznań"));
        flights.add(new Flight("Warszawa", "Wrocław"));
        flights.add(new Flight("Warszawa", "Katowice"));
        flights.add(new Flight("Kraków", "Szczecin"));
        flights.add(new Flight("Poznań", "Wrocław"));
        flights.add(new Flight("Poznań", "Lublin"));
    }

    public List<Flight> getFlightsList() {
        return flights;
    }
}
