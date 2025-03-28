package practice.pro.review_dataStructureAndAlgorithms.collection;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String str = "JaJaDeveloper";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        char c= ' ';
        for(char ch : str.toCharArray()) {
            if (map.get(ch)==1) {
                System.out.println(ch);
                break;
            }
        }
//        System.out.println(c);
    }
}
