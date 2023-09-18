package main.java.Basic;

import java.util.Arrays;

public class ReferenceVarExample {
    public static void main(String[] args) {
        // index   0 1 2 3  4
        int[] a = {3,8,5,11,16};
        int[] b = a.clone();

        System.out.println("array a = " + Arrays.toString(a));
        System.out.println("array b = " + Arrays.toString(b));

        b[2] = 1000;

        System.out.println("array a = " + Arrays.toString(a));
        System.out.println("array b = " + Arrays.toString(b));

//        int q = 10;
//        int w = q;
//
//        System.out.println("q = " + q);
//        System.out.println("w = " + w);
//
//        w = 1000;
//
//        System.out.println("q = " + q);
//        System.out.println("w = " + w);

    }
}
