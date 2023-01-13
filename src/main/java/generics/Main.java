package generics;



import java.util.*;


public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(list);
        list.add(2);
        System.out.println(list);
    }
}
