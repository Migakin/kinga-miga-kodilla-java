package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final Set<Continent> continentsOnTheWorld = new HashSet<>();

    public void addCContinent(Continent continent) {
        continentsOnTheWorld.add(continent);
    }

    public Set<Continent> getContinentsOnTheWorld() {
        return continentsOnTheWorld;
    }

    public BigDecimal getPeopleQuantity(){
        return continentsOnTheWorld.stream()
                .flatMap(continent -> continent.getCountriesOnTheContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum, current) -> sum = sum.add(current));
    }
}
