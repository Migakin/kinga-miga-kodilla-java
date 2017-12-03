package com.kodilla.stream.world;


import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country("Poland", new BigDecimal(38092000));
        Country germany = new Country("Germany", new BigDecimal(80620000));
        Country france = new Country("France", new BigDecimal(65821885));

        Country japan = new Country("Japan", new BigDecimal(127300000));
        Country india = new Country("India", new BigDecimal(1349521845));
        Country china = new Country("China", new BigDecimal(1386641728));

        Country nigeria = new Country("Nigeria", new BigDecimal(190275000));
        Country algeria = new Country("Algeria", new BigDecimal(36300000));
        Country morocco = new Country("Morocco", new BigDecimal(34496100));

        Country brazil = new Country("Brazil", new BigDecimal(210707000));
        Country colombia = new Country("Colombia", new BigDecimal(49428000));
        Country argentina = new Country("Argentina", new BigDecimal(40117096));

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Continent southAmerica = new Continent("South America");

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        asia.addCountry(japan);
        asia.addCountry(india);
        asia.addCountry(china);
        africa.addCountry(nigeria);
        africa.addCountry(algeria);
        africa.addCountry(morocco);
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(colombia);
        southAmerica.addCountry(argentina);

        World world = new World();
        world.addCContinent(europe);
        world.addCContinent(asia);
        world.addCContinent(africa);
        world.addCContinent(southAmerica);


        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("3609320654");
        Assert.assertEquals(expectedPopulation, worldPopulation);

    }

}
