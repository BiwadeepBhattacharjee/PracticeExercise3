//Write a program to create a ChessBoard pattern with the help of multidimensional array, where
//        WWrepresents white color and BB represents Black color.
//        Output:
//        My Chess Board
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
package com.stackroute;

public class ChessBoard {
    public String arr[][] = new String[8][8];

    /*This method determines which blocks in the chess board should be black and white*/
    public String[][] colouredBoxes() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i % 2) == (j % 2)) {
                    arr[i][j] = "WW";
                } else {
                    arr[i][j] = "BB";
                }
            }
        }
        return arr;
    }
}
