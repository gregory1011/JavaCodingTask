package jd;

import java.util.Arrays;

public class MissingNumber {

    /*
    Given an array nums containing n distinct numbers in the range [0, n], return the only number in
the range that is missing from the array.
Example 1:
Input: nums = [3, 0, 1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0, 3]. 2 is the missing
number in the range since it does not appear in nums.
Example 2:
Input: nums = [0, 1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0, 1]. 2 is the missing
number in the range since it does not appear in nums.
Example 3:
Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0, 9]. 8 is the missing
number in the range since it does not appear in nums.
Constraints:
 n == nums.length
 1 <= n <= 104
 0 <= nums[i] <= n
 All the numbers of nums are unique.
Follow up: Could you implement a solution using only O(1) extra space complexity and O(n)
runtime complexity?
Please, test your solution here: https://leetcode.com/problems/missing-number/
    */


    public static void main(String[] args) {
        int n= 8;
//        int[] nums = new int[]{3,0,1};
        int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] num1 = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println(missingNumber(nums, n)); // time O(n) Space O(1)
        System.out.println(missingNumber2(nums)); // time O(n) Space O(1)
        System.out.println(missingNumber3(num1));// time O(n) Space O(0) , no space complexity

    }


    public static int missingNumber(int[] nums, int n) {

        Arrays.sort(nums);
        int misNum= 0;

        if(n > nums.length) {
            for (int i = 0; i < n; i++) {
                if (i != nums[i]) {
                    misNum = i;
                }
            }

                }else {

            for(int i= 0; i < nums.length; i++){
                if (i != nums[i]) {
                    misNum= i;
                }
            }

        }
        return misNum;
    }


    public static int missingNumber2(int[] nums) {
        Arrays.sort(nums);
        int misNum= 0;

        for(int i= 0; i < nums.length; i++){
            if(i != nums[i] ){
                misNum= i;
            }

        }
        return misNum;
    }

    public static int missingNumber3(int[] nums) {

        int n= nums.length;
        int sum = ((n+1) * n) / 2; // sum =9+1=10*9=90/2= 45
        //{9, 6, 4, 2, 3, 5, 7, 0, 1} -> 8 is missing
        for (int i : nums){
            sum= sum - i;
        }
        return sum;
    }



}
