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

        for (String name : names) {
            System.out.println(name);
        }
    }
}
