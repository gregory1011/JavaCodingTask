package week05;

public class findTheUnique {
    public static void main(String[] args) {
        // Write a return method that can find the
        // unique characters from the String
        // Ex: unique("AAABBBCCCDEF") ==> "DEF";

        System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEF"));
    }

    public static String unique(String word){

        String[] arr = word.split("");
        String unique = "";

        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(arr[i])){
                    count++;
                }
            }


            if ( count == 1 ){
                unique += arr[i];
            }

        }

        return unique;
    }






}
