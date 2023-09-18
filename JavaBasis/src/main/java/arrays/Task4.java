package main.java.arrays;

public class Task4 {
    public static void main(String[] args) {
        // Найти максимальный по значению элемент

        int[] a = {1, 17, 90, 54, 23, 36, 8};
        double[] b = {2.2, 5.8, 4.3, 3.1, 5.80001, 3.5};

        System.out.println(getMax(a));
        System.out.println(getMax(b));
        System.out.println(getMin(a));
        System.out.println(getMin(b));

    }

    public static int getMax(int[] arr) {

        // можно использовать в качестве tmp переменной значение из самого массива
        //int tmp = arr[0];

        // можно использовать в качестве tmp переменной минимально значение диапазон
        int tmp = Integer.MIN_VALUE; // MIN_VALUE (int) = -2147483648

        // либо classic for-loop, либо for-each loop
        // classic for-loop
//        for (int i = 0; i < arr.length; i++)
//            if (arr[i] > tmp)
//                tmp = arr[i];

        // for-each loop
        for (int element : arr)
            if (element > tmp)
                tmp = element;

        return tmp;
    }

    public static double getMax(double[] arr) {

        // можно использовать в качестве tmp переменной значение из самого массива
//        double tmp = arr[0];

        // можно использовать в качестве tmp переменной минимально значение диапазон
        double tmp = Double.MIN_VALUE; // MIN_VALUE (double) = -4.9E-324

        // либо classic for-loop, либо for-each loop
        // classic for-loop
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > tmp)
                tmp = arr[i];

        // for-each loop
//        for (double element : arr)
//            if (element > tmp)
//                tmp = element;

        return tmp;
    }

    public static double getMin(double[] arr) {

        // можно использовать в качестве tmp переменной значение из самого массива
        double tmp = arr[0];

        // либо classic for-loop, либо for-each loop
        // classic for-loop
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < tmp)
                tmp = arr[i];

        return tmp;
    }

    public static int getMin(int[] arr) {

        // можно использовать в качестве tmp переменной значение из самого массива
        int tmp = arr[0];

        // либо classic for-loop, либо for-each loop
        // classic for-loop
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < tmp)
                tmp = arr[i];

        return tmp;
    }


}
