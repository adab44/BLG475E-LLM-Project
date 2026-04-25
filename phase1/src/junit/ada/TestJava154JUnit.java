/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.Test;
import org.junit.Assert;

public class TestJava154JUnit {
    Solution s = new Solution();

    @Test
    public void testNoMatch() {
        Assert.assertFalse(s.cycpatternCheck("xyzw", "xyw"));
    }

    @Test
    public void testDirectMatch() {
        Assert.assertTrue(s.cycpatternCheck("yello", "ell"));
    }

    @Test
    public void testNoRotation() {
        Assert.assertFalse(s.cycpatternCheck("whattup", "ptut"));
    }

    @Test
    public void testRotationMatch() {
        Assert.assertTrue(s.cycpatternCheck("efef", "fee"));
    }

    @Test
    public void testNoRotation2() {
        Assert.assertFalse(s.cycpatternCheck("abab", "aabb"));
    }

    @Test
    public void testRotationMatch2() {
        Assert.assertTrue(s.cycpatternCheck("winemtt", "tinem"));
    }

    @Test
    public void testBLongerThanA() {
        Assert.assertFalse(s.cycpatternCheck("ab", "abc"));
    }

    @Test
    public void testSingleCharPattern() {
        Assert.assertTrue(s.cycpatternCheck("hello", "h"));
    }

    @Test
    public void testEqualStrings() {
        Assert.assertTrue(s.cycpatternCheck("abc", "abc"));
    }
}
