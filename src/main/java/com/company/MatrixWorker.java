package com.company;

/**
 * Created by Олег on 23.01.2017.
 */
public class MatrixWorker {

    private static final String MATRIX_IS_NOT_CORRECT = "Матрицы не соответствуют требованиям";

    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] matrixC;


    public MatrixWorker(Matrix a, Matrix b) {
        matrixA = a.getMatrix();
        matrixB = b.getMatrix();

        if (areMultiply(matrixA[0].length, matrixB.length)) {
            matrixC = new int[matrixA.length][matrixB[0].length];
        } else {
            System.out.println(MATRIX_IS_NOT_CORRECT);
            System.exit(0);
        }
    }

    private boolean areMultiply(int columnsA, int rowsB) {
        return columnsA == rowsB;
    }

    /**
     * @param matrix
     * @return
     */
    public String toString(Matrix matrix) {

        int[][] m = matrix.getMatrix();
        String answer = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                answer += m[i][j] + " ";
            }
            answer += "\n";
        }
        return answer;
    }

    public Matrix multiply() {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return new Matrix(matrixC);
    }
}

