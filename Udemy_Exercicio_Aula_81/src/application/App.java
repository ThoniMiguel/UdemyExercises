package application;

import bank.Bank;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int accountNumber;
        String accountHolder;

        System.out.println("Enter account number: ");
        accountNumber = in.nextInt();
        in.nextLine();
        System.out.println("Enter account holder: ");
        accountHolder = in.nextLine();
        Bank b1 = new Bank();
        b1.createAccount(accountNumber, accountHolder);
        System.out.println(b1);
        System.out.println("How much do you wish to deposit?");
        double depositValue = in.nextDouble();
        b1.deposit(depositValue);
    }
}
