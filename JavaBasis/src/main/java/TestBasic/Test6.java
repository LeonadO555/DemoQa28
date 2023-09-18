package main.java.TestBasic;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pls your message: ");
        String line = scanner.nextLine();

        scanner.close();

        // стандартный путь (путь №1)
//        int words = 1;
//        if (line.length() > 0) {
//            for (int i = 0; i < line.length(); i++) {
//                if (line.charAt(i) == ' ')
//                    words++;
//            }
//        } else words = 0;
//        System.out.println("Words = " + words);

        // путь №2
        int words2;
        if (line.length() > 0) {
            String[] amountOfWords = line.split(" ");
            words2 = amountOfWords.length;
        }
        else words2 = 0;

        System.out.println("Words (2nd way) = " + words2);
    }
}