package com.thamiris.avaliacao.exercicio3.dataTransferObject;

import java.util.List;

public class FibonacciResponse {

    private List<Integer> sequence;
    private String message;

    public FibonacciResponse(List<Integer> sequence, String message) {
        this.sequence = sequence;
        this.message = message;
    }

    public List<Integer> getSequence() {

        return sequence;
    }

    public String getMessage() {

        return message;
    }
}
