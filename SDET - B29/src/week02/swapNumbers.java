package week02;

public class swapNumbers {

    public static void main(String[] args) {
    /*
       Numbers – Swap Numbers
       Swap two variables' values without using a third variable.
    */

        int a = 3;
        int b = 6;
        System.out.println("a= "+ a);
        System.out.println("b= "+ b);

                a = a + b;  // a = 3 + 6;
                b = a - b;  // b = 9 - 6;
                a = a - b;  // a = 9 - 3;

        System.out.println("a= "+ a);
        System.out.println("b= " + b);




    }
}
