package gemini.cemal;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava52 {
    Java52_belowThreshold s = new Java52_belowThreshold();

    @Test
    void testBelowThreshold() {
        assertTrue(s.belowThreshold(Arrays.asList(1, 2, 4, 10), 100));
        assertFalse(s.belowThreshold(Arrays.asList(1, 20, 4, 10), 5));
        assertFalse(s.belowThreshold(Arrays.asList(1, 10, 4), 10)); // Exactly at boundary: 10 >= 10 should be False
    }
}
