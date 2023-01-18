package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class WordsCalculation {
    public static void main(String[] args) {
        String[] string = "you never know what you have until you clean hh your room".split(" ");
        System.out.println(Arrays.stream(string).min(String::compareTo).get());

        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
        System.out.println(Arrays.stream(string).min(lengthCompare).get());

        IntStream.of(10, 20, 30, 40).sum();
    }
}