package main.java.methodPractice;

import java.util.Random;

public class Two {
    public static void main(String[] args) {
        // выбор случайного студента для вопроса

        // indexes              0        1      2      3       4       5         6
        String[] students = {"Alice", "Bob", "Alex", "Sam", "Nick", "Felix", "Andrew"};

        Two w = new Two();
        w.selectStudent1(students);
        w.selectStudent2(students);
        w.selectStudent4(students);
        System.out.println("Result via return method = " + w.selectStudent3(students));
    }

    // Random
    public void selectStudent1(String[] a) {
        // создаём экземпляр класса Random
        Random random = new Random();

        // генерация случайного числа в пределах
        int studentIndex = random.nextInt(0, a.length);

        // получение имени студента на основе его индекса в массиве
        String studentName = a[studentIndex];

        // печать студента
        System.out.println("Result via Random class = " + studentName);
    }

    // Math.random
    public void selectStudent2(String[] a) {
        // [min;max), min < max => Math.random() * (max - min) + min

        // определение пределов
        int min = 0;
        int max = a.length;

        // генерация случайного числа в пределах
        int studentIndex = (int) (Math.random() * (max - min) + min);

        // получение имени студента на основе его индекса в массиве
        String studentName = a[studentIndex];

        // печать студента
        System.out.println("Result via Random class = " + studentName);
    }

    public String selectStudent3(String[] a) {
        // создаём экземпляр класса Random
        Random random = new Random();

        // генерация случайного числа в пределах
        int studentIndex = random.nextInt(0, a.length);

        // получение имени студента на основе его индекса в массиве
        String studentName = a[studentIndex];

        return studentName;
    }
    public String selectStudent4(String[] a) {
        Random random = new Random();
        return a[random.nextInt(0, a.length)];
    }
}
