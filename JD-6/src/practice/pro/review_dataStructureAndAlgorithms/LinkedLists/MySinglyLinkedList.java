package practice.pro.review_dataStructureAndAlgorithms.LinkedLists;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
         return (head == null);
    }

    void add(int data) {
        // create a new object from data;
        Node node = new Node(data);
        if (isEmpty()) head= tail= node;
        else{
            tail.next= node;
            tail= node;
//            tail.next= null; // my node.next already is null
        }
        size++;
    }

    void printNodes(){
        Node current= head;
        while(current!=null){
            if (current.next == null) System.out.println(current.id+" => null");
            else System.out.print(current.id+ " => ");
            current= current.next;
        }
    }

    void remove(int data){
        Node current= head;
        Node prev= head;
        //check if empty
        if (isEmpty()) System.out.println("List is empty!!!");
        //assign prev and current with the head
        while(current!=null){
            if (current.id==data){ // if there is a match
                //case1: item == head/beginning
                if (current==head){
                    head= current.next;
                    current.next= null;
                } else if (current==tail) {//case2: item == tail/end
                    tail= current.next;
                    prev.next = null;
                } else { //case3: item == middle
                    prev.next = current.next;
                    current.next = null; // current node will be eligible for garbage collection
                }
                size--;
            } else prev= current;
            current= current.next;
        }

    }

    int indexOf(int data){
        if (isEmpty()) return -1;
        int pos= 0;
        // iterate through the list
        Node current= head;  // set my current with the starting element
        while(current!=null){
            if (current.id==data) return pos;
            pos++;
            current= current.next;
        }
        return -1;
    }

    void addFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) head= tail= node;
        else {
            node.next= head;
            head= node;
        }
        size++;
    }

    int getKthItemFromLast(int k) {
        Node node1= head;
        Node node2= head;
        // move node2 k-1 times, or we can start i= 1;
        for (int i= 0; i < (k-1); i++) {
            node2= node2.next;
        }
        //move both pointers until node2 hits the last element
        while(node2.next!=null){
            node1= node1.next;
            node2= node2.next;
        }
        // node1 is on the kth element from the last.
        return node1.id;
    }

    void removeKthItemFromLast(int k) {
        Node node1= head;
        Node node2= head;
        Node prev= null; // or head
        // move node2 k-1 times, or we can start i= 1;
        for (int i= 0; i < (k-1); i++) {
            node2= node2.next;
        }
        //move both pointers until node2 hits the last element
        while(node2.next!=null){
            prev= node1;
            node1= node1.next;
            node2= node2.next;
        }
        // node1 is on the kth element from the last.
        // do delete operation
        if (node1==head){
            head= node1.next;
            node1.next= null;
            size--;
        }
        else if (node1==tail) {
            tail= prev;
            prev.next = null;
            size--;
        }
        else {
            prev.next = node1.next;
            node1.next= null;
            size--;
        }

    }



}
