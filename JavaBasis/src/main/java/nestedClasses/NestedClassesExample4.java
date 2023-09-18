package main.java.nestedClasses;

public class NestedClassesExample4 {
    public static void main(String[] args) {
Pepperoni pizza=new Pepperoni();
pizza.cooking();
pizza.serving();

    }

}
class Pepperoni implements PepperoniInterface {
    @Override
    public void serving() {
        System.out.println("serving process");
    }

    @Override
    public void cooking() {
        System.out.println("cooking process");

    }
}
interface PepperoniInterface{
abstract void cooking();
void serving();

}