package main.java.loops;

public class ForExample1 {
    public static void main(String[] args) {


//        for (int i = 0, j = 10; i != j; i++, j--) {
//            System.out.println("hello java " + i + " " + j);
//        }


//        for (int i = 0, code = 558; i < 5; i++) {
//            System.out.println("hello java " + (i*2) + " " + code);
//        }

        // indexes  0  1  2  3   4  5   6   7   8
        int[] a = {32, 8, 4, 1, 23, 9, 11, 13, 15};
        double[] aOut = new double[a.length];

        // classic for-loop
        for (int b = 0; b < a.length; b++) {
            if (b == 0 || b == a.length - 1)
                aOut[b] = a[b];
            else {
                aOut[b] = (a[b-1] + a[b] + a[b+1]) / 3.0;
            }
        }
for (int i=0;i< aOut.length; i++ );
    //    System.out.print(customRound(aOut[int i], 5) + " ");
        for (double v : aOut) {
            System.out.print(customRound(v, 5) + " ");
        }

//         for-each loop
        for (int e : a) {
            double q = 3;
            System.out.print(customRound(e / q, 1) + " ");
        }


    }

    // 3.3333333333334 -> 3.33 -> 3.3

    public static double customRound(double d, int value) {
//        int q = 10;
//        double tmp1 = q / 3.0; // 3.3333333333333335
//        int tmp2 = (int) (tmp1 * 100);
//        double tmp3 = tmp2 / 100.0;
//
//        System.out.println(tmp3);

        return ((int) (d * Math.pow(10, value))) / Math.pow(10, value);
    }
}
