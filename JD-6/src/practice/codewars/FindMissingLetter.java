package practice.codewars;

public class FindMissingLetter {
    public static void main(String[] args) {

        char[] arr= {'a','b','c','d','f'};
//        char[] arr= {'O','Q','R','S'};
//        char[] arr= {'Q', 'R', 'T'};

        System.out.println(findMissingLetter(arr));
        System.out.println(findMissingLetter1(arr));
    }

    public static char findMissingLetter(char[] array){

        int start= array[0];
        int end= array[array.length-1];
        int sum= 0;
        for (int i = start; i <= end ; i++) {
            sum+= i;
        }
        for (char ch : array){
            sum-=ch;
        }

        return (char) sum;

    }

    public static char findMissingLetter1(char[] array){
        char expectableLetter = array[0];
        for(char letter : array){
            if(letter != expectableLetter) break;
            expectableLetter++;
        }
        return expectableLetter;
    }



}
