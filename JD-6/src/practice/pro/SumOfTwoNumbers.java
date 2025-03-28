package practice.pro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumbers {


    public static void main(String[] args) {
        int[] arr1 = {1,3,9,7,3,2,4,5};
        int r= 9;
        int[] i = sumOfTwoNumbers(arr1, r);
        int[] is = sumOfTwoNumbers(arr1, r);

        System.out.println("index of "+ Arrays.toString(i));
        System.out.println("index of "+ Arrays.toString(is));

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

    // this optimal solution with Time complexity O(n) and Space complexity O(n)
    private static int[] sumOfTwoNumber(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target-arr[i])) return new int[]{i, map.get( target-arr[i]), i};
            map.put(arr[i], i); // put for map key= array value, and key value= array index
        }
        return new int[]{};
    }



}
