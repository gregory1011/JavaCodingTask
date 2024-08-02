package practice.week;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

    public static void main(String[] args) {

        String[] strings= {"Apple", "Banana", "apple", "Cherry", "Apple"};
        System.out.println(freq(strings));
    }


    public static Map<String, Integer> freq(String[] arr){

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        return map;
    }
}
