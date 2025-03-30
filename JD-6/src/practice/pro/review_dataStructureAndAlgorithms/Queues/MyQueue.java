package practice.pro.review_dataStructureAndAlgorithms.Queues;

import java.util.NoSuchElementException;

public class MyQueue<T> {

    private int size;
    QNode<T> front;
    QNode<T> back;

    public MyQueue() {
    } // empty constructor

    boolean isEmpty() {
        return front==null && size == 0;
    }

    void enqueue(T item) {
        QNode<T> node= new QNode<>(item);
        if (isEmpty()) front= back= node;  // no elements in stuck
        else{ // there are some elements in the stuck
            back.next= node;
            back= node;
        }
        size++;
    }

    T dequeue() {
       QNode<T> frontNode;
       if (isEmpty()) throw new NoSuchElementException("Queue is empty");
       if(front==back){
           frontNode= front;
           front= back= null;
       }else {
           frontNode= front;
           front= front.next;
       }
       size--;
       return frontNode.value;
    }

    T peek() {
        return front.value;
    }

    int size() {
        return size;
    }
}
