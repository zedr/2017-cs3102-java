package com.example.cs3102;

import java.util.Scanner;

public class Indexer {

    public static void main(String args[]) {
        final String str = "This is a sample string";
        final String substr = "sample";

        System.out.println(indexOf(substr, str));
    }

    static int indexOf(String substr, String str) {
        final int strLen = str.length();
        final int subStrLen = substr.length();
        int l = 0;
        int matched = 0;

        if (strLen >= substr.length()) {

            for (int i = 0; i < (strLen - subStrLen); i++) {
                if (str.charAt(i) == substr.charAt(l)) {
                    matched++;
                    l++;
                    if (matched == subStrLen) {
                        return i - matched;
                    }
                } else {
                    l = 0;
                    matched = 0;
                }
            }
        }

        return -1;
    }
}
