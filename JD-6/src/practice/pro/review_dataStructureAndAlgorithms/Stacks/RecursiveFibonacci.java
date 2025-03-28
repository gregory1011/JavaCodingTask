package practice.pro.review_dataStructureAndAlgorithms.Stacks;

import java.util.ArrayList;

public class RecursiveFibonacci {

    public static void main(String[] args) {
        //fibonacci -> 1,2,3,5,8,13,21,34,55,89,144
        System.out.println(fibonacci(12));

    }
    //a typical factorial calculation will be -> n! = n*(n-1)!;

    //Factorial calculation: F(n)= F(n-1) + f(n-2);
    public static int fibonacci(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
