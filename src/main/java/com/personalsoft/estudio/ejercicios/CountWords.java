package com.personalsoft.estudio.ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {

    private static Map<String, Integer> countWords(String text) {
        Map<String, Integer> result = new HashMap<>();
        Pattern pattern = Pattern.compile("([a-z0-9]+)");
        Matcher matcher = pattern.matcher(text.toLowerCase());
        while (matcher.find()) {
            if (!Objects.isNull(matcher.group(1))) {
                String word = matcher.group(1);
                result.put(word, result.getOrDefault(word, 0) + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Hola, mi nombre es brais. Mi nombre completo es Brais Moure (MoureDev)."));
    }
}
