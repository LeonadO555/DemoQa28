package main.java.com.auto.finland;

public class Car {
    int weight;
    int year;
    String model;

    public Car(int weight, int year, String model) {
        this.weight = weight;
        this.year = year;
        this.model = model;

        System.out.println(weight);
        System.out.println(year);
        System.out.println(model);
    }

    public Car(int weight, int year) {
        this.weight = weight;
        this.year = year;
        model = "bmw";

        System.out.println(weight);
        System.out.println(year);
        System.out.println(model);
    }

    public Car(int weight) {
        this.weight = weight;
        year = 2008;
        model = "audi";

        System.out.println(weight);
        System.out.println(year);
        System.out.println(model);
    }

    public Car() {
        weight = 1430;
        year = 2022;
        model = "fiat";

        System.out.println(weight);
        System.out.println(year);
        System.out.println(model);
    }

}
