package com.thamiris.avaliacao.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Integer> sequence;

    public Fibonacci(int n) {
        sequence = new ArrayList<>(n);
        generateSequence(n);
    }

    /**
     * Generates a sequence of numbers (like the Fibonacci sequence).
     *
     * - starts the sequence with 1
     * - adds numbers following the rule: each number is the sum of the two previous numbers
     * - stops when the sequence has n numbers
     *
     * Takes n as a parameter (the length of the sequence).
     * Does not return anything.
     */
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

    /**
     * Returns a copy of the generated sequence.
     *
     * - creates a new list with the same numbers as the original sequence
     *
     * Does not take any parameters.
     * Returns the sequence as a List of integers.
     */
    public List<Integer> getSequence() {
        return new ArrayList<>(sequence);
    }

    /**
     * Checks if the sequence contains a specific number.
     *
     * - looks for the number x in the sequence
     *
     * Takes x as a parameter (the number to check).
     * Returns true if the number is in the sequence, false otherwise.
     */
    public boolean containsNumber(int x) {
        return sequence.contains(x);
    }
}
