/* @Authors 
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava23JUnit {
    Solution s = new Solution();

    @Test
    public void testEmptyString() {
        assertEquals(0, s.strlen(""));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals(1, s.strlen("x"));
    }

    @Test
    public void testNormalString() {
        assertEquals(9, s.strlen("asdasnakj"));
    }

    @Test
    public void testStringWithSpaces() {
        assertEquals(11, s.strlen("hello world"));
    }

    @Test
    public void testSpecialCharacters() {
        assertEquals(5, s.strlen("@#$%^"));
    }
}