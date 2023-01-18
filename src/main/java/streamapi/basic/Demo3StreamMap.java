package streamapi.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3StreamMap {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "2", "Java", "3", "4", "5", "6");

        List<Integer> mapped = list.stream()
                .filter(Demo3StreamMap::isDigit)
                .map(x -> (int)Math.pow(Integer.parseInt(x), 2))
                .collect(Collectors.toList());

        System.out.println(mapped);
    }

    public static boolean isDigit(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch(NumberFormatException x) {
            return false;
        }
    }
}
