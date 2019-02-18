//Write a program to compute the addition of two matrix, Read the number of rows and columns
//        as input, also the values of each matrix
//        Output:
//        Input number of rows of matrix: 3
//        Input number of columns of matrix: 2
//        Input elements of first matrix: 1 2 3 4 5 6
//        Input the elements of second matrix: 9 8 7 6 5 4
//        Sum of the matrices:-
//        10 10
//        10 10
//        10 10
package com.stackroute;

public class AdditionOfMatrices {
    /*This method adds the contents of one matrix to the other and returns the sum of two matrices as a two dimensional array*/
    public int[][] sumOfMatrices(int row, int col, int array1[][], int array2[][]) {
        int[][] sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return sum;
    }
}
