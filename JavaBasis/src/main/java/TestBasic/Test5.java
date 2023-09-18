package main.java.TestBasic;

import java.util.Arrays;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        // Write the solution and paste the code.
        //
        // Replace every element of an array with an odd index to zero.
        //
        //The task:
        //1.) Create an array of 8 random integers from the interval [1;10]
        //
        //2.) Display the array to the screen as a string
        //
        //3.) Replace every odd-indexed element with zero
        //
        //4.) Display the array again on a separate line

        int[] arr = new int[8];

        Random random = new Random(123);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 11);
        }

        System.out.println("init array: " + Arrays.toString(arr));

        // не самый удачный вариант
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 != 0)
//                arr[i] = 0;
//        }

        // наиболее подходящий вариант
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }

        System.out.println("result array: " + Arrays.toString(arr));
    }
}
