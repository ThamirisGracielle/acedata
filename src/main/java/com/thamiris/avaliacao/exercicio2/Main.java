package com.thamiris.avaliacao.exercicio2;

import com.thamiris.avaliacao.util.Validator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {

            int quantidade = Validator.readPositiveInt(keyboard, "Digite a quantidade de números: ");

            Sequence sequence = new Sequence(quantidade);

            for (int i = 0; i < quantidade; i++) {
                int number = Validator.readNonNegativeInt(keyboard, "Digite o número " + (i + 1) + ": ");
                sequence.addNumber(number);
            }

            System.out.println("Sequência digitada: " + sequence.getSequence());
            System.out.println("Menor número: " + sequence.getSmallest());
            System.out.println("Maior número: " + sequence.getMaior());
        }
    }
}
