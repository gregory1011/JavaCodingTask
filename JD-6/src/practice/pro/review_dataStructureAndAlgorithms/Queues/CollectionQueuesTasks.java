package practice.pro.review_dataStructureAndAlgorithms.Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class CollectionQueuesTasks {

    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>();

        // insertion order is not preserved
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Jora");
        priorityQueue.add("Carol");
        priorityQueue.add("Mike");
        priorityQueue.add("Josse");
        System.out.println(priorityQueue); //[Carol, Jora, Mike, Josse]
        System.out.println(priorityQueue.remove()); // it removes first, first in -> first out -> Carol
    }


}
