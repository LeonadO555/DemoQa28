package main.java.HomeWork;

import java.util.Scanner;

//уровень сложности: Разработайте метод, который бы считал площадь пиццы
// в зависимости от её диаметра (формулу для расчёта площади круга можно найти в интернете).
//Выберите подходящий тип метода (void или с возвращаемым значением),
// который позволит вам реализовать вывод на экран площадь этой пиццы

//public class methodArea {

public class HomeworkPizzaArea {
    public static void main(String[] args) {

        //double diameter;
        Scanner sc = new Scanner(System.in);                          // method 1
        System.out.print("Enter please pizza diameter  : ");
        double diameter = sc.nextInt();
        System.out.println("Your pizza diameter is :" + diameter);
        double area = (Math.PI * Math.pow(diameter, 2) / 4);
        System.out.println(" Pizza area is :" + area);
        sc.close();
        System.out.println("Label1- method 1");
        methodAreaPizza(diameter);
    }


    public static double methodAreaPizza(double diameter) {
        Scanner scanner = new Scanner(System.in);                          // method
        System.out.println("Enter please pizza diameter  : ");
        System.out.println("Label2- method 2");
        diameter = scanner.nextInt();
        System.out.println("Your pizza diameter is :" + diameter);
        double area = (Math.PI * Math.pow(diameter, 2) / 4);
        System.out.println(" Pizza area is :" + area);

        scanner.close();
       return diameter;
    }
}