package main.java.HomeWork;

public class HomeworkSpring {
    public static void main(String[] args) {
//        Задайте строковую переменную с таким
//        значением как "Hello, Java! It's a Java Basic course" (её лучше скопировать).
//        Напишите код (используя уже известные методы),
//        который будет выводить в командную строку следующее:
//        длину этой строки
//        символ '!' (без одинарных кавычек)
//        "It's a Java" (без двойных кавычек)
//        "Java Basic course" (без двойных кавычек)

        String q = "Hello, Java! It's a Java Basic course";
        System.out.println(q);

        String w = "!";
        System.out.println(w);

        String e = "It's a Java";
        System.out.println(e);

        String r = "Java Basic course";
        System.out.println(r);

        // длина строки
        System.out.println("длина строки : "+q.length());

        // посимвольная работа со строкой
        System.out.println("11-символ !>> :" + q.charAt(11)); // символ '!'

        // срез строки
        //  System.out.println(q.substring(11));
        System.out.println("12-24 символы>> :" +q.substring(12,24)); //"It's a Java"
        System.out.println("20-37 символы>> :" +q.substring(20,37)); //"Java Basic course"
    }
}