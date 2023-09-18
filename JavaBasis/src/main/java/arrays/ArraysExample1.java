package main.java.arrays;

public class ArraysExample1 {
    public static void main(String[] args) {

        // 1 способ:
        int[] q; // декларация переменной, ассоциированной с массивом
        q = new int[100]; // аллокация памяти (выделение/резервирование памяти)

        // 2 способ:
        byte[] w = new byte[1000]; // инициализация массива

        // 3 способ (литерал):
        float[] e = {3.5F, 2.1F, 1.3F};

        // 4 способ:
        double[] r = new double[]{1.1, 2.2, 3.3, 4.4};

        // java/c++ way
        int[] t = new int[10];  // java way
        int y[] = new int[10];  // c/c++ way

        float[] u = new float[10];
        boolean[] o = new boolean[10];
        String[] p = new String[10];

        // массив объектов
        Student[] students = new Student[2];
        students[0] = new Student("Bob", "Morley");
        students[1] = new Student("Lady", "Gaga");

        Student[] fastStudents = {new Student("Bob", "Morley"), new Student("Lady", "Gaga")};

        for (Student element : students)
            System.out.println(element.toString());
        System.out.println();
//        for (int i)
//            System.out.println();
    }
}

class Student {
    private String name, surname;

    public Student(String name, String surname) {
        if (name != null && surname != null) {
            this.name = name;
            this.surname = surname;
        } else {
            this.name = "default name";
            this.surname = "default surname";
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student name=" + name + ", surname=" + surname;
    }
}