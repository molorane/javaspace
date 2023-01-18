package streamapi.pimitive;

import java.util.Arrays;

public class Boxed {

    static void miniMaxSum(int[] arr) {

        long min = Arrays.stream(arr)
                .boxed()
                .sorted()
                .mapToLong(x -> x)
                .limit(4)
                .sum();

        long max = Arrays.stream(arr)
                .boxed()
                .sorted()
                .mapToLong(x -> x)
                .skip(1)
                .sum();

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) throws InterruptedException {
        int[] li = {256741038, 623958417, 467905213, 714532089, 938071625};
        // 396285104 573261094 759641832 819230764 364801279
        // 140638725 436257910 953274816 734065819 362748590
        // 769082435 210437958 673982045 375809214 380564127
        miniMaxSum(li);


    }

}
