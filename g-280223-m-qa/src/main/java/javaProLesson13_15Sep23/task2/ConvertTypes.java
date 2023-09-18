package javaProLesson13_15Sep23.task2;

import java.util.function.Function;

public class ConvertTypes
{
    public static void main(String[] args) {
        Dog dog= new Dog(3,"Black",8.64);
        Function<Dog,Cat> dogToCat = x-> new Cat(x.getAge(),x.getColor(), x.getWeight()/2);
        System.out.println(" my dog  :  "+dog);
        Cat cat= dogToCat.apply(dog);
        System.out.println("my Cat : "+cat);
    }
}
