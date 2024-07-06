package JavaInterviewQuestions;

public class ArrayFindMax {

    public static void main(String[] args) {

        int[] a = {2, 5, 6, 8, 10, -3};
        System.out.println("maxValue(a) = " + maxValue(a));
    }

    public static int maxValue(int[] n){

        int max = 0;
        for (int each: n){
            if (each > max){
                max=each;
            }
        }
        return max;
    }


}
