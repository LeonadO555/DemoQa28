package main.java.operators;

public class BreakContinueReturnExamples {
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8, 5, 3, 7, 9};

        returnExample(a);
        System.out.println();
        breakExample(a);
        System.out.println();
        continueExample(a);
        System.out.println();
    }

    public static void returnExample(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 3)
                return;
            System.out.print(a[i] + "  ");
        }
        System.out.println("End return operator");
    }

    public static void continueExample(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

            if (a[i] % 2 == 0) {
                System.out.println();
                continue;
            }

            // альтернатива без continue
//            if (a[i] % 2 == 1)
//                System.out.println("Нечётное");
//            else
//                System.out.println();

            System.out.println("Нечётное");
        }

        System.out.println("End of continue operator");
    }

    public static void breakExample(int[] a) {
        // for-loop / for-цикл
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (a[i] == 6) {
                break;
            }

            if (a[i] == 4) {
                break;
            }

        }

        System.out.println();
        System.out.println("End of break operator");
    }
}
