package main.java.Basic;

public class CharExamples {
    public static void main(String[] args) {
        // примитив     класс обёртка
        // char      -> Character
        // byte      -> Byte
        // int       -> Integer
        // ...

        char q = 'y';
        char w = 216;
        char e = '\u03a3';

//        System.out.println(q);
//        System.out.println(w);
//        System.out.println(e);
//
//        System.out.println();
//
//        System.out.println((int) q);
//        System.out.println('y' * 'y'); // пример из того, что char - псеводоцелочисленное значение

        // Char to int
        // 1. ASCII table
        char r = 'y';
        System.out.println((int) r + " " + r);

        // конвертация цифры, которая записана как символ в char
        // 2. использование метода valueOf() класса String
        char t = '8';
        int tint = Integer.parseInt(String.valueOf(t));
        System.out.println(tint);

        // 3. использование метода getNumericValue() класса символов Character
        char y = '9';
        int yint = Character.getNumericValue(y);
        System.out.println(yint);
    }
}
