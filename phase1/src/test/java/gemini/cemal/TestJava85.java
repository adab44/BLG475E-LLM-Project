package gemini.cemal;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava85 {
    Java85_add s = new Java85_add();

    @Test
    void testAddConditional() {
        // Sum even elements at odd indices
        assertEquals(2, s.add(Arrays.asList(4, 2, 6, 7))); // Index 1: 2 (even), Index 3: 7 (odd)
        assertEquals(88, s.add(Arrays.asList(4, 88))); 
        assertEquals(12, s.add(Arrays.asList(4, 4, 6, 8))); // 4 + 8 = 12
    }
}
