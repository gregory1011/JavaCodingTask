package week06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SumOfAllDigits {

    public static void main(String[] args) {
        // Write a method that can return the sum of the digits in a string
        //Ex:  "12 java 5 apple 3"  ==>  20

      //  returnDigits("10 dollars plus 10 dollars");


        String str = "8 plus 2 plus 4 and 4";
        int sum = 0;

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if ( ch >= '0' && ch <= '9'){
               sum += ch - 48; // 48 from asccii table
            }


        }

        System.out.println("sum= "+ sum);

    }









}
