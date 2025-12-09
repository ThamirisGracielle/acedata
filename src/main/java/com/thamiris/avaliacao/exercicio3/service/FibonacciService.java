package com.thamiris.avaliacao.exercicio3.service;

import com.thamiris.avaliacao.exercicio3.dataTransferObject.FibonacciResponse;
import com.thamiris.avaliacao.exercicio3.model.FibonacciSequence;
import com.thamiris.avaliacao.util.Validator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FibonacciService {

    /**
     *  Method responsible for creating a Fibonacci sequence with n numbers.
     */
    public FibonacciResponse generateFibonacci(int n) {

        Validator.validatePositiveInt(n);

        List<Integer> sequence = generateSequence(n);

        boolean contains = isFibonacciNumber(n);


        String message;
        if (contains) {
            message = "O número " + n + " faz parte da sequência de Fibonacci.";
        } else {
            message = "O número " + n + " NÃO faz parte da sequência de Fibonacci.";
        }

        FibonacciSequence fibonacciSequence = new FibonacciSequence(sequence);

        return new FibonacciResponse(fibonacciSequence.getSequence(), message);
    }

    /**
     * Generates a Fibonacci sequence with n numbers.
     */
    private List<Integer> generateSequence(int n) {
        List<Integer> sequence = new ArrayList<>();

        if (n <= 0) return sequence;

        sequence.add(1);
        if (n == 1) return sequence;

        sequence.add(1);
        for (int i = 2; sequence.size() < n; i++) {
            int next = sequence.get(i - 1) + sequence.get(i - 2);
            sequence.add(next);
        }
        return sequence;
    }

    private boolean isFibonacciNumber(int num) {
        int x1 = 5 * num * num + 4;
        int x2 = 5 * num * num - 4;
        return isPerfectSquare(x1) || isPerfectSquare(x2);
    }

    private boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}