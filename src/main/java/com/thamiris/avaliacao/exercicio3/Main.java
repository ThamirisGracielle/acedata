package com.thamiris.avaliacao.exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = 0;
        while (true) {
            System.out.print("Digite o valor de N: ");
            if (teclado.hasNextInt()) {
                n = teclado.nextInt();
                if (n > 0) break;
                else System.out.println("Erro: N deve ser maior que zero!");
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                teclado.next();
            }
        }

        Fibonacci fibonacci = new Fibonacci(n);

        System.out.println("Os " + n + " primeiros números da sequência de Fibonacci:");
        System.out.println(fibonacci.getSequencia());

        if (fibonacci.contem(n)) {
            System.out.println(n + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.println(n + " NÃO faz parte da sequência de Fibonacci.");
        }

        teclado.close();
    }
}
