package com.thamiris.avaliacao.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Integer> sequence;

    public Fibonacci(int n) {
        sequence = new ArrayList<>(n);
        generateSequence(n);
    }

    private void generateSequence(int n) {
        if (n <= 0) return;

        sequence.add(1);
        if (n == 1) return;

        sequence.add(1);
        for (int i = 2; i < n; i++) {
            int next = sequence.get(i - 1) + sequence.get(i - 2);
            sequence.add(next);
        }
    }

    public List<Integer> getSequence() {
        return new ArrayList<>(sequence);
    }

    public boolean containsNumber(int x) {
        return sequence.contains(x);
    }
}
