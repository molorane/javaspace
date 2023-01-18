package streamapi.pimitive;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class SplitStream {

    public static void main(String[] args) {
        Object[] words = Pattern.compile(",").splitAsStream("1,2,3,4,5").toArray();
        System.out.println(Arrays.stream(words).mapToInt(str -> Integer.valueOf((String) str)).sum());

        IntStream chars = "bookkeep".chars();
        //System.out.println(chars.count());
        chars.distinct().sorted().forEach(ch -> System.out.printf("%c ", ch));

        IntStream s = IntStream.of(1, 2, 3, 4);
        long count = s.peek(System.out::println).count();
    }

}
