package com.thamiris.avaliacao.exercicio2;

import com.thamiris.avaliacao.util.Validador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            int quantidade = Validador.lerIntPositivo(teclado, "Digite a quantidade de números: ");

            Sequencia sequencia = new Sequencia(quantidade);

            for (int i = 0; i < quantidade; i++) {
                int numero = Validador.lerIntNaoNegativo(teclado, "Digite o número " + (i + 1) + ": ");
                sequencia.adicionarNumero(numero);
            }


            System.out.println("Sequência digitada: " + sequencia.getSequencia());
            System.out.println("Menor número: " + sequencia.getMenor());
            System.out.println("Maior número: " + sequencia.getMaior());
        }
    }
}
