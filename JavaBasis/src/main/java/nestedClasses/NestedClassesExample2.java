package main.java.nestedClasses;

// пример класса, который лежит внутри метода
public class NestedClassesExample2 {

    public void testMethod() {
        class Inner {
            public void innerMethod() {
                System.out.println("hello from inner method inside inner class inside local method");
            }
        }

        Inner in = new Inner();
        in.innerMethod();
    }

    public static void main(String[] args) {
        NestedClassesExample2 example2 = new NestedClassesExample2();
        example2.testMethod();


    }
}