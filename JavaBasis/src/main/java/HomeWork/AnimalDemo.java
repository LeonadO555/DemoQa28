package main.java.HomeWork;



public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        cat1.age = 2;
        cat1.name = "Murzik";
        cat1.color =  "grey";
        cat1.isHungry = false;


        System.out.println(cat1);
        System.out.println(cat1.age);
        System.out.println(cat1.isHungry);
        System.out.println(cat1.name);
        System.out.println(cat1.color);

        System.out.println("_____________________");

        Cat cat2 = new Cat(3, "Barsik", "red" , true);
        System.out.println(cat2);
        System.out.println(cat2.age);
        System.out.println(cat2.isHungry);
        System.out.println(cat2.name);
        System.out.println(cat2.color);

        System.out.println("_____________________");

        Cat cat3 = new Cat(2, "Dexter", "black" , true);


        Dog dog1 = new Dog("Tuzik");
        Dog dog2 = new Dog("Lessy", "Kolly");

        System.out.println(dog1.breed);
    }
}
