package javaProLesson13_15Sep23.task2;

public class Cat {
    private int age;
    private String color;
    private double weight;

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public Cat(int age, String color, double weight) {
        this.age = age;
        this.color = color;
        this.weight = weight;
    }
}
