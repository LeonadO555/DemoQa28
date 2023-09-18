package main.java.operators;

public class RelativeOperators {
    public static void main(String[] args) {
//        int a;// declaration
//        a=10 ; // allocation
//        int b=10 ; // initialisation
        double a1 =3.1, a2=5.2, a3= 4.16, a4=3.1 ;
        boolean q= a1==a2;
        boolean w= a1!=a2;
        boolean e= a1>a2;
        boolean r= a1>a2;
        boolean t= a1>=a2;
        boolean y=a1>=a2;

        System.out.println("var1==var2 is "+ q);
        System.out.println("var1!=var2 is "+w);//nur !=

        System.out.println("var1>var2 is "+ e);
        System.out.println("var1<var2 is "+ r);

        System.out.println("var1>=var2 is "+ t);
        System.out.println("var1<=var2 is "+ y);

    }
}
