package practice.week;

import java.util.Arrays;

public class ArrayOfDigits {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getDigits(490)));
    }

    public static int[] getDigits(int num){

        String s = String.valueOf(num);
        int[] arr= new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            String a = s.substring(0, i+1);
            int n = (Integer.valueOf(a)) % 10;
            arr[i]= n;
        }

        return arr;
    }

}

