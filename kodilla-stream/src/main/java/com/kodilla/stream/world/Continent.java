package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<Country> countriesOnTheContinent = new HashSet<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countriesOnTheContinent.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountriesOnTheContinent() {
        return countriesOnTheContinent;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countriesOnTheContinent=" + countriesOnTheContinent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        if (!continentName.equals(continent.continentName)) return false;
        return countriesOnTheContinent.equals(continent.countriesOnTheContinent);
    }

    @Override
    public int hashCode() {
        return continentName.hashCode();
    }
}

