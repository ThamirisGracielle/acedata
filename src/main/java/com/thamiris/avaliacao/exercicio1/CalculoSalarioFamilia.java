package com.thamiris.avaliacao.exercicio1;

public class CalculoSalarioFamilia {

    public double calcularSalarioFamilia(double salarioBruto, int quantidadeFilhos) {

        double valorPorFilho;

        if (salarioBruto <= 788.00) {
            valorPorFilho = 30.50;
        } else if (salarioBruto <= 1100.00) {
            valorPorFilho = 18.50;
        } else {
            valorPorFilho = 11.90;
        }

        return quantidadeFilhos * valorPorFilho;
    }
}