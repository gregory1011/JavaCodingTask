package week05;

public class StringReverse {
    public static void main(String[] args) {

        // Write a function that can reverse String
        // Ex: Reverse("ABCD"); ==> DCBA

        System.out.println("reverse word= " + reverse("FLOOR"));

    }


    public static String reverse (String word){

        String str ="";

        for ( int i = word.length()-1 ; i >= 0 ; i--){
            str += word.charAt(i);
        }
        return str;
    }

}
