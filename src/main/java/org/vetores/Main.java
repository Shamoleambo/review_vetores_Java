package org.vetores;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Maria");
        names.add("Bob");
        names.add("Alex");
        names.add("Ana");

        String name = names.stream().filter(n -> n.charAt(0) == 'A').toList().getFirst();

        System.out.println(name);
    }
}
