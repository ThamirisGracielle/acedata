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
     * Generates the Fibonacci sequence with n numbers.
     *
     * This method does the following:
     * - If n is 0 or negative, it does nothing.
     * - Adds the first two numbers (1, 1) if n >= 2.
     * - Calculates the next numbers by summing the previous two and adds them to the list 'sequence'.
     *
     * @param n the number of Fibonacci numbers to generate
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
     * Returns a copy of the current sequence of integers.
     * <p>
     * This method creates and returns a new ArrayList containing the same elements
     * as the internal sequence. Modifications to the returned list will not affect
     * the original internal sequence.
     * </p>
     *
     * @return A new List of integers representing the current sequence.
     */
    public List<Integer> getSequence() {
        return new ArrayList<>(sequence);
    }

    /**
     * Checks if a specific number is present in the sequence.
     * <p>
     * This method verifies whether the given integer is contained
     * in the internal sequence of numbers.
     * </p>
     *
     * @param x The number to check for in the sequence.
     * @return {@code true} if the number is present in the sequence,
     *         {@code false} otherwise.
     */
    public boolean containsNumber(int x) {
        return sequence.contains(x);
    }
}
