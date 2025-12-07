package com.thamiris.avaliacao.exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int quantidade = 0;
        while (true) {
            System.out.print("Digite a quantidade de números: ");
            if (teclado.hasNextInt()) {
                quantidade = teclado.nextInt();
                if (quantidade > 0) break;
                else System.out.println("Erro: a quantidade deve ser maior que zero!");
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                teclado.next();
            }
        }

        Sequencia sequencia = new Sequencia(quantidade);

        int i = 0;
        while (i < quantidade) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            if (teclado.hasNextInt()) {
                int numero = teclado.nextInt();
                try {
                    sequencia.adicionarNumero(numero);
                    i++;
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage() + " Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                teclado.next();
            }
        }

        System.out.println("Sequência digitada: " + sequencia.getSequencia());
        System.out.println("Menor número: " + sequencia.getMenor());
        System.out.println("Maior número: " + sequencia.getMaior());

        teclado.close();
    }
}
