package collection;

import java.util.*;

public class MapDemo1 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("AA", "AH", "BA", "CAB", "AAH", "BAC",
        "silent", "listen", "stenli");

        Map<Integer, List<String>> map = new HashMap<>();

        words.forEach((word) -> {
            int wordLength = word.length();
            if (map.get(wordLength) != null) {
                map.get(wordLength).add(word);
            } else {
                map.put(wordLength, new ArrayList<>(Arrays.asList(word)));
            }
        });

        System.out.println(map);
        map.forEach(MapDemo1::print);
    }

    public static void print(int wordLength, List<String> list) {

        int countAnagrams = 0;

        for (int i = 0; i < list.size(); i++) {

            String word = list.get(i);

            for (int x = 0; x < list.size(); x++) {

                String compare = list.get(x);

                if (x != i) {
                    if(isAnagram(word, compare)){
                        countAnagrams++;
                    }
                }
            }
        }  // 30

        System.out.printf("Words with length %s has %s anagrams\n", wordLength, countAnagrams);
    }

    public static boolean isAnagram(String x, String y){
        if (x.length() != y.length())
            return false;

        int length = y.length();

        while (length > 0) {

            if (!x.contains("" + y.charAt(0))) {
                return false;
            }

            x = x.replaceFirst(String.valueOf(y.charAt(0)), "");
            y = y.replaceFirst(String.valueOf(y.charAt(0)), "");
            length = x.length();
        }

        return true;
    }
}
