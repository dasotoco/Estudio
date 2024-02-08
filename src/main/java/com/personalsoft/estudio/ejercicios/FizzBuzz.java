package com.personalsoft.estudio.ejercicios;

import java.util.stream.IntStream;

public class FizzBuzz {

    private static void FizzBuzz(){
        IntStream.rangeClosed(1,100).mapToObj(number ->
                number % 3 == 0 ? number % 5 == 0 ? "FizzBuzz" : "Fizz" : number % 5 == 0 ? "Buzz" : number)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        FizzBuzz();
    }

}
