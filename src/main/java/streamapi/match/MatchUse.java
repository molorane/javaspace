package streamapi.match;

import java.util.stream.IntStream;

public class MatchUse {
    public static void main(String[] args) {
//        boolean anyMatch = IntStream.of( -5, -5, -5, 8, -5, -8, -1, -9)
//                .peek(System.out::println)
//                .anyMatch(x -> x > 0);
//        System.out.println("anyMatch(x -> x > 0): " + anyMatch);
//        boolean allMatch = IntStream.of(1, -8, 90)
//                .peek(System.out::println)
//                .allMatch(x -> x > 0);
//        System.out.println("allMatch(x -> x > 0): " + allMatch);
        boolean noneMatch = IntStream.of(-1, -3, 9)
                .peek(System.out::println)
                .noneMatch(x -> x > 0);
        System.out.println("noneMatch(x -> x > 0): " + noneMatch);
    }
}