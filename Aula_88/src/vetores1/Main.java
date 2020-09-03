package vetores1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("How many people will be stored in the array?");
        int n = in.nextInt();
        double[] heights = new double[n];
        for(int i = 0; i < heights.length; i++){
            System.out.println();
            System.out.println("Height of person #"+ (i + 1));
            double height = in.nextDouble();
            heights[i] = height;
        }
        double sum = 0;
        for(int i = 0; i < heights.length; i++){
            sum += heights[i];
        }
        double avg = sum / heights.length;
        String strAvg = String.format("%.2f", avg);
        System.out.println("Average height: " + strAvg);
    }
}
