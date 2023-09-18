package main.java.HomeWork;

public class HomeworkNumericalSystem
{
    public static void main(String[] args)
    {
        Short q = 12;
        int  q8 = (q / 8)*10 + (q % 8);
      Short w = 978;
        int  w8 = (w/512)*1000 + (w%512)/64*100+ (w%64)/8*10+ (w%64)%8;
        Short e = 1144;
        int  e8 = (e/512)*1000 + (e%512)/64*100+ (e%64)/8*10+ (e%64)%8;
        System.out.print("DECIMAL >> OCTAL");
        String[] array = new String[]{"DECIMAL ",String.valueOf(q)," ; DECIMAL ",String.valueOf(w)," ; DECIMAL ",String.valueOf(e)};
        System.out.println();
   for (byte i = 0; i < array.length; i++)
       System.out.print(array[i]);
        System.out.println();
        System.out.print("OCTAL ");
        System.out.print( q8);
        System.out.print(" ; OCTAL ");
        System.out.print(w8);
        System.out.print(" ; OCTAL ");
        System.out.println(e8);
        System.out.println();
        System.out.println("OCTAL >> DECIMAL");

      System.out.print("OCTAL ");
     System.out.print(q / 8); //  1
     System.out.print(q % 8); // 4
        int q10 =  (q8/1000)*512 + (q8%1000)/100*64+ (q8%100)/10*8+ (q8%100)%10;
        System.out.print(" ; DECIMAL ");
        System.out.println(q10);

        System.out.print("OCTAL ");
        System.out.print(w/512);//1
       // System.out.println(w%512);//466
        System.out.print(w%512/64); //7
        // System.out.println(w%64); //18
      System.out.print((w%64)/8); //2
       System.out.print((w%64)%8); //2
        int w10 =  (w8/1000)*512 + (w8%1000)/100*64+ (w8%100)/10*8+ (w8%100)%10;
        System.out.print(" ; DECIMAL  ");
        System.out.println(w10);

        System.out.print("OCTAL ");
        System.out.print(e/512);//2
        System.out.print(e%512/64); //1
        System.out.print((e%64)/8); //7
        System.out.print((e%64)%8); //0
        int e10 =  (e8/1000)*512 + (e8%1000)/100*64+ (e8%100)/10*8+ (e8%100)%10;
        System.out.print(" ; DECIMAL  ");
        System.out.print(e10);
}
}

