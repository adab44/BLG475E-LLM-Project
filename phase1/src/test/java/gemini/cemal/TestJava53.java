package gemini.cemal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava53 {
    Java53_add s = new Java53_add();

    @Test
    void testAdd() {
        assertEquals(5, s.add(2, 3));
        assertEquals(1, s.add(0, 1));
        assertEquals(-2, s.add(-1, -1)); // Negative numbers
        assertEquals(1000, s.add(500, 500));
    }
}
