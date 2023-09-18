package main.java.Basic;

import java.util.Scanner;

public class SwitchCaseExamples5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pls day number of week:");
        int dayOfWeek = scanner.nextInt();
        scanner.close();

        System.out.println(getDayOfWeekName(dayOfWeek));
        System.out.println(getDayOfWeekName2(dayOfWeek));
    }

    // switch um : + break
    public static String getDayOfWeekName(int d) {
        String result = "";
        System.out.println("Label1 ");
        switch (d) {
            case 1, 2, 3, 4, 5:
                return "working day ";
            //        break ;
            case 6, 7:
                return "Weekend";
            //      break;
            default:
                return "Wrong day";
        }

        //   return "";
    }

    ;

    public static String getDayOfWeekName2(int d) {
        String result;
        System.out.println("Label 2");
        switch (d) {
            case 1, 2, 3, 4, 5 -> result = "Working day";
            case 6, 7 -> result = "Weekend";
            default -> result = "Wrong day";
        }

        return result;
    }

    public static String getDayOfWeekName4(int d) {
//        String result;
//        System.out.println("Label 2");
        return switch (d) {
            case 1, 2, 3, 4, 5 -> "Working day";
            case 6, 7 -> "Weekend";
            default -> "Wrong day";
        };
    }

}