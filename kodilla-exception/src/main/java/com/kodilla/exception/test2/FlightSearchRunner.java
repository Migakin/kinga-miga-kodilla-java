package com.kodilla.exception.test2;

public class FlightSearchRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Kalisz");
        Flight flight2 = new Flight("Warsaw","Rome");
        Flight flight3 = new Flight("Rome", "Radom");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Cannot find route to this destination");
        }
        try {
            flightSearch.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Cannot find route to this destination");
        }
        try {
            flightSearch.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Cannot find route to this destination");
        }
    }
}