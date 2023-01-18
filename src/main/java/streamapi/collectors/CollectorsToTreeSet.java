package streamapi.collectors;

import java.util.*;
import java.util.stream.Collectors;


public class CollectorsToTreeSet {

    public static void main(String[] args) {

        String[] roseQuote = "Complex code Java11 Streams".split(" ");
        List<String> words =
                Arrays.stream(roseQuote)
                        .collect(Collectors.toCollection(ArrayList::new));

        words.forEach(System.out::println);

    }
}