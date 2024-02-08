package com.personalsoft.estudio.ejercicios;

import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.entry;

public class HackerLanguage {

    private static String transformString(String text) {

        return text.toUpperCase().chars()
                .mapToObj(c -> (char) c)
                .map(c -> constMap().getOrDefault(c.toString(), c.toString()))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(transformString("Hola mundo 2024!"));
    }

    private static Map<String, String> constMap() {

        return Map.ofEntries(
                entry("A", "4"),
                entry("B", "I3"),
                entry("C", "["),
                entry("D", ")"),
                entry("E", "3"),
                entry("F", "|="),
                entry("G", "&"),
                entry("H", "#"),
                entry("I", "1"),
                entry("J", ",_|"),
                entry("K", ">|"),
                entry("L", "1"),
                entry("M", "/\\/\\"),
                entry("N", "^/"),
                entry("O", "0"),
                entry("P", "|*"),
                entry("Q", "(_,)"),
                entry("R", "I2"),
                entry("S", "5"),
                entry("T", "7"),
                entry("U", "(_)"),
                entry("V", "\\/"),
                entry("W", "\\/\\/"),
                entry("X", "><"),
                entry("Y", "j"),
                entry("Z", "2"),
                entry("1", "L"),
                entry("2", "R"),
                entry("3", "E"),
                entry("4", "A"),
                entry("5", "S"),
                entry("6", "b"),
                entry("7", "T"),
                entry("8", "B"),
                entry("9", "g"),
                entry("0", "o"));
    }
}
