package vetores2;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Number of products");
        int n = in.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length; i++){
            System.out.println("Product: ");
            String name = in.next();
            System.out.println("Price: ");
            double price = in.nextDouble();
            vect[i] = new Product(name, price);
        }

        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        double sum = 0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("Average Price = %.2f%n", avg);
    }
}
