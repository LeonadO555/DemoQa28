package main.java.HomeWork;

import java.util.Scanner;

public class HomeworkCoffeeApp {


    public static void main(String[] args) {

        //Представьте, что вы находитесь перед кофейным аппаратом, у него 4 кнопки, которые соответствуют напиткам:
        // эспрессо, американо, капучино, обычная вода.
        //Напишите алгоритм, который будет предлагать клиенту выбрать напиток, нажатие кнопки
        // (или считывания цифры, например) и в консоль будет отображаться результат приготовления
        // (например, "Ваш <напиток> готов").
        //Сделайте 2 метода, в одном из них будет реализован формат if-else, в другом - switch
        // IF/ELSE
      //  String[] drinks = {"Coffee", "Latte", "Cappuccino", "Water"};

        System.out.println("Method SWITCH CASE:");
        coffeeCase(); //SWITCH CASE
        System.out.println();

        System.out.println("Method IF/ELSE:");
        methodCoffeeIf();//Method If

    }

    private static void  coffeeCase() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter please number(Coffee 1), (Latte 2), (Cappuccino 3), (Water 4):");
        int d = scanner.nextInt();
        String[] drinks = {"Coffee", "Latte", "Cappuccino", "Water"};
        //   scanner.close();
        String result;
        if (d<5&&0<d)
        {System.out.println("You are select:" + drinks[d-1]);}
        else
        {System.out.println("No coin or false entering ");}


        switch (d) {
            case 1: result = drinks[0];
                System.out.println("Your drink : "+drinks[d-1]+"  is ready");

                //  result = "Coffee";//        int coffee = 1;
                break;

            case 2: result = drinks[1];
                System.out.println("Your drink : "+drinks[d-1]+"  is ready");

                //       result = "Latte";//        int latte = 2;
                break;

            case 3: result = drinks[2];
                System.out.println("Your drink : "+drinks[d-1]+"  is ready");

                //result = "Cappuccino";//        int cappuccino = 3;
                break;

            case 4: result = drinks[3];
                System.out.println("Your drink : "+drinks[d-1]+"  is ready");

                //result = "Water";//        int Water = 4;
                break;


            default:
                result = "No coin or false entering";
        }
    }


    private static void methodCoffeeIf() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter please number(Coffee 1), (Latte 2), (Cappuccino 3), (Water 4):");
        int q = scanner.nextInt();
        scanner.close();
        int coffee = 1;
        int latte = 2;
        int cappuccino = 3;
        int water = 4;

        if (q == coffee) {
            System.out.println("You are select:  Coffee");
            System.out.println("Your drink  is ready");
        } else if (q == latte) {
            System.out.println("You are select: Latte");
            System.out.println("Your drink  is ready");
        } else if (q == cappuccino) {
            System.out.println("You are select: Cappuccino");
            System.out.println("Your drink  is ready");
        } else if (q == water) {
            System.out.println("You are select: Water");
            System.out.println("Your drink  is ready");
        } else {
            System.out.println("No coin or false entering");
        }
    }
}
