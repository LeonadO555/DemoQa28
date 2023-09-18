package main.java.Basic;

public class SigmoidOne {
    // sigmoid = 1 / (1 + e^(-x))

    private double result1, result2, result3, result4;

    public SigmoidOne(double input) {
        neg(input);
        pow();
        sum();
        div();
        printResult();
    }

    private void neg(double x) {
        result1 = x * (-1);
    }

    private void pow() {
        result2 = Math.pow(Math.E, result1);
    }

    private void sum() {
        result3 = 1 + result2;
    }

    private void div() {
        result4 = 1 / result3;
    }

    public void printResult() {
        System.out.println("Result is = " + result4);
    }

    public double getResult2() {
        return result2;
    }
//getters
    public double getResult3() {
        return result3;
    }

    public double getResult4() {
        return result4;
    }
//setters
    public void setResult1(double result1) {
        this.result1 = result1;
    }

    public void setResult2(double result2) {
        this.result2 = result2;
    }

    public void setResult3(double result3) {
        this.result3 = result3;
    }

    public void setResult4(double result4) {
        this.result4 = result4;
    }

    public double getResult1() {
        return result1;
    }

}