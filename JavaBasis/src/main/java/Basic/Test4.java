package main.java.Basic;

public class Test4 {
    public static void main(String[] args) {

        String str = "";
        System.out.println(Integer.toHexString(str.hashCode()));

        int[] a = {1, 17, 90, 54, 23, 36, 8};

        for (int element : a) {
            str = str + " " + element;

            System.out.println(str + " " + Integer.toHexString(str.hashCode()));
        }



    }

    public static void example1() {
        String a = new String("hello");

        System.out.println(Integer.toHexString(a.hashCode()));

        System.out.println(a);
        System.out.println(a + "!");
        System.out.println(a);

        System.out.println(Integer.toHexString(a.hashCode()));

        a = a + "?";

        System.out.println(Integer.toHexString(a.hashCode()));
    }
}
