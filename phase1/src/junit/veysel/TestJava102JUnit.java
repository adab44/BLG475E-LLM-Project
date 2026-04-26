/* @Authors 
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava102JUnit {
    Solution s = new Solution();

    @Test
    public void testNormalRange() {
        assertEquals(14, s.chooseNum(12, 15));
    }

    @Test
    public void testInvalidRange() {
        assertEquals(-1, s.chooseNum(13, 12));
    }

    @Test
    public void testEvenY() {
        assertEquals(546, s.chooseNum(546, 546));
    }

    @Test
    public void testOddY() {
        assertEquals(28, s.chooseNum(6, 29));
    }

    @Test
    public void testNoEvenNumber() {
        assertEquals(-1, s.chooseNum(7, 7));
    }
}