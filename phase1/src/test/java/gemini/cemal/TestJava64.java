package gemini.cemal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava64 {
    Java64_vowelsCount s = new Java64_vowelsCount();

    @Test
    void testVowelsCount() {
        assertEquals(2, s.vowelsCount("abcde"));
        assertEquals(3, s.vowelsCount("ACEDY")); // 'Y' at the end is a vowel
        assertEquals(2, s.vowelsCount("key"));   // 'y' at the end is a vowel
        assertEquals(1, s.vowelsCount("bye"));   // 'y' is not at the end, only 'e' is a vowel
    }
}
