package main.java.Basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pls your age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your surname: ");
        String surname = sc.next();

        System.out.println("Your full name is " + name + " " + surname);

        // int -> .nextIt()
//        System.out.println("Enter pls which year today: ");
//        int year = sc.nextInt();
//        System.out.println("You selected year is " + year);

        // double -> .nextDouble()
//        System.out.println("Enter pls radius: ");
//        double radius = sc.nextDouble();
//        double result = Math.pow(radius, 2) * Math.PI;
//        System.out.println("Square = " + result);

        // int example
//        System.out.print("Enter integer value: ");
//        int value = sc.nextInt();
//        System.out.println("Decimal value: " + value);
//        System.out.println("Binary value: " + Integer.toBinaryString(value));
//        System.out.println("Octal value: " + Integer.toOctalString(value));
//        System.out.println("Hex value: " + Integer.toHexString(value));

        sc.close();
    }
}
