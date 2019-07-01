package com.stackroute.pe3;
/*class which displacy sum of two matrices*/
public class MatrixSum {

    public static int[][] sum(int rows, int cols, int[][] m1, int[][] m2) {
        int sum[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return sum;
    }

    }
