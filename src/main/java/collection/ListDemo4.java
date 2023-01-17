package collection;

import java.util.*;

public class ListDemo4 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Java4", "Java1", "Java3"));
        //System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    static class MyOrdering implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }

}
