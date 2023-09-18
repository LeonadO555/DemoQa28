package main.java.HomeWork;

public class HomeworkBox1 {


    //        Описание задания.
//        1 уровень сложности: Создайте класс Box, в котором будут определены 4 конструктора.
//        Каждый конструктор должен выводить объём этой коробки (не важны единицы измерения,
//        формулу объёма можно вспомнить или найти в интернете) из расчёта её высоты, длины и ширины.
//        Создайте такие конструкторы:
//       1. Принимающий все 3 параметры
//       2. Принимающий 2 параметра, а третий будет определён каким-то стандартным значением
//       3. Принимающий 1 параметр, а второй и третий будут определены какими-то стандартными значениями
//       4.Конструктор без аргументов - все значения будут определены внутри конструктора
//        Не забудьте про вывод объёма в каждом конструкторе
   int length; int high; int width;

    public HomeworkBox1(int length, int high, int width) {
        this.length = length;
        this.high = high;
        this.width = width;

        System.out.print(" lenght :"+length);
        System.out.print(" high :"+high);
        System.out.println(" width :"+width);
        print();
    }

    public HomeworkBox1(int length, int high) {
        this.length = length;
        this.high = high;
        width = 55;
        System.out.print(" lenght :"+length);
        System.out.print(" high :"+high);
        System.out.println(" width :"+width);
        print();
    }

    public HomeworkBox1(int length) {
        this.length = length; high = 25; width = 85;

        System.out.print(" lenght :"+length);
        System.out.print(" high :"+high);
        System.out.println(" width :"+width);
        print();
    }

    public HomeworkBox1() {
        length = 33; high = 23; width = 32;

        print();
    }

    public void print() {
        int volume = length * high * width;
        System.out.println("length=" + length + ", high=" + high + ", width=" + width);
        System.out.println("volume =  " + volume);
    }

    public static void main(String[] args) {
      int length = 11;  int higt = 22; int width = 33;

        HomeworkBox1 homeworkBox13 = new HomeworkBox1(length,higt, width) {  }; System.out.println("box3>>" + homeworkBox13);

        HomeworkBox1 homeworkBox12 = new HomeworkBox1(length,higt) {  }; System.out.println("box2>>" + homeworkBox12);

        HomeworkBox1 homeworkBox11 = new HomeworkBox1(length) {  }; System.out.println("box1>>" + homeworkBox11);

        HomeworkBox1 homeworkBox1 = new HomeworkBox1() {  }; System.out.println("box>>" + homeworkBox1);

    }
}