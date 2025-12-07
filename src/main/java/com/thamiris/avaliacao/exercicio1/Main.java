package com.thamiris.avaliacao.exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        double valorHora = lerDoublePositivo(teclado, "Informe o valor da hora trabalhada: ");
        double quatidadeHorasTrabalhadas = lerDoublePositivo(teclado, "Informe a quantidade de horas trabalhadas no mês: ");
        int quantidadeFilhosMenosQuatrorzeAnos = lerIntNaoNegativo(teclado, "Informe a quantidade de filhos menores de 14 anos: ");

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

    private static double lerDoublePositivo(Scanner scanner, String mensagem) {
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

    private static int lerIntNaoNegativo(Scanner scanner, String mensagem) {
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
