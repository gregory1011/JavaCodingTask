package week04;

public class String_removeDuplicates {
    public static void main(String[] args) {
        //Write a return method that can remove the duplicated values from String
        //Ex: removeDup("AAABBBCCC") ==> ABC

        String exm = removeDuplicates("AABBBCCC");
        System.out.println(exm);
    }

    public static String removeDuplicates (String word){
      String result = "" ;

        for (int i = 0; i < word.length(); i++) {

            char each = word.toUpperCase().charAt(i);

            if ( ! result.contains(""+each)){
                result += each;
            }
        }
      return result;
    }


}
