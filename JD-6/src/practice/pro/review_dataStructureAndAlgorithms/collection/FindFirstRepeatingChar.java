package practice.pro.review_dataStructureAndAlgorithms.collection;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatingChar {

    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        String str = "Java Developer";
        char ch= ' ';
        for (int i = 0; i < str.length(); i++) {
            if(set.contains(str.charAt(i))){
                ch=str.charAt(i);
                break;
            }
            set.add(str.charAt(i));
        }
        System.out.println(ch);
    }
}
