package main.java.HomeWork;

import java.util.Scanner;

public class HomeworkFlasks {
    public static void main(String[] args) {
        //уровень сложности: Представим, что у нас есть устройство, в котором две колбы.
        // Прибор работает корректно, если температура первой колбы выше 100 градусов,
        // а температура второй колбы меньше 100 градусов. Вы должны написать метод,
        // который проверяет это устройство. Ваша программа должна иметь переменные
        // Temperature1 и Temperature2. В результате он выводит сообщение true или false.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls how temperature of the first flask: ");
        int temperature1 = sc.nextInt();
        System.out.println("temperature1 :" +temperature1);
        System.out.print("Enter pls how temperature of the second flask: ");
        int temperature2 = sc.nextInt();
        sc.close();
        System.out.println("temperature2 :" +temperature2);
    if (temperature1 > 100  && temperature2 <100 ) {
        System.out.println("true :" );
    }else
        System.out.println("false");

    }
}

