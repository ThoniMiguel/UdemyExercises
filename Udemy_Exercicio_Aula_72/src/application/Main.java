package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dollarPrice, dollars, reais;
        Scanner in = new Scanner(System.in);
        System.out.print("What is the dollar price? $");
        dollarPrice = in.nextDouble();
        System.out.print("How many dollars will be bought? $");
        dollars = in.nextDouble();
        System.out.print("Amount to be paid in reais: R$");
        reais = CurrencyConverter.converter(dollarPrice, dollars);
        String strReais = String.format("%.2f", reais);
        System.out.println(strReais);
    }

}
