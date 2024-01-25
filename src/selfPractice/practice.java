package selfPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {

    public static void main(String[] args) {
        
        // Reverse a string 

        String string = reverseString("Jora");
        System.out.println("string = " + string);

        System.out.println("-----------------------------");

        //Prime number

        boolean number = primeNumbers(4);
        System.out.println("number = " + number);

        System.out.println("-----------------------------");

        // Palindrome
        String word = "java";
        boolean palindrome = isPalindrome(word);
        System.out.println("is "+word+" palindrome?  = " + palindrome);

        System.out.println("-----------------------------");

        // Factorial
        int num = 4;
        int i = factorialNumber(num);
        System.out.println("Factorial of " + num + " is " + i);

        System.out.println("-----------------------------");

        // Sum of digits

        int numbers = 135;
        int i1 = sumOfDigits(numbers);
        System.out.println("Sum of digits " + numbers + " = " + i1);

        System.out.println("-----------------------------");

        // Reverse numbers

        //int reverseNums = reverseNumbers();
        //System.out.println("reverseNums = " + reverseNums);

        System.out.println("-----------------------------");

        // Find duplicates
        int[] arr = {1,3,5,1,5,9,9,6,4};
        System.out.println(Arrays.toString(findDup(arr)));

        System.out.println("-----------------------------");

        // Find quick

        System.out.println("-----------------------------");

        // Find nBiggestNum
        int[] arr2 = {1,3,5,1,5,9,9,6,4};
        System.out.println("nBiggestNum(2, arr2) = " + nBiggestNum(3, arr2));

    }



    
    public static String reverseString (String str){

        String reverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static boolean primeNumbers(int num){
         if( num < 2 ) {
             return false;
         }

        for (int i = 2; i < num ; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPalindrome( String str){

        String result = "";
        for (int i = str.length() -1; i >= 0; i--) {
            result += str.charAt(i);
            if (str.equalsIgnoreCase(result)){
                return true;
            }
        }
        return false;
    }

    public static int factorialNumber (int num){

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public static int sumOfDigits(int nums){
        int result = 0;

        while ( nums >= 1){
                result += nums % 10;
                nums = nums / 10;
        }
        return result;
    }

    public static int reverseNumbers(int nums){

        int sum =0;


        while ( nums > 1){

        }

           return sum;
    }

    public String stringSplosion(String str) {
        String rs = "";

        for(int i = 0; i < str.length(); i++){
            rs += str.substring(0, i+1);
        }


        return rs;
    }

    public static int[] findDup(int[] arr){
        /* */

        int[] result = new int[arr.length];
        int index = 0;
        ArrayList<Integer> checked = new ArrayList<>();


        for (int eachArr : arr) {

            if(checked.contains(eachArr)){
                continue;
            }

            int count = 0;
            for(int other : arr){
                if(eachArr == other){
                    count++;
                }
            }
            if (count > 1){
                result[index++] = eachArr;
                checked.add(eachArr);
            }
        }
        return Arrays.copyOf(result, checked.size());
    }

    public static int quick(int n, int ... arr){

        Arrays.sort(arr);
        return arr[arr.length - n];

    }

    public static int nBiggestNum (int n, int... arr){
        ArrayList<Integer> max = new ArrayList<>();

        max.add(0);

        for (int each : arr){
            if (max.contains(each)){
                continue;
            }

            if(each > max.get(0)){
                max.add(0, each);
            }else{
                for (int i = 1; i < max.size(); i++) {
                    if (each > max.get(i)){
                        max.add(i, each);
                        break;
                    }
                }
            }
        }
        return max.get(n-1);
    }


    public boolean array123(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3){
                return true;
            }
        }
        return false;
    }


}
