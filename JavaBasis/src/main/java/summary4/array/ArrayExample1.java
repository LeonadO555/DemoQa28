package main.java.summary4.array;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {

        // cоздание массива целых чисел из 8 элементов и инициализация (заполнение значениями по умолчанию)
        int[] arr = new int[8];


        System.out.println(Arrays.toString(arr));

        // сохраняем в каждый элемент массива случайное число в диапазоне от 0 до 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));


        // проверим наш массив и если значение элемента массива будет четное то заменим его на 0

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }


        System.out.println(Arrays.toString(arr));

    }
}
