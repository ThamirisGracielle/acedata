package exercicio3;

import com.thamiris.avaliacao.exercicio3.Fibonacci;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testGenerateSequenceZeroOrNegative() {
        Fibonacci fib0 = new Fibonacci(0);
        assertTrue(fib0.getSequence().isEmpty());

        Fibonacci fibNeg = new Fibonacci(-5);
        assertTrue(fibNeg.getSequence().isEmpty());
    }

    @Test
    void testGenerateSequenceOne() {
        Fibonacci fib = new Fibonacci(1);
        assertEquals(List.of(1), fib.getSequence());
    }

    @Test
    void testGenerateSequenceTwo() {
        Fibonacci fib = new Fibonacci(2);
        assertEquals(List.of(1, 1), fib.getSequence());
    }

    @Test
    void testGenerateSequenceSeven() {
        Fibonacci fib = new Fibonacci(7);
        assertEquals(List.of(1, 1, 2, 3, 5, 8, 13), fib.getSequence());
    }

    @Test
    void testContainsNumber() {
        Fibonacci fib = new Fibonacci(10);

        assertTrue(fib.containsNumber(5));
        assertTrue(fib.containsNumber(1));
        assertFalse(fib.containsNumber(4));
        assertFalse(fib.containsNumber(20));
    }

    @Test
    void testSequenceImmutability() {
        Fibonacci fib = new Fibonacci(5);
        List<Integer> seq = fib.getSequence();
        seq.add(100);

        assertEquals(List.of(1, 1, 2, 3, 5), fib.getSequence());
    }
}
