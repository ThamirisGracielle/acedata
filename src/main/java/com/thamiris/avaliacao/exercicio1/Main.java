package com.thamiris.avaliacao.exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor da hora trabalhada: ");
        double valorHora = teclado.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        double quatidadeHorasTrabalhadas = teclado.nextDouble();

        System.out.println("Informe a quantidade de filhos menores de 14 anos: ");
        int quantidadeFilhosMenosQuatrorzeAnos = teclado.nextInt();

        Funcionario funcionario = new Funcionario(valorHora, quatidadeHorasTrabalhadas, quantidadeFilhosMenosQuatrorzeAnos);

        CalculoSalario calculoSalario = new CalculoSalario();

        CalculoSalarioFamilia calculoSalarioFamilia = new CalculoSalarioFamilia();

        double salarioBruto = calculoSalario.calcularSalarioBruto(funcionario);
        double salarioFamilia = calculoSalarioFamilia.calcularSalarioFamilia(salarioBruto, quantidadeFilhosMenosQuatrorzeAnos);
        double salarioTotal = salarioBruto + salarioFamilia;


        System.out.println("=--=-= Folha de Pagamento =-=-=-=");
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Salário-família: R$ " + salarioFamilia);
        System.out.println("Salário total: R$ " + salarioTotal);


        teclado.close();

    }
}
