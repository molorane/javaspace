package collection;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueDemo {

    public static void main(String[] args) {


        Queue<Integer>  ls = new LinkedList<>();
        Queue<Integer>  ad = new ArrayDeque<>();
        Queue<Integer>  abq = new ArrayBlockingQueue<>(10);
        Queue<Integer> pq = new PriorityQueue<>();
    }
}
