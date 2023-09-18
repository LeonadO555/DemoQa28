package main.java.arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        // Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран
        // в строку в обратном порядке

        // 1. определили длину массива
        // 1.1 цикл по всему диапазону
        // 1.2 if -> count++
        // 2. создаём массив определённой длины (count)
        // 3. сборка массива только нужных значений (неважно в какой сортировке)
        // 4. сортировка

        // диапазон [1;99]

        example1();
        example2();
        example3();
    }

    public static void example1() {

        long start = System.nanoTime();

        int count = 0;

        for (int i = 1; i <= 99; i += 2) {
//            if (i % 2 != 0)
            count++;
        }

        int[] a = new int[count];

        for (int i = 0; i < a.length; i++) {
            a[i] = i * 2 + 1;
        }
//        System.out.println(Arrays.toString(a));

        int[] b = new int[a.length]; //a.clone();

        count--;

        for (int i = b.length - 1; i >= 0; i--, count--) {
            b[i] = a[(a.length - 1) - count];
        }
        System.out.println(Arrays.toString(b));

        long finish = System.nanoTime();
        long delta = finish - start;
        System.out.println("Time (1 algorithm) = " + delta);

//        System.out.println("Time (1 algorithm) = " + (System.nanoTime() - start));
    }


    public static void example2() {
        long start = System.nanoTime();

        int min = 1, max = 99, count = -1;

        int[] arr = new int[max % 2 == 0 ? max / 2 : max / 2 + 1];

//        String strSorted = "", strReversed = "";
        int[] arrRev = new int[arr.length];

        int position = arr.length - 1;
        while (count < arr.length - 1) {
            arr[++count] = min;
//            strSorted = strSorted + " " + min + " ";
//            strReversed = min + " " + strReversed;
            arrRev[position] = min;
            min += 2;
            position--;
        }

//        System.out.println(strReversed);
        System.out.println(Arrays.toString(arrRev));

        long finish = System.nanoTime();
        long delta = finish - start;

        System.out.println("Time (2 algorithm) = " + delta);
    }

    public static void example3() {

        long start = System.nanoTime();

        int a = 0;
        // получаем длину массива, в который будем записывать значения
        for (int i = 1; i <= 99; i += 2) {
//            if (i % 2 != 0)
            a++;
        }

        // инициализируем массив
        int[] Mas = new int[a];

        for (int i = 1, b = 0; i <= 99; i += 2) {
//            if (i % 2 != 0) {
            Mas[b] = i;
            b++;
//            }
        }

        int[] out = new int[Mas.length];

        a--;
        for (int i = Mas.length - 1; i >= 0; i--, a--) {
            out[i] = Mas[(Mas.length - 1) - a];
        }

        System.out.println(Arrays.toString(out));

        long finish = System.nanoTime();
        long delta = finish - start;

        System.out.println("Time (3 algorithm) = " + delta);
    }

}
