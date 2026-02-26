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

        names.add(2, "Marco");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println(names.size());

        System.out.println();
        names.remove("Ana");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
        names.remove(1);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
