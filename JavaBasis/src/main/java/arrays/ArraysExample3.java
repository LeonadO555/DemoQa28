package main.java.arrays;

import java.util.Arrays;

public class ArraysExample3 {
    public static void main(String[] args) {
        int[] a = new int[]{14,2,3,19,87,6,53,32};

        // метод .copyOf()
        int[] b = Arrays.copyOf(a, 10);

        System.out.println("original array = " + Arrays.toString(a));
        System.out.println("result copyOf() = " + Arrays.toString(b));

        // метод .copyOfRange()
        int[] c = Arrays.copyOfRange(a, 2, a.length);

        System.out.println("original array = " + Arrays.toString(a));
        System.out.println("result copyOfRange() = " + Arrays.toString(c));

        // метод .toString()
        // использовать .toString() из класса Arrays
        System.out.println("original array = " + Arrays.toString(a));

        int[] aa = a.clone();

        // метод .sort() автоматически сортирует по возрастанию
        // применяется к массиву и тут же изменяет его
        Arrays.sort(aa);
        System.out.println("original array = " + Arrays.toString(aa));

    }
}
