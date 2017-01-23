package com.company;

import java.util.Random;

/**
 * Created by Олег on 23.01.2017.
 */
public class Matrix {

    private int[][] matrix;

    //конструктор, в котороем задается количество строк и столбцов матрицы
    // и тут же заполнение матрицы
    public Matrix(int i, int j) {
        matrix = new int[i][j];
        fill();
    }

    //геттер
    public int[][] getMatrix() {
        return matrix;
    }

    // метод заполнения матрицы рэндомными числами
    private void fill() {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    //показать сформировавшуюся матрицу
    public void showMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
