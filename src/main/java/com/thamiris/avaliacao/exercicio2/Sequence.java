package com.thamiris.avaliacao.exercicio2;

import java.util.ArrayList;
import java.util.List;


public class Sequence {

    private List<Integer> numbers;

    public Sequence(int capacity) {
        numbers = new ArrayList<>(capacity);
    }

    /**
     * Adds a number to the list of numbers.
     *
     * This method does the following:
     * - Checks if the number is negative. If it is, throws an exception.
     * - If the number is zero or positive, adds it to the list 'numbers'.
     *
     * @param number the number to add (must be 0 or positive)
     */

    public void addNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Número deve ser maior ou igual a zero!");
        }
        numbers.add(number);
    }

    /**
     * Returns the sequence of numbers as a string.
     * <p>
     * This method converts the internal list of numbers to a string representation
     * and returns it. The format depends on how the internal list's `toString` method
     * formats the elements (typically as a comma-separated list enclosed in brackets).
     * </p>
     *
     * @return A string representing the sequence of numbers.
     */
    public String getSequence() {
        return numbers.toString();
    }

    /**
     * Returns the smallest number in the list.
     *
     * This method does the following:
     * - Checks if the list 'numbers' is empty. If it is, throws an exception.
     * - Goes through all numbers and finds the smallest one.
     *
     * @return the smallest number in the list
     */
    public int getSmallest() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Sequência vazia!");
        }

        int smallest = numbers.get(0);
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    /**
     * Returns the largest number in the list.
     *
     * This method does the following:
     * - Checks if the list 'numbers' is empty. If it is, throws an exception.
     * - Goes through all numbers and finds the largest one.
     *
     * @return the largest number in the list
     */
    public int getLargest() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Sequência vazia!");
        }

        int largest = numbers.get(0);
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }
}