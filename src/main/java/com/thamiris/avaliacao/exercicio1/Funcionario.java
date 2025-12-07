package com.thamiris.avaliacao.exercicio1;

public class Funcionario {

    private String nome;
    private double valorHora;
    private double horasTrabalhadas;
    private int quantidadeFilhos;

    public Funcionario(String nome,double valorHora, double horasTrabalhadas, int quantidadeFilhos) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.quantidadeFilhos = quantidadeFilhos;
    }

    public String getNome() {
        return nome;
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
