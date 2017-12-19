package com.kodilla.good.patterns.challenges4;

import java.util.HashMap;
import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        String city = "Warszawa";
        flightSearch.flightsFrom(city);
        flightSearch.flightsTo("Wrocław");
        flightSearch.flightsVia("Szczecin");

    }
}
