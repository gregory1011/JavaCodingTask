package practice;

import java.util.Arrays;

public class ValidAnagram {


    /*
    Question-1 Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
Constraints:
 1 <= s.length, t.length <= 5 * 104
 s and t consist of lowercase English letters.
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to
such a case?
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Please, test your solution here : https://leetcode.com/problems/valid-anagram/
     */


    public static void main(String[] args) {

        System.out.println(isAnagram("Hero", "eroh"));
    }


    public static boolean isAnagram(String s, String t) {

             s = s.toLowerCase();
             t = t.toLowerCase();

            char[] sChar = s.toCharArray();
            Arrays.sort(sChar);

            char[] tChar = t.toCharArray();
            Arrays.sort(tChar);

            return Arrays.equals(sChar, tChar);
    }




}
