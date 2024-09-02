package jd;

public class RemoveLinkedListElement {

    public static void main(String[] args) {

        int[] arr= {};
        MyLinkedList m= new MyLinkedList();
        m.insertAll(arr);
        m.removeVal(6);
        m.print();



    }

    /*
    * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has
Node.val == val, and return the new head.
Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:
Input: head = [], val = 1
Output: []
Example 3:
Input: head = [7,7,7,7], val = 7
Output: []
Constraints:
• The number of nodes in the list is in the range [0, 104
].
• 1 <= Node.val <= 50
• 0 <= val <= 50
Please, try to test your solution via JUnit and also test your solution here:
https://leetcode.com/problems/remove-linked-list-elements/
*/

    public static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static class MyLinkedList{

        Node head, tail;

        public boolean isEmpty(){
            return head==null;
        }

        public void insert(int data){
            Node node= new Node(data);
            if(isEmpty()){
                head= tail= node;
            }else {
                tail.next=node;
                tail= node;
                node.next= null;
            }
        }

        public void insertAll(int[] array){
            for (int i : array){
                insert(i);
            }
        }

        public void removeVal( int data){
//            insertAll(array);
//            ArrayList<Integer> arrayList= new ArrayList<>();
//            for (int i : array) arrayList.add(i);

            Node node= new Node(data);
            if (isEmpty()) System.out.println("[]");

            Node p1= head; // travers node
            Node prev= head; // prev node

            while (p1 != null){

                if(p1.value==data){

                    if (p1==head){
                        head= head.next;
                        node.next= null;
                    }else if (p1==tail) {
                        tail= prev;
                        prev.next= null;
                    }else {
                        prev.next= p1.next;
                        node.next= null;
                    }

                }
                prev= p1;
                p1= p1.next;

            }
        }

        public void print(){
//            if (isEmpty()) System.out.println("Empty");
            Node node= head;

            while (node != null){
                if (node.next==null) {
                    System.out.print(node.value + " -> null");
                }else {
                    System.out.print(node.value+", ");
                }
                node= node.next;
            }
            System.out.println();
        }




    }



}
