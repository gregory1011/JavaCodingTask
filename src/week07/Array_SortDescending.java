package week07;

public class Array_SortDescending {
    public static void main(String[] args) {

        int [] array = {10,20,7, 8, 90};
        sortDescending(array);

        
    }

    //Write a return method that can sort an int array in descending order
    // without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //arr = Sort(arr); ==> {90, 20, 10, 8, 7};

    public static void sortDescending (int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for ( int j = 0; j < n - i - 1; j++ ) {
                if ( arr[j] > arr[j + 1] ){

                    int temp  = arr[i];
                    arr[j] = arr[j + 1];
                    arr[j +1] = temp;
                }
            }
        }


    }

}
