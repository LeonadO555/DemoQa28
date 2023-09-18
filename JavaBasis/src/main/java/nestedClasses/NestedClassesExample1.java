package main.java.nestedClasses;

public class NestedClassesExample1 {

    class Inner {
        public void sayHello() {
            System.out.println("hello from inner class");
        }

        public void getAnotherText() {
            System.out.println("I'm second method in inner class");
        }
    }

    public void test1Method() {
        System.out.println("test1 method");
    }

    public static void test2Method() {
        System.out.println("test2 method");
    }

    public static void main(String[] args) {
        // доступ к статическому методу
        test2Method();

        // доступ к нестатическому методу через создание экземпляра класса
        NestedClassesExample1 example1 = new NestedClassesExample1();
        example1.test1Method();

        // доступ к данным внутри внутреннего класса
        Inner inner = new NestedClassesExample1().new Inner();
        inner.sayHello();
        inner.getAnotherText();

    }
}
