package com.thamiris.avaliacao.exercicio1;

public class FolhaPagamento {

    private Funcionario funcionario;
    private double salarioBruto;
    private double salarioFamilia;
    private double salarioTotal;

    private static final double LIMITE_BAIXO = 788.00;
    private static final double LIMITE_MEDIO = 1100.00;
    private static final double VALOR_FILHO_BAIXO = 30.50;
    private static final double VALOR_FILHO_MEDIO = 18.50;
    private static final double VALOR_FILHO_ALTO = 11.90;

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

        if (salarioBruto <= LIMITE_BAIXO) {
            valorPorFilho = VALOR_FILHO_BAIXO;
        } else if (salarioBruto <= LIMITE_MEDIO) {
            valorPorFilho = VALOR_FILHO_MEDIO;
        } else {
            valorPorFilho = VALOR_FILHO_ALTO;
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

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getSalarioFamilia() {
        return salarioFamilia;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
}
