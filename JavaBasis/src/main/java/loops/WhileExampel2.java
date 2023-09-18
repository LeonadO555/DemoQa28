package main.java.loops;

import java.util.Scanner;

public class WhileExampel2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter pls int nummer..:");
        int sum =0;
        while (scanner.hasNextInt()){
            int a = scanner.nextInt();
            sum=sum+a;
            System.out.println("sum"+sum);
        }
        System.out.println("sum end"+sum );
        scanner.close();
    }
}
