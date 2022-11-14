package entities;

public class CurrencyConverter {

    public double dollarPrice = 3.10;
    public int quantity;

    public static double boughtDollar(double dollarPrice, int quantity){
        return dollarPrice * quantity;
    }
}
