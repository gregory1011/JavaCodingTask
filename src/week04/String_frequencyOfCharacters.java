package week04;

public class String_frequencyOfCharacters {
    public static void main(String[] args) {
        //Write a return method that can find the frequency of characters
        //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String exm = frequencyOfChar("AAABBCDD");
        System.out.println(exm);

    }

    public static String frequencyOfChar(String word){
        String result = "";

        for (int i = 0; i < word.length(); i++) {

            if ( result.contains(""+word.charAt(i)))
                continue;

            int count = 0;

            for (int j = 0; j < word.length(); j++) {

                if (word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }

            result += word.charAt(i)+ ""+ count;
        }

        return result ;
    }

}
