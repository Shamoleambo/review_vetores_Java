package org.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Provide the array size");
        int n = sc.nextInt();
        double vect[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Provide the value for position %d: %n", i);
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double average = sum / n;
        System.out.printf("The average of heights is: %.2f%n", average);

        sc.close();
    }
}
