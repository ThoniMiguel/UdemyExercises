package bank;

import java.util.Scanner;

public class Bank {
    private int accountNumber;
    private String accountHolder;
    private double initialDeposit, balance;


    public void createAccount(int accountNumber, String accountHolder){
        Scanner in = new Scanner(System.in);
        System.out.print("Is there an initial deposit (y/n)?");
        String ans = in.next();
        if(ans.equals("y")){
            System.out.println("How much do you wish to deposit? ");
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.initialDeposit = in.nextDouble();
            this.balance = this.initialDeposit;
        }
        else {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = 0.00;
        }
    }

    public void deposit(double value){
        this.balance += value;
        System.out.println("Updated account data: \n" + this.toString());
    }


    public void withdraw(double value){
        this.balance = (this.balance - value) - 5;
        System.out.println("Updated account data: \n" + this.toString());
    }

    @Override
    public String toString() {
        return "Account data: \n" + "Account: " + this.accountNumber + ", Holder: " + this.accountHolder + ", Balance: $" + this.balance;
    }
    //getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}
