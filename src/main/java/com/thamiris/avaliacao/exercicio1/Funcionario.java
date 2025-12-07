package com.thamiris.avaliacao.exercicio1;

public class Funcionario {

    private double valorHora;
    private double horasTrabalhadas;
    private int quantidadeFilhos;

    public Funcionario(double valorHora, double horasTrabalhadas, int quantidadeFilhos) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.quantidadeFilhos = quantidadeFilhos;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public int getQuantidadeFilhos() {
        return quantidadeFilhos;
    }
}
