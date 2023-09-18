package javaProLesson13_15Sep23.task6;


import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        // 1. Написать функцию, которая всегда возвращает "Hello".
        // 2. Написать функцию, которая возвращает строку вида "А А А ",
        //    где количество букв А - случайное число от 5 до 10
        // 3. Написать метод, который принимает функцию в качестве входящего параметра
        //    и 10 раз выводит в консоль результат её работы.

        Supplier<String> supplier1 = () -> "Hello";
        System.out.println("Пример 1:");
        print(supplier1);

        Supplier<String> supplier2 = () -> {
            Random random = new Random();
            StringBuilder builder = new StringBuilder();
            int randomValue = random.nextInt(5, 11);
            for (int i = 0; i < randomValue; i++) {
                builder.append("A ");
            }
            return builder.toString();
        };

        System.out.println("Пример 2:");
        print(supplier2);
    }

    public static void print(Supplier<String> supplier) {
        for (int i = 0; i < 10; i++) {
            System.out.println(supplier.get());
        }
    }
}