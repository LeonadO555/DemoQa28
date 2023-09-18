package main.java.boxTask;

public class CurrencyConverter {
    public double conversationEuroToUsd( double amountEuro, double exchangeRate){

      double amountUsd = amountEuro *exchangeRate;
        return amountUsd;
    }
    public double conversationEuroToEuro (double amountUsd, double exchangeRate) {
        double amountEuro = amountUsd *exchangeRate;
        return amountEuro;
    }
}
