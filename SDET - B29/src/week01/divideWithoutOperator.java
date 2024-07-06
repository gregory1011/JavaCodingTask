package week01;

public class divideWithoutOperator {

    public static void main(String[] args) {

        System.out.println(print(15,5));


    }


    public static int print(int num1, int num2){

        int count = 0;

        while( num1 >= num2 ){
            if ( num1 < 0 || num2 < 0) {
                System.out.println("Negative number are not allowed");
                System.exit(0);
            }else {
                num1 -= num2;
                count++;
            }
        }
        return count;
    }


}
