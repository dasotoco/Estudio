package com.personalsoft.estudio.ejercicios;

import java.util.Arrays;

public class Anagrama {

    private static Boolean isAnigram(String word, String word2) {
        if (word.equalsIgnoreCase(word2)) return false;
        char[] wordSorted = word.toLowerCase().toCharArray();
        char[] word2Sorted = word2.toLowerCase().toCharArray();
        Arrays.sort(wordSorted);
        Arrays.sort(word2Sorted);
        return Arrays.equals(wordSorted, word2Sorted);

    }

    public static void main(String[] args) {
        System.out.println(isAnigram("Roma", "Omar"));
    }

}
