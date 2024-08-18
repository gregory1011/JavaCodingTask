package jd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String s= "Hello World  to      ";

        System.out.println(lastWordLength(s)); // with stream
        System.out.println(lastWord(s)); // without stream
        System.out.println(lastWord2(s)); // single loop

    }

    public static int lastWordLength(String s) {

        String[] str= s.trim().split(" ");
        List<String> stringList = Arrays.stream(str).filter(m -> !m.isEmpty()).collect(Collectors.toList());

        int lastIndex = stringList.size() -1;

        return stringList.get(lastIndex).length();
    }


    public static int lastWord(String s) {

        String[] str= s.trim().split(" ");
        int length = str.length;
        return str[length-1].length();
    }


    public static int lastWord2(String s) {

        int count= 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count > 0 ) break;
            if (s.charAt(i) != ' ') count++;
        }
        return count;
    }






}
