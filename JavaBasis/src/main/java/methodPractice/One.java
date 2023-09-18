package main.java.methodPractice;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        // пользовательский метод, который проверяет, является ли число четным или нечетным

        Scanner sc = new Scanner(System.in);

        // создание экземпляра текущего класса
        One o = new One();


        System.out.print("Enter pls first integer number: ");
        int first = sc.nextInt();
           o.checkIt(first);
       // o.checkItReturn(first);
        System.out.println(o.checkItReturn(first));


        System.out.print("Enter pls second integer number: ");
        int second = sc.nextInt();
        o.checkIt(second);
        System.out.println(o.checkItReturn(second));
        // вызов статического методы
//        checkIt2(a);

        sc.close();
    }

    public void checkIt(int input) {

        if (input % 2 == 0) {
            System.out.println("данное число (" + input + ") чётное");
        } else {
            System.out.println("данное число (" + input + ") нечётное");
        }
    }

    public String checkItReturn(int input) {
        String result;

        if (input % 2 == 0) {
            result = "данное число (" + input + ") чётное";
        } else {
            result = "данное число (" + input + ") нечётное";
        }

        return result;
    }

    public static void checkIt2(int input) {

        if (input % 2 == 0) {
            System.out.println("данное число чётное");
        } else {
            System.out.println("данное число нечётное");
        }
    }
}
