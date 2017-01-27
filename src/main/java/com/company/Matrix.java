package com.company;

import javax.swing.*;

/**
 * Created by Олег on 23.01.2017.
 * Created matrix class
 */
public class Matrix extends JFrame {

    private int[][] matrix;

    /**
     * Constructor is initialize matrix by rows and columns
     *
     * @param i
     * @param j
     */
    public Matrix(int i, int j) {
        matrix = new int[i][j];
    }

    public Matrix(int[][] matrix){
        this.matrix = matrix;
    }


    public int[][] getMatrix() {
        return matrix;
    }
}
