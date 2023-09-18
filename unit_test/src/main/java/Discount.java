package main.java;

public class Discount {
    public int discountCalc(int i,int after18){
        int result =0;
        if (i%2 ==0 )
        {
            result = result + 2;}
            if (after18 > 0) result = result + 2;

        return result;
    }
}
