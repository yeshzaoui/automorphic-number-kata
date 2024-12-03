package com.codecrafters;

public class AutomorphicNumber {

    public String process(int number) {
        int square = number * number;
        return (square + "").endsWith(number + "") ? "Automorphic" : "Not!!";
    }
}
