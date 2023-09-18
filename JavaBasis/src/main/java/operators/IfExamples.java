package main.java.operators;

import java.util.Scanner;

public class IfExamples {
    public static void main(String[] args) {

        int fullTime = 9;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls how many hours you already spend: ");
        int spendTime = sc.nextInt();
        sc.close();

        if (spendTime <= fullTime && spendTime >0 ) {
            // 3 <= lunch <= 5
            if (spendTime >= 3 && spendTime <= 5)
                System.out.println("Go to the lunch");
            else
                System.out.println("Go to the coffee time");
        } else if (spendTime == 10) {
            System.out.println("No free time, I need to complete my work");
        } else if (spendTime >= 24) {
            System.out.println("Something wrong");
        } else {
            System.out.println("I need to go home");
        }

//        else {
//            if (spendTime == 10)
//                System.out.println("No free time, I need to complete my work");
//            else
//                System.out.println("I need to go home");
//        }

        System.out.println("end of file");

    }

    public static void example1() {

        int fullTime = 9;
        int spendTime = 9;

        boolean isFreeLunchTime;

        if (spendTime < fullTime)
            isFreeLunchTime = true;
        else
            isFreeLunchTime = false;

        if (isFreeLunchTime)
            System.out.println("Go to the lunch");
        else
            System.out.println("No free time, I need to work");

        System.out.println("end of file");
    }
}
