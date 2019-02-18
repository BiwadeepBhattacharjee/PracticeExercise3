//Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
//        assume the digits are a string and use split()
//        Input: 98,96,95,94,93
//        Output: 98,96,95,94,93 non consecutive numbers
//        Input: 54,53,52,51,50,49,48
//        Output : 54,53,52,51,50,49,48 are consecutive numbers
//        Input: 1,2,3,4,5,6,6
//        Output: 1,2,3,4,5,6,6 non consecutive numbers
package com.stackroute;

public class ConsecutiveNumbers {
    public boolean result = false;

    /*This method determines whether the String consists of consecutive values or not*/
    public boolean checkConsecutive(String values) {
        String[] array = values.split(",");
        for (int i = 0; i < array.length - 1; i++) {
            int difference = Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]);
            if (difference == 1 || difference == -1) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
