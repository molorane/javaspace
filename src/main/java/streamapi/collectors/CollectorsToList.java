package streamapi.collectors;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CollectorsToList {
    public static void main(String[] args) {
        String sotho = "tloho:lerato,zinhle{nomfundo";
        List<String> gmailList = Pattern.compile("[^0-9a-zA-Z]")
                .splitAsStream(sotho)
                .collect(Collectors.toList());
        gmailList.forEach(System.out::println);
    }
}