package practice.pro.review_dataStructureAndAlgorithms.collection;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {
        // it doesn't keep insertion order!
        Set<Student> set = new HashSet<>();
        set.add(new Student(1, "Jora"));
        set.add(new Student(2, "jessica"));
        set.add(new Student(3, "Laura"));
        set.add(new Student(4, "Frank"));

        System.out.println("insertion order is not preserved-> "+set);

        // insertion order is not preserved
        Set<Student> linkedSet = new LinkedHashSet<>();
        linkedSet.add(new Student(1, "Jora"));
        linkedSet.add(new Student(2, "jessica"));
        linkedSet.add(new Student(3, "Laura"));
        linkedSet.add(new Student(4, "Frank"));
        System.out.println("insertion order is preserved-> "+linkedSet);

        // return the first repeating char in the string
        String str= "Java Developer";
        System.out.println("firstRepeatingChar = " + firstRepeatingChar(str));

    }

    public static char firstRepeatingChar(String s){
        Set<Character> chars= new HashSet<>();
        for(char c: s.toCharArray()) if(!chars.add(c)) return c;
        return 0;
    }


}
