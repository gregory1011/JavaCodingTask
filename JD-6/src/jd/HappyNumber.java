package jd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {

        System.out.println(happyNumber(19));
//        System.out.println(sumDigits(19));

//        System.out.println(isHappy2(20));
//        System.out.println(isHappy2(19));
//        System.out.println(isHappy(20));
//        System.out.println(isHappy(19));
    }

/*
 Write a function that returns true if a number is a happy number, and false if it is an unhappy number.
A happy number is a number defined by the following process:
 1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
 2. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which
does not include 1.
 3. Those numbers for which this process ends in 1 are happy.
Example 1:
Input: n = 19 Output: True
Explanation:
 19 is Happy Number,
 1^2 + 9^2 = 82
 8^2 + 2^2 = 68
 6^2 + 8^2 = 100
 1^2 + 0^2 + 0^2 = 1
 As we reached to 1, 19 is a Happy Number.
Example 2:
Input: n = 20 Output: False
Constraints: 1 <= n <= 2^31 - 1
Please, try to test your solution via JUnit and also test your solution here:
https://leetcode.com/problems/happy-number/
For more explanation about happy number : https://en.wikipedia.org/wiki/Happy_number
    */


    public static int sumDigits(int n) {
        if(n==0) return 0; // base case


        return 1;
    }

    static boolean happyNumber(int num){

        if (num==1) return true;

        int sum= 0;
        while (num!=0){
            sum+= (num % 10) * (num % 10);
            num= num / 10;
        }

        return sumDigits(num) == 1;
    }



    public static int sumOfDigits(int  n){

        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
//            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }

        return sum;
    }

    public static boolean isHappy(int n){

        Set<Integer> num= new HashSet<>();
        while ( num.add(n)){

            if(n==1) return true;
            n= sumOfDigits(n);
        }

        return false;
    }

    public static boolean isHappy2(int n) {

        if(n==1) return true;
        if(n==7) return true;
        if(n>1 && n<10) return false;
        if(n<=0) return false;
        int sum=0;
        while(n>0){
            sum+=(n % 10) * (n % 10);
            n/=10;
        }
        return isHappy(sum);
    }




}
