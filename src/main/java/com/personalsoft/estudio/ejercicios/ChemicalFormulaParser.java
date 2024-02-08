package com.personalsoft.estudio.ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChemicalFormulaParser {

    public static Map<String, Integer> countAtoms(String formula) throws IllegalArgumentException {
        Map<String, Integer> atomCounts = new HashMap<>();
        parseGroup(formula, 1, atomCounts);
        return atomCounts;
    }

    private static void parseGroup(String group, int multiplier, Map<String, Integer> atomCounts) throws IllegalArgumentException {

        Pattern pattern = Pattern.compile("([A-Z][a-z]?)(\\d?)|\\(([^)]+)\\)(\\d?)|\\[([^]]+)](\\d?)");
        Matcher matcher = pattern.matcher(group);
        if(!matcher.find()) throw new IllegalArgumentException();
        matcher.reset();
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                // Simple element with optional count
                String element = matcher.group(1);
                int count = matcher.group(2).isEmpty() ? 1 : Integer.parseInt(matcher.group(2));
                atomCounts.put(element, atomCounts.getOrDefault(element, 0) + count * multiplier);
            } else if (matcher.group(3) != null) {
                // Parenthesis group with optional count
                String subgroup = matcher.group(3);
                int subMultiplier = matcher.group(4).isEmpty() ? 1 : Integer.parseInt(matcher.group(4));
                parseGroup(subgroup, multiplier * subMultiplier, atomCounts);
            } else if (matcher.group(5) != null) {
                // Square bracket group with optional count
                String subgroup = matcher.group(5);
                int subMultiplier = matcher.group(6).isEmpty() ? 1 : Integer.parseInt(matcher.group(6));
                parseGroup(subgroup, multiplier * subMultiplier, atomCounts);
            }
        }

    }

    public static void main(String[] args) {
        Map<String, Integer> result1 = countAtoms("H2O");
        System.out.println(result1);

        Map<String, Integer> result2 = countAtoms("Mg(OH)2");
        System.out.println(result2);

        Map<String, Integer> result3 = countAtoms("K4[ON(SO3)2]2");
        System.out.println(result3);
    }
}
