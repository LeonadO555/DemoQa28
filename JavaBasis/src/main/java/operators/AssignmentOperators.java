package main.java.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
//hhh
        a += 2; // a = a + 2    => 12
        a -= 2; // a = a - 2    => 10
        a *= 2; // a = a * 2    => 20
        a /= 2; // a = a / 2    => 10
        a %= 2; // a = a % 2    => 0

        System.out.println(a);
    }
}