package com.thamiris.avaliacao.exercicio2.dataTransferObject;

import java.util.List;

public class SequenceRequest {

    private int quantity;

    private List<Integer> numbers;

    public SequenceRequest() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}