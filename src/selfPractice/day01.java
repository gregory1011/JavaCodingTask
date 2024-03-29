package selfPractice;

import java.util.Arrays;

public class day01 {



    public static void main(String[] args) {

        boolean perfectSquare = isPerfectSquare(3);
        System.out.println("perfectSquare = " + perfectSquare);

    }


    public static boolean isPerfectSquare(int num){

    /*  How to find if a number is a perfect square
        , and he gave an example of 25 and 36,
        he said that these two numbers are perfect squares,
        but the problem is how to find if
        they are perfect squares{1, 4, 9, 25, 36, 49, 64, 81, 100, 121, 144...}
     */

        boolean isPerfectNumber= false;

        if (num<1){
            return false;
        }

        for (int i = 1; i <= num; i++) { // better if <=num/2;

            if( i * i == num ){
                isPerfectNumber= true;
                break;
            }
        }
        return isPerfectNumber;
    }




    private static int countSubArraysDecreasing(int[] array) {

        /*
    *
    *  There is a new product launched and its customer ratings are being recorded in an array. The ratings are being monitored and analyzed if there is any decrease in the ratings.
    Find the number of periods in which the rating is consecutively decreasing.
    Example - Ratings = [4,3,5,4,3]
    Periods (in other words sub arrays in which ratings are decreasing):
    One day periods = [4],[3],[5],[4],[3] (count of subarrays is 5)
    Two day periods = [4,3],[5,4],[4,3] (count of subarrays is 3)
    3 day periods = [5,4,3] (count of subarrays is 1)
    So, the output for this example will be 9 (5 + 3 + 1)
    *
    *
    *     1. General Condition [4,3,5,4,3]
    *     2. [4],[3],[5],[4],[3]   = 5 Arrays
    *     3. [4,3],[5,4],[4,3]     = 3 Arrays
    *     4. [5,4,3]               = 1 Arrays
    *     5. Result    (5+3+1)     = 9
    * */

        int counter=0;

        for (int i = 1; i <=array.length ; i++) {

            for (int j = 0; j <=array.length-i ; j++) {

                int[] subArray=  Arrays.copyOfRange(array,j,j+i);

                boolean res=   isValidSub(subArray);
                if (res)
                    counter++;
            }
        }

        return counter;
    }

    private static boolean isValidSub(int[] subArray) {

        /*
    *
    *  There is a new product launched and its customer ratings are being recorded in an array. The ratings are being monitored and analyzed if there is any decrease in the ratings.
    Find the number of periods in which the rating is consecutively decreasing.
    Example - Ratings = [4,3,5,4,3]
    Periods (in other words sub arrays in which ratings are decreasing):
    One day periods = [4],[3],[5],[4],[3] (count of subarrays is 5)
    Two day periods = [4,3],[5,4],[4,3] (count of subarrays is 3)
    3 day periods = [5,4,3] (count of subarrays is 1)
    So, the output for this example will be 9 (5 + 3 + 1)
    *
    *
    *     1. General Condition [4,3,5,4,3]
    *     2. [4],[3],[5],[4],[3]   = 5 Arrays
    *     3. [4,3],[5,4],[4,3]     = 3 Arrays
    *     4. [5,4,3]               = 1 Arrays
    *     5. Result    (5+3+1)     = 9
    * */

        boolean isValid=true;
        //7>6>5>4
        for (int i = 0; i < subArray.length-1; i++) {
            int current=subArray[i];
            int next=subArray[i+1];
            if (next>current){
                isValid=false;
                break;
            }
        }
        return isValid;
    }




}
