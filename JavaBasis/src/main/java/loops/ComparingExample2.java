package main.java.loops;

public class ComparingExample2 {
    public static void main(String[] args) {
        // печать всех элементов массива
        int[] arr = {12,9,7,5,3,1,2};

        // for-loop
        System.out.print("For loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // for-each
        System.out.print("For-each loop: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // while loop
        int t = 0;

        System.out.print("While loop: ");
        while (t < arr.length) {
            System.out.print(arr[t] + " ");
            t++;
        }
        System.out.println();


        // do-while loop
        int y = 0;

        System.out.print("Do-While loop: ");
        do {
            System.out.print(arr[y] + " ");
            y++;
        } while (y < arr.length);
        System.out.println();

    }
}
