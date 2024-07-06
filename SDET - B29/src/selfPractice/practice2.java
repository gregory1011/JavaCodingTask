package selfPractice;

import java.util.ArrayList;

public class practice2 {

    public static void main(String[] args) {

        System.out.println("stringSplosion(\"Good\") = " + stringSplosion("Good"));

    }

    public static String stringSplosion(String str) {
        String rs = "";

        for(int i = 0; i < str.length(); i++){
            rs += str.substring(0, i+1);
        }


        return rs;
    }


    public static int max(int[] arr){

        ArrayList<Integer> max = new ArrayList<>();
        int max1= 0;
        for (int each : arr) {
            max.add(each);

            for (int i = 0; i < max.size(); i++) {

            }
        }
        return max1;
    }






}
