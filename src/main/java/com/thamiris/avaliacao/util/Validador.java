package com.thamiris.avaliacao.util;

import java.util.Scanner;
import java.util.function.Predicate;

public class Validador {


    public static int lerIntPositivo(Scanner scanner, String mensagem) {
        return lerInt(scanner, mensagem, n -> n > 0, "Erro: valor deve ser maior que zero!");
    }

    public static int lerIntNaoNegativo(Scanner scanner, String mensagem) {
        return lerInt(scanner, mensagem, n -> n >= 0, "Erro: valor não pode ser negativo!");
    }

    public static double lerDoublePositivo(Scanner scanner, String mensagem) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                if (valor > 0) break;
                else System.out.println("Erro: valor deve ser maior que zero!");
            } else {
                System.out.println("Entrada inválida! Digite um número válido.");
                scanner.next();
            }
        }
        return valor;
    }

    private static int lerInt(Scanner scanner, String mensagem, Predicate<Integer> condicao, String erroMsg) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) {
                valor = scanner.nextInt();
                if (condicao.test(valor)) break;
                else System.out.println(erroMsg);
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.next();
            }
        }
        return valor;
    }
}
