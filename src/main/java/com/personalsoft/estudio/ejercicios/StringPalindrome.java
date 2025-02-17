package com.personalsoft.estudio.ejercicios;

public class StringPalindrome {

    private static boolean isPalindromeWithFor(String sentence){
        String sentenceMod = sentence.replaceAll("[\\d\\s-]", "").toLowerCase();
        StringBuilder sentenceRev = new StringBuilder();
        for(int i = sentenceMod.length()-1; i >= 0; i--){
            sentenceRev.append(sentenceMod.charAt(i));
        }
        return sentenceRev.toString().equals(sentenceMod);
    }

    private static boolean isPalindromeWithStringBuilder(String sentence){
        String sentenceMod = sentence.replaceAll("[\\d\\s-]", "").toLowerCase();
        StringBuilder sentenceSB = new StringBuilder(sentenceMod);
        String sentenceRev = sentenceSB.reverse().toString();
        return sentenceRev.equals(sentenceMod);
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeWithFor("Amo la paloma-"));
        System.out.println(isPalindromeWithStringBuilder("Amo la paloma-"));
    }
}
