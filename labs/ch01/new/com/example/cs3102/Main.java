package com.example.cs3102;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<Integer> ints = new ArrayList<>();
        while (ints.size() < 45) {
            double rnd = ((Math.random() * 100) % 46) + 1;
            if (!ints.contains(rnd)) {
                ints.add((int) rnd);
            }
        }
        System.out.println(ints);
    }
}
