package Algorithms;

import java.util.Arrays;

/*
Calculate the min-max.
        The input is a list of lists of numbers.
        Calculate the minimum max of each list

        Steps:
        1. calculate max for each list
        2. calculate the min from the maxes

        Example:
        [1,2,3],[4,5],[1,8]
             3     5     8
           = 3
*/
public class Main {
    public static void main(String[] args) {
        int[][] myArray = {{1,2,3},{4,5},{1,8}};

        minMaxFor2DArray(myArray);
    }

    public static void minMaxFor2DArray(int[][] array) {
        int maxTimes = 0;
        for (int i = 0; i < array.length; i++) {
            maxTimes++;
        }
        int[] someArray = new int[maxTimes];

        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
            someArray[i] = max;
        }
        System.out.println("An array of all maxes: " + Arrays.toString(someArray));

        int min = someArray[0];
        for (int i = 0; i < someArray.length; i++) {
            if (min > someArray[i]) {
                min = someArray[i];
            }
        }
        System.out.println("The minimum max is: " + min);
    }
}