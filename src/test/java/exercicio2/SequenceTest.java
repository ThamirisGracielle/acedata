package exercicio2;

import com.thamiris.avaliacao.exercicio2.Sequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SequenceTest {

    @Test
    void testAddNumberAndGetSequence() {
        Sequence sequence = new Sequence(5);
        sequence.addNumber(10);
        sequence.addNumber(5);
        sequence.addNumber(7);

        assertEquals("[10, 5, 7]", sequence.getSequence());
    }

    @Test
    void testAddNegativeNumberThrowsException() {
        Sequence sequence = new Sequence(3);

        assertThrows(IllegalArgumentException.class, () -> sequence.addNumber(-1));
    }

    @Test
    void testGetSmallest() {
        Sequence sequence = new Sequence(4);
        sequence.addNumber(10);
        sequence.addNumber(3);
        sequence.addNumber(7);

        assertEquals(3, sequence.getSmallest());
    }

    @Test
    void testGetLargest() {
        Sequence sequence = new Sequence(4);
        sequence.addNumber(10);
        sequence.addNumber(3);
        sequence.addNumber(7);

        assertEquals(10, sequence.getLargest());
    }

    @Test
    void testGetSmallestFromEmptySequenceThrowsException() {
        Sequence sequence = new Sequence(3);
        assertThrows(IllegalStateException.class, sequence::getSmallest);
    }

    @Test
    void testGetLargestFromEmptySequenceThrowsException() {
        Sequence sequence = new Sequence(3);
        assertThrows(IllegalStateException.class, sequence::getLargest);
    }

    @Test
    void testSingleElementSequence() {
        Sequence sequence = new Sequence(1);
        sequence.addNumber(42);

        assertEquals("[42]", sequence.getSequence());
        assertEquals(42, sequence.getSmallest());
        assertEquals(42, sequence.getLargest());
    }

    @Test
    void testAllElementsEqual() {
        Sequence sequence = new Sequence(3);
        sequence.addNumber(5);
        sequence.addNumber(5);
        sequence.addNumber(5);

        assertEquals("[5, 5, 5]", sequence.getSequence());
        assertEquals(5, sequence.getSmallest());
        assertEquals(5, sequence.getLargest());
    }
}

