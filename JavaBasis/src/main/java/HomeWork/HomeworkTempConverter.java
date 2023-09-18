package main.java.HomeWork;

import java.util.Scanner;

public class HomeworkTempConverter {
    public static void main(String[] args) {
//  Напишите класс Converter для конвертации из градусов по Цельсию в Кельвины
// Фаренгейты. У класса должны быть методы для конвертации.
//  ºC = (ºF - 32)/1.8     ºC = ºK - 273,15
//  ºK = ºC +273.15         ºK = (ºF-32)/1.8 +273.15
//  ºF = ºC*1,8+32            ºF = º(K+273,15)*1,8+32
//  Напишите программу на Java для того, чтобы поменять местами значения,
//  хранящиеся в двух переменных с помощью третьей переменной
        HomeworkTempConverter tempConverter = new HomeworkTempConverter();
        HomeworkTempConverter ui = new HomeworkTempConverter();

        double tempCelsium = ui.userInput("Please enter temp in Celsius  : ");
        double tempKelvin = tempConverter.converterFromCelsiumToKelvin(tempCelsium);
        double tempFahr = tempConverter.converterFromCelsiumToFehrengeit(tempCelsium);
        System.out.println("Your temp temp in Celsius:" + tempCelsium + "ºC ; in Kelvin  is :" + tempKelvin + "ºK  ; in Fahrenheit is : " + tempFahr + "ºF");

        tempFahr = ui.userInput("Please enter temp in Fahrenheit : ");
        tempKelvin = tempConverter.converterFromFehrengeitToKelvin(tempFahr);
        tempCelsium = tempConverter.converterFromFehrengeitToCelsium(tempFahr);
        System.out.println("Your temp in Fahrenheit :" + tempFahr + "ºF; in Kelvin is: " + tempKelvin + "ºK ; in Celsius is: " + tempCelsium + "ºC ");

        double a = ui.userInput("Please enter first var : ");
        double b = ui.userInput("Please enter second var : ");
        System.out.println("Your first var :"+a+"; second var : "+b);
        rotate( a, b);
        }

    public double converterFromFehrengeitToKelvin(double tempFahr) {
        double tempInKelvin = (tempFahr - 32) / 1.8 + 273.15;      // ºK = (ºF-32)/1.8 +273.15
        return tempInKelvin;
    }

    public double converterFromCelsiumToKelvin(double tempCelsium) {
        double tempInKelvin = tempCelsium + 273.15;
        return tempInKelvin;
    }

    public double converterFromCelsiumToFehrengeit(double tempCelsium) {
        double tempInFahr = tempCelsium * 1.8 + 32;
        return tempInFahr;
    }

    public double converterFromFehrengeitToCelsium(double tempInFahr) {
        double tempCelsium = (tempInFahr - 32) / 1.8;
        return tempCelsium;
    }

    public double userInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);

        double input = scanner.nextDouble();
        return input;
    }

    public void rotate2(int a, int b) {
        a = a + b; // 10 + 20 = 30
        b = a - b; // 30 - 20 = 10
        a = a - b; // 30 - 10 = 20
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static double rotate(double a, double b) {
        double c = a;
        a = b;
        b = c;
        System.out.println("now first var :"+a+"; second var : "+b);
        return c;
    }
}
