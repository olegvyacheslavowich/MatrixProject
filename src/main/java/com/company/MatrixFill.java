package com.company;

import java.util.Random;

/**
 * Created by Олег on 27.01.2017.
 */
public class MatrixFill {

    /**
     * Method fill matrix by random numbers
     *
     * @param matrix
     */
    public static void fillByRandom(Matrix matrix) {

        Random random = new Random();
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                matrix.getMatrix()[i][j] = random.nextInt(10) + 1;
            }
        }
    }
}

