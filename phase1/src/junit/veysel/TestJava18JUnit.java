/* @Authors 
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava18JUnit {
    Solution s = new Solution();

    @Test
    public void testEmptyString() {
        assertEquals(0, s.howManyTimes("", "x"));
    }

    @Test
    public void testEmptySubstring() {
        assertEquals(0, s.howManyTimes("abc", ""));
    }

    @Test
    public void testSubstringLongerThanString() {
        assertEquals(0, s.howManyTimes("abc", "abcd"));
    }

    @Test
    public void testSingleCharacterOccurrences() {
        assertEquals(4, s.howManyTimes("xyxyxyx", "x"));
    }

    @Test
    public void testOverlappingOccurrences() {
        assertEquals(3, s.howManyTimes("aaaa", "aa"));
    }

    @Test
    public void testMultipleOverlappingOccurrences() {
        assertEquals(4, s.howManyTimes("cacacacac", "cac"));
    }

    @Test
    public void testOneOccurrenceAtBeginning() {
        assertEquals(1, s.howManyTimes("john doe", "john"));
    }

    @Test
    public void testNoOccurrence() {
        assertEquals(0, s.howManyTimes("abcdef", "xyz"));
    }

    @Test
    public void testExactMatch() {
        assertEquals(1, s.howManyTimes("abc", "abc"));
    }
}