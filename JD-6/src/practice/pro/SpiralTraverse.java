package practice.pro;

import java.util.Arrays;

public class SpiralTraverse {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        int[] traverse = traverse(matrix);
        System.out.println("traverse spiral= " + Arrays.toString(traverse));
    }

    private static int[] traverse(int[][] matrix) {
        int[] result = new int[matrix.length*matrix.length];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {

            }
        }
        return result;
    }
}
