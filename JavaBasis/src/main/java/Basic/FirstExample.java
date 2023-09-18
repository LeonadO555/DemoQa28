package main.java.Basic;

public class FirstExample {
    public static void main(String[] args) {
        // GERMAN CARS
        // 1, weight=1350, year=2020, model="audi"
        com.auto.germany.Car a = new com.auto.germany.Car();

        System.out.println(a.weight);
        System.out.println(a.year);
        System.out.println(a.model);

        System.out.println();

        // 2, weight=1350, year=2020 -> 2023, model="audi"
        com.auto.germany.Car aNew = new com.auto.germany.Car();
        aNew.year = 2023;

        System.out.println(aNew.weight);
        System.out.println(aNew.year);
        System.out.println(aNew.model);

        System.out.println();

        // FINLAND CARS
        com.auto.finland.Car finCar1 =
                new com.auto.finland.Car(1200, 2003, "lancer");

        System.out.println();

        com.auto.finland.Car finCar2
                = new com.auto.finland.Car(1100, 2010); // CMD + p

        System.out.println();

        com.auto.finland.Car finCar3 =
                new com.auto.finland.Car(1250);

        System.out.println();

        com.auto.finland.Car finCar4 =
                new com.auto.finland.Car();
    }
}
