package com.thamiris.avaliacao.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Sequencia {

    private List<Integer> numeros;

    public Sequencia(int capacidade) {
        numeros = new ArrayList<>(capacidade);
    }

    public void adicionarNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número deve ser maior ou igual a zero!");
        }
        numeros.add(numero);
    }

    public String getSequencia() {
        return numeros.toString();
    }

    public int getMenor() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("Sequência vazia!");
        }
        return numeros.stream().min(Integer::compareTo).get();
    }

    public int getMaior() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("Sequência vazia!");
        }
        return numeros.stream().max(Integer::compareTo).get();
    }
}