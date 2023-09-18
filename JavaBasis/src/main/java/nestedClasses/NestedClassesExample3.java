package main.java.nestedClasses;

public class NestedClassesExample3 {

    public static void getHelloOutMethod() {
        System.out.println("hello from static method outside inner class");
    }

    static class Inner {
        public static void sayHelloAgain() {
            System.out.println("hello from static class");
            getHelloOutMethod();
        }
    }

    public static void main(String[] args) {
        Inner.sayHelloAgain();
    }
}
