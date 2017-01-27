package com.company;

public class Main {

    public static void main(String[] args) {
        Matrix a = new Matrix(3,3);  // матрица 1
        Matrix b = new Matrix(3,3);  // матрица 2

        MatrixFill.fillByRandom(a);
        MatrixFill.fillByRandom(b);

        MatrixWorker mw = new MatrixWorker(a,b);
        System.out.println(mw.toString(a) +
                "\n" + mw.toString(b) +
                "\n" + mw.toString(mw.multiply()));


    }
}
