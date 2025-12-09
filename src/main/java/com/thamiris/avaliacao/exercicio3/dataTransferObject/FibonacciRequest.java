package com.thamiris.avaliacao.exercicio3.dataTransferObject;

import jakarta.validation.constraints.Positive;

public class FibonacciRequest {

    @Positive(message = "O número N deve ser maior que zero")
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
