package streamapi;

import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.regex.Pattern;

public class WordStatistics {
    public static void main(String[] args) {
        String limerick = "There was an old mane named Moses who traveled from Egypt to canaan "
                + "He performed many miracles before the people ";
        IntSummaryStatistics wordStatistics =
                Pattern.compile(" ")
                        .splitAsStream(limerick)
                        .mapToInt(String::length)
                        .summaryStatistics();

        String limerick1 = "There was n an old mane named Moses who traveled from Egypt to canaan "
                + "He performed many miracles before the people ";
        IntSummaryStatistics wordStatistics1 =
                Pattern.compile(" ")
                        .splitAsStream(limerick)
                        .mapToInt(String::length)
                        .summaryStatistics();

        wordStatistics.combine(wordStatistics1);

        System.out.printf(
                "Number of words = %d \n"
                        + "Sum of the length of the words = %d \n"
                        + "Minimum word size = %d \n"
                        + "Maximum word size %d \n"
                        + "Average word size = %f \n",
                wordStatistics.getCount(),
                wordStatistics.getSum(),
                wordStatistics.getMin(),
                wordStatistics.getMax(),
                wordStatistics.getAverage());
    }
}