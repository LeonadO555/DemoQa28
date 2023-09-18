package main.java.Basic;

public class TempConverter {
    public double converterFromCelsiumToFehrengeit(double tempCelsium){
        double tempInFahr = tempCelsium * 1.8 +32;
        return tempInFahr;
    }
    public double converterFromFehrengeitToCelsium(double tempInFahr){
        double tempCelsium = (tempInFahr - 32) * 5 / 9;
        return tempCelsium;
    }


}