package practice.week;

public class FindMax {

    public static void main(String[] args) {

        int[] nums= {6, 8, 3, 5, 1, 9};
        System.out.println(getMax(nums));
    }

    public static int getMax(int[] arr){

        int max= arr[0];
        for (int i : arr){
            if(i>max){
                max= i;
            }
        }
        return max;
    }

}
