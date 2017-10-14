package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import com.sun.istack.internal.FinalArrayList;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {


    @Before
    public void before() {
        System.out.println("Test Case: Begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: End");
    }

    @Test

    public void testOddNumberExterminatorEmptyList() {

        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assert.assertEquals(Arrays.asList(), result);

    }

    @Test

    public void testOddNumberExterminatorNormalList() {

        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int n = 1; n < 11; n++) {
            numbers.add(n);
        }

        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assert.assertEquals(Arrays.asList(2, 4, 6, 8, 10), result);
    }
}