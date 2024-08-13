package jd;

public class ValidPalindrome {

    /*
    Question-2 Valid Palindrome
Write a function that accepts a string and determines whether it is a palindrome, ignoring nonalphanumeric characters and case and returns true if it is palindrome.
(A string is said to be palindrome if it reads the same backward as forward, after converting all
uppercase letters into lowercase letters and removing all non-alphanumeric characters).
Examples:
Input: Do geese see God? Output: True
Input: Was it a car or a cat I saw? Output: True
Input: A brown fox jumping over Output: False
Constraints:
• 1 <= s.length <= 2 * 105
• s consists only of printable ASCII characters.
Please, test your solution here : https://leetcode.com/problems/valid-palindrome/
     */

    public static void main(String[] args) {

//        System.out.println(isPalindrome("Do gees see GodOML"));
        System.out.println(isPalindrome2("Do gees see God?"));
        System.out.println(isPalindrome2("!Was it a car or a cat I saw?"));

    }


    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s= s.replace(" ","");
        int i1 = s.length() / 2;

        String rs= "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 97 && ascii <= 122) {
               rs = ""+ ch;
            }
        }

        int left = 0;
        int right = rs.length()-1;
        while(left < right) {
            if(rs.charAt(left) != rs.charAt(right)) {
                return false;
            }
        }
        return true;
    }


    public static boolean isPalindrome2(String s) {
        s = s.toLowerCase();
        s = s.replace(" ","");

        // convert s to charArray
        char[] chars = s.toCharArray();
        // loop through
        for (int i = 0; i < chars.length; i++) {
            //convert each char in ascii num
            int ascii = (int)chars[i];
            // check if
            if(ascii >= 97 && ascii <= 122) {
                s += chars[i];
            }
//            else if(ascii <= 97 && ascii >= 122){
//                String replace = s.replace(""+chars[i], "");
//            }
        }

        // reverse the string and check s.equals(rs)
        String rs= "";
        for(int i = (s.length()-1); i >= 0 ; i--) {
            rs += s.charAt(i);
        }
        return s.equals(rs);
    }

}
