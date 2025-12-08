package com.thamiris.avaliacao.exercicio3;

import com.thamiris.avaliacao.util.Validator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {

            int n = Validator.readPositiveInt(keyboard, "Digite o valor de N: ");

            Fibonacci fibonacci = new Fibonacci(n);

            System.out.println("Os " + n + " primeiros números da sequência de Fibonacci:");
            System.out.println(fibonacci.getSequence());

            if (fibonacci.containsNumber(n)) {
                System.out.println(n + " faz parte da sequência de Fibonacci.");
            } else {
                System.out.println(n + " NÃO faz parte da sequência de Fibonacci.");
            }
        }
    }
}
