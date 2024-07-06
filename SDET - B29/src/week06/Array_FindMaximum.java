package week06;

import java.sql.Array;

public class Array_FindMaximum {
    public static void main(String[] args) {

        // Write a method that can find the maximum number from an int Array
        // Ex:  int[] arr = { 99, 12, 23, 32, 44, 57, 6 } ==> 99

        int[] arr = {11, 99, 12, 23, 32, 44, 57, 6};
        System.out.println("maxNumber= " + maxNumber(arr));


    }


    public static int maxNumber(int[] num) {

        int max = num[0];

           for (int i = 0; i < num.length; i++) {

               if (num[i] > max){
                  max = num[i];
               }

           }

        return max;

    }

}
