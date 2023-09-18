package main.java.loops;

public class ComparingExample1 {
    public static void main(String[] args) {
        // печать строки (hello java) несколько раз
        String str = "hello java";
        int limit = 3;

        // for loop
        for (int i = 0; i < limit; i++) {
            System.out.println("For loop: " + str);
        }

        // while
        int q = 0;
        while (q < limit) {
            System.out.println("While loop: " + str);
            q++;
        }

        // do-while
        int w = 0;
        do {
            System.out.println("Do-While loop: " + str);
            w++;
        } while (w < limit);
    }
}