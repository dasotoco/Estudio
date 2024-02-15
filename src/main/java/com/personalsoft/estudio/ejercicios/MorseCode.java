package com.personalsoft.estudio.ejercicios;

import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.entry;

public class MorseCode {

    private static String transformString(String text) {

        return text.toUpperCase().chars()
                .mapToObj(c -> (char) c)
                .map(c -> constMap().getOrDefault(c.toString(), c.toString()) + " ")
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(transformString("Hola mundo 2024"));
    }
    private static Map<String, String> constMap() {

        return Map.ofEntries(
                entry("A", ". _"),
                entry("B", "_ . . ."),
                entry("C", "_ . _ ."),
                entry("D", "_ . ."),
                entry("E", ". "),
                entry("F", "_ . . ."),
                entry("G", "_ _ ."),
                entry("H", ". . . ."),
                entry("I", ". ."),
                entry("J", ". _ _ _"),
                entry("K", "_ . _"),
                entry("L", ". _ . ."),
                entry("M", "_ _"),
                entry("N", "_ ."),
                entry("Ñ", "_ _ . _ _"),
                entry("O", "_ _ _"),
                entry("P", ". _ _ ."),
                entry("Q", "_ _ . _"),
                entry("R", ". _ ."),
                entry("S", ". . ."),
                entry("T", "_"),
                entry("U", ". . _"),
                entry("V", ". . . _"),
                entry("W", ". _ _"),
                entry("X", "_ . . _"),
                entry("Y", "_ . _ _"),
                entry("Z", "_ _ . ."),
                entry("1", ". _ _ _ _"),
                entry("2", ". . _ _ _"),
                entry("3", ". . . _ _"),
                entry("4", ". . . . _"),
                entry("5", ". . . . ."),
                entry("6", "_ . . . ."),
                entry("7", "_ _ . . ."),
                entry("8", "_ _ _ . ."),
                entry("9", "_ _ _ _ ."),
                entry("0", "_ _ _ _ _"),
                entry(".", ". _ . _ . _"),
                entry(",", "_ _ . . _ _"),
                entry("?", ". . _ _ . ."),
                entry("\"", ". _ . . _ ."));
    }
}
