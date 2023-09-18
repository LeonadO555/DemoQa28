package main.java.com.auto.germany;

public class Car {
    // статические переменные
    public static int yearOfBirth = 1920;

    // переменные экземпляра класса
    // поля (fields)
    // instance variables:
    // weight, year, model
    public int weight = 1350;
    public int year = 2020;
    public String model = "audi";

    // локальные переменные
    public void drive() {
        int velocity = 50;
        System.out.println("Driving with velocity " + velocity);
    }
}
