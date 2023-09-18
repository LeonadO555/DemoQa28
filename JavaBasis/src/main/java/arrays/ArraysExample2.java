package main.java.arrays;

import java.util.Arrays;

public class ArraysExample2 {
    public static void main(String[] args) {

        // метод .clone()

        int[] a = new int[]{14,2,3,19,87,6,53,32};
        int[] b = a.clone();

        System.out.println("A = " + Arrays.toString(a));
        System.out.println("B = " + Arrays.toString(b));

        b[1] = 1000;

        System.out.println("A = " + Arrays.toString(a));
        System.out.println("B = " + Arrays.toString(b));

    }
}
