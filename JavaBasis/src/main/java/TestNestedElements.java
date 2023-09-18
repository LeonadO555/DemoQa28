package main.java;

import java.io.FileOutputStream;

public class TestNestedElements {
    public static void main(String[] args) {
        Pasta pasta = new Pasta();

        System.out.println(pasta.souse);
        pasta.printTomatoes();

        System.out.println(pasta.herbs);

        // печать нашей ссылочной переменной в формате class@hashcode
        System.out.println(pasta);

        // hashcode в 10й форме записи
        System.out.println(pasta.hashCode());

        // hashcode в 16й форме записи
        System.out.println(Integer.toHexString(pasta.hashCode()));
    }

    public static void example2() {
        Pizza pizza = new Pizza();
        pizza.cook();
        pizza.eat();
    }

    public static void example1() {
        Shop shop711Seestrasse = new Shop();
        System.out.println(shop711Seestrasse.name);
        System.out.println(shop711Seestrasse.car.isBusy);

        BusinessCar myCar = new BusinessCar();
        System.out.println(myCar.isBusy);
    }
}

class Shop {
    String name = "7/11";
    BusinessCar car = new BusinessCar();
    Pizza pizza = new Pizza();
}

class BusinessCar {
    boolean isBusy = true;
}

class Pizza implements PizzaInterface {

    public void printIt() {
        System.out.println("This is new class for Pizza");
    }

    @Override
    public void cook() {
        System.out.println("Cooking");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}

interface PizzaInterface {
    void cook();
    void prepare();
    void deliver();
    void eat();
}

class Pasta extends FamilyPasta {
    int herbs = 100;

    @Override
    public void printTomatoes() {
        System.out.println("tomatoes = " + 500 + " gramm");
    }
}

class FamilyPasta {
    int souse = 300;

    public void printTomatoes() {
        System.out.println("tomatoes = " + 400 + " gramm");
    }
}