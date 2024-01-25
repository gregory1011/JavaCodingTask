package week07;

public class Array_SortAscending {
    public static void main(String[] args) {

        int [] arr = {10, 9, 8, 7};
        sortAscending(arr);

    }

    // Write a return method that can sort an int array in Ascending order
    // without using the sort method of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};
    //arr = Sort(arr); ==>{ 7, 8, 9, 10};

    public static void sortAscending (int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n-i - 1; j++) {
                if ( arr[j] > arr[j + 1]){

                    int temp  = arr[i];
                    arr[j] = arr[j + 1];
                    arr[j +1] = temp;
                }
            }
        }


    }




}
