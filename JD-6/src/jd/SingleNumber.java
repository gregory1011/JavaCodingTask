package jd;

import java.util.*;

public class SingleNumber {

    public static void main(String[] args) {

        int[] nums= {1,2,1,2,3,4,4,3,6};
        System.out.println(getSingle(nums));
        System.out.println(getSingle2(nums));
    }


    public static int getSingle(int[] arr){

        if (arr.length == 1) return arr[0];
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }


    public static int getSingle2(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // this operator ^ (XOR) sums each element and subtract element if it repeats
        }
        return result;
    }



}


