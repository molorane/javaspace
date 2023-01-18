package streamapi.collectors;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class CollectorsToTreeSet {

    public static void main(String[] args) {

        String[] roseQuote = "Complex code Java11 Streams".split(" ");
        Set<String> words =
                Arrays.stream(roseQuote)
                        .collect(Collectors.toCollection(HashSet::new));

        words.forEach(System.out::println);

    }
}