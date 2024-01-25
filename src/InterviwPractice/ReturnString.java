package InterviwPractice;

public class ReturnString {

    public static void main(String[] args) {

        String str = "company";
        String result = "";

            for (int i = str.length()-1; i >= 0 ; i--) {
                result += str.charAt(i);
            }
        System.out.println(result);

        System.out.println(reverseString("PHONE"));
        System.out.println("reverse(\"water\") = " + reverse("water"));
    }



    public static String reverseString (String str){
        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }


    public static String reverse(String str){
        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }

        return result;
    }
}
