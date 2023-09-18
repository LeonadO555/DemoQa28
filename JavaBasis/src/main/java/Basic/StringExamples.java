package main.java.Basic;

public class StringExamples {
    public static void main(String[] args) {
        // 1. литерал -> пулл констант String (String pool)
        String a = "hello";
        String b = "hello";

        // .equals() - сравнивает значения внутри String объектов
        System.out.println("1.equals = " + a.equals(b));

        // == - сравнение по ссылке для ссылочных типов
        System.out.println("1.== = " + (a == b));

        // 2. new -> хранение переменных со своим адресом в куче (heap)
        String c = new String("java");
        String d = new String("java");

        // .equals() - сравнивает значения внутри String объектов
        System.out.println("2.equals = " + c.equals(d));

        // == - сравнение по ссылке для ссылочных типов
        System.out.println("2.== = " + (c == d));

        // длина строки
        System.out.println(a.length());

        // посимвольная работа со строкой
        System.out.println(a.charAt(4));

        // срез строки
        System.out.println(a.substring(1));
        System.out.println(a.substring(1,3));

    }
}
