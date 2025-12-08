package com.thamiris.avaliacao.exercicio1;

import java.util.Scanner;

public class Validador {

    public static double lerDoublePositivo(Scanner scanner, String mensagem) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                if (valor > 0) break;
                else System.out.println("Erro: valor deve ser maior que zero.");
            } else {
                System.out.println("Entrada inválida! Digite um número válido.");
                scanner.next();
            }
        }
        return valor;
    }

    public static int lerIntNaoNegativo(Scanner scanner, String mensagem) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) {
                valor = scanner.nextInt();
                if (valor >= 0) break;
                else System.out.println("Erro: valor não pode ser negativo.");
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro válido.");
                scanner.next();
            }
        }
        return valor;
    }
}
