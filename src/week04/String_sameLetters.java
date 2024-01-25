package week04;

public class String_sameLetters {
    public static void main(String[] args) {

        //Write a return method that check if a string is build out
        // of the same letters as another string.
        //Ex: same("abc", "cab"); -> true
        //same("abc", "abb"); -> false:


         boolean same = SameLetters();
        System.out.println(same);
    }

    public static boolean SameLetters() {

        String word1 = "";
        String word2 = "";

        for (int i = 0; i < word2.length(); i++) {
            if(word1.contains(word2.substring(i))){
                return true;
            }

        }
        return false;

    }

}
