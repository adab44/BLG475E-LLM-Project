package gemini.cemal;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava109 {
    Java109_moveOneBall s = new Java109_moveOneBall();

    @Test
    void testMoveOneBall() {
        assertTrue(s.moveOneBall(Arrays.asList(3, 4, 5, 1, 2))); // Can be shifted
        assertFalse(s.moveOneBall(Arrays.asList(3, 5, 4, 1, 2))); // Cannot be shifted
        assertTrue(s.moveOneBall(new ArrayList<>())); // Empty list (True)
    }
}
