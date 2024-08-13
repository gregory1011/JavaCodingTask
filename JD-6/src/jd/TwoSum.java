package jd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {

    /*
    *Given an array of integers nums and an integer target, return the two numbers such that they add
up to target.
Assume that each input would have exactly one solution, and you should not use the same
element twice.
You can return the answer in any order.
No solution will return empty array.
Please, use two pointer strategy to solve this problem
(Hint : you should sort the input first).
Example:
Input: nums = [16, 3, 11, 5, 15], target = 8
Output: [3, 5]
Explanation: Because nums[1] + nums[3] => 3 + 5 = 8, we return [3, 5].
Optional additional task: Try to return original indices of the pair numbers.
Please, try to find more efficient solution after solving second algo question using two pointer
strategy
    * */

    public static void main(String[] args) {


        int[] num = new int []{16, 3, 11, 5, 15};
        int target = 8;

        System.out.println(Arrays.toString(twoSum(num, target)));
        System.out.println(Arrays.toString(twoSum2(num, target)));
        System.out.println(Arrays.toString(twoSum3(num, target)));
        System.out.println(Arrays.toString(twoSumOptimalSolution(num, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

//        Arrays.sort(nums);
        for (int i : nums) {
            for (int j : nums) {

                if (i + j == target && i != j) {
                    return new int[]{i, j};
                }

            }
        }
        return nums;

    }


    public static int[] twoSum2(int[] nums, int target) {

//        int[] nums = {16, 4, 4, 3, 11, 5, 15};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer arrNum = map.get(nums[i]);
            if (arrNum != null) {
                return new int[]{i, arrNum};
            }
            map.put(target - nums[i], i);
        }
        return nums;
    }


    public static int[] twoSum3(int[] arr, int target){
        //{16, 3, 11, 5, 15};
        // target 8
        Arrays.sort(arr);
        Map<Integer, Integer> map= new HashMap<>();

        for(int i= 0; i < arr.length; i++){
            int n= target - arr[i];
            if(map.containsKey(n)){
                return new int []{map.get(n), i};
            }else {
                map.put(arr[i], i);
            }
        }

        return new int[]{};
    }


    public static int[] twoSumOptimalSolution(int[] array, int targetValue){

        //    {16, 3, 11, 5, 15}
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <array.length ; i++) {
            int potentialMatch= targetValue - array[i];
            if (map.containsKey(potentialMatch)) return new int[] {i,map.get(potentialMatch)};
            else map.put(array[i], i);

        }
        return new int[]{};
    }



}
