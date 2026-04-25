/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestJava154JUnit {
    Solution s = new Solution();

    @Test
    public void testNoMatch() {
        Assertions.assertFalse(s.cycpatternCheck("xyzw", "xyw"));
    }

    @Test
    public void testDirectMatch() {
        Assertions.assertTrue(s.cycpatternCheck("yello", "ell"));
    }

    @Test
    public void testNoRotation() {
        Assertions.assertFalse(s.cycpatternCheck("whattup", "ptut"));
    }

    @Test
    public void testRotationMatch() {
        Assertions.assertTrue(s.cycpatternCheck("efef", "fee"));
    }

    @Test
    public void testNoRotation2() {
        Assertions.assertFalse(s.cycpatternCheck("abab", "aabb"));
    }

    @Test
    public void testRotationMatch2() {
        Assertions.assertTrue(s.cycpatternCheck("winemtt", "tinem"));
    }

    @Test
    public void testBLongerThanA() {
        Assertions.assertFalse(s.cycpatternCheck("ab", "abc"));
    }

    @Test
    public void testSingleCharPattern() {
        Assertions.assertTrue(s.cycpatternCheck("hello", "h"));
    }

    @Test
    public void testEqualStrings() {
        Assertions.assertTrue(s.cycpatternCheck("abc", "abc"));
    }
}
