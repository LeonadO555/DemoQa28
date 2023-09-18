package main.java.Basic;

import java.util.Scanner;

public class SwitchCaseExamples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      System.out.print("Enter pls a day of week: ");
      String dayOfWeek = scanner.nextLine();

        System.out.print("Enter pl a month of year: ");
        int month = scanner.nextInt();

        System.out.println("Is it good weather? (1 -positive /0 -negative)");
        int isGoodWeather = scanner.nextInt();
        scanner.close();

        switchExample3(month, isGoodWeather);

        switchExample1(dayOfWeek);
        switchExample2(dayOfWeek);
    }

    public static void switchExample3(int month, int isGoodWeather) {
        switch (month) {
            case 3, 4, 5:
                switch (isGoodWeather) {
                    case 0:
                        System.out.println("Spring");
                        System.out.println("Weather is bad");
                        break;

                    case 1:
                        System.out.println("Spring");
                        System.out.println("Weather is good");
                        break;
                }

                break;

            case 6, 7, 8:
                switch (isGoodWeather) {
                    case 0:
                        System.out.println("Summer");
                        System.out.println("Weather is bad");
                        break;

                    case 1:
                        System.out.println("Summer");
                        System.out.println("Weather is good");
                        break;
                };

            case 9, 10, 11:
                switch (isGoodWeather) {
                    case 0:
                        System.out.println("Autum");
                        System.out.println("Weather is bad");
                        break;

                    case 1:
                        System.out.println("Autum");
                        System.out.println("Weather is good");
                        break;
                }
                break;

            case 12, 1, 2:
                switch (isGoodWeather) {
                    case 0:
                        System.out.println("Winter");
                        System.out.println("Weather is bad");
                        break;

                    case 1:
                        System.out.println("Winter");
                        System.out.println("Weather is good");
                        break;
                }

                break;
        }
        System.out.println("Label outside of switch case month");

    }

    public static void switchExample2(String dayOfWeek) {

        switch (dayOfWeek) {
            case "MO", "TU", "WE", "TH", "FR":
                System.out.println("  Working day  ");
                break;

            case "SA", "SU":
                System.out.println(" Weekend  ");
                break;

            default:
                System.out.println("This day is wrong");
        }
        System.out.println("Label outside of switch case dayWeek");
    }

    public static void switchExample1(String dayOfWeek) {

        switch (dayOfWeek) {
            case "WE":
                System.out.println("Wednesday");
                break;

            case "MO":
                System.out.println("Monday");
                break;

            case "TU":
                System.out.println("Tuesday");
                break;

            case "TH":
                System.out.println("Thursday");
                break;

            case "FR":
                System.out.println("Friday");
                break;

            case "SA":
                System.out.println("Saturday");
                break;

            case "SU":
                System.out.println("Sunday");
                break;

            default:
                System.out.println("This day is wrong");
        }

        System.out.println("Label outside of switch case day");

    }
}
