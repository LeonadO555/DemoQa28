package main.java.operators;

public class LogicOperators {
    public static void main(String[] args) {
        int a =2, b=4, c=6, d=8, e=4;
        boolean r1=(a<b)&& (b<c)&& (c<d)&& !(d<e);
        System.out.println(r1);
        //                                          true
        //                        true          true   false
  //                         false      true      !       !
     //               false    true             false   true
        boolean r2=(a*10<b)&& (a<e)||(d/2<=e)&&(b>c)||!(d>e);
    }
    public void examples1(){
        double a1 = 3.1, a2 = 5.2, a3 = 4.16, a4 = 3.1;
        // логическое И (AND, &&)
        //                                        false
        //                                  true        false
        System.out.println("AND, && " + ((a1 < a2) && (a3 < a4)) );

        //                                        true
        //                                   true         true
        System.out.println("AND, && " + ((a1 < a2) && (a3 > a4)) );

        // логическое ИЛИ (OR, ||)
        //                                       true
        //                                 true        false
        System.out.println("OR, || " +  ((a1 < a2) || (a3 < a4)) );
        //                                       false
        //                                  false       false
        System.out.println("OR, || " +  ((a2 < a1) || (a4 > a3)) );
        // логическое НЕ (NOT, !)
        //                                          true
        //                                           !
        //                                         false
        //                                   true        false
        System.out.println("NOT, ! " + !((a1 < a2) && (a3 < a4)) );
        //                                         false
        //                                           !
        //                                         true
        //                                   true         false
        System.out.println("OR, || " +  !((a1 < a2) || (a3 < a4)) );
    }
}
