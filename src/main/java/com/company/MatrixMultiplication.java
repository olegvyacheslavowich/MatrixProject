package com.company;

/**
 * Created by Олег on 23.01.2017.
 */
public class MatrixMultiplication {

    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] matrixC;

    //конструктор с предварительным указанием матриц, которые хотим перемножить
    public MatrixMultiplication(Matrix a, Matrix b) {
        matrixA = a.getMatrix();
        matrixB = b.getMatrix();

        // а можно ли перемножить матрицы??
        if (areMultiply(matrixA[0].length,matrixB.length))
            matrixC = new int[matrixA.length][matrixB[0].length];

    }

    //проверка на возможность перемножения матриц
    private boolean areMultiply(int columnsA,int rowsB){
        boolean answer;
        if (columnsA == rowsB)
            answer = true;
        else answer = false;
        return answer;
    }

    //метод вывода результата умножения
    public void showAnswer() {
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }

    // метод перемжножения матриц
    public int[][] multiply() {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixB.length;  /*k < matrixA[i].length;*/ k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixC;
    }
}
