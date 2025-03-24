package practice.pro.review_dataStructureAndAlgorithms.Stacks;

import java.util.EmptyStackException;

public class MyStack<T> {

    public SNode bottom; // head
    public SNode top; // tail
    int size;

    public boolean isEmpty(){
        return bottom==null;
    }

    public void push(T item){
        SNode newNode = new SNode(item);

        if(isEmpty()) bottom = top = newNode;
        else {
            top.next = newNode;
            top = newNode;
        }
        size++;
    }

    public T peek(){
        return (T) top.data;
    }
    public T pop(){
        SNode peekNode;
        if(isEmpty()) throw new EmptyStackException();
        else {
            //stack has one element, when top == bottom
            if(top==bottom) {
                peekNode = top;
                top=bottom=null;
            }else{ //stack has more elements
                peekNode = top;
                SNode prev= bottom;
                while(prev.next != top) {
                    prev= prev.next;
                }
                prev.next = null;
                top= prev;
            }
            size--;
        }
        return (T) peekNode.data;
    }

    void print(){}


}
