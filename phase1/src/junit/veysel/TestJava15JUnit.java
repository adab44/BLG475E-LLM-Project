/* @Authors 
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava15JUnit {
    Solution s = new Solution();

    @Test
    public void testZero() {
        assertEquals("0", s.stringSequence(0));
    }

    @Test
    public void testOne() {
        assertEquals("0 1", s.stringSequence(1));
    }

    @Test
    public void testSmallPositive() {
        assertEquals("0 1 2 3", s.stringSequence(3));
    }

    @Test
    public void testLargerPositive() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10", s.stringSequence(10));
    }

    @Test
    public void testNegative() {
        assertEquals("", s.stringSequence(-1));
    }
}