package practice.pro.review_dataStructureAndAlgorithms.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionStack {

    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println("last element removed -> " + stack.pop());
        System.out.println("new peek is -> "+stack.peek());

        Stack<Integer> s = new Stack<>();
    }
}
