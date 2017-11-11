package com.example.cs3102;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<Integer> ints = new ArrayList<>();
        while (ints.size() < 45) {
            int rnd = (int) ((Math.random() * 100) % 45) + 1;
            if (!ints.contains(rnd)) {
                ints.add(rnd);
            }
        }

        for (int i = 1; i < 46; i++) {
            if (!ints.contains(i)) {
                System.out.println(i + " is not present!");
            }
        }
        if (ints.contains(46)) {
            System.out.println("46 should not be present!");
        }
        if (ints.contains(0)) {
            System.out.println("0 should not be present!");
        }


        System.out.println(ints);
    }
}
