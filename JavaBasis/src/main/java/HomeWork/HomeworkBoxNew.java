package main.java.HomeWork;

//уровень сложности: Создайте класс BoxNew, в котором будет тот же функционал, как и в Box,
// но только и использованием ключевого слова this для выстраивания соответствия переменных
// экземпляра класса и входных параметров у каждого конструктора.
// Попробуйте выстроить взаимодействие одного конструктора с другим.
// Например, конструктор с 3 параметрами помимо своего функционала чтоб вызывал конструктор с 2 параметрами и т.д
public class HomeworkBoxNew {
     int length; int high; int width;

    public HomeworkBoxNew(int length, int high, int width) {
        this.length = length;
        this.high = high;
        this.width = width;

        print();
    }

    public HomeworkBoxNew(int length, int high) {
        this.length = length;
        this.high = high;
        this.width = 55;

        print();
    }

    public HomeworkBoxNew(int length) {
        this.length = length; high = 25; width = 85;

        print();
    }

    public HomeworkBoxNew() {
        this.length = 3; this.high = 2; this.width = 4;

        print();
    }

    public void print() {
        int volume = length * high * width;
        System.out.println("length=" + length + ", high=" + high + ", width=" + width);
        System.out.println("volume =  length ( "+length +")* high ( " + high + " )  *width ( "+ width+  " ):  " + volume);
    }

    public static void main(String[] args) {
        int length = 11;  int higt = 32; int width = 43;

        HomeworkBoxNew homeworkBox13 = new HomeworkBoxNew(length,higt, width) {
                HomeworkBoxNew homeworkBox22 = new HomeworkBoxNew(length,higt) {
                    HomeworkBoxNew homeworkBox21 = new HomeworkBoxNew(length) {
                        HomeworkBoxNew homeworkBox1 = new HomeworkBoxNew() {

                        };
                    };
            };
        };
        System.out.print("var box3  >> " + homeworkBox13);


        HomeworkBoxNew homeworkBox12 = new HomeworkBoxNew(length,higt) {}; System.out.print("var box2  >> " + homeworkBox12);

        HomeworkBoxNew homeworkBox11 = new HomeworkBoxNew(length) {}; System.out.print("var box1  >> " + homeworkBox11);

        HomeworkBoxNew homeworkBox1 = new HomeworkBoxNew() {}; System.out.println("var box  >> " + homeworkBox1);

    }
}
