package practice.pro.review_dataStructureAndAlgorithms.collection;

import java.util.HashMap;
import java.util.Map;


public class MapReview {

    public static void main(String[] args) {

        // create hashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jack");
        map.put(2, "Julia");
        map.put(3, "Frank");

        String str= "JJavav";
        System.out.println("findFirsNonRepeatedChar = " + findFirsNonRepeatedChar(str));
    }

    private static Character findFirsNonRepeatedChar(String s) {
        // create a Map:
        Map<Character, Integer> map = new HashMap<>();
        // count the frequency of the letters
        int count = 0;
        for(char ch : s.toCharArray()) {
            if(map.containsKey(ch)) {
                count= map.get(ch);
                map.put(ch, count+1);
            } else map.put(ch, 1); // for the first time char, then add 1
        }
        // start from the beginning and check if there is a char with freq= 1.
        for(char ch : s.toCharArray()) {
            if (map.get(ch)==1) return ch;
        }
        return null;
    }
}
