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


}
