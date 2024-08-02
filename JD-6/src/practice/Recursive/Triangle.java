package practice.Recursive;

public class Triangle {

    public static void main(String[] args){
        System.out.println(triangle(6));
    }

    public static int triangle(int rows) {

        if(rows==0) return 0;

        return triangle(rows - 1) + rows;
    }


}
