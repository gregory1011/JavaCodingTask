package practice.pro;

import java.util.Arrays;

public class SumOfTwoNumbers {


    public static void main(String[] args) {
        int[] arr1 = {1,3,9,7,3,2,4,5};
        int r= 9;
        int[] i = sumOfTwoNumbers(arr1, r);

        System.out.println("index of "+ Arrays.toString(i));

//        ------------------------
        int[] m= {1,2,3,4,5,6,7,8,9};
        m[0]= 0;
        int[] n= new int[m.length+m.length];
        m= n;
        String string = Arrays.toString(m);
        System.out.println(string);
    }


    // this method is O(n`2) -> time complexity - Quadratic
    private static int[] sumOfTwoNumbers(int[] arr, int result) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == result) return new int[]{i, j};
            }
        }
        return new int[]{0,0};
    }



}
