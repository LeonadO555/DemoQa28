package main.java.methodPractice;

public class Four {
    public static void main(String[] args) {
        // Напишите программу на Java для того, чтобы поменять местами значения,
        // хранящиеся в двух переменных с помощью третьей переменной

        int a = 10;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Four four = new Four();
        four.rotate(a,b);
    }

    public void rotate(int a, int b) {
        int c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void rotate2(int a, int b) {


    }
}
