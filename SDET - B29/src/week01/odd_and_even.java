package week01;

public class odd_and_even {

    public static void main(String[] args) {

      //  Write a method that can identify  a given number is even or odd.
        
        System.out.println(print(100));

    }


    public static String print (int num){

        if (num % 2 == 0 ){
            return num +" --> even";
        }else {
            return num+ " --> odd";
        }

    }



}
