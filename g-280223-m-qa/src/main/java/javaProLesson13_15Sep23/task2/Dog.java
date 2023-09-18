package javaProLesson13_15Sep23.task2;

public class Dog {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    private String color;

    public Dog(int age, String color, double weight) {
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    private double weight;
}
