package main.java.summary4;

import java.util.Objects;
import java.util.Scanner;

public class LoopWhileExample2 {
    public static void main(String[] args) {

        boolean isContinue = true;

        while (isContinue) {

            String userInput = userInput();

            if (Objects.equals(userInput, "false")) {
                isContinue = false;
                System.out.println("Bye - bye!");
            } else {
                System.out.println(" User input = " + userInput + " !");
            }
        }
    }

    public static String userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text (false for end) ->");
        String inputResult = scanner.nextLine();
        return inputResult;
    }
}
