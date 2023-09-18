package main.java.Basic;

public class NumericalSystems {
    public static void main(String[] args) {
        // возведение в степень: Math.pow(10, 2) => 100


        // DECIMAL
        // QWERT = Q*10^4 + W*10^3 + E*10^2 + R*10^1 + T*10^0
        // 43210 <- reversed indexes
        int a = 123;
//        System.out.println(1*Math.pow(10,2) + 2*Math.pow(10,1) + 3*Math.pow(10,0));

        int b = 1024;
//        System.out.println(1*Math.pow(10,3) + 0*Math.pow(10,2) + 2*Math.pow(10,1) + 4*Math.pow(10,0));

        // OCTAL
        int c = 219;
        int c8 = 0333;
//        System.out.println(c8);

        // 10 -> 8
//        System.out.println(219 / 8);    // 27
//        System.out.println(219 % 8);        // 3
//
//        System.out.println(27 / 8);     // 3
//        System.out.println(27 % 8);         // 3
//
//        System.out.println(3 / 8);      //0
//        System.out.println(3 % 8);          // 3

        int d = 100;
        int d8 = 0144;
//        System.out.println(d8);
//        System.out.println(1*Math.pow(8,2) + 4*Math.pow(8,1) + 4*Math.pow(8,0));
//        System.out.println(100 / 8);    // 12
//        System.out.println(100 % 8);        // 4
//
//        System.out.println(12 / 8);     // 1
//        System.out.println(12 % 8);         // 4
//
//        System.out.println(1 / 8);      // 0
//        System.out.println(1 % 8);          // 1

        // BINARY
        int e = 45;
        int e2 = 0b101101;
        // создать копию строки: CMD(Ctrl) + d
        // запуск последнего удачного старта: Ctrl + r / Shift + F10

//        System.out.println(45 / 2);     // 22
//        System.out.println(45 % 2);         // 1
//
//        System.out.println(22 / 2);     // 11
//        System.out.println(22 % 2);         // 0
//
//        System.out.println(11 / 2);     // 5
//        System.out.println(11 % 2);         // 1
//
//        System.out.println(5 / 2);     // 2
//        System.out.println(5 % 2);         // 1
//
//        System.out.println(2 / 2);     // 1
//        System.out.println(2 % 2);         // 0
//
//        System.out.println(1 / 2);     // 0
//        System.out.println(1 % 2);         // 1

//        System.out.println(e2);
        // 101101
        // 00000000 00000000 00000000 00101101 <- int value (32 bit)
//        System.out.println(1*Math.pow(2,5) + 1*Math.pow(2,3) + 1*Math.pow(2,2) + 1*Math.pow(2,0));


        // HEX
        int r = 45;
        int r16 = 0x2d;

//        System.out.println(45 / 16);    // 2
//        System.out.println(45 % 16);        // 13 -> d
//
//        System.out.println(2 / 16);     // 0
//        System.out.println(2 % 16);         // 2

//        System.out.println(r16);
//        // 2d -> 2 13
//        System.out.println(2*Math.pow(16,1) + 13*Math.pow(16,0));

        System.out.println(Integer.toBinaryString(r));
        System.out.println(Integer.toOctalString(r));
        System.out.println(Integer.toHexString(r));
    }
}
