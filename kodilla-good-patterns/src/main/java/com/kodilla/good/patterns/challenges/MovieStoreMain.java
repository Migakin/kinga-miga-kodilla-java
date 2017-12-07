package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class MovieStoreMain {
    public static void main (String[] args) {
       MovieStore movieStore = new MovieStore();
       String movieList = movieStore.getMovies().entrySet().stream()
                .map(Map.Entry::getValue)
                .flatMap(List::stream)
                .collect(Collectors.joining("!"));
        System.out.println(movieList);

    }
}
