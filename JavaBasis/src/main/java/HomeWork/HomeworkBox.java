package main.java.HomeWork;

import java.util.Scanner;

//        Описание задания.
//        1 уровень сложности: Создайте класс Box, в котором будут определены 4 конструктора.
//        Каждый конструктор должен выводить объём этой коробки (не важны единицы измерения,
//        формулу объёма можно вспомнить или найти в интернете) из расчёта её высоты, длины и ширины.
//        Создайте такие конструкторы:
//       1. Принимающий все 3 параметры
//       2. Принимающий 2 параметра, а третий будет определён каким-то стандартным значением
//       3. Принимающий 1 параметр, а второй и третий будут определены какими-то стандартными значениями
//       4.Конструктор без аргументов - все значения будут определены внутри конструктора
//        Не забудьте про вывод объёма в каждом конструкторе
public class HomeworkBox {
    // public double homeworkBox;
    double height;
    double length;
    double width;
    double volume;
    double parameter;

//    public double homeworkBox(String message) {
//        this.height = height;
//        this.length = length;
//        this.width = width;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(message);
//        double input = scanner.nextDouble();
//        double volume = height * length * width;
//        System.out.println("volume = " + volume);
//     // return ;
//        }

    public void Box(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
        this.volume = volume;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter parameter 1 : ");
        height = scanner.nextInt();
        System.out.println("Enter parameter 2 : ");
        length = scanner.nextInt();
        System.out.println(" parameter 2 " + scanner);
        System.out.println("Enter parameter 3 : ");
        width = scanner.nextInt();
        System.out.println(" parameter 3 " + scanner);
        double volume = height * length * width;
        System.out.println("volume = " + volume);
        return;
    }

    public void HomeworkBox(double length, double width) {
        this.length = length;
        this.width = width;
        this.volume = volume;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter parameter 2 : ");
        length = scanner.nextInt();
        System.out.println(" parameter 2 " + scanner);
        System.out.println("Enter parameter 3 : ");
        width = scanner.nextInt();
        System.out.println(" parameter 3 " + scanner);
        double volume = height * length * width;
        System.out.println("volume = " + volume);
        return;
    }

    public void HomeworkBox(double width) {
        this.width = width;
        this.volume = volume;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" parameter 3 " + scanner);
        double volume = height * length * width;
        System.out.println("volume = " + volume);
        return;
    }
}
