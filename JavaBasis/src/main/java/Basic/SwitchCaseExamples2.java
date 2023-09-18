package main.java.Basic;

public class SwitchCaseExamples2
{
    public static void main(String[] args)
    {
        String dayOfWeek = "MO";

        String result = switch (dayOfWeek)
        {
            case "WE" -> "Wednesday";
            case "MO"  -> "Monday";
            case "TU" -> "Tuesday";
            case "TH" ->"Thursday";
            case "FR" ->"Friday";
            case "SA" ->"Saturday";
            case "SU" ->"Sunday";
            default -> "This day is wrong";
        };
        System.out.println("result : "+result);
    }
}
