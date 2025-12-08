package com.thamiris.avaliacao.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Integer> sequencia;

    public Fibonacci(int n) {
        sequencia = new ArrayList<>(n);
        gerarSequencia(n);
    }

    private void gerarSequencia(int n) {
        if (n <= 0) return;

        sequencia.add(1);
        if (n == 1) return;

        sequencia.add(1);
        for (int i = 2; i < n; i++) {
            int proximo = sequencia.get(i - 1) + sequencia.get(i - 2);
            sequencia.add(proximo);
        }
    }

    public List<Integer> getSequencia() {
        return new ArrayList<>(sequencia);
    }

    public boolean contem(int x) {
        return sequencia.contains(x);
    }
}
