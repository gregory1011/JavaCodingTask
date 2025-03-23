package practice.pro.review_dataStructureAndAlgorithms.LinkedLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class TestMyLinkedList {

    public static void main(String[] args) {

        MySinglyLinkedList myList = new MySinglyLinkedList();

        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) myList.add(i);
//        myList.addFirst(100);

        myList.printNodes();
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("myList.hashCode() = " + myList.hashCode());

//        myList.remove(5);
        myList.printNodes();
        myList.remove(1);
        myList.printNodes();
        myList.remove(9);
        myList.printNodes();
//        myList.addFirst(100);

        System.out.println("myList.indexOf(1) = " + myList.indexOf(1));

        Stack<Character> stack = new Stack<>();



        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        linkedList.remove(5);
        linkedList.remove(1);
        System.out.println("linkedList.indexOf(5) = " + linkedList.indexOf(1));

        // -----------   ----------------
        // test remove Kth element
        myList.printNodes();
        System.out.println("myList.getKthItemFromLast(3) = " + myList.getKthItemFromLast(3));
        myList.removeKthItemFromLast(3);
        myList.printNodes();


    }




}
