package main.java.summary4;

import java.util.Scanner;

public class LoopWhileExample {
    public static void main(String[] args) {

        boolean isContinue = true;

        while (isContinue) {

            int intInput = userInput();

            if (intInput > 100) {
                isContinue = false;
                System.out.println("Bye - bye!");
            } else {
                System.out.println(" User input = " + intInput + "  ^2 = " + (intInput * intInput));
            }
        }
    }

    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number ->");
        int inputResult = scanner.nextInt();
        return inputResult;
    }
}
