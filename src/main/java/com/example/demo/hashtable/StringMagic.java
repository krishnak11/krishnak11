package com.example.demo.hashtable;

public class StringMagic {

    /*
    * Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
    *
    *
    * */

    public boolean isUnique(String value) {
        if (null == value || value.length() <= 0) {
            throw new IllegalArgumentException("Don't try.");
        }
        char[] myStrings = new char[value.length()];

        for (int i = 0; i < value.length(); i++) {

            myStrings[i] = value.charAt(i);

        }

        for (int i = 1; i < value.length(); i++) {
            if (myStrings[i - 1] == value.charAt(i))
                return true;
        }

        return false;
    }
}
