package main.java.loops;

public class ComparingExample3 {
    public static void main(String[] args) {
        // печать диапазона (включая пределы) элементов внутри массива
        // indexes    0 1 2 3 4 5 6
        int[] arr = {12,9,7,5,3,1,2};
        int startIdx = 2;
        int finishIdx = 5;   // => 7 5 3 1

        // for loop
        System.out.print("For-loop: ");
        for (int i = startIdx; i <= finishIdx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // while
        System.out.print("While loop: ");
        int i = startIdx;
        while (i <= finishIdx) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

        // do-while
        System.out.print("Do-While loop: ");
        int y = startIdx;
        if (y <= finishIdx) {
            do {
                System.out.print(arr[y] + " ");
                y++;
            } while (y <= finishIdx);
        }
        System.out.println();
    }
}
