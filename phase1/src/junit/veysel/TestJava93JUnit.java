/* @Authors 
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava93JUnit {
    Solution s = new Solution();

    @Test
    public void testUppercaseInput() {
        assertEquals("tgst", s.encode("TEST"));
    }

    @Test
    public void testMixedCase() {
        assertEquals("mWDCSKR", s.encode("Mudasir"));
    }

    @Test
    public void testVowelReplacement() {
        assertEquals("ygs", s.encode("YES"));
    }

    @Test
    public void testSentence() {
        assertEquals("tHKS KS C MGSSCGG", s.encode("This is a message"));
    }

    @Test
    public void testSpecialCharacters() {
        assertEquals("123!", s.encode("123!"));
    }
}