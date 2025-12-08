package com.thamiris.avaliacao.exercicio2;

import java.util.ArrayList;
import java.util.List;


public class Sequence {

    private List<Integer> numbers;

    public Sequence(int capacity) {
        numbers = new ArrayList<>(capacity);
    }

    public void addNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Número deve ser maior ou igual a zero!");
        }
        numbers.add(number);
    }

    public String getSequence() {
        return numbers.toString();
    }

    public int getSmallest() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Sequência vazia!");
        }
        return numbers.stream().min(Integer::compareTo).get();
    }

    public int getMaior() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Sequência vazia!");
        }
        return numbers.stream().max(Integer::compareTo).get();
    }
}