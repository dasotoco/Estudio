package com.personalsoft.estudio.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Fibonacci {

    private static String generateFibonacci() {
        return Stream.iterate(new long[] {0L, 1L},
                        t -> new long[] {t[1], t[0] + t[1]})
                .limit(50)
                .map(n -> n[0])
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args){
        System.out.println(generateFibonacci());
    }
}
