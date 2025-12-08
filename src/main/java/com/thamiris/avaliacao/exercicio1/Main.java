package com.thamiris.avaliacao.exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = teclado.nextLine();

        double valorHora = Validador.lerDoublePositivo(teclado, "Informe o valor da hora trabalhada: ");
        double quatidadeHorasTrabalhadas = Validador.lerDoublePositivo(teclado, "Informe a quantidade de horas trabalhadas no mês: ");
        int quantidadeFilhosMenosQuatrorzeAnos = Validador.lerIntNaoNegativo(teclado, "Informe a quantidade de filhos menores de 14 anos: ");

        Funcionario funcionario = new Funcionario(nome, valorHora, quatidadeHorasTrabalhadas, quantidadeFilhosMenosQuatrorzeAnos);

        CalculoSalario calculoSalario = new CalculoSalario();
        CalculoSalarioFamilia calculoSalarioFamilia = new CalculoSalarioFamilia();

        double salarioBruto = calculoSalario.calcularSalarioBruto(funcionario);
        double salarioFamilia = calculoSalarioFamilia.calcularSalarioFamilia(salarioBruto, quantidadeFilhosMenosQuatrorzeAnos);
        double salarioTotal = salarioBruto + salarioFamilia;

        System.out.println("=--=-= Folha de Pagamento =-=-=-=");
        System.out.println("Nome do funcionário " + nome);
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Salário-família: R$ " + salarioFamilia);
        System.out.println("Salário total: R$ " + salarioTotal);

        teclado.close();
    }
}
