package com.thamiris.avaliacao.exercicio2.service;

import com.thamiris.avaliacao.exercicio2.dataTransferObject.SequenceResponse;
import com.thamiris.avaliacao.exercicio2.model.Sequence;
import com.thamiris.avaliacao.util.Validator;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SequenceService {

    /**
    * Processes a list of integers, validating them and returning a response
    * with the original sequence, the smallest, and the largest number.
    */
    public SequenceResponse processSequence(int quantity, List<Integer> numbers) {

        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("A sequência não pode ser vazia!");
        }

        if (numbers.size() != quantity) {
            throw new IllegalArgumentException(
                    "A quantidade de números informada (" + quantity +
                            ") não coincide com a quantidade real da sequência (" + numbers.size() + ")!"
            );
        }

        for (int num : numbers) {
            Validator.validateNonNegativeInt(num);
        }

        Sequence sequence = new Sequence(numbers);

        int smallest = numbers.get(0);
        int largest = numbers.get(0);

        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        return new SequenceResponse(sequence.getNumbers(), smallest, largest);
    }
}
