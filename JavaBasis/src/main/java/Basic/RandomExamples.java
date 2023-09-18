package main.java.Basic;

import java.util.Random;

public class RandomExamples {
    public static void main(String[] args) {

        // [1;4] -1,2,3
        // [0;5] -1,2,3,4
        // 1 sposob
//        Random random = new Random(10L);
//     //   random.setSeed(10L);
//        double rD = random.nextDouble();// [0;1)
//       System.out.println(rD);
//       // int random
//      int rI2 = random.nextInt(10);// [0..10)
//       int rI1= random.nextInt(1,5); //[1..5)
//        System.out.println(rI2);
//        System.out.println(rI1);
//        System.out.println(random.nextInt(7,10));
        //2 sposob Math.random
        double m = Math.random(); //[0,1)
        double q =  Math.random() * 10;// [0,10)
        int w = (int) Math.random() * 8 + 2;// [2;10)
        System.out.println(m);
        System.out.println((int) q);
        System.out.println((int) w);
    }
    //  public Random
}
