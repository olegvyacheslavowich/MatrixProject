package com.company;



public class Main {

    public static void main(String[] args) {
        Matrix a = new Matrix(3,3);  // матрица 1
        Matrix b = new Matrix(3,3);  // матрица 2
        a.showMatrix();              //показать первую матрицу
        System.out.println();
        b.showMatrix();              //показать вторую
        System.out.println();
        MatrixMultiplication mm = new MatrixMultiplication(a,b);
        mm.multiply();
        mm.showAnswer();
    }
}
