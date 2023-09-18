package main.java.HomeWork;
import java.util.Scanner;

public class HomeworkScanner {
    // public static final int a = 3;

    public static void main(String[] args) {
        //Разработайте алгоритм для считывания (через Scanner) из командной строки целочисленного числа,
        // трансформации его в троичную систему (по аналогии как мы делали с другими системами)
        // и вывода в командную строку результата
        System.out.print("Enter your integer number  :");


        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int a3 =a ;
        System.out.println("Your integer number in DECIMAL is :"+ a);
        sc.nextLine();
        sc.close();
        //  int a3  //Math.pow(3,10)=59049>Math.pow(2,16)

        // int  a3 = (a/Math.pow(3,10))*10  ;
        System.out.println("Your integer number in ternary system from "+ a3 +" : ");
        System.out.print(a3 / 81);    //
        //  System.out.println(a3 % 81);        //
        a3 = a3 % 81;
        System.out.print(a3 / 27);    //
        //    System.out.println(a3 % 27);        //
        a3 = a3 % 27;
        System.out.print(a3 / 9);    //
        //    System.out.println(a3 % 9);
        a3 = a3 % 9;
        System.out.print(a3 / 3);    //
        System.out.print(a3 % 3);

    }
}
