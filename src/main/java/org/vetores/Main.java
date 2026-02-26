package org.vetores;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Maria");
        names.add("Alex");
        names.add("Bob");
        names.add("Ana");

        names.add(1, "Marco");

        names.removeIf(name -> name.charAt(0) == 'M');


        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
        System.out.println("Index of Bob: " + names.indexOf("Bob"));

        System.out.println();

        List<String> namesWithA = names.stream().filter(name -> name.charAt(0) == 'A').toList();

        for (String name : namesWithA) {
            System.out.println(name);
        }
    }
}
