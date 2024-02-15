package com.personalsoft.estudio.ejercicios;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DecimalToBinary {
    private static String decimalToBinary(Integer decimal) {
        return IntStream.iterate(decimal, n -> n / 2)
                .limit(Integer.SIZE)
                .boxed()
                .takeWhile(n -> n > 0)
                .map(i -> i % 2)
                .sorted((a,b) -> -1)
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(578));
    }
}
