package jd;

public class DeleteNode {


    public static void main(String[] args) {

        MyLinkedList list= new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);

        list.printNodes();

        list.removeNodes(3,3);
        list.printNodes();
    }

    public static class Node{

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    public static class MyLinkedList{

        Node head;
        Node tail;

        public  boolean isEmpty(){
            return head == null;
        }

        public void printNodes() {

            Node node = head;
            while (node != null) {
                if (node.next == null) {
                    System.out.println(node.value + "-> null");
                } else {
                    System.out.print(node.value + "-> ");
                }
                node = node.next;
            }
        }

        public  void add(int data){

            Node node = new Node(data);
            if (isEmpty()) {
                head= tail= node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        public void removeNodes(int m, int n){

            Node p1= head; // keep node -> m iteration
            Node p2= head; // delete node -> n iteration

            while (p1.next != null) {

                for (int i = 0; i < m; i++) {
                    p2= p1;
                    p1 = p1.next;
                }

                for (int i = 0; i < n; i++) {
                    if( p1==null ) break;
                    p2.next = p1.next;
                    p1= p1.next;
                }

            }


        }

    }






}
