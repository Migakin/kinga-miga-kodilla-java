package com.kodilla.exception.test2;

public class FlightSearchRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Kalisz");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Cannot find route to this destination");
        }
    }
}