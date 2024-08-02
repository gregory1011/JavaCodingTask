package practice.week;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindUnique {

    public static void main(String[] args) {

        String str= "success";
        System.out.println(findUnique(str));

    }


    public static char getUnique(String s){
        if (s.isEmpty()) return ' ';


//        if(s.charAt(0))
        return ' ';
    }


    public static char findUnique(String str){

        str= str.toLowerCase();
        if(str.isEmpty()) return ' ';

    Map<Character, Integer> map= new HashMap<>();
    for (char ch : str.toCharArray()){
        map.put(ch, map.getOrDefault(ch,0)+1);
    }

    for (char ch : str.toCharArray()){
        if (map.get(ch) ==1) return ch;
    }
        return ' ';
    }







}
