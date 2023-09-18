package javaProLesson13_15Sep23.task4;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String,String>function= Function.identity();
        System.out.println(function.apply("Hey"));
        Function<String,String>function1= x->x;
        System.out.println(function1.apply("Hey"));
    }
}
