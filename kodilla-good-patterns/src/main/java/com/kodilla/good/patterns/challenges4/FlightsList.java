package com.kodilla.good.patterns.challenges4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class FlightsList {

    private final List<Flight> flights = new ArrayList<>();

    public FlightsList() {
        flights.add(new Flight("Warszawa", "Poznań", null));
        flights.add(new Flight("Warszawa", "Wrocław", null));
        flights.add(new Flight("Warszawa", "Katowice", null));
        flights.add(new Flight("Kraków", "Szczecin", null));
        flights.add(new Flight("Poznań", "Wrocław", "Szczecin"));
        flights.add(new Flight("Poznań", "Lublin", "Gdańsk"));
    }

    public List<Flight> getFlightsList() {
        return flights;
    }
}
