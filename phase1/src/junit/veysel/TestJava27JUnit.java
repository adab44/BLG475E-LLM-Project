/* @Authors 
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava27JUnit {
    Solution s = new Solution();

    @Test
    public void testEmptyString() {
        assertEquals("", s.flipCase(""));
    }

    @Test
    public void testMixedCase() {
        assertEquals("hELLO", s.flipCase("Hello"));
    }

    @Test
    public void testOnlyUppercase() {
        assertEquals("abc", s.flipCase("ABC"));
    }

    @Test
    public void testOnlyLowercase() {
        assertEquals("XYZ", s.flipCase("xyz"));
    }

    @Test
    public void testSpecialCharacters() {
        assertEquals("hELLO123!", s.flipCase("Hello123!"));
    }
}