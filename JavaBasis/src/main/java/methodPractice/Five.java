package main.java.methodPractice;

public class Five {
    public static void main(String[] args) {
        // Напишите программу на Java, чтобы поменять местами значения, хранящиеся в
        // двух переменных, без использования третьей переменной

        int a = 10;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        new Five().rotate2(a,b);
    }

    public void rotate2(int a, int b) {
        a = a + b; // 10 + 20 = 30
        b = a - b; // 30 - 20 = 10
        a = a - b; // 30 - 10 = 20

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
