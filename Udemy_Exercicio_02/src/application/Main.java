package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Thoni", 6000, 1000);

        System.out.println("Name: " + e1.getName() + "\nGross Salary: " + e1.getGrossSalary() + "\nTax: " + e1.getTax());
        System.out.println();
        System.out.println("Employee: " + e1.getName() + ", " + e1.netSalary());

        System.out.println("Which percentage to increase salary? ");
        Scanner in = new Scanner(System.in);

        double per = in.nextDouble();
        e1.increaseSalary(per);
        System.out.println("Updated data: " + e1.getName() + " " + e1.getGrossSalary());

    }
}
