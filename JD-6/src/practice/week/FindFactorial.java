package practice.week;

public class FindFactorial {

    public static void main(String[] args) {

        int num= 6;
        System.out.println(factorial(num)); // recursive
        System.out.println(fact(num)); // for loop
        System.out.println(fact2(num)); // while loop

    }

    public static int factorial(int num) {
        if(num==1) return 1;
        return num * factorial(num-1);
    }

    public static int fact(int num){

        int rs= 1;
        for (int i = 2; i <= num; i++) {
            rs *= i;
        }
        return rs;
    }

    public static int fact2(int num){
        int rs= 1;
        while (1<=num){
            rs*=num;
            num--;
        }
        return rs;
    }




}
