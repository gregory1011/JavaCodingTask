package practice.pro.review_dataStructureAndAlgorithms.Stacks;

public class TestStackApp {

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        for (int i = 1; i <= 10; i++) {
            myStack.push(i);
        }
//        System.out.println(myStack.peek());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.peek());

        for (int i = 1; i <= 10; i++) {
            System.out.println(myStack.pop());
        }
    }



}
