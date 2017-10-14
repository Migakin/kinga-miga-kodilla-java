package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.*;

public class OddNumbersExterminator {

        ArrayList<Integer> evenNumbers = new ArrayList<>();


    public ArrayList <Integer> exterminate(ArrayList <Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

}
