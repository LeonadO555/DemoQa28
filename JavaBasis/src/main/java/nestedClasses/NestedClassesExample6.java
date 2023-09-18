package main.java.nestedClasses;

// пример анонимного класса, который реализован на основе класса наследника
public class NestedClassesExample6 {
    public static void main(String[] args) {
        Peppereni2 pizza = new Peppereni2() {
            @Override
            public void cooking() {
                System.out.println("Cooking process #2 via Anon object");
            }
            @Override
            public void serving() {
                System.out.println("Serving process #2 via Anon object");
            }
        };
        pizza.cooking();
        pizza.serving();
    }
}

class Peppereni2 {
    public void cooking() {
        System.out.println("Cooking process #2");
    }
    public void serving() {
        System.out.println("Serving process #2");
    }
}