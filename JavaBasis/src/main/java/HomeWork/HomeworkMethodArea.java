package main.java.HomeWork;

import java.util.Scanner;

public class HomeworkMethodArea {
    public static void main(String[] args) {

        double diameter;

        Scanner sc = new Scanner(System.in);                          // method 1
        System.out.print("Enter please pizza diameter  : ");
        diameter = sc.nextInt();
        System.out.println("Your pizza diameter is :" + diameter);
        double area = (Math.PI * Math.pow(diameter, 2) / 4);
        System.out.println(" Pizza area is :" + area);
        sc.close();
        System.out.println("Label1- method 1");


//        //1 уровень сложности: Разработайте метод, который бы считал площадь пиццы в зависимости от её диаметра
//        // (формулу для расчёта площади круга можно найти в интернете).
//        //Выберите подходящий тип метода (void или с возвращаемым значением), который позволит вам реализовать вывод на экран площадь этой пиццы
//        //S = π × r2
//       // methodArea methodArea = new methodArea(r);
//
//        //   System.out.println("Radius is = " + Math.pow(Math.E, (5.14) * p));
////
////    }
////
////
////    }
//////
//////
//        // public class methodAreaOne {
//////        //S = π × r2
//        public double result1, result2, result3, result4;
////
// public methodAreaOne( double input){
//            neg(input);
//            pow();
//            sum();
//            div();
////
//        }
////
////        private void neg(double p) {
////            result1 = p * (10);
////        }
////
////        private void pow() {
////            result2 = Math.pow(Math.E, result1);
////        }
////
////        private void sum() {
////            result3 = 1 + result2;
////        }
////
////        private void div() {
////            result4 = 1 / result3;
////        }

    }
}