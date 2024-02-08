package com.personalsoft.estudio.ejercicios;

import java.util.stream.IntStream;

public class PrimeNumber {

    private static boolean isPrime(Integer number) {
        if (number<1) return false;
        return IntStream.rangeClosed(2,number/2).noneMatch(value -> number % value == 0);
    }

    private static void printPrimesTo100(){
        IntStream.rangeClosed(2,100).filter(PrimeNumber::isPrime).forEach(prime -> System.out.print(prime + ", "));
    }

    public static void main(String[] args){
        System.out.println(isPrime(613) ? "Es primo" : "No es primo");
        printPrimesTo100();
    }
}
