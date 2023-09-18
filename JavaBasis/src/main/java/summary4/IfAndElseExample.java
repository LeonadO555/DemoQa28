package main.java.summary4;

import org.w3c.dom.ls.LSOutput;

public class IfAndElseExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        boolean isCorrectResult = false;

        if ((a > b) || (isCorrectResult)){
            System.out.println("OK! ");
        } else {
            System.out.println("Something was wrong!");
        }
    }
}
