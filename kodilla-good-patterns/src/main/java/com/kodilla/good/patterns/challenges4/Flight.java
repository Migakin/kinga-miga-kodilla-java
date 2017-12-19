package com.kodilla.good.patterns.challenges4;

public class Flight {
    private final String departureCity;
    private final String arrivalCity;
    private final String viaCity;

    public Flight(String departureCity, String arrivalCity, String viaCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.viaCity = viaCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }
    public String getViaCity() {
        return viaCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!departureCity.equals(flight.departureCity)) return false;
        if (!arrivalCity.equals(flight.arrivalCity)) return false;
        return viaCity != null ? viaCity.equals(flight.viaCity) : flight.viaCity == null;
    }

    @Override
    public int hashCode() {
        int result = departureCity.hashCode();
        result = 31 * result + arrivalCity.hashCode();
        result = 31 * result + (viaCity != null ? viaCity.hashCode() : 0);
        return result;
    }
}
