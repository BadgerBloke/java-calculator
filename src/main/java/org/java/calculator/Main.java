package org.java.calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!"+add(5, 10));
    }

    public static T add<T>(T a, T b) {
        return a + b;
    }
}