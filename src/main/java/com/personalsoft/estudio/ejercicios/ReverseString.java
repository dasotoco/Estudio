package com.personalsoft.estudio.ejercicios;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    private static String reverse(String text) {
        char[] temp = text.toCharArray();
        return IntStream.rangeClosed(1,temp.length)
                .mapToObj(n -> temp[temp.length-n])
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hola Mundo!"));
    }
}
