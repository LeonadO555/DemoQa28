package main.java.Basic;

public class VarCasting {
    public static void main(String[] args) {

        int r = 45;
        double rr = r;
        // 2d -> 2 13 (10/decimal -> 16/hex)
//        System.out.println(r);
//        System.out.println(rr);
//        System.out.println(2*Math.pow(16,1) + 13*Math.pow(16,0));

        // расширение (автоматически) Byte -> Short -> Int -> Long -> Float -> Double
        int a = 10;
        int b = -10;
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));

        // сужение (должно явно обозначено) Double -> Float -> Long -> Int -> Short -> Byte
        double q = 3.99;
        long w = (long) q;

//        System.out.println(q);
//        System.out.println(w);

        long day = 129;
        byte dayByte = (byte) day;
        long day2 = dayByte;

//        System.out.println(day);
//        System.out.println(dayByte);
//        System.out.println(day2);

        // byte [-128; 127]
        byte e = 127;
//        System.out.println(e + 1);

        // Byte -> Short -> Int -> Long -> Float -> Double
        float t = (float) (e + 1.2F + 1.0);


//        System.out.println(e);

        double doubleE = e;
//        System.out.println(doubleE);

        // short = 16bit (2 byte)
        short sh = 30000;
        // 01110101 00110000
        System.out.println(Integer.toBinaryString(sh));

        byte shByte = (byte) sh; // сузилось с 30000 до 48
        // 00110000
        System.out.println(shByte);
        System.out.println(Integer.toBinaryString(shByte));

    }
}
