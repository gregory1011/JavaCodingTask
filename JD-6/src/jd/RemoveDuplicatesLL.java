package jd;

public class RemoveDuplicatesLL {

    public static void main(String[] args) {


    }

    /*
    * You're given the head of a Singly Linked List whose nodes are in sorted order with respect to their values.
    * Write a function that returns a modified version of the Linked List that doesn't contain any nodes with duplicate values.
    * The Linked List should be modified in place (i.e., you shouldn't create a brand-new list),
    * and the modified Linked List should still have its nodes sorted with respect to their values.
    *  Each LinkedList node has an integer value as well as a next node pointing to the next node in the list,
    * or to None / null if it's the tail of the list.
    * Input: head = [1,1,2,3,3]   -   Output: [1,2,3]
    * Example:Input: [1, 1, 3, 4, 4, 4, 5, 6, 6] // the head node with value 1
    * Output: [1, 3, 4, 5, 6] // the head node with value 1
    * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
     */


    public class Node{
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }

    public class MyLinkedList{
        Node head, tail;

        public void insert(int data){
           if (head==null) head= tail= new Node(data);
           else {
               tail.next= new Node(data);
               tail= new Node(data);
           }
        }

        public void insertAll(int[] array){
            for (int i : array){
                insert(i);
            }
        }


        public void removeDuplicates(int[] arr){

            MyLinkedList list= new MyLinkedList();
            list.insertAll(arr);

            if (head==null) System.out.println("[no elements]");

            Node p1= head; // travers node
            Node p2= head; // prev node

            while (p1 != null){
                Node node= p1.next;

                while (node !=null && node.value == p1.value){
                    node= node.next;
                }
            }

        }







    }

}
