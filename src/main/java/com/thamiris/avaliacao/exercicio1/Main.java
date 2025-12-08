package com.thamiris.avaliacao.exercicio1;

import com.thamiris.avaliacao.util.Validador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            System.out.print("Informe seu nome: ");
            String nome = teclado.nextLine();

            double valorHora = Validador.lerDoublePositivo(teclado, "Informe o valor da hora trabalhada: ");
            double quantidadeHorasTrabalhadas = Validador.lerDoublePositivo(teclado, "Informe a quantidade de horas trabalhadas no mês: ");
            int quantidadeFilhosMenores14Anos = Validador.lerIntNaoNegativo(teclado, "Informe a quantidade de filhos menores de 14 anos: ");

            Funcionario funcionario = new Funcionario(nome, valorHora, quantidadeHorasTrabalhadas, quantidadeFilhosMenores14Anos);

            FolhaPagamento folha = new FolhaPagamento(funcionario);
            folha.imprimir();
        }
    }
}