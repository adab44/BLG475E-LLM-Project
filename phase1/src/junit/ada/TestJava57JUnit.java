/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.*;

public class TestJava57JUnit {
    Solution s = new Solution();

    @Test
    public void testIncreasing() {
        Assertions.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList(1, 2, 4, 10))));
    }

    @Test
    public void testDecreasing() {
        Assertions.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList(4, 1, 0, -10))));
    }

    @Test
    public void testZigzag() {
        Assertions.assertFalse(s.monotonic(new ArrayList<>(Arrays.asList(1, 20, 4, 10))));
    }

    @Test
    public void testEqual() {
        Assertions.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList(9, 9, 9, 9))));
    }

    @Test
    public void testSingleElement() {
        Assertions.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList(1))));
    }

    @Test
    public void testTwoElements() {
        Assertions.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList(1, 2))));
    }

    @Test
    public void testTwoEqualElements() {
        Assertions.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList(5, 5))));
    }

    @Test
    public void testEmptyList() {
        Assertions.assertTrue(s.monotonic(new ArrayList<>(Arrays.asList())));
    }
}
