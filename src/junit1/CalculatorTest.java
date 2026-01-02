package junit1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(10,c.calculate(2,3));
        assertEquals(5,c.calculate(3,4,10));
    }
}
