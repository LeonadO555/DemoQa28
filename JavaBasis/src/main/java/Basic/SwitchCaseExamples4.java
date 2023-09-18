package main.java.Basic;

public class SwitchCaseExamples4 {
    public static void main(String[] args) {
        int dayOfWeek =5;
        String result = switch (dayOfWeek)
                {
                    case  1,2,3,4,5 -> "Working day";
                    case 6,7 -> "Weekend";
                    default -> "wrong day";
                };
    }
}
