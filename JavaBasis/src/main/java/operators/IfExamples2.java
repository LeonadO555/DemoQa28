package main.java.operators;

public class IfExamples2 {
    public static void main(String[] args) {
        int dayOfWeek =5;

        System.out.print("Classic If:");
        String resultClassic = " ";
        if (dayOfWeek <=5 && dayOfWeek > 0)
            resultClassic= "Working day";
        else if (dayOfWeek <=7  && dayOfWeek>5)
            resultClassic="Weekend ";
        else
            resultClassic ="Wronggday";
        System.out.println(resultClassic);

        System.out.print("Ternary if ");
     //   String resultTernary =(dayOfWeek<=5) ? "Working day":"Weekend"; ()auch
        String resultTernary =dayOfWeek<=5 && dayOfWeek >0 ? "Working day": dayOfWeek<=7 &&dayOfWeek >5 ? "Weekend":"Wrong day";
        System.out.println(resultTernary);
    }
}
