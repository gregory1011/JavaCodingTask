package practice;

import java.util.Arrays;

public class New {

    public static void main(String[] args) {
        System.out.println(centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }

    public static int centeredAverage(int[] nums) {

        int sum= 0;
        int n= nums.length;
        for (int i = 1; i < n-1; i++) {
            sum +=nums[i];
        }
        return sum / (n-2);
    }
}
