package com.thamiris.avaliacao.exercicio2.dataTransferObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SequenceResponse {

    private List<Integer> sequence;

    @JsonProperty("Menor numero da sequencia: ")
    private int smallest;

    @JsonProperty("Maior numero da sequencia: ")
    private int largest;

    public SequenceResponse(List<Integer> sequence, int smallest, int largest) {
        this.sequence = sequence;
        this.smallest = smallest;
        this.largest = largest;
    }

    public List<Integer> getSequence() {

        return sequence;
    }

    public void setSequence(List<Integer> sequence) {

        this.sequence = sequence;
    }

    public int getSmallest() {

        return smallest;
    }

    public void setSmallest(int smallest) {

        this.smallest = smallest;
    }

    public int getLargest() {

        return largest;
    }

    public void setLargest(int largest) {

        this.largest = largest;
    }
}
