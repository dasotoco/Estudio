package com.personalsoft.estudio.ejercicios;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class BalancedExpression {

    private static boolean isBalanced(String expression) {
        Map<Character,Character> symbols = Map.of('{','}', '[', ']', '(', ')');
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : expression.toCharArray()) {
            boolean containsKey = symbols.containsKey(c);
            if (containsKey || symbols.containsValue(c)) {
                if (containsKey) stack.push(c);
                else if (stack.isEmpty() || c != symbols.get(stack.pop())) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{ [ a * ( c + d ) ] - 5 }") ? "Balanceada" : "No Balanceada");
        System.out.println(isBalanced("{ a * ( c + d ) ] - 5 }") ? "Balanceada" : "No Balanceada");
        System.out.println(isBalanced("{a + b [c] * (2x2)}}}}") ? "Balanceada" : "No Balanceada");
        System.out.println(isBalanced("( x + y )") ? "Balanceada" : "No Balanceada");
    }
}
