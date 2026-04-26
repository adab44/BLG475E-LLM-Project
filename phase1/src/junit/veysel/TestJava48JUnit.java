/* @Authors 
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava48JUnit {
    Solution s = new Solution();

    @Test
    public void testEmptyString() {
        assertTrue(s.isPalindrome(""));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(s.isPalindrome("a"));
    }

    @Test
    public void testOddPalindrome() {
        assertTrue(s.isPalindrome("aba"));
    }

    @Test
    public void testEvenPalindrome() {
        assertTrue(s.isPalindrome("abba"));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(s.isPalindrome("zbcd"));
    }
}