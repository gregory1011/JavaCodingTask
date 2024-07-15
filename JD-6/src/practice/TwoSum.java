package practice;

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


        int[] nums = {16, 3, 11, 5, 15};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        Arrays.sort(nums);

        for (int i : nums) {
//            if ( nums[i] + nums[i+1] == target ) {
//                    res[0] = nums[i];
//                    res[1] = nums[i+1];
//            }
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


}
