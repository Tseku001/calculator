package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    void testMultiplyPositive() {
        Multiplication m = new Multiplication();
        assertEquals(6.0, m.multiply(2.0, 3.0));
    }

    @Test
    void testMultiplyNegative() {
        Multiplication m = new Multiplication();
        assertEquals(-6.0, m.multiply(-2.0, 3.0));
    }
}
