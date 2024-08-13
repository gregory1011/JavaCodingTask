package jd;

import java.util.HashMap;



public class ExcelSheetColumnNumber {

    public static void main(String[] args) {


        String str= "ZY";
        System.out.println(titleToNumber(str));
        System.out.println("result= "+titleToNumber2(str));
    }

    /*
    * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its
corresponding column number.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
Example 1:
Input: columnTitle = "A" Output: 1
Example 2:
Input: columnTitle = "AB" Output: 28
Example 3:
Input: columnTitle = "ZY" Output: 701
Constraints:
1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].
Please, test your solution here: https://leetcode.com/problems/excel-sheet-column-number/
*
*/

    public static int titleToNumber(String columnTitle) {

        if (columnTitle == null || columnTitle.isEmpty() || columnTitle.length() > 7) return 0;
        char[] chars = columnTitle.toUpperCase().toCharArray();

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (int i = 1; i < 27; i++) {   //    key,  value
            charMap.put( (char) (64+i), i); // (A,    1)
        }
        System.out.println(charMap);


        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum *= 26;
            sum += charMap.get(chars[i]);
        }
        return sum;
    }




    public static int titleToNumber2(String str) {

        if (str == null || str.isEmpty()) return 0;
        int sum = 0;
        int index= 0;
        for (char ch : str.toUpperCase().toCharArray()) {
            if(str.length() <= 1){
                System.out.println("debug 1st iteration: "+ch+"="+((int)ch -64));
            }else {
                index++;
                System.out.println("debug "+index+" iterations:"+ch+"="+((int)ch -64));
            }
            sum *= 26;
            sum += ch - 'A' + 1;
        }
        return sum;

    }


















    public static int factor(int x){
        if (x==1) return 1;
        return x*factor(x-1);
    }


//    public static int factorial(int n) {
//        if (n == 1) return 1;
//        return n * factorial(n-1);
//    }

}
