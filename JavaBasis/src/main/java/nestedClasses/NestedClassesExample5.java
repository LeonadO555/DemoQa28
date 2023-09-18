package main.java.nestedClasses;

public class NestedClassesExample5 {
    public static void main(String[] args) {


        PepperoniInterface1 pizza= new PepperoniInterface1(){
            @Override
            public void cooking() {
                System.out.println("cooking process via Anon object ");
            }

            @Override
            public void serving() {
                System.out.println("service process via Anon object");
            }
        };
        pizza.cooking();
        pizza.serving();
    }
}
interface PepperoniInterface1 {


        abstract void cooking();
        void serving();

}