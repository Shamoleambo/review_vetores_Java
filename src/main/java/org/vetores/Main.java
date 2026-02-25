package org.vetores;

import org.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Provide the size of the vector: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Provide the name of product %d: %n", i + 1);
            String name = sc.next();
            System.out.printf("Provide the price of product %d: %n", i + 1);
            double price = sc.nextDouble();

            Product product = new Product(name, price);
            products[i] = product;
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += products[i].getPrice();
        }

        double priceAverage = sum / n;
        System.out.printf("The average price of the products is: $%.2f%n", priceAverage);

        sc.close();
    }
}
