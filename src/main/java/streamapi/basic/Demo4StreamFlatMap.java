package streamapi.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4StreamFlatMap {

    public static void main(String[] args) {

        List<String> para = Arrays.asList("There", "was", "a", "young");

        List<String> list = para.stream()
                .flatMap(x -> Arrays.stream(x.split("")))
                .filter(x -> !x.toLowerCase().contains("a"))
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
