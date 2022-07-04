package org.example;

public class Main {
    public static void main(String[] args) {

        final double PI = 3.14159;
        //once variable is declared final, it can't be changed later in the program
        //common practice is to name the final variable in capital letters

        //this will not compile
        PI = 4;

        System.out.println(PI);
    }
}