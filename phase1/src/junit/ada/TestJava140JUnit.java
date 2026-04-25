/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestJava140JUnit {
    Solution s = new Solution();

    @Test
    public void testNoSpaces() {
        Assertions.assertEquals("Example", s.fixSpaces("Example"));
    }

    @Test
    public void testSingleSpace() {
        Assertions.assertEquals("Mudasir_Hanif_", s.fixSpaces("Mudasir Hanif "));
    }

    @Test
    public void testDoubleSpace() {
        Assertions.assertEquals("Yellow_Yellow__Dirty__Fellow", s.fixSpaces("Yellow Yellow  Dirty  Fellow"));
    }

    @Test
    public void testTripleSpace() {
        Assertions.assertEquals("Exa-mple", s.fixSpaces("Exa   mple"));
    }

    @Test
    public void testLeadingSpaces() {
        Assertions.assertEquals("-Exa_1_2_2_mple", s.fixSpaces("   Exa 1 2 2 mple"));
    }

    @Test
    public void testEmptyString() {
        Assertions.assertEquals("", s.fixSpaces(""));
    }

    @Test
    public void testOnlySpaces() {
        Assertions.assertEquals("-", s.fixSpaces("   "));
    }

    @Test
    public void testTwoSpaces() {
        Assertions.assertEquals("Ex__1", s.fixSpaces("Ex  1"));
    }

    @Test
    public void testTrailingSpace() {
        Assertions.assertEquals("Ex_", s.fixSpaces("Ex "));
    }
}
