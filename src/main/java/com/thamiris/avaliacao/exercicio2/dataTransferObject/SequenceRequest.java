package com.thamiris.avaliacao.exercicio2.dataTransferObject;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.util.List;

public class SequenceRequest {

    @Positive(message = "A quantidade deve ser maior que zero")
    private int quantity;

    @NotNull(message = "A lista de números não pode ser nula")
    @Size(min = 1, message = "A lista deve ter pelo menos 1 número")

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