package test;
import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        /**
         * Matrix, which we filling
         */
        int[][] matrix = new int[4][4];
        Exercise ex = new Exercise();
        ex.matrixFilling(matrix,3);
        int [][] matrix1 = new int[6][6];
        Exercise exercise = new Exercise();
        exercise.matrixFilling(matrix1,8);
    }
}
