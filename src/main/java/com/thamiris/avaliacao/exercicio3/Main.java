package com.thamiris.avaliacao.exercicio3;

import com.thamiris.avaliacao.util.Validador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            int n = Validador.lerIntPositivo(teclado, "Digite o valor de N: ");

            Fibonacci fibonacci = new Fibonacci(n);

            System.out.println("Os " + n + " primeiros números da sequência de Fibonacci:");
            System.out.println(fibonacci.getSequencia());

            if (fibonacci.contem(n)) {
                System.out.println(n + " faz parte da sequência de Fibonacci.");
            } else {
                System.out.println(n + " NÃO faz parte da sequência de Fibonacci.");
            }
        }
    }
}
