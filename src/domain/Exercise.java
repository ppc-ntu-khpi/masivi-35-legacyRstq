package domain;

import java.util.Arrays;

/**
 * This class fill the matrix by numbers from x to end of matrix
 */
public class Exercise {
    /**
     * Method, which fills matrix by numbers from x to end of matrix
     * @param matrix matrix, which we filling
     * @param x numbers, which we using like start point
     */
    public void matrixFilling( int[][] matrix, int x){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = x;
                x++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }
}
