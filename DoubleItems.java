package com.company;

public class DoubleItems {
    public static void main(String[] args) {

        // - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
        int numList[] = {3, 4, 5, 6, 7};

        int b[];

        b = new int[5];

        for (int i = 0; i < numList.length; i++) {

            int resultArray = numList[i] * 2;

            b[i] = resultArray;

        }

        for (int show : b) {

            System.out.print(" "+show);
        }
    }
}
