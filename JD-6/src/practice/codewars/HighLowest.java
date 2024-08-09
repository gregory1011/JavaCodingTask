package practice.codewars;

import java.util.Arrays;

public class HighLowest {

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 -3 4 5"));
    }


    public static String highAndLow(String numbers) {

        String[] arr= numbers.split(" ");

        int min= Integer.parseInt(arr[0]);
        int max= Integer.parseInt(arr[0]);

        for (String s : arr) {
            int num = Integer.parseInt(s);
            if (num > max) max = num;
            if (num < min) min = num;
        }

        return max + " " + min;
    }




}
