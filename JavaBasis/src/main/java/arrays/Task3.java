package main.java.arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        // Создать массив типа String с размером 7. Записать в него значения
        // дней недели. Вывести на консоль значение последнего элемента.

        String[] week = new String[7];
        week[0] = "MO";
        week[1] = "TU";
        week[2] = "WE";
        week[3] = "TH";
        week[4] = "FR";
        week[5] = "SA";
        week[6] = "SU";

        String[] week2 = new String[]{"MO", "TU", "WE", "TH", "FR", "SA", "SU"};

        System.out.println(week[week.length - 1]);
        System.out.println(week2[week2.length - 1]);
        System.out.println(week[6]);
char[] s = {'h','e','l','l','o'};
        System.out.println(s); // hello
        System.out.println(Arrays.toString(s));//[h, e, l, l, o]
    }
}