package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        double g1, g2, g3;
        Scanner in = new Scanner(System.in);
        System.out.println("What's the student's name?");
        name = in.nextLine();
        System.out.println("Enter student's grades");
        System.out.println("First Trimester: ");
        g1 = in.nextDouble();
        System.out.println("Second Trimester: ");
        g2 = in.nextDouble();
        System.out.println("Third Trimester: ");
        g3 = in.nextDouble();
        Student t1 = new Student(name, g1, g2, g3);

    }
}
