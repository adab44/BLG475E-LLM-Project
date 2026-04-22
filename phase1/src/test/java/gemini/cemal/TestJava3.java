package gemini.cemal;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava3 {
    Java3_belowZero s = new Java3_belowZero();

    @Test
    void testBelowZero() {
        assertFalse(s.belowZero(Arrays.asList(1, 2, 3)));
        assertTrue(s.belowZero(Arrays.asList(1, 2, -4, 5)));
        assertFalse(s.belowZero(new ArrayList<>())); // Empty list
        assertTrue(s.belowZero(Arrays.asList(-1))); // Immediate negative
    }
}
