package org.vetores;

public class Main {

    public static void main(String[] args) {

        int[] x = new int[3];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;

        String[] names = new String[]{"Maria", "Bod", "Alex"};

        for (int num : x) {
            System.out.println(num);
        }

        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
