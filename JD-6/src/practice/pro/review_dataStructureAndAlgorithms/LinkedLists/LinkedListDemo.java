package practice.pro.review_dataStructureAndAlgorithms.LinkedLists;



public class LinkedListDemo {


    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        //make a list
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        System.out.println(node1);
        System.out.println("Next address is= "+node2.next.id);
        System.out.println("Next address is= "+node4.next);

        Node current;
        Node head= node1;
        current= head;
        while (current != null) {
            System.out.println("Id of the current= "+current.id);
            current= current.next;
        }
    }
}
