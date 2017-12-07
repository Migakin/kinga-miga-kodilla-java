package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class MovieStoreMain {
    public static void main (String[] args) {
       MovieStore movieStore = new MovieStore();
       movieStore.getMovies().entrySet().stream()
                .map(Map.Entry::getValue)
                .flatMap(List::stream)
                .forEach(s -> System.out.print(s + "!"));
    }
}
