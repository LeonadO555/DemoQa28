package main.java.HomeWork;

import java.sql.Time;
import java.util.Date;
import java.util.Random;
import java.util.Timer;

public class HomeworkClocks {
    public static void main(String[] args) {
        //Есть устройство, на табло которого показывается количество секунд,
        // оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра —
        // табло отображает «28800» (т.е. остаётся 8 часов), когда 14:30 — на табло «9000»
        // (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло
        // отображается «0» (т.е. рабочий день закончился).
        //Некоторые сотрудники не умеют оценивать остаток рабочего дня в секундах.
        //Итак: требуется написать программу, которая вместо секунд будет выводить на табло
        // понятные фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
        //Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
        //Обьяснение: в переменную n должно записываться случайное (на время тестирования программы)
        // целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран (для тех сотрудников,
        // кто понимает в секундах) и на следующей строке (для тех сотрудников, кто не понимает)
        // должна выводиться фраза о количестве полных часов, содержащихся в n секундах.

        Random random = new Random();
        int s = random.nextInt(1, 28800); // [1...28800: seconds )
        s = 28800 - s;                                       //leave seconds
        int h = s / 3600;
        System.out.println( "leave : "+ s + " seconds");

        if (h < 1)   // [0;8 : hours)

            System.out.println("leave less than 1 hour; ");
        else
            System.out.println("leave :" + h + " hours; " );

    }
}
