package InterviwPractice;

public class Odd_or_even {

    public static void main(String[] args) {

        System.out.println( result(40) );
        System.out.println(go(33));
    }

    public static String result (int num){

        if (num % 2 == 0){
            return num +" is even.";
        }else {
            return num + " is odd.";
        }
    }

    public static String go (int num){

        if (num % 2 == 0){
           return num +" is even";
        }else {
          return num +" is odd";
        }
    }


}
