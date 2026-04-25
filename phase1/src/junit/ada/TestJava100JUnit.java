/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.Test;
import org.junit.Assert;
import java.util.*;

public class TestJava100JUnit {
    Solution s = new Solution();

    @Test
    public void testOddNumber() {
        Assert.assertEquals(Arrays.asList(3, 5, 7), s.makeAPile(3));
    }

    @Test
    public void testEvenNumber() {
        Assert.assertEquals(Arrays.asList(4, 6, 8, 10), s.makeAPile(4));
    }

    @Test
    public void testN5() {
        Assert.assertEquals(Arrays.asList(5, 7, 9, 11, 13), s.makeAPile(5));
    }

    @Test
    public void testN6() {
        Assert.assertEquals(Arrays.asList(6, 8, 10, 12, 14, 16), s.makeAPile(6));
    }

    @Test
    public void testMinimumN() {
        Assert.assertEquals(Arrays.asList(1), s.makeAPile(1));
    }

    @Test
    public void testSmallestEvenN() {
        Assert.assertEquals(Arrays.asList(2, 4), s.makeAPile(2));
    }
}
