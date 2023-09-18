package main.java.HomeWork;

import java.util.Random;

public class HomeworkLargestDigit {
    public static void main(String[] args) {
        //уровень сложности: Создать программу, выводящую на экран случайно
        // сгенерированное трёхзначное целое число и его наибольшую цифру
        Random random = new Random();
        int threeDigitInteger = random.nextInt(100, 999); // 100...999: randomly generated three-digit integer
        System.out.println("randomly generated three-digit integer is:" + threeDigitInteger);
        int firstDigit = threeDigitInteger / 100;
        System.out.println("firstDigit is :" + firstDigit);
        int secondDigit = (threeDigitInteger - firstDigit * 100) / 10;
        System.out.println("firstDigit is :" + secondDigit);
        int threeDigit = threeDigitInteger - firstDigit * 100 - secondDigit * 10;
        System.out.println("firstDigit is :" + threeDigit);
        if (firstDigit > secondDigit && firstDigit > threeDigit)
            System.out.println("largest digit is :" + firstDigit);
        if (secondDigit > threeDigit) {
            System.out.println("largest digit is :" + secondDigit);
        } else System.out.println("largest digit is :" + threeDigit);


    }
}
