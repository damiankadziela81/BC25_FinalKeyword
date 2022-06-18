package org.example;

public class Main {
    public static void main(String[] args) {

        final double PI = 3.14159;

        //this will not compile
        PI = 4;

        System.out.println(PI);
    }
}