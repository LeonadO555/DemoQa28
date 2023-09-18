package main.java.Basic;

public class SimpleMathOperations {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;

        System.out.println(a + 2);
        System.out.println(a - 2);
        System.out.println(a * 2);
        System.out.println(a / 2);
        System.out.println(a % 2);

        System.out.println();

        System.out.println(b + 2.1);
        System.out.println(b - 2.1);
        System.out.println(b * 2.1);
        System.out.println(b / 2.1);

        System.out.print("Result = 0.55 * a + b = ");
        System.out.println(b + 0.55 * a);
    }
}
