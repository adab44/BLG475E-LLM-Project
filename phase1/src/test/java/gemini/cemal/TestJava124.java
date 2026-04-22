package gemini.cemal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava124 {
    Java124_validDate s = new Java124_validDate();

    @Test
    void testValidDate() {
        assertTrue(s.validDate("03-11-2000"));
        assertFalse(s.validDate("15-01-2012")); // Month error
        assertFalse(s.validDate("04-31-2040")); // Day error (April has 30 days)
        assertFalse(s.validDate("06/04/2020")); // Format error
        assertTrue(s.validDate("02-29-2000")); // February boundary
    }
}
