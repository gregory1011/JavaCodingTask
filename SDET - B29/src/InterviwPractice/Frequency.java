package InterviwPractice;

public class Frequency {

    public static void main(String[] args) {

        System.out.println(frequent("Massachusetts"));
    }

    public static String frequent (String str){

        String done = "";

        for (int i = 0; i < str.length(); i++) {
            if (done.contains(""+str.charAt(i)))
                continue;

             int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }

            done += str.charAt(i) + "" + count;
        }

        return done;
    }


}
