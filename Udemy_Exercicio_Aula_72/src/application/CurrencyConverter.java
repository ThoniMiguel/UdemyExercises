package application;

public class CurrencyConverter {
    private static double dollarPrice, dollars, reais;
    private static final double IOF = 0.06;
    private static final String STRDOLLARPRICE = String.format("%.2f", dollarPrice);
    private static final String STRDOLLARS = String.format("%.2f", dollars);
    private static final String STRREAIS = String.format("%.2f", reais);


    public static double converter(double dollarPrice, double dollars){
        double newDollars = (dollarPrice * dollars);
        double converting =  IOF * newDollars;
        reais = converting + newDollars;
        return reais;
    }
}
