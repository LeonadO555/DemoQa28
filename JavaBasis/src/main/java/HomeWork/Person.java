package main.java.HomeWork;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void hello(){
        System.out.println("Hello! My name is " + name);
    }
}