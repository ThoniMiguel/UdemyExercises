package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter rectangle widht and height: ");
        Scanner in = new Scanner(System.in);
        double width = in.nextInt();
        double height = in.nextInt();
        Rectangle r1 = new Rectangle(width,height);
        System.out.println(r1);
    }
}
