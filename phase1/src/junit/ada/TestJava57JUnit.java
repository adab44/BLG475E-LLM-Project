/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.Test;
import org.junit.Assert;
import java.util.*;

public class TestJava57JUnit {
    Solution s = new Solution();

    @Test
    public void testIncreasing() {
        Assert.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList(1, 2, 4, 10))));
    }

    @Test
    public void testDecreasing() {
        Assert.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList(4, 1, 0, -10))));
    }

    @Test
    public void testZigzag() {
        Assert.assertFalse(s.monotonic(new ArrayList<>(Arrays.asList(1, 20, 4, 10))));
    }

    @Test
    public void testEqual() {
        Assert.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList(9, 9, 9, 9))));
    }

    @Test
    public void testSingleElement() {
        Assert.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList(1))));
    }

    @Test
    public void testTwoElements() {
        Assert.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList(1, 2))));
    }

    @Test
    public void testTwoEqualElements() {
        Assert.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList(5, 5))));
    }

    @Test
    public void testEmptyList() {
        Assert.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList())));
    }
}
