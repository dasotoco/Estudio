package com.personalsoft.estudio.ejercicios;

import java.util.Collections;
import java.util.List;

public class MaxSumTwoNumbersInAList {

    private static String maxSum(List<Integer> listNums){
        int maxSum = Integer.MIN_VALUE;
        int num1 = 0, num2 = 0;
        for(int i = 0; i < listNums.size(); i++){
           for(int j = i + 1; j < listNums.size(); j++){
               int suma = listNums.get(i) + listNums.get(j);
               if(suma > maxSum){
                   maxSum = suma;
                   num1 = listNums.get(i);
                   num2 = listNums.get(j);
               }
           }
        }
        return "maxSum es entre "
                .concat(String.valueOf(num1))
                .concat(" y ")
                .concat(String.valueOf(num2))
                .concat(" igual a ")
                .concat(String.valueOf(maxSum));
    }

    private static String maxSumOpt(List<Integer> listNums){
        List<Integer> orderedList = listNums.stream().sorted(Collections.reverseOrder()).toList();
        int num1 = orderedList.get(0);
        int num2 = orderedList.get(1);
        return "maxSum es entre "
                .concat(String.valueOf(num1))
                .concat(" y ")
                .concat(String.valueOf(num2))
                .concat(" igual a ")
                .concat(String.valueOf(num1+num2));
    }

    private static String maxSumOpt2(List<Integer> listNums){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : listNums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return "maxSum es entre "
                .concat(String.valueOf(max1))
                .concat(" y ")
                .concat(String.valueOf(max2))
                .concat(" igual a ")
                .concat(String.valueOf(max1+max2));
    }



    public static void main(String[] args) {
        System.out.println(maxSum(List.of(3,7,2,9,5,1)));
        System.out.println(maxSumOpt(List.of(3,7,2,9,5,1)));
        System.out.println(maxSumOpt2(List.of(3,7,2,9,5,1)));
    }
}
