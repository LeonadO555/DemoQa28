package main.java.summary4.array;

import java.util.Arrays;

public class TwoDimensionArrExample {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        // равносильно такой записи int[] array1 = {1,2,3}

        System.out.println(Arrays.toString(array1));

        int[][] array2 = new int[3][4];
        // java создает массив из 3-х элементов в котором каждый элемент будет - массив состоящий из 4=х элементов

        //int[][] array2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int counter = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                array2[i][j] = counter;
                System.out.println("index i = " + i + " index j = " + j + " counter = " + counter + " element = " + array2[i][j]);
                counter++;

            }
        }





    }
}
