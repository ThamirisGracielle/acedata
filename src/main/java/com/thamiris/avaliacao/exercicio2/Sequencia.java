package com.thamiris.avaliacao.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Sequencia {

    private List<Integer> numeros;


    public Sequencia(int capacidade) {
        numeros = new ArrayList<>(capacidade);
    }


    public void adicionarNumero(int numero) throws  IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Número deve ser maior que zero!");
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
        int menor = numeros.get(0);
        for (int num : numeros) {
            if (num < menor) menor = num;
        }
        return menor;

    }
    public int getMaior() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("Sequência vazia!");
        }
        int maior = numeros.get(0);
        for (int num : numeros) {
            if (num > maior) maior = num;
        }
        return maior;
    }
}