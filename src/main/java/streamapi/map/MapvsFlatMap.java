package streamapi.map;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class MapvsFlatMap {

    public static void withCollections() {
        Path path = Paths.get("words.txt");
        NavigableSet<String> uniqueWords = new TreeSet<>();
        try {
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines);
            for (String line : lines) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    uniqueWords.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // uniqueWords = uniqueWords.descendingSet(); will sort set in descending order
        System.out.println(uniqueWords);
    }

    public static void withMap() {
        Path path = Paths.get("words.txt");
        try {
            Files.lines(path)
                    .map(line -> line.split("\\s+")) // Stream of arrays
                    //	Stream(	["","",""],
                    //			["","",""]
                    //		  )
                    .map(Arrays::stream) // Stream of streams Stream<Stream<String>>
                    //Stream(	Stream(["","",""]),
                    //			Stream(["","",""])
                    //		)
                    .distinct()
                    .forEach(System.out::println);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void withFlatMap() {
        Path path = Paths.get("words.txt");
        try {
            Files.lines(path)
                    .map(line -> line.split("\\s+"))
                    .flatMap(Arrays::stream)
                    .distinct()
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        withFlatMap();
    }

}
