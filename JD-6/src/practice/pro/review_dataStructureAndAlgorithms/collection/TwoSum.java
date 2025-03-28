package practice.pro.review_dataStructureAndAlgorithms.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(sum(arr, target)));
    }

    private static int[] sum(int[] arr, int target) {
        //   value, index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[]{map.get(target-arr[i]), i};
            }else map.put(arr[i], i);
        }
        return new int[]{};
    }
}
