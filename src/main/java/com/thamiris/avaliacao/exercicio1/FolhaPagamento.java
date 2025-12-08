package com.thamiris.avaliacao.exercicio1;

public class FolhaPagamento {

    private Funcionario funcionario;
    private double salarioBruto;
    private double salarioFamilia;
    private double salarioTotal;

    private static final double LIMITE_MINIMO_SALARIO = 788.00;
    private static final double LIMITE_MEDIO_SALARIO = 1100.00;

    private static final double VALOR_POR_FILHO_MINIMO_SALARIO = 30.50;
    private static final double VALOR_POR_FILHO_MEDIO_SALARIO  = 18.50;
    private static final double VALOR_POR_FILHO_ALTO_SALARIO = 11.90;

    public FolhaPagamento(Funcionario funcionario) {
        this.funcionario = funcionario;
        calcular();
    }

    private void calcular() {
        salarioBruto = calcularSalarioBruto();
        salarioFamilia = calcularSalarioFamilia();
        salarioTotal = salarioBruto + salarioFamilia;
    }

    private double calcularSalarioBruto() {
        return funcionario.getValorHora() * funcionario.getHorasTrabalhadas();
    }

    private double calcularSalarioFamilia() {
        double valorPorFilho;

        if (salarioBruto <= LIMITE_MINIMO_SALARIO ) {
            valorPorFilho = VALOR_POR_FILHO_MINIMO_SALARIO;
        } else if (salarioBruto <= LIMITE_MEDIO_SALARIO) {
            valorPorFilho = VALOR_POR_FILHO_MEDIO_SALARIO;
        } else {
            valorPorFilho = VALOR_POR_FILHO_ALTO_SALARIO;
        }

        return funcionario.getQuantidadeFilhos() * valorPorFilho;
    }

    public void imprimir() {
        System.out.println("=--=-= Folha de Pagamento =-=-=-=");
        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Salário-família: R$ " + String.format("%.2f", salarioFamilia));
        System.out.println("Salário total: R$ " + String.format("%.2f", salarioTotal));
    }
}
