package com.kodilla.good.patterns.challenges4;

public class Flight {
    private final String departureCity;
    private final String ArrivalCity;

    public Flight(String departureCity, String arrivalCity) {
        this.departureCity = departureCity;
        ArrivalCity = arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return ArrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!departureCity.equals(flight.departureCity)) return false;
        return ArrivalCity.equals(flight.ArrivalCity);
    }

    @Override
    public int hashCode() {
        int result = departureCity.hashCode();
        result = 31 * result + ArrivalCity.hashCode();
        return result;
    }
}
