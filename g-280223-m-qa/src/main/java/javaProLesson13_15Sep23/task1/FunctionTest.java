package javaProLesson13_15Sep23.task1;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        // Написать функцию, которая принимает дробное число
        // и возвращает округлённое число

        // 1 способ. Создаём класс, реализуем интерфейс Function и реализуем
        // метод apply в этом классе.

        MyFunction myFunction =new MyFunction();
        System.out.println("1 способ : "+myFunction.apply(2.34));
        System.out.println("1 способ : "+myFunction.apply(7.57));

        // 2 способ. Сразу реализуем метод интерфейса Function через лямбду.
        Function<Double,Long> roundFunction= x->Math.round(x);
        System.out.println("2 способ : "+roundFunction.apply(2.34));
        System.out.println("2 способ : "+roundFunction.apply(7.57));
        //3 Method reference
        Function<Double,Long> roundFunction1= Math::round;
        System.out.println("3 способ : "+roundFunction1.apply(2.34));
        System.out.println("3 способ : "+roundFunction1.apply(7.57));
    }
}