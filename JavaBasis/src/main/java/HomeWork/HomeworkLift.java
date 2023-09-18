package main.java.HomeWork;

import java.util.Scanner;

public class HomeworkLift {
    public static void main(String[] args) {
        //Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан,
        // работает некорректно. Каждый раз он поднимается на N этажей и спускается на M этажей.
        // Если на последнем подъёме лифт превысил количество этажей, то считается что лифт поднялся на самый верх.
        // Найдите количество подъёмов, которые понадобятся лифту.
        //Параметры H, M, N можно получить через Scanner. Лучше всего сформировать отдельный метод для расчётов,
        // куда будут отправляться параметры. Добейтесь универсальности Вашего алгоритма через наиболее
        // подходящий цикл и другие известные вам конструкции
        int stepLifts = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of floors of a building of height H (ground floor=0): ");
        int heightBuilding = scanner.nextInt();
        System.out.print("How many floors does the elevator go up N(ground floor=0): ");
        int upFloors = scanner.nextInt();
        System.out.print("How many floors does the elevator go down M (ground floor=0): ");
        int downFloors = scanner.nextInt();
        scanner.close();

        if (downFloors > upFloors) {
            System.out.println("Elevator can't move up");
            stepLifts = 0;
        } else {
            if (heightBuilding <= upFloors) {
                System.out.println("the elevator has risen to the very top");
                stepLifts = 1;
            } else {
                stepLifts = heightBuilding / (upFloors - downFloors);
            }
        }
        System.out.println("The step of lifts the elevator need : " + stepLifts);
    }
}