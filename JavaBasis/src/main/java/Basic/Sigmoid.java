package main.java.Basic;

public class Sigmoid {
    public static void main(String[] args) {
        //sigmoid = 1 / (1 + e^(-x))

        double x = 5;

        // developer side
        SigmoidOne sigmoidOne = new SigmoidOne(x);
        SigmoidTwo sigmoidTwo = new SigmoidTwo(x);
     //  sigmoidOne.printResult();
        // test side

        System.out.println("Test result = " + (1.0 / (1.0 + Math.pow(Math.E, (-1) * x))));

    }
}
