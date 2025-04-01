package practice.pro.review_dataStructureAndAlgorithms.Queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversKthNumberOfElements {

    public static void main(String[] args) {

        // input [10,20,30,40,50], k= 4;
        //output [40,30,20,10,50]
        // hint: I can use Stack to reverse elements
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("Initial queue-> "+queue);
        System.out.println("reversKth(4) = " + reversKth(queue, 4));

    }

    public static Queue<Integer> reversKth(Queue<Integer> queue, int k) {

        Stack<Integer> stack = new Stack<>();
        if (k==0) return queue;
        while (!queue.isEmpty() && k > 0) {

            stack.push(queue.element());
            queue.remove();
            k--;

        }

        Queue<Integer> newQueue = new LinkedList<>();
        while (!stack.isEmpty()) {
            newQueue.add(stack.pop());
        }
        while (!queue.isEmpty()) newQueue.add(queue.element());
        return newQueue;
    }


}
