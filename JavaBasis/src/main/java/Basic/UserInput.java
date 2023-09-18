package main.java.Basic;

import java.util.Scanner;

public class UserInput {

    public double userInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        double input = scanner.nextDouble();
        return input;
    }

//    public int userInputInteger(String message){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(message);
//
//        int input = scanner.nextInt();
//        return input;
//    }
}