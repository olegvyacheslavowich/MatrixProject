package com.company;

public class Main {

    public static void main(String[] args) {
        Matrix a = new Matrix(5,2);  // матрица 1
        Matrix b = new Matrix(2,2);  // матрица 2
        a.showMatrix();              //показать первую матрицу
        System.out.println();
        b.showMatrix();              //показать вторую
        MatrixMultiplication mm = new MatrixMultiplication(a,b);  //передаем готовые матрицы для умножения
        mm.multiplication(); // умножаем
        System.out.println();
        mm.showAnswer(); // смотрим что получилось

    }
}
