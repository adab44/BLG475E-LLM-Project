/* @Authors 
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava16JUnit {
    Solution s = new Solution();

    @Test
    public void testEmptyString() {
        assertEquals(0, s.countDistinctCharacters(""));
    }

    @Test
    public void testAllUniqueCharacters() {
        assertEquals(5, s.countDistinctCharacters("abcde"));
    }

    @Test
    public void testCaseInsensitiveDuplicates() {
        assertEquals(5, s.countDistinctCharacters("abcdeCADE"));
    }

    @Test
    public void testRepeatedSingleCharacter() {
        assertEquals(1, s.countDistinctCharacters("aaaaAAAAaaaa"));
    }

    @Test
    public void testStringWithSpaces() {
        assertEquals(5, s.countDistinctCharacters("Jerry jERRY JeRRRY"));
    }

    @Test
    public void testSingleCharacterBoundary() {
        assertEquals(1, s.countDistinctCharacters("Z"));
    }
}