/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.Test;
import org.junit.Assert;

public class TestJava140JUnit {
    Solution s = new Solution();

    @Test
    public void testNoSpaces() {
        Assert.assertEquals("Example", s.fixSpaces("Example"));
    }

    @Test
    public void testSingleSpace() {
        Assert.assertEquals("Mudasir_Hanif_", s.fixSpaces("Mudasir Hanif "));
    }

    @Test
    public void testDoubleSpace() {
        Assert.assertEquals("Yellow_Yellow__Dirty__Fellow", s.fixSpaces("Yellow Yellow  Dirty  Fellow"));
    }

    @Test
    public void testTripleSpace() {
        Assert.assertEquals("Exa-mple", s.fixSpaces("Exa   mple"));
    }

    @Test
    public void testLeadingSpaces() {
        Assert.assertEquals("-Exa_1_2_2_mple", s.fixSpaces("   Exa 1 2 2 mple"));
    }

    @Test
    public void testEmptyString() {
        Assert.assertEquals("", s.fixSpaces(""));
    }

    @Test
    public void testOnlySpaces() {
        Assert.assertEquals("-", s.fixSpaces("   "));
    }

    @Test
    public void testTwoSpaces() {
        Assert.assertEquals("Ex__1", s.fixSpaces("Ex  1"));
    }

    @Test
    public void testTrailingSpace() {
        Assert.assertEquals("Ex_", s.fixSpaces("Ex "));
    }
}
