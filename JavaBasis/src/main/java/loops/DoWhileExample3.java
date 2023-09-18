package main.java.loops;

public class DoWhileExample3 {
    public static void main(String[] args) {
        // пример работы do-while для печати
        // части элементов внутри массива

        //indexes   0 1 2 3 4 5 6
        int[] a = {14,9,3,1,6,4,2};

        int q = 2;

        do {
            System.out.print(a[q] + " ");
            q++;
        } while (q <= 5);
    }
}

