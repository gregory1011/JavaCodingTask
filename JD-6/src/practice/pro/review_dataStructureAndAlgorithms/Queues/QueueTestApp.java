package practice.pro.review_dataStructureAndAlgorithms.Queues;

public class QueueTestApp {

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(10);
        System.out.println(myQueue.size());
        System.out.println("Front queue is: "+myQueue.peek());
        System.out.println("Front remove from queue: "+myQueue.dequeue());
        System.out.println("Front queue is: "+myQueue.peek());
    }


}
