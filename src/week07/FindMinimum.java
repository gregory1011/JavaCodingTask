package week07;

public class FindMinimum {
    public static void main(String[] args) {

        int [] arr = {10,3,45,23,2};
        findNum(arr);

    }

    // Write a method that can find the minimum number from an int Array
    public static void findNum (int[] array){
         // int [] array = {10,3,45,23,2};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if( array[i] < min ){
                min = array[i];
            }
        }
    }
}
