package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length)
                .average().getAsDouble();

        return average;
    }

    static double getAverage2(int[] numbers) {
         double average = IntStream.of(numbers)
                .average().getAsDouble();

        return average;
    }
}
