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
     * - checks if the number is greater than or equal to zero
     * - adds the number to the list
     *
     * Takes a number as a parameter.
     * Does not return anything.
     */

    public void addNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Número deve ser maior ou igual a zero!");
        }
        numbers.add(number);
    }

    /**
     * Returns the list of numbers as a string.
     *
     * - converts the list of numbers to a string
     *
     * Does not take any parameters.
     * Returns the sequence of numbers as a String.
     */
    public String getSequence() {
        return numbers.toString();
    }

    /**
     * Returns the smallest number in the list.
     *
     * - checks if the list is empty and throws an exception if it is
     * - goes through all numbers to find the smallest one
     *
     * Does not take any parameters.
     * Returns the smallest number as an int.
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
     * - checks if the list is empty and throws an exception if it is
     * - goes through all numbers to find the largest one
     *
     * Does not take any parameters.
     * Returns the largest number as an int.
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