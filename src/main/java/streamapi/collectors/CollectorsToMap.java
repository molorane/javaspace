package streamapi.collectors;

import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMap {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("speak", "bark", "meow", "growl");
        Map<String, Integer> map = s.collect(Collectors.toMap(String::toUpperCase, String::length));
        System.out.println(map);
    }

}
